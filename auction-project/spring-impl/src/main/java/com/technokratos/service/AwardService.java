package com.technokratos.service;

import com.technokratos.dto.request.AwardRequest;
import com.technokratos.dto.response.AwardResponse;

import java.util.Set;
import java.util.UUID;

public interface AwardService {
    AwardResponse getById(UUID uuid);

    Set<AwardResponse> getAll();

    UUID create(AwardRequest awardRequest);
}
