package com.technokratos.controller;

import com.technokratos.api.UserApi;
import com.technokratos.dto.request.UserRequest;
import com.technokratos.dto.response.AuctionResponse;
import com.technokratos.dto.response.UserResponse;
import com.technokratos.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {

    private final UserService service;
    @Override
    public UserResponse getById(UUID uuid) {
        return service.getById(uuid);
    }

    @Override
    public List<UserResponse> getAll() {
        return service.getAll();
    }

    @Override
    public UUID create(UserRequest userRequest) {
        return service.create(userRequest);
    }

    @Override
    public UserResponse update(UserRequest userRequest) {
        return service.update(userRequest);
    }

    @Override
    public void delete(UUID id) {
        service.delete(id);
    }

    @Override
    public List<UserResponse> getAuctions(UUID id) {
        return service.getAuctions(id);
    }
//
    @Override
    public void createFromList(List<UserRequest> userRequests) {
        service.create(userRequests);
    }
}
