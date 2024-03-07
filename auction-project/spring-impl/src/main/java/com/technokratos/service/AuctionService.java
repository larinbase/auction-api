package com.technokratos.service;

import com.technokratos.dto.request.AuctionRequest;
import com.technokratos.dto.response.AuctionResponse;

import java.util.Set;
import java.util.UUID;

public interface AuctionService {
    AuctionResponse getById(UUID uuid);

    Set<AuctionResponse> getAll();

    UUID create(AuctionRequest auctionRequest);
}
