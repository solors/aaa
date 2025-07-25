package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgan {
    public static char zza(long j) {
        boolean z;
        char c = (char) j;
        if (c == j) {
            z = true;
        } else {
            z = false;
        }
        zzfun.zzh(z, "Out of range: %s", j);
        return c;
    }

    public static char zzb(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }
}
