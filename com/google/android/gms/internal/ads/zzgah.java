package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgah {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zza(double d) {
        zzfun.zzf(zzb(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        if (exponent == -1023) {
            return doubleToRawLongBits + doubleToRawLongBits;
        }
        return doubleToRawLongBits | 4503599627370496L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzb(double d) {
        if (Math.getExponent(d) <= 1023) {
            return true;
        }
        return false;
    }
}
