package com.p551my.tracker.obfuscated;

import java.security.MessageDigest;

/* renamed from: com.my.tracker.obfuscated.n */
/* loaded from: classes7.dex */
public final class C26372n {
    /* renamed from: a */
    public static String m41919a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                sb2.append(String.format("%02X", Byte.valueOf(digest[i])));
            }
            return sb2.toString().toLowerCase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
