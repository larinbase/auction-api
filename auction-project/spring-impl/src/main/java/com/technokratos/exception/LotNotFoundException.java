package com.technokratos.exception;

import java.util.UUID;

public class LotNotFoundException extends NotFoundServiceException {

    public LotNotFoundException(UUID uuid) {
        super("Lot with id = %s - not found".formatted(uuid));
    }
}
