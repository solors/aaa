package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zztj implements zzvy {
    public final zzvy zza;
    final /* synthetic */ zztk zzb;
    private boolean zzc;

    public zztj(zztk zztkVar, zzvy zzvyVar) {
        this.zzb = zztkVar;
        this.zza = zzvyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zza(zzke zzkeVar, zzhh zzhhVar, int i) {
        zztk zztkVar = this.zzb;
        if (zztkVar.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzhhVar.zzc(4);
            return -4;
        }
        long zzb = zztkVar.zzb();
        int zza = this.zza.zza(zzkeVar, zzhhVar, i);
        if (zza == -5) {
            zzab zzabVar = zzkeVar.zza;
            zzabVar.getClass();
            int i2 = zzabVar.zzG;
            int i3 = 0;
            if (i2 == 0) {
                if (zzabVar.zzH != 0) {
                    i2 = 0;
                }
                return -5;
            }
            if (this.zzb.zzb == Long.MIN_VALUE) {
                i3 = zzabVar.zzH;
            }
            zzz zzb2 = zzabVar.zzb();
            zzb2.zzG(i2);
            zzb2.zzH(i3);
            zzkeVar.zza = zzb2.zzag();
            return -5;
        }
        long j = this.zzb.zzb;
        if (j != Long.MIN_VALUE && ((zza == -4 && zzhhVar.zze >= j) || (zza == -3 && zzb == Long.MIN_VALUE && !zzhhVar.zzd))) {
            zzhhVar.zzb();
            zzhhVar.zzc(4);
            this.zzc = true;
            return -4;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zzb(long j) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final boolean zze() {
        if (!this.zzb.zzq() && this.zza.zze()) {
            return true;
        }
        return false;
    }
}
