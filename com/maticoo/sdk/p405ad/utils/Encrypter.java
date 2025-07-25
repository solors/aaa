package com.maticoo.sdk.p405ad.utils;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.maticoo.sdk.ad.utils.Encrypter */
/* loaded from: classes6.dex */
public class Encrypter {
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    private Encrypter() {
    }

    public static String byte2hex(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb2.append("0");
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    public static byte[] encrypt(String str, byte[] bArr) {
        try {
            return MessageDigest.getInstance(str).digest(bArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String md5(String str) {
        return md5(str, UTF_8);
    }

    public static String md5(String str, Charset charset) {
        return byte2hex(encrypt(SameMD5.TAG, str.getBytes(charset)));
    }
}
