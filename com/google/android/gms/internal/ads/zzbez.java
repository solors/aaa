package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbez {
    public static final zzbdv zza = zzbdv.zzd("gads:trustless_token_for_decagon:enabled", true);
    public static final zzbdv zzb;

    static {
        zzbdv.zzd("gads:invalidate_token_at_refresh_start", true);
        zzbdv.zzd("gms:expose_token_for_gma:enabled", true);
        zzbdv.zzd("gads:referesh_rate_limit", false);
        zzb = zzbdv.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        zzbdv.zzd("gads:token_anonymization:enabled", true);
        zzbdv.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}
