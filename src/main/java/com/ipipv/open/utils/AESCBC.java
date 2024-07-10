package com.ipipv.open.utils;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class AESCBC {
    public static byte[] encryptCBC(byte[] data, byte[] key, byte[] iv) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"), new IvParameterSpec(iv));
        byte[] result = cipher.doFinal(data);
        return result;
    }

    public static byte[] decryptCBC(byte[] data, byte[] key, byte[] iv) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key, "AES"), new IvParameterSpec(iv));
        byte[] result = cipher.doFinal(data);
        return result;
    }

    public static void main(String[] args) throws IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException {
        String data = "TestMessage"; // 待加密的原文
        String key = "qwertyuiop123456asdfghjk"; // key 长度只能是 16、24 或 32 字节
        String iv = key.substring(0,16); // CBC 模式需要用到初始向量参数

        byte[] ciphertext = encryptCBC(data.getBytes(), key.getBytes(), iv.getBytes());
        System.out.println("CBC 模式加密结果（Base64）：" + Base64.getEncoder().encodeToString(ciphertext));

        byte[] plaintext = decryptCBC(ciphertext, key.getBytes(), iv.getBytes());
        System.out.println("解密结果：" + new String(plaintext));
    }
}

