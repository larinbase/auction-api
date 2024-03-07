package com.technokratos.api;

import com.technokratos.dto.request.UserRequest;
import com.technokratos.dto.response.AuctionResponse;
import com.technokratos.dto.response.UserResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Api(tags = "Users | Пользователи", value = "Юзер")
@RequestMapping("/api/v1/users")
public interface UserApi {

    @GetMapping("/{user-id}")
    @ResponseStatus(HttpStatus.OK)
    UserResponse getById(@PathVariable("user-id") UUID uuid);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<UserResponse> getAll();

    @ApiOperation(value = "Создание юзера", nickname = "user-create", response = UUID.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Юзер создан", response = UUID.class),
            @ApiResponse(code = 400, message = "Ошибка валидации"),
            @ApiResponse(code = 500, message = "Серверная ошибка")
    })
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    UUID create(@RequestBody UserRequest userRequest);

    @PutMapping("/{user-id}")
    @ResponseStatus(HttpStatus.OK)
    UserResponse update(@RequestBody UserRequest userRequest);

    @DeleteMapping("/{user-id}")
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable("user-id") UUID id);

    @GetMapping("/{user-id}/auctions")
    @ResponseStatus(HttpStatus.OK)
    List<UserResponse> getAuctions(@PathVariable("user-id") UUID id);

    @PatchMapping
    @ResponseStatus(HttpStatus.CREATED)
    void createFromList(List<UserRequest> userRequests);

}
