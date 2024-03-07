package com.technokratos.api;

import com.technokratos.dto.request.BetRequest;
import com.technokratos.dto.response.BetResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.UUID;

@Api(tags = "Bets | Ставки", value = "Ставка")
@RequestMapping("/api/v1/bets")
public interface BetApi {

    @GetMapping("/{bet-id}")
    @ResponseStatus(HttpStatus.OK)
    BetResponse getById(@PathVariable("bet-id") UUID uuid);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    Set<BetResponse> getAll();

    @ApiOperation(value = "Создание ставки", nickname = "bet-create", response = UUID.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Ставка создана", response = UUID.class),
            @ApiResponse(code = 400, message = "Ошибка валидации"),
            @ApiResponse(code = 500, message = "Серверная ошибка")
    })
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    UUID create(@RequestBody BetRequest betRequest);
}
