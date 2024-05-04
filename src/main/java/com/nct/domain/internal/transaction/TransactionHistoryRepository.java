package com.nct.domain.internal.transaction;

import com.nct.domain.internal.user.UserId;

interface TransactionHistoryRepository {
    TransactionHistoryModel create(UserId senderId, UserId receiverId, Integer transactionAmount);
    TransactionHistoryModel[] listBySender(UserId senderId);
    TransactionHistoryModel[] listByReceiver(UserId receiverId);
}
