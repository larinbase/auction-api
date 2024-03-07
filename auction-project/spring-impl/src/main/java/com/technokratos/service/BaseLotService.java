package com.technokratos.service;

import com.technokratos.dto.request.LotRequest;
import com.technokratos.dto.response.LotResponse;
import com.technokratos.exception.LotNotFoundException;
import com.technokratos.mapper.LotMapper;
import com.technokratos.model.LotEntity;
import com.technokratos.repository.LotJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BaseLotService implements LotService {
    private final LotJpaRepository repository;
    private final LotMapper mapper;

    @Override
    public LotResponse getById(UUID uuid) {
        return mapper.toResponse(
                repository.findById(uuid)
                        .orElseThrow(() -> new LotNotFoundException(uuid))
        );
    }

    @Override
    public Set<LotResponse> getAll() {
        List<LotEntity> entities = repository.findAll();
        if (!entities.isEmpty()) {
            return entities.stream().map(mapper::toResponse).collect(Collectors.toSet());
        } else {
            return new HashSet<>();
        }
    }

    @Override
    public UUID create(LotRequest lotRequest) {
        // repository.save(lotRequest)
        return null;  //  repository.save(lotRequest);
    }
}