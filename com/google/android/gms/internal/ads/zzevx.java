package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzevx {
    private final zzbvk zza;
    private final int zzb;

    public zzevx(zzbvk zzbvkVar, int i) {
        this.zza = zzbvkVar;
        this.zzb = i;
    }

    public final int zza() {
        return this.zzb;
    }

    @Nullable
    public final PackageInfo zzb() {
        return this.zza.zzf;
    }

    public final String zzc() {
        return this.zza.zzd;
    }

    public final String zzd() {
        return zzfve.zzc(this.zza.zza.getString("ms"));
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final List zzf() {
        return this.zza.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzg() {
        return this.zza.zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzh() {
        return this.zza.zza.getBoolean("is_gbid");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzi() {
        return this.zza.zzk;
    }
}
