package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zznz {
    final /* synthetic */ zzoa zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzug zze;
    private boolean zzf;
    private boolean zzg;

    public zznz(zzoa zzoaVar, String str, @Nullable int i, zzug zzugVar) {
        long j;
        this.zza = zzoaVar;
        this.zzb = str;
        this.zzc = i;
        if (zzugVar == null) {
            j = -1;
        } else {
            j = zzugVar.zzd;
        }
        this.zzd = j;
        if (zzugVar != null && zzugVar.zzb()) {
            this.zze = zzugVar;
        }
    }

    public final void zzg(int i, @Nullable zzug zzugVar) {
        if (this.zzd == -1 && i == this.zzc && zzugVar != null) {
            zzoa zzoaVar = this.zza;
            long j = zzugVar.zzd;
            if (j >= zzoa.zza(zzoaVar)) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzj(int i, @Nullable zzug zzugVar) {
        if (zzugVar == null) {
            if (i == this.zzc) {
                return true;
            }
            return false;
        }
        zzug zzugVar2 = this.zze;
        if (zzugVar2 == null) {
            if (!zzugVar.zzb() && zzugVar.zzd == this.zzd) {
                return true;
            }
            return false;
        } else if (zzugVar.zzd == zzugVar2.zzd && zzugVar.zzb == zzugVar2.zzb && zzugVar.zzc == zzugVar2.zzc) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean zzk(zzlu zzluVar) {
        zzug zzugVar = zzluVar.zzd;
        if (zzugVar == null) {
            if (this.zzc != zzluVar.zzc) {
                return true;
            }
            return false;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        if (zzugVar.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbq zzbqVar = zzluVar.zzb;
        int zza = zzbqVar.zza(zzugVar.zza);
        int zza2 = zzbqVar.zza(this.zze.zza);
        zzug zzugVar2 = zzluVar.zzd;
        if (zzugVar2.zzd < this.zze.zzd || zza < zza2) {
            return false;
        }
        if (zza > zza2) {
            return true;
        }
        if (zzugVar2.zzb()) {
            zzug zzugVar3 = zzluVar.zzd;
            int i = zzugVar3.zzb;
            int i2 = zzugVar3.zzc;
            zzug zzugVar4 = this.zze;
            int i3 = zzugVar4.zzb;
            if (i > i3) {
                return true;
            }
            if (i == i3 && i2 > zzugVar4.zzc) {
                return true;
            }
            return false;
        }
        int i4 = zzluVar.zzd.zze;
        if (i4 == -1 || i4 > this.zze.zzb) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 < r8.zzc()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(com.google.android.gms.internal.ads.zzbq r7, com.google.android.gms.internal.ads.zzbq r8) {
        /*
            r6 = this;
            int r0 = r6.zzc
            int r1 = r7.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.zzc()
            if (r0 >= r7) goto L11
            goto L4a
        L11:
            r0 = r3
            goto L4a
        L13:
            com.google.android.gms.internal.ads.zzoa r1 = r6.zza
            com.google.android.gms.internal.ads.zzbp r1 = com.google.android.gms.internal.ads.zzoa.zzc(r1)
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zzoa r0 = r6.zza
            com.google.android.gms.internal.ads.zzbp r0 = com.google.android.gms.internal.ads.zzoa.zzc(r0)
            int r0 = r0.zzn
        L26:
            com.google.android.gms.internal.ads.zzoa r1 = r6.zza
            com.google.android.gms.internal.ads.zzbp r1 = com.google.android.gms.internal.ads.zzoa.zzc(r1)
            int r1 = r1.zzo
            if (r0 > r1) goto L11
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L47
            com.google.android.gms.internal.ads.zzoa r7 = r6.zza
            com.google.android.gms.internal.ads.zzbo r7 = com.google.android.gms.internal.ads.zzoa.zzb(r7)
            com.google.android.gms.internal.ads.zzbo r7 = r8.zzd(r1, r7, r2)
            int r0 = r7.zzc
            goto L4a
        L47:
            int r0 = r0 + 1
            goto L26
        L4a:
            r6.zzc = r0
            if (r0 != r3) goto L4f
            return r2
        L4f:
            com.google.android.gms.internal.ads.zzug r7 = r6.zze
            r0 = 1
            if (r7 != 0) goto L55
            return r0
        L55:
            java.lang.Object r7 = r7.zza
            int r7 = r8.zza(r7)
            if (r7 == r3) goto L5e
            return r0
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznz.zzl(com.google.android.gms.internal.ads.zzbq, com.google.android.gms.internal.ads.zzbq):boolean");
    }
}
