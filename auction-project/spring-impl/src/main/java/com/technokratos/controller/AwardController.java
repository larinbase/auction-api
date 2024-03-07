package com.technokratos.controller;

import com.technokratos.api.AwardApi;
import com.technokratos.dto.request.AwardRequest;
import com.technokratos.dto.request.BetRequest;
import com.technokratos.dto.response.AwardResponse;
import com.technokratos.dto.response.BetResponse;
import com.technokratos.service.AwardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class AwardController implements AwardApi {

    private final AwardService service;

    @Override
    public AwardResponse getById(UUID uuid) {
        return service.getById(uuid);
    }

    @Override
    public Set<AwardResponse> getAll() {
        return service.getAll();
    }

    @Override
    public UUID create(AwardRequest awardRequest) {
        return service.create(awardRequest);
    }
}