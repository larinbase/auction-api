package com.technokratos.service;

import com.technokratos.dto.request.LotRequest;
import com.technokratos.dto.response.LotResponse;

import java.util.Set;
import java.util.UUID;

public interface LotService {
    LotResponse getById(UUID uuid);

    Set<LotResponse> getAll();

    UUID create(LotRequest lotRequest);
}
