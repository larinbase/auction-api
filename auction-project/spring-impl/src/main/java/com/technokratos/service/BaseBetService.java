package com.technokratos.service;

import com.technokratos.dto.request.BetRequest;
import com.technokratos.dto.response.BetResponse;
import com.technokratos.exception.BetNotFoundException;
import com.technokratos.mapper.BetMapper;
import com.technokratos.model.BetEntity;
import com.technokratos.repository.BetJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BaseBetService implements BetService {
    private final BetJpaRepository repository;
    private final BetMapper mapper;

    @Override
    public BetResponse getById(UUID uuid) {
        return mapper.toResponse(
                repository.findById(uuid)
                        .orElseThrow(() -> new BetNotFoundException(uuid))
        );
    }

    @Override
    public Set<BetResponse> getAll() {
        List<BetEntity> entities = repository.findAll();
        if (!entities.isEmpty()) {
            return entities.stream().map(mapper::toResponse).collect(Collectors.toSet());
        } else {
            return new HashSet<>();
        }
    }

    @Override
    public UUID create(BetRequest betRequest) {
        return null;
    }
}

