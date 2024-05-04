package com.nct.domain.internal.transaction;

import com.nct.domain.internal.DefaultTimestamp;
import com.nct.domain.internal.user.UserId;

import io.micronaut.core.annotation.Creator;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class TransactionHistoryModel extends DefaultTimestamp {
    @NotNull
    private final UserId senderId;
    @NotNull
    private final UserId receiverId;
    @Min(0)
    @NotNull
    private final Integer transactionAmount;

    @Creator
    public TransactionHistoryModel(UserId senderId, UserId receiverId, Integer transactionAmount) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.transactionAmount = transactionAmount;
    }

    public UserId getSenderId() {
        return senderId;
    }

    public UserId getReceiverId() {
        return receiverId;
    }

    public Integer getTransactionHistoryAmount() {
        return transactionAmount;
    }
}
