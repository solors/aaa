package com.ironsource.mediationsdk.utils;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.C20086i9;
import com.ironsource.C20972si;
import com.ironsource.C21218xa;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public class IronSourceAES {
    /* renamed from: a */
    private static SecretKeySpec m56464a(String str) throws UnsupportedEncodingException {
        int i = 32;
        byte[] bArr = new byte[32];
        Arrays.fill(bArr, (byte) 0);
        byte[] bytes = str.getBytes("UTF-8");
        if (bytes.length < 32) {
            i = bytes.length;
        }
        System.arraycopy(bytes, 0, bArr, 0, i);
        return new SecretKeySpec(bArr, "AES");
    }

    public static synchronized String compressAndEncrypt(String str) {
        String compressAndEncrypt;
        synchronized (IronSourceAES.class) {
            compressAndEncrypt = compressAndEncrypt(C21218xa.m54153b().m54152c(), str);
        }
        return compressAndEncrypt;
    }

    public static synchronized String decode(String str, String str2) {
        synchronized (IronSourceAES.class) {
            byte[] decodeToBytes = decodeToBytes(str, str2);
            if (decodeToBytes != null) {
                return new String(decodeToBytes);
            }
            return "";
        }
    }

    public static synchronized byte[] decodeToBytes(String str, String str2) {
        synchronized (IronSourceAES.class) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            try {
                SecretKeySpec m56464a = m56464a(str);
                byte[] bArr = new byte[16];
                Arrays.fill(bArr, (byte) 0);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                byte[] decode = Base64.decode(str2, 0);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(2, m56464a, ivParameterSpec);
                return cipher.doFinal(decode);
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception on decryption error: " + e.getMessage());
                return null;
            }
        }
    }

    public static synchronized String decryptAndDecompress(String str) {
        String decryptAndDecompress;
        synchronized (IronSourceAES.class) {
            decryptAndDecompress = decryptAndDecompress(C21218xa.m54153b().m54152c(), str);
        }
        return decryptAndDecompress;
    }

    public static synchronized String encode(String str, String str2) {
        synchronized (IronSourceAES.class) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (TextUtils.isEmpty(str2)) {
                return "";
            }
            try {
                return encodeFromBytes(str, str2.getBytes("UTF8"));
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error(e.toString());
                return "";
            }
        }
    }

    @SuppressLint({"TrulyRandom"})
    public static synchronized String encodeFromBytes(String str, byte[] bArr) {
        synchronized (IronSourceAES.class) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (bArr == null) {
                return "";
            }
            try {
                SecretKeySpec m56464a = m56464a(str);
                byte[] bArr2 = new byte[16];
                Arrays.fill(bArr2, (byte) 0);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(1, m56464a, ivParameterSpec);
                return Base64.encodeToString(cipher.doFinal(bArr), 0).replaceAll(System.getProperty("line.separator"), "");
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error(e.toString());
                return "";
            }
        }
    }

    public static synchronized String encrypt(String str) {
        String encode;
        synchronized (IronSourceAES.class) {
            encode = encode(C21218xa.m54153b().m54152c(), str);
        }
        return encode;
    }

    public static synchronized String compressAndEncrypt(String str, String str2) {
        synchronized (IronSourceAES.class) {
            if (TextUtils.isEmpty(str2)) {
                return "";
            }
            try {
                byte[] m54956a = C20972si.m54956a(str2);
                if (m54956a != null) {
                    return encodeFromBytes(str, m54956a);
                }
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            return "";
        }
    }

    public static synchronized String decryptAndDecompress(String str, String str2) {
        synchronized (IronSourceAES.class) {
            if (TextUtils.isEmpty(str2)) {
                return "";
            }
            try {
                byte[] decodeToBytes = decodeToBytes(str, str2);
                if (decodeToBytes != null) {
                    return C20972si.m54954a(decodeToBytes);
                }
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            return "";
        }
    }
}
