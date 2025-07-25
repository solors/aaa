package com.google.android.gms.internal.p383authapi;

import android.util.Base64;
import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
/* renamed from: com.google.android.gms.internal.auth-api.zbbj */
/* loaded from: classes5.dex */
public final class zbbj {
    private static final SecureRandom zba = new SecureRandom();

    public static String zba() {
        byte[] bArr = new byte[16];
        zba.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
