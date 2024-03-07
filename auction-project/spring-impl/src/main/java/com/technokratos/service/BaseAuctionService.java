package com.technokratos.service;

import com.technokratos.dto.request.AuctionRequest;
import com.technokratos.dto.response.AuctionResponse;
import com.technokratos.exception.AuctionNotFoundException;
import com.technokratos.mapper.AuctionMapper;
import com.technokratos.model.AuctionEntity;
import com.technokratos.repository.AuctionJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BaseAuctionService implements  AuctionService{
    private final AuctionJpaRepository repository;
    private final AuctionMapper mapper;

    @Override
    public AuctionResponse getById(UUID uuid) {
        return mapper.toResponse(
                repository.findById(uuid)
                        .orElseThrow(() -> new AuctionNotFoundException(uuid))
        );
    }

    @Override
    public Set<AuctionResponse> getAll() {
        List<AuctionEntity> entities = repository.findAll();
        if(!entities.isEmpty()) {
            return entities.stream().map(mapper::toResponse).collect(Collectors.toSet());
        } else {
            return new HashSet<>();
        }
    }

    @Override
    public UUID create(AuctionRequest auctionRequest) {
//        AuctionEntity auctionEntity = repository.save(auctionRequest);
        return null;  //  repository.save(auctionRequest);
    }
}
