package com.five_corp.p372ad.internal;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.five_corp.ad.internal.J */
/* loaded from: classes4.dex */
public abstract class AbstractC13624J {
    /* renamed from: a */
    public static String m78476a(String str) {
        byte[] bArr;
        String str2 = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            bArr = messageDigest.digest();
        } catch (IllegalArgumentException | NoSuchAlgorithmException unused) {
            bArr = null;
        }
        if (bArr != null) {
            str2 = Base64.encodeToString(bArr, 11);
        }
        if (str2 != null) {
            return str2;
        }
        return str.replaceAll("[^a-zA-Z0-9]", "_");
    }
}
