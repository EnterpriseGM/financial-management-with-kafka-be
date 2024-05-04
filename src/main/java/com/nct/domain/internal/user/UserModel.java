package com.nct.domain.internal.user;

import com.nct.domain.internal.DefaultTimestamp;

import com.nct.domain.internal.wallet.WalletId;
import io.micronaut.core.annotation.Introspected;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import java.sql.Timestamp;

@Introspected
public class UserModel extends DefaultTimestamp {
    @NotNull
    private UserId id;
    @Max(30)
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private final WalletId walletId;

    public UserModel(UserId id, String username, String password, WalletId walletId, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.walletId = walletId;
        super.createdAt = createdAt;
        super.updatedAt = updatedAt;
    }

    public UserModel(String username, String password, WalletId walletId) {
        super();
        this.username = username;
        this.password = password;
        this.walletId = walletId;
    }

    public UserId getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public WalletId getWalletId() {
        return walletId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
