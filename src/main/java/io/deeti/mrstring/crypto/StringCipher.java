package io.deeti.mrstring.crypto;

import io.deeti.mrstring.assertion.Assert;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.util.Base64;

/**
 * StringCipher for encryption and decryption
 */
public class StringCipher {

    private static String DEFAULT_CIPHER_ALGORITHM = CipherAlgorithms.AES_CBC_PKCS5Padding;
    private static String DEFAULT_SECRET_KEY_ALGORITHM = "AES";

    /***
     * Encrypts value using {@link Base64}
     * @param value Data value
     * @param key SecretKey
     * @return {@link Base64} encoded encrypted String
     */
    public static String encrypt(String value, String key) {
        Assert.notNulls(value, key);

        String encrypted = null;

        Key encryptSecretKey = new SecretKeySpec(key.getBytes(), DEFAULT_SECRET_KEY_ALGORITHM);
        try {
            Cipher cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, encryptSecretKey, new IvParameterSpec(new byte[16]));

            byte[] encryptedAttrBytes = cipher.doFinal(value.getBytes());
            encrypted = Base64.getEncoder()
                    .encodeToString(encryptedAttrBytes);

        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
        return encrypted;
    }
}
