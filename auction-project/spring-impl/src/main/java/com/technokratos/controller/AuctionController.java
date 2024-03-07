package com.technokratos.controller;

import com.technokratos.api.AuctionApi;
import com.technokratos.dto.request.AuctionRequest;
import com.technokratos.dto.response.AuctionResponse;
import com.technokratos.service.AuctionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class AuctionController implements AuctionApi {

    private final AuctionService service;
    @Override
    public AuctionResponse getById(UUID uuid) {
        return service.getById(uuid);
    }

    @Override
    public Set<AuctionResponse> getAll() {
        return service.getAll();
    }

    @Override
    public UUID create(AuctionRequest auctionRequest) {
        return service.create(auctionRequest);
    }
}
