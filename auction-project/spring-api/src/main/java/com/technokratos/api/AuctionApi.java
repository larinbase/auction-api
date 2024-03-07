package com.technokratos.api;

import com.technokratos.dto.request.AuctionRequest;
import com.technokratos.dto.response.AuctionResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.UUID;

@Api(tags = "Auctions | Аукционы", value = "Аукцион")
@RequestMapping("/api/v1/auctions")
public interface AuctionApi {

    @GetMapping("/{auction-id}")
    @ResponseStatus(HttpStatus.OK)
    AuctionResponse getById(@PathVariable("auction-id") UUID uuid);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    Set<AuctionResponse> getAll();

    @ApiOperation(value = "Создание аукциона", nickname = "auction-create", response = UUID.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Аукцион создан", response = UUID.class),
            @ApiResponse(code = 400, message = "Ошибка валидации"),
            @ApiResponse(code = 500, message = "Серверная ошибка")
    })
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    UUID create(@RequestBody AuctionRequest auctionRequest);
}
