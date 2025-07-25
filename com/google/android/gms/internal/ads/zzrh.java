package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzrh {
    public static final boolean zza;

    static {
        boolean z = false;
        if ("Amazon".equals(zzei.zzc)) {
            String str = zzei.zzd;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            }
        }
        zza = z;
    }
}
