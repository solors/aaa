package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbej {
    public static final zzbdv zza = zzbdv.zzd("gads:init:init_on_bg_thread", true);
    public static final zzbdv zzb = zzbdv.zzd("gads:init:init_on_single_bg_thread", false);
    public static final zzbdv zzc = zzbdv.zzd("gads:adloader_load_bg_thread", true);
    public static final zzbdv zzd = zzbdv.zzd("gads:appopen_load_on_bg_thread", true);
    public static final zzbdv zze = zzbdv.zzd("gads:banner_destroy_bg_thread", false);
    public static final zzbdv zzf = zzbdv.zzd("gads:banner_load_bg_thread", true);
    public static final zzbdv zzg = zzbdv.zzd("gads:banner_pause_bg_thread", false);
    public static final zzbdv zzh = zzbdv.zzd("gads:banner_resume_bg_thread", false);
    public static final zzbdv zzi = zzbdv.zzd("gads:interstitial_load_on_bg_thread", true);
    public static final zzbdv zzj;
    public static final zzbdv zzk;

    static {
        zzbdv.zzd("gads:persist_flags_on_bg_thread", true);
        zzj = zzbdv.zzd("gads:query_info_bg_thread", true);
        zzk = zzbdv.zzd("gads:rewarded_load_bg_thread", true);
    }
}
