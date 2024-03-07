package com.technokratos.exception;

import java.util.UUID;

public class BetNotFoundException extends NotFoundServiceException {

    public BetNotFoundException(UUID uuid) {
        super("Bet with id = %s - not found".formatted(uuid));
    }
}