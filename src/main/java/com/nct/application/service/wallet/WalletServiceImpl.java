package com.nct.application.service.wallet;

import com.nct.domain.internal.wallet.WalletModel;
import com.nct.domain.internal.wallet.WalletRepository;
import jakarta.inject.Inject;

public class WalletServiceImpl implements WalletService{

    @Inject
    private WalletRepository walletRepository;

    @Override
    public WalletModel initWallet() {
        WalletModel wallet = new WalletModel();
        walletRepository.initWallet(wallet);
        return wallet;
    }
}
