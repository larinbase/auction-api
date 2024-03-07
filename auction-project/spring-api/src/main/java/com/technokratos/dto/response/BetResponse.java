package com.technokratos.dto.response;

import java.util.UUID;

public record BetResponse(Double amount, String description, UUID lotId, UUID accountId) {
}
