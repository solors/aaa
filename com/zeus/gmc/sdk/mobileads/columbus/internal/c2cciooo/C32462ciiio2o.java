package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.ciiio2o */
/* loaded from: classes8.dex */
public final class C32462ciiio2o {
    private static final AtomicLong coi222o222 = new AtomicLong(1);
    private static final String coo2iico = "Utils";

    private C32462ciiio2o() {
    }

    private static boolean c2oc2i(char c) {
        if (c >= 1024 && c <= 1279) {
            return true;
        }
        return false;
    }

    private static boolean coi222o222(char c) {
        return c >= 256 && c <= 591;
    }

    public static String coo2iico(byte[] bArr) {
        String str;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(bArr);
            str = String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
        } catch (Exception unused) {
            str = "";
        }
        return str.toLowerCase();
    }

    public static String coi222o222(String str) {
        if (TextUtils.isEmpty(str)) {
            return ".*";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (coo2iico(charAt) || c2oc2i(charAt) || coi222o222(charAt)) {
                sb2.append(".*");
                sb2.append(charAt);
            }
        }
        if (!TextUtils.isEmpty(sb2)) {
            sb2.insert(0, "(?i)");
        }
        sb2.append(".*");
        return sb2.toString();
    }

    public static String coo2iico(String str) {
        if (str == null) {
            str = "";
        }
        return coo2iico(str.getBytes());
    }

    public static long coo2iico() {
        AtomicLong atomicLong;
        long j;
        long j2;
        do {
            atomicLong = coi222o222;
            j = atomicLong.get();
            j2 = j + 1;
        } while (!atomicLong.compareAndSet(j, j2 <= 9223372036854775806L ? j2 : 1L));
        return j;
    }

    public static boolean coo2iico(long j, long j2) {
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public static Set<String> coo2iico(C32445c22o22co22i c32445c22o22co22i, String str, Set<String> set) {
        if (c32445c22o22co22i == null) {
            return new HashSet();
        }
        Set<String> coo2iico2 = c32445c22o22co22i.coo2iico(str, set);
        if (coo2iico2 == null) {
            return new HashSet();
        }
        return new HashSet(coo2iico2);
    }

    private static boolean coo2iico(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }
}
