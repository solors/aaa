package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgho {
    public static final zzgho zza = new zzgho("ASSUME_AES_GCM");
    public static final zzgho zzb = new zzgho("ASSUME_XCHACHA20POLY1305");
    public static final zzgho zzc = new zzgho("ASSUME_CHACHA20POLY1305");
    public static final zzgho zzd = new zzgho("ASSUME_AES_CTR_HMAC");
    public static final zzgho zze = new zzgho("ASSUME_AES_EAX");
    public static final zzgho zzf = new zzgho("ASSUME_AES_GCM_SIV");
    private final String zzg;

    private zzgho(String str) {
        this.zzg = str;
    }

    public final String toString() {
        return this.zzg;
    }
}
