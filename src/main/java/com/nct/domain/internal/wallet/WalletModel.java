package com.nct.domain.internal.wallet;

import com.nct.domain.internal.DefaultTimestamp;

import io.micronaut.core.annotation.Creator;
import io.micronaut.core.annotation.Introspected;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@Introspected
public class WalletModel extends DefaultTimestamp implements Comparable<WalletModel> {
    private static final Long INITIAL_WALLET_BALANCE = 0L;
    @NotNull
    private final WalletId id;
    @Min(0)
    @NotNull
    private Long balance;

    @Creator
    public WalletModel() {
        this.id = new WalletId(UUID.randomUUID());
        this.balance = INITIAL_WALLET_BALANCE;
    }

    @Creator
    public WalletModel(WalletId id, Long balance) {
        this.id = id;
        this.balance = balance;
    }

    @Override
    public int compareTo(WalletModel o) {
        return balance.compareTo(o.balance);
    }

    public WalletId getId() {
        return id;
    }

    public Long getBalance() {
        return balance;
    }
}
