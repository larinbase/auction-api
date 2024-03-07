package com.technokratos.dto.response;

import java.util.UUID;

public record AuctionResponse(String name, String status, UUID auctionId) {
}
