package com.technokratos.service;

import com.technokratos.dto.request.BetRequest;
import com.technokratos.dto.response.BetResponse;

import java.util.Set;
import java.util.UUID;

public interface BetService {
    BetResponse getById(UUID uuid);

    Set<BetResponse> getAll();

    UUID create(BetRequest betRequest);
}
