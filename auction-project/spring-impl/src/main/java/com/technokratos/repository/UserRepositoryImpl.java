package com.technokratos.repository;

import com.technokratos.dto.request.UserRequest;
import com.technokratos.model.UserEntity;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    //language=sql
    private final static String SQL_GET_BY_ID = "select * from account where id = '%s'";
    //language=sql
    private final static String SQL_INSERT = "insert into account(name, password, email) values (?,?,?)";
    //language=sql
    private final static String SQL_GET_ALL = "select * from account";
    //language=sql
    private final static String SQL_UPDATE = "update account set name = ?, password = ?, email = ? where id = ?";
    //language=sql
    private final static String SQL_UPDATE_NAME = "update account set name = ? where id = ?";
    //language=sql
    private final static String SQL_DELETE = "delete from account where id = ?";


    private RowMapper<UserEntity> rowMapper = (rs, rowNum) -> UserEntity.builder()
            .name(rs.getString("name"))
            .password(rs.getString("password"))
            .email(rs.getString("email"))
            .uuid(rs.getObject("id", UUID.class))
            .build();

    @Override
    public Optional<UserEntity> findById(UUID uuid) {
        try (val stream = jdbcTemplate.queryForStream(SQL_GET_BY_ID.formatted(uuid), rowMapper)) {
            return stream.findAny();
        }
    }
    @Override
    public Optional<Set<UserEntity>> findAll() {
        try (val stream = jdbcTemplate.queryForStream(SQL_GET_ALL, rowMapper)) {
            return Optional.of(stream.collect(Collectors.toSet()));
        }
    }

    @Override
    public UUID save(UserRequest user) {
        UUID uuid;
        try {
            KeyHolder keyHolder = new GeneratedKeyHolder();
            jdbcTemplate.update(connection -> {
                PreparedStatement statement = connection.prepareStatement(SQL_INSERT, new String[]{"id"});
                statement.setString(1, user.name());
                statement.setString(2, user.password());
                statement.setString(3, user.email());
                return statement;
            }, keyHolder);
            uuid = (UUID) keyHolder.getKeyAs(Class.forName("java.util.UUID"));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return uuid;
    }

    @Override
    public void delete(UserEntity user) {
        jdbcTemplate.update(SQL_DELETE,
                user.getUuid()
        );
    }

    @Override
    public void updateName(UserEntity user, String name) {
        jdbcTemplate.update(SQL_UPDATE_NAME,
                name,
                user.getUuid()
        );
    }

    @Override
    public void update(UserEntity user) {
        jdbcTemplate.update(SQL_UPDATE,
                user.getName(),
                user.getPassword(),
                user.getEmail(),
                user.getUuid()
        );
    }
}
