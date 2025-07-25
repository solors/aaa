package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdrv {
    final /* synthetic */ zzdrw zza;
    private final Map zzb = new ConcurrentHashMap();

    @VisibleForTesting
    public zzdrv(zzdrw zzdrwVar) {
        this.zza = zzdrwVar;
    }

    public static /* bridge */ /* synthetic */ zzdrv zza(zzdrv zzdrvVar) {
        Map map;
        zzdrw zzdrwVar = zzdrvVar.zza;
        Map map2 = zzdrvVar.zzb;
        map = zzdrwVar.zzc;
        map2.putAll(map);
        return zzdrvVar;
    }

    public final zzdrv zzb(String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdrv zzc(zzfbo zzfboVar) {
        zzb("aai", zzfboVar.zzw);
        zzb("request_id", zzfboVar.zzan);
        zzb("ad_format", zzfbo.zza(zzfboVar.zzb));
        return this;
    }

    public final zzdrv zzd(zzfbr zzfbrVar) {
        zzb("gqi", zzfbrVar.zzb);
        return this;
    }

    public final String zze() {
        zzdsb zzdsbVar;
        zzdsbVar = this.zza.zza;
        return zzdsbVar.zzb(this.zzb);
    }

    public final void zzf() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdru
            @Override // java.lang.Runnable
            public final void run() {
                zzdrv.this.zzi();
            }
        });
    }

    public final void zzg() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrs
            @Override // java.lang.Runnable
            public final void run() {
                zzdrv.this.zzj();
            }
        });
    }

    public final void zzh() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrt
            @Override // java.lang.Runnable
            public final void run() {
                zzdrv.this.zzk();
            }
        });
    }

    public final /* synthetic */ void zzi() {
        zzdsb zzdsbVar;
        zzdsbVar = this.zza.zza;
        zzdsbVar.zze(this.zzb);
    }

    public final /* synthetic */ void zzj() {
        zzdsb zzdsbVar;
        zzdsbVar = this.zza.zza;
        zzdsbVar.zzg(this.zzb);
    }

    public final /* synthetic */ void zzk() {
        zzdsb zzdsbVar;
        zzdsbVar = this.zza.zza;
        zzdsbVar.zzf(this.zzb);
    }
}
