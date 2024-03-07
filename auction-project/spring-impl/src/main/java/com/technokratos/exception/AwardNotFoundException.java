package com.technokratos.exception;

import java.util.UUID;

public class AwardNotFoundException extends NotFoundServiceException {

    public AwardNotFoundException(UUID uuid) {
        super("Award with id = %s - not found".formatted(uuid));
    }
}
