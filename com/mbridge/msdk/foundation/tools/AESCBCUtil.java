package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.mbridge.msdk.foundation.tools.a */
/* loaded from: classes6.dex */
public final class AESCBCUtil {

    /* renamed from: b */
    private static byte[] f56856b = new byte[32];

    /* renamed from: a */
    private static byte[] f56855a = new byte[16];

    /* compiled from: AESCBCUtil.java */
    /* renamed from: com.mbridge.msdk.foundation.tools.a$a */
    /* loaded from: classes6.dex */
    public static class C22031a extends Provider {
        public C22031a() {
            super("Crypto", 1.0d, "HARMONY (SHA1 digest; SecureRandom; SHA1withDSA signature)");
            put("SecureRandom.SHA1PRNG", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl");
            put("SecureRandom.SHA1PRNG ImplementedIn", ExifInterface.TAG_SOFTWARE);
        }
    }

    static {
        String m51603a = SameBase64Tool.m51603a("HkzwDFeD4QuyLdx5igfZYcu9xTM9NN==");
        if (!TextUtils.isEmpty(m51603a)) {
            try {
                byte[] digest = MessageDigest.getInstance("sha-384").digest(m51603a.getBytes());
                System.arraycopy(digest, 0, f56856b, 0, 32);
                System.arraycopy(digest, 32, f56855a, 0, 16);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static String m51909a(String str) {
        return m51908a(str, f56856b, f56855a);
    }

    /* renamed from: a */
    private static String m51908a(String str, byte[] bArr, byte[] bArr2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Security.addProvider(new C22031a());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return new String(Base64.encode(cipher.doFinal(str.getBytes()), 0));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
