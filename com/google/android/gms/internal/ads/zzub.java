package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzub extends zzwl {
    private final boolean zzb;
    private final zzbp zzc;
    private final zzbo zzd;
    private zztz zze;
    @Nullable
    private zzty zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzub(zzui zzuiVar, boolean z) {
        super(zzuiVar);
        boolean z2;
        if (z) {
            zzuiVar.zzv();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzbp();
        this.zzd = new zzbo();
        zzuiVar.zzM();
        this.zze = zztz.zzq(zzuiVar.zzJ());
    }

    private final Object zzK(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.zze.zze;
        if (obj2 != null && obj.equals(zztz.zzc)) {
            obj3 = this.zze.zze;
            return obj3;
        }
        return obj;
    }

    private final boolean zzL(long j) {
        zzty zztyVar = this.zzf;
        int zza = this.zze.zza(zztyVar.zza.zza);
        if (zza == -1) {
            return false;
        }
        zztz zztzVar = this.zze;
        zzbo zzboVar = this.zzd;
        zztzVar.zzd(zza, zzboVar, false);
        long j2 = zzboVar.zzd;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zztyVar.zzs(j);
        return true;
    }

    public final zzbq zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    @Nullable
    protected final zzug zzD(zzug zzugVar) {
        Object obj;
        Object obj2;
        obj = this.zze.zze;
        Object obj3 = zzugVar.zza;
        if (obj != null) {
            obj2 = this.zze.zze;
            if (obj2.equals(obj3)) {
                obj3 = zztz.zzc;
            }
        }
        return zzugVar.zza(obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    @Override // com.google.android.gms.internal.ads.zzwl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void zzE(com.google.android.gms.internal.ads.zzbq r15) {
        /*
            r14 = this;
            boolean r0 = r14.zzh
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zztz r0 = r14.zze
            com.google.android.gms.internal.ads.zztz r15 = r0.zzp(r15)
            r14.zze = r15
            com.google.android.gms.internal.ads.zzty r15 = r14.zzf
            if (r15 == 0) goto L9e
            long r2 = r15.zzn()
            r14.zzL(r2)
            goto L9e
        L1a:
            boolean r0 = r15.zzo()
            if (r0 == 0) goto L36
            boolean r0 = r14.zzi
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zztz r0 = r14.zze
            com.google.android.gms.internal.ads.zztz r15 = r0.zzp(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbp.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zztz.zzc
            com.google.android.gms.internal.ads.zztz r15 = com.google.android.gms.internal.ads.zztz.zzr(r15, r0, r2)
        L33:
            r14.zze = r15
            goto L9e
        L36:
            com.google.android.gms.internal.ads.zzbp r0 = r14.zzc
            r2 = 0
            r3 = 0
            r15.zze(r2, r0, r3)
            com.google.android.gms.internal.ads.zzbp r0 = r14.zzc
            java.lang.Object r0 = r0.zzb
            com.google.android.gms.internal.ads.zzty r5 = r14.zzf
            if (r5 == 0) goto L62
            long r6 = r5.zzq()
            com.google.android.gms.internal.ads.zztz r8 = r14.zze
            com.google.android.gms.internal.ads.zzbo r9 = r14.zzd
            com.google.android.gms.internal.ads.zzug r5 = r5.zza
            java.lang.Object r5 = r5.zza
            r8.zzn(r5, r9)
            com.google.android.gms.internal.ads.zztz r5 = r14.zze
            com.google.android.gms.internal.ads.zzbp r8 = r14.zzc
            r5.zze(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.google.android.gms.internal.ads.zzbp r9 = r14.zzc
            com.google.android.gms.internal.ads.zzbo r10 = r14.zzd
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.zzl(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.zzi
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.zztz r0 = r14.zze
            com.google.android.gms.internal.ads.zztz r15 = r0.zzp(r15)
            goto L86
        L82:
            com.google.android.gms.internal.ads.zztz r15 = com.google.android.gms.internal.ads.zztz.zzr(r15, r0, r3)
        L86:
            r14.zze = r15
            com.google.android.gms.internal.ads.zzty r15 = r14.zzf
            if (r15 == 0) goto L9e
            boolean r0 = r14.zzL(r4)
            if (r0 == 0) goto L9e
            com.google.android.gms.internal.ads.zzug r15 = r15.zza
            java.lang.Object r0 = r15.zza
            java.lang.Object r0 = r14.zzK(r0)
            com.google.android.gms.internal.ads.zzug r1 = r15.zza(r0)
        L9e:
            r15 = 1
            r14.zzi = r15
            r14.zzh = r15
            com.google.android.gms.internal.ads.zztz r15 = r14.zze
            r14.zzo(r15)
            if (r1 == 0) goto Lb2
            com.google.android.gms.internal.ads.zzty r15 = r14.zzf
            r15.getClass()
            r15.zzr(r1)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzub.zzE(com.google.android.gms.internal.ads.zzbq):void");
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final void zzF() {
        if (!this.zzb) {
            this.zzg = true;
            zzB(null, ((zzwl) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwl, com.google.android.gms.internal.ads.zzui
    public final void zzG(zzue zzueVar) {
        ((zzty) zzueVar).zzt();
        if (zzueVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwl, com.google.android.gms.internal.ads.zzui
    /* renamed from: zzH */
    public final zzty zzI(zzug zzugVar, zzyk zzykVar, long j) {
        zzty zztyVar = new zzty(zzugVar, zzykVar, j);
        zztyVar.zzu(((zzwl) this).zza);
        if (this.zzh) {
            zztyVar.zzr(zzugVar.zza(zzK(zzugVar.zza)));
        } else {
            this.zzf = zztyVar;
            if (!this.zzg) {
                this.zzg = true;
                zzB(null, ((zzwl) this).zza);
            }
        }
        return zztyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zztf
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zztf, com.google.android.gms.internal.ads.zzui
    public final void zzt(zzar zzarVar) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzwh(this.zze.zzb, zzarVar));
        } else {
            this.zze = zztz.zzq(zzarVar);
        }
        ((zzwl) this).zza.zzt(zzarVar);
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zzui
    public final void zzz() {
    }
}
