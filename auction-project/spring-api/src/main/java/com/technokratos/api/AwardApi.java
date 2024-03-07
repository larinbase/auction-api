package com.technokratos.api;

import com.technokratos.dto.request.AwardRequest;
import com.technokratos.dto.response.AwardResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.UUID;

@Api(tags = "Awards | Выигрыши", value = "Выигрыш")
@RequestMapping("/api/v1/awards")
public interface AwardApi {

    @GetMapping("/{award-id}")
    @ResponseStatus(HttpStatus.OK)
    AwardResponse getById(@PathVariable("award-id") UUID uuid);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    Set<AwardResponse> getAll();

    @ApiOperation(value = "Создание выигрыша", nickname = "award-create", response = UUID.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Выигрышь создан", response = UUID.class),
            @ApiResponse(code = 400, message = "Ошибка валидации"),
            @ApiResponse(code = 500, message = "Серверная ошибка")
    })
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    UUID create(@RequestBody AwardRequest awardRequest);
}
