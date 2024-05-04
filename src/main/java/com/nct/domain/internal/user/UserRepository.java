package com.nct.domain.internal.user;

interface UserRepository {
    void create(UserModel user);
    void update(UserModel user);
    UserModel findBy(UserId id);
}
