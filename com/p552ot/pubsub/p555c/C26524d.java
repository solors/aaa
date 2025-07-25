package com.p552ot.pubsub.p555c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.p552ot.pubsub.util.C26586j;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.ot.pubsub.c.d */
/* loaded from: classes7.dex */
public class C26524d {

    /* renamed from: a */
    private static final String f69406a = "DigestUtil";

    /* renamed from: b */
    private static final char[] f69407b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c */
    private static final char[] f69408c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    static MessageDigest m41346a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /* renamed from: b */
    public static byte[] m41340b(String str) {
        return m41344a(m41345a(str, "UTF-8"));
    }

    /* renamed from: c */
    public static String m41337c(String str) {
        return m41343a(m41340b(str), true);
    }

    /* renamed from: d */
    public static String m41335d(String str) {
        return m41343a(m41330g(str), true);
    }

    /* renamed from: e */
    public static String m41333e(String str) {
        return m41343a(m41331f(str), true);
    }

    /* renamed from: f */
    public static byte[] m41331f(String str) {
        return m41336c(m41345a(str, "UTF-8"));
    }

    /* renamed from: g */
    public static byte[] m41330g(String str) {
        return m41338c().digest(m41345a(str, "UTF-8"));
    }

    /* renamed from: h */
    public static String m41329h(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return m41332e(str.getBytes());
    }

    /* renamed from: b */
    public static String m41339b(byte[] bArr) {
        return m41343a(m41344a(bArr), true);
    }

    /* renamed from: c */
    private static MessageDigest m41338c() {
        return m41346a("SHA1");
    }

    /* renamed from: d */
    public static String m41334d(byte[] bArr) {
        return m41343a(m41336c(bArr), true);
    }

    /* renamed from: e */
    public static String m41332e(byte[] bArr) {
        String format;
        if (bArr != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                messageDigest.update(bArr);
                format = String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
            } catch (Exception e) {
                C26586j.m41074b(f69406a, "getMD5 exception: " + e);
            }
            return format.toLowerCase();
        }
        format = "";
        return format.toLowerCase();
    }

    /* renamed from: a */
    private static MessageDigest m41347a() {
        return m41346a(SameMD5.TAG);
    }

    /* renamed from: b */
    private static MessageDigest m41341b() {
        return m41346a("SHA-256");
    }

    /* renamed from: c */
    public static byte[] m41336c(byte[] bArr) {
        return m41341b().digest(bArr);
    }

    /* renamed from: a */
    public static byte[] m41344a(byte[] bArr) {
        return m41347a().digest(bArr);
    }

    /* renamed from: a */
    public static String m41343a(byte[] bArr, boolean z) {
        return new String(m41342a(bArr, z ? f69407b : f69408c));
    }

    /* renamed from: a */
    private static char[] m41342a(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b & 240) >>> 4];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return cArr2;
    }

    /* renamed from: a */
    private static byte[] m41345a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
