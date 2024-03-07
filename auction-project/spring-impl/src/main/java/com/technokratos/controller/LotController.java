package com.technokratos.controller;

import com.technokratos.api.LotApi;
import com.technokratos.dto.request.LotRequest;
import com.technokratos.dto.response.LotResponse;
import com.technokratos.service.LotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class LotController implements LotApi {

    private final LotService service;

    @Override
    public LotResponse getById(UUID uuid) {
        return service.getById(uuid);
    }

    @Override
    public Set<LotResponse> getAll() {
        return service.getAll();
    }

    @Override
    public UUID create(LotRequest lotRequest) {
        return service.create(lotRequest);
    }
}
