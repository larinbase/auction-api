package com.technokratos.exception;

import java.util.UUID;

public class AuctionNotFoundException extends NotFoundServiceException {

    public AuctionNotFoundException(UUID uuid) {
        super("Auction with id = %s - not found".formatted(uuid));
    }
}
