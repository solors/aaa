package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
abstract class zzaex {
    protected final zzadt zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzaex(zzadt zzadtVar) {
        this.zza = zzadtVar;
    }

    protected abstract boolean zza(zzdy zzdyVar) throws zzbc;

    protected abstract boolean zzb(zzdy zzdyVar, long j) throws zzbc;

    public final boolean zzf(zzdy zzdyVar, long j) throws zzbc {
        if (zza(zzdyVar) && zzb(zzdyVar, j)) {
            return true;
        }
        return false;
    }
}
