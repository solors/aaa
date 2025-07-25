package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzflc {
    private final String zza;
    private final String zzb;

    private zzflc(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzflc zza(String str, String str2) {
        zzfmk.zzb(str, "Name is null or empty");
        zzfmk.zzb(str2, "Version is null or empty");
        return new zzflc(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
