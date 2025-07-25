package com.google.android.gms.internal.ads;

import android.util.Base64;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzatr {
    public static String zza(byte[] bArr, boolean z) {
        int i;
        if (true != z) {
            i = 2;
        } else {
            i = 11;
        }
        return Base64.encodeToString(bArr, i);
    }

    public static byte[] zzb(String str, boolean z) throws IllegalArgumentException {
        byte[] decode = Base64.decode(str, 2);
        if (decode.length == 0 && str.length() > 0) {
            throw new IllegalArgumentException("Unable to decode ".concat(str));
        }
        return decode;
    }
}
