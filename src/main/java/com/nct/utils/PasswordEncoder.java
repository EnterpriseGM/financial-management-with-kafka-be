package com.nct.utils;

import com.nct.domain.internal.Hash;
import com.nct.utils.exceptions.PasswordEncoderException;

import jakarta.inject.Singleton;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.SecureRandom;
import java.security.spec.KeySpec;

@Singleton
public class PasswordEncoder implements Hash<String> {
    private static final Integer KEY_LENGTH = 128;
    private static final Integer ITERATION_COUNT = 65536;
    private static final String ALGORITHM = "PBKDF2WithHmacSHA1";
    private static final String HASH_ERROR_MESSAGE = "Error with hash method";

    @Override
    public String hash(String s) throws PasswordEncoderException {
        try {
            SecureRandom random = new SecureRandom();
            byte[] salt = new byte[16];
            random.nextBytes(salt);

            KeySpec spec = new PBEKeySpec(s.toCharArray(), salt, ITERATION_COUNT, KEY_LENGTH);
            SecretKeyFactory factory = SecretKeyFactory.getInstance(ALGORITHM);

            byte[] hash = factory.generateSecret(spec).getEncoded();
            return hash.toString();
        } catch (Exception e) {
            throw new PasswordEncoderException(HASH_ERROR_MESSAGE);
        }
    }

    @Override
    public boolean verify(String rawPassword, String encodePassword) {
        try {
            return this.hash(rawPassword).equals(encodePassword);
        } catch (PasswordEncoderException e) {
            return false;
        }
    }
}
