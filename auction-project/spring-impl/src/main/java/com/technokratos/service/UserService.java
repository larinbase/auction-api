package com.technokratos.service;

import com.technokratos.dto.request.UserRequest;
import com.technokratos.dto.response.AuctionResponse;
import com.technokratos.dto.response.UserResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface UserService {
    UserResponse getById(UUID uuid);
    List<UserResponse> getAll();
    UUID create(UserRequest userRequest);
    UserResponse update(UserRequest userRequest);
    void delete(UUID id);
    List<UserResponse> getAuctions(UUID id);
    void create(List<UserRequest> userRequests);
    Page<UserResponse> getAllByPages(Pageable pageable);

}
