package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgfh {
    public static final zzgfh zza = new zzgfh("SHA1");
    public static final zzgfh zzb = new zzgfh("SHA224");
    public static final zzgfh zzc = new zzgfh("SHA256");
    public static final zzgfh zzd = new zzgfh("SHA384");
    public static final zzgfh zze = new zzgfh("SHA512");
    private final String zzf;

    private zzgfh(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
