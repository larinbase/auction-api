package com.technokratos.dto.response;

import java.util.UUID;

public record LotResponse(String name, String description, String artikul, String status, UUID auctionId) {
}
