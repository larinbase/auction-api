package com.technokratos.service;

import com.technokratos.dto.request.AwardRequest;
import com.technokratos.dto.response.AwardResponse;
import com.technokratos.exception.AwardNotFoundException;
import com.technokratos.mapper.AwardMapper;
import com.technokratos.model.AwardEntity;
import com.technokratos.repository.AwardJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BaseAwardService implements AwardService{
    private final AwardJpaRepository repository;
    private final AwardMapper mapper;
    @Override
    public AwardResponse getById(UUID uuid) {
        return mapper.toResponse(
                repository.findById(uuid)
                        .orElseThrow(() -> new AwardNotFoundException(uuid))
        );
    }

    @Override
    public Set<AwardResponse> getAll() {
        List<AwardEntity> entities = repository.findAll();
        if (!entities.isEmpty()) {
            return entities.stream().map(mapper::toResponse).collect(Collectors.toSet());
        } else {
            return new HashSet<>();
        }
    }

    @Override
    public UUID create(AwardRequest awardRequest) {
        return null;
    }
}
