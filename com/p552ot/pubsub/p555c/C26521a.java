package com.p552ot.pubsub.p555c;

import android.util.Base64;
import com.google.common.primitives.SignedBytes;
import com.p552ot.pubsub.util.C26585i;
import com.p552ot.pubsub.util.C26586j;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.ot.pubsub.c.a */
/* loaded from: classes7.dex */
public class C26521a {

    /* renamed from: a */
    public static final String f69392a = m41369b();

    /* renamed from: b */
    public static final String f69393b = m41365c();

    /* renamed from: c */
    private static final String f69394c = "AES";

    /* renamed from: d */
    private static final String f69395d = "AES/ECB/PKCS5Padding";

    /* renamed from: e */
    private static final String f69396e = "AES";

    /* renamed from: f */
    private static KeyGenerator f69397f;

    static {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            f69397f = keyGenerator;
            keyGenerator.init(128);
        } catch (Exception e) {
            C26586j.m41073b("AES", "AesUtil e", e);
        }
    }

    /* renamed from: a */
    public static byte[] m41374a() {
        return f69397f.generateKey().getEncoded();
    }

    /* renamed from: b */
    public static byte[] m41366b(byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance(f69395d);
            cipher.init(2, secretKeySpec);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            C26586j.m41073b("AES", "decrypt exception:", e);
            C26586j.m41074b("AES", "content len=" + bArr.length + ", passwd len=" + bArr2.length);
            return null;
        }
    }

    /* renamed from: c */
    private static byte[] m41364c(String str) {
        if (str == null || str.length() < 1) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < str.length() / 2; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            bArr[i] = (byte) ((Integer.parseInt(str.substring(i2, i3), 16) * 16) + Integer.parseInt(str.substring(i3, i2 + 2), 16));
        }
        return bArr;
    }

    /* renamed from: d */
    public static String m41362d(String str, String str2) {
        return new String(m41371a(Base64.decode(str, 10), str2));
    }

    /* renamed from: e */
    private static byte[] m41361e(String str, String str2) {
        return m41370a(str.getBytes(), str2.getBytes());
    }

    /* renamed from: a */
    public static byte[] m41370a(byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance(f69395d);
            cipher.init(1, secretKeySpec);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            C26586j.m41073b("AES", "encrypt exception:", e);
            return null;
        }
    }

    /* renamed from: a */
    private static byte[] m41371a(byte[] bArr, String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(m41368b(str), "AES");
            Cipher cipher = Cipher.getInstance(f69395d);
            cipher.init(2, secretKeySpec);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            C26586j.m41078a("AES", "decrypt exception:", e);
            return null;
        }
    }

    /* renamed from: b */
    private static byte[] m41368b(String str) {
        if (str != null) {
            return str.getBytes();
        }
        return null;
    }

    /* renamed from: c */
    public static String m41363c(String str, String str2) {
        return new String(m41371a(m41364c(str), str2));
    }

    /* renamed from: b */
    public static String m41367b(String str, String str2) {
        return Base64.encodeToString(m41361e(str, str2), 10);
    }

    /* renamed from: b */
    private static String m41369b() {
        try {
            return new String("6AiSfshj3pD/9r91".getBytes(), "UTF-8");
        } catch (Exception e) {
            C26586j.m41074b("AES", e.getMessage());
            return "";
        }
    }

    /* renamed from: c */
    private static String m41365c() {
        try {
            return new String(new byte[]{104, 42, 89, 51, 49, 93, 99, 33, SignedBytes.MAX_POWER_OF_TWO, 53, 78, 115, 95, 106, 80, 115, 118, 101, 106, 33, SignedBytes.MAX_POWER_OF_TWO, 51, 91, 40, 42, 119, 40, 33, 108}, "UTF-8");
        } catch (Exception e) {
            C26586j.m41074b("AES", e.getMessage());
            return "";
        }
    }

    /* renamed from: a */
    public static String m41372a(String str, String str2) {
        return C26585i.m41086a(m41361e(str, str2));
    }

    /* renamed from: a */
    public static String m41373a(String str) {
        try {
            char[] charArray = (str + C26522b.f69398a).toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                for (int i2 = 0; i2 < charArray.length - 1; i2++) {
                    char c = charArray[i];
                    char c2 = charArray[i2];
                    if (c < c2) {
                        charArray[i] = c2;
                        charArray[i2] = c;
                    }
                }
            }
            return C26524d.m41329h(new String(charArray));
        } catch (Exception unused) {
            C26586j.m41074b("AES", "encodeFromSalt ");
            return "";
        }
    }
}
