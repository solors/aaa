package com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p153iR;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.bykv.vk.openvk.bg.bg.bg.iR.IL */
/* loaded from: classes3.dex */
public class C6507IL {

    /* renamed from: bg */
    private static final MessageDigest f13582bg = m91684bg();

    /* renamed from: IL */
    private static final char[] f13581IL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private C6507IL() {
    }

    /* renamed from: bg */
    private static MessageDigest m91684bg() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: bg */
    public static String m91683bg(String str) {
        byte[] digest;
        MessageDigest messageDigest = f13582bg;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        synchronized (C6507IL.class) {
            digest = messageDigest.digest(bytes);
        }
        return m91682bg(digest);
    }

    /* renamed from: bg */
    public static String m91682bg(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f13581IL;
            cArr[i] = cArr2[(b & 240) >> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
