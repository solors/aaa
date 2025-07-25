package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdm {
    public final Object zza;
    private zzv zzb = new zzv();
    private boolean zzc;
    private boolean zzd;

    public zzdm(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzdm.class == obj.getClass()) {
            return this.zza.equals(((zzdm) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i, zzdk zzdkVar) {
        if (!this.zzd) {
            if (i != -1) {
                this.zzb.zza(i);
            }
            this.zzc = true;
            zzdkVar.zza(this.zza);
        }
    }

    public final void zzb(zzdl zzdlVar) {
        if (!this.zzd && this.zzc) {
            zzx zzb = this.zzb.zzb();
            this.zzb = new zzv();
            this.zzc = false;
            zzdlVar.zza(this.zza, zzb);
        }
    }

    public final void zzc(zzdl zzdlVar) {
        this.zzd = true;
        if (this.zzc) {
            this.zzc = false;
            zzdlVar.zza(this.zza, this.zzb.zzb());
        }
    }
}
