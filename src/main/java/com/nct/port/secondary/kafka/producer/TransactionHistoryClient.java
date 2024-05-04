package com.nct.port.secondary.kafka.producer;

import com.nct.port.secondary.kafka.TopicEnum;
import com.nct.domain.internal.wallet.WalletId;
import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface TransactionHistoryClient {

    @Topic(TopicEnum.TRANSACTION)
    void makeTransactionHistory(@KafkaKey WalletId id, Integer amount);
}