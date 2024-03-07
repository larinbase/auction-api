package com.technokratos.controller;

import com.technokratos.api.BetApi;
import com.technokratos.dto.request.BetRequest;
import com.technokratos.dto.response.BetResponse;
import com.technokratos.service.BetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class BetController implements BetApi {

    private final BetService service;

    @Override
    public BetResponse getById(UUID uuid) {
        return service.getById(uuid);
    }

    @Override
    public Set<BetResponse> getAll() {
        return service.getAll();
    }

    @Override
    public UUID create(BetRequest betRequest) {
        return service.create(betRequest);
    }
}