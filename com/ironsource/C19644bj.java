package com.ironsource;

import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* renamed from: com.ironsource.bj */
/* loaded from: classes6.dex */
public class C19644bj {

    /* renamed from: a */
    public static final int f49291a = 1024;

    /* renamed from: b */
    public static final String f49292b = "RSA/ECB/PKCS1Padding";

    /* renamed from: a */
    public static String m59304a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Base64.encodeToString(m59302a(str.getBytes("UTF-8"), m59305a(str2)), 0).replaceAll(System.getProperty("line.separator"), "");
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception on string encryption error: " + e.getMessage());
            return "";
        }
    }

    /* renamed from: a */
    public static KeyPair m59306a() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(f49292b);
            keyPairGenerator.initialize(1024);
            return keyPairGenerator.genKeyPair();
        } catch (NoSuchAlgorithmException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception on key generation error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static RSAPublicKey m59305a(String str) throws NoSuchAlgorithmException, InvalidKeySpecException, UnsupportedEncodingException {
        return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
    }

    /* renamed from: a */
    public static byte[] m59303a(byte[] bArr, PrivateKey privateKey) {
        try {
            Cipher cipher = Cipher.getInstance(f49292b);
            cipher.init(2, privateKey);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception on decryption error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static byte[] m59302a(byte[] bArr, PublicKey publicKey) {
        try {
            Cipher cipher = Cipher.getInstance(f49292b);
            cipher.init(1, publicKey);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception on encryption error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
