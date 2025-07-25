package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zztq implements zzwa {
    private final zzfxn zza;
    private long zzb;

    public zztq(List list, List list2) {
        boolean z;
        zzfxk zzfxkVar = new zzfxk();
        if (list.size() == list2.size()) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzd(z);
        for (int i = 0; i < list.size(); i++) {
            zzfxkVar.zzf(new zztp((zzwa) list.get(i), (List) list2.get(i)));
        }
        this.zza = zzfxkVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final long zzb() {
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        for (int i = 0; i < this.zza.size(); i++) {
            zztp zztpVar = (zztp) this.zza.get(i);
            long zzb = zztpVar.zzb();
            if ((zztpVar.zza().contains(1) || zztpVar.zza().contains(2) || zztpVar.zza().contains(4)) && zzb != Long.MIN_VALUE) {
                j = Math.min(j, zzb);
            }
            if (zzb != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzb);
            }
        }
        if (j != Long.MAX_VALUE) {
            this.zzb = j;
            return j;
        } else if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j3 = this.zzb;
            if (j3 != -9223372036854775807L) {
                return j3;
            }
            return j2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final long zzc() {
        long j = Long.MAX_VALUE;
        for (int i = 0; i < this.zza.size(); i++) {
            long zzc = ((zztp) this.zza.get(i)).zzc();
            if (zzc != Long.MIN_VALUE) {
                j = Math.min(j, zzc);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final void zzm(long j) {
        for (int i = 0; i < this.zza.size(); i++) {
            ((zztp) this.zza.get(i)).zzm(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final boolean zzo(zzkj zzkjVar) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (int i = 0; i < this.zza.size(); i++) {
                long zzc2 = ((zztp) this.zza.get(i)).zzc();
                if (zzc2 != Long.MIN_VALUE && zzc2 <= zzkjVar.zza) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (zzc2 == zzc || z2) {
                    z |= ((zztp) this.zza.get(i)).zzo(zzkjVar);
                }
            }
            z3 |= z;
        } while (z);
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final boolean zzp() {
        for (int i = 0; i < this.zza.size(); i++) {
            if (((zztp) this.zza.get(i)).zzp()) {
                return true;
            }
        }
        return false;
    }
}
