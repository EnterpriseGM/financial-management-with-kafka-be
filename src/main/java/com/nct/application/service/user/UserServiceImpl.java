package com.nct.application.service.user;

import com.nct.application.service.wallet.WalletService;
import com.nct.domain.internal.user.UserModel;
import com.nct.domain.internal.wallet.WalletModel;
import jakarta.inject.Inject;

public class UserServiceImpl implements UserService {

    @Inject
    private WalletService walletService;

    @Override
    public void createUser(String username, String password) {
        WalletModel wallet = walletService.initWallet();
        UserModel user = new UserModel(username, password, wallet.getId());
    }
}
