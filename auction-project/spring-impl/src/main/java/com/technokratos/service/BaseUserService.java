package com.technokratos.service;

import com.technokratos.dto.request.UserRequest;
import com.technokratos.dto.response.AuctionResponse;
import com.technokratos.dto.response.UserResponse;
import com.technokratos.exception.UserNotFoundException;
import com.technokratos.mapper.UserMapper;
import com.technokratos.repository.UserJooqRepository;
import lombok.RequiredArgsConstructor;
import org.jooq.User;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BaseUserService implements UserService {

    //    private final UserRepository repository;
    private final UserJooqRepository repository; // TODO
    private final UserMapper mapper;
//    private final AuctionMapper auctionMapper;

    @Override
    public UserResponse getById(UUID uuid) {
        return mapper.toResponse(
                repository.findById(uuid)
                        .orElseThrow(() -> new UserNotFoundException(uuid))
        );
    }

    @Override
    public List<UserResponse> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public UUID create(UserRequest userRequest) {
        return repository.save(mapper.toEntity(userRequest))
                .orElseThrow(() -> new UserNotFoundException(UUID.fromString("")))
                .getId();
    }

    @Override
    public UserResponse update(UserRequest userRequest) {
        return mapper.toResponse(
                repository.update(
                        mapper.toEntity(userRequest)
                ).orElseThrow(() -> new UserNotFoundException(UUID.fromString("")))
        );
    }

    @Override
    public void delete(UUID id) {
        Boolean res = repository.delete(id);
        if(!res){
            throw new UserNotFoundException(UUID.fromString(""));
        }
    }

    @Override
    public List<UserResponse> getAuctions(UUID id) {
        return repository.getAuctions(id).stream().map((u -> mapper.toResponse(u))).collect(Collectors.toList());
    }

    @Override
    public void create(List<UserRequest> userRequests) {
        repository.save(userRequests.stream().map(mapper::toEntity).collect(Collectors.toList()));
    }
}
