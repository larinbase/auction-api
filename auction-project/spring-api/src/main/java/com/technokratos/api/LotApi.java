package com.technokratos.api;

import com.technokratos.dto.request.LotRequest;
import com.technokratos.dto.response.LotResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.UUID;

@Api(tags = "Lots | Лоты", value = "Лот")
@RequestMapping("/api/v1/lots")
public interface LotApi {

    @GetMapping("/{lot-id}")
    @ResponseStatus(HttpStatus.OK)
    LotResponse getById(@PathVariable("lot-id") UUID uuid);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    Set<LotResponse> getAll();

    @ApiOperation(value = "Создание лота", nickname = "lot-create", response = UUID.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Лот создан", response = UUID.class),
            @ApiResponse(code = 400, message = "Ошибка валидации"),
            @ApiResponse(code = 500, message = "Серверная ошибка")
    })
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    UUID create(@RequestBody LotRequest lotRequest);
}
