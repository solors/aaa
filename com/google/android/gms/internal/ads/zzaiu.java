package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzaiu {
    public final zzajb zza;
    public final zzaje zzb;
    public final zzadt zzc;
    @Nullable
    public final zzadu zzd;
    public int zze;

    public zzaiu(zzajb zzajbVar, zzaje zzajeVar, zzadt zzadtVar) {
        zzadu zzaduVar;
        this.zza = zzajbVar;
        this.zzb = zzajeVar;
        this.zzc = zzadtVar;
        if ("audio/true-hd".equals(zzajbVar.zzg.zzo)) {
            zzaduVar = new zzadu();
        } else {
            zzaduVar = null;
        }
        this.zzd = zzaduVar;
    }
}
