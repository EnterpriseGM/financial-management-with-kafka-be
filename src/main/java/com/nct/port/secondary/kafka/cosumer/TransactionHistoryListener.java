package com.nct.port.secondary.kafka.cosumer;

import com.nct.utils.Logging;
import com.nct.port.secondary.kafka.TopicEnum;
import com.nct.domain.internal.wallet.WalletId;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaListener(offsetReset = OffsetReset.EARLIEST)
public class TransactionHistoryListener extends Logging {

    @Topic(TopicEnum.TRANSACTION)
    public void receive(@KafkaKey WalletId id, Integer amount) {
        log.info("TransactionHistory with amount: {}", amount);

    }
}