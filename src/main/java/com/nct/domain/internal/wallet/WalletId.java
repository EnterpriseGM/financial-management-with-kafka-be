package com.nct.domain.internal.wallet;

import com.nct.domain.internal.Identifier;

import java.util.UUID;
import io.micronaut.core.annotation.Creator;
import io.micronaut.core.annotation.Introspected;
import jakarta.validation.constraints.NotNull;

@Introspected
public class WalletId implements Identifier<UUID> {
    @NotNull
    private final UUID id;

    @Creator
    public WalletId(UUID id) {
        this.id = id;
    }

    @Override
    public UUID getIdentifier() {
        return id;
    }
}
