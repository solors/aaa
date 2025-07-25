package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzoa implements zzoe {
    public static final zzfvf zza = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzny
        @Override // com.google.android.gms.internal.ads.zzfvf
        public final Object zza() {
            String zzn;
            zzn = zzoa.zzn();
            return zzn;
        }
    };
    private static final Random zzb = new Random();
    private final zzbp zzc;
    private final zzbo zzd;
    private final HashMap zze;
    private zzod zzf;
    private zzbq zzg;
    @Nullable
    private String zzh;
    private long zzi;

    public zzoa() {
        throw null;
    }

    public final long zzl() {
        long j;
        long j2;
        zznz zznzVar = (zznz) this.zze.get(this.zzh);
        if (zznzVar != null) {
            j = zznzVar.zzd;
            if (j != -1) {
                j2 = zznzVar.zzd;
                return j2;
            }
        }
        return this.zzi + 1;
    }

    private final zznz zzm(int i, @Nullable zzug zzugVar) {
        long j;
        int i2;
        zzug zzugVar2;
        zzug zzugVar3;
        long j2 = Long.MAX_VALUE;
        zznz zznzVar = null;
        for (zznz zznzVar2 : this.zze.values()) {
            zznzVar2.zzg(i, zzugVar);
            if (zznzVar2.zzj(i, zzugVar)) {
                j = zznzVar2.zzd;
                if (j != -1 && j >= j2) {
                    if (i2 == 0) {
                        int i3 = zzei.zza;
                        zzugVar2 = zznzVar.zze;
                        if (zzugVar2 != null) {
                            zzugVar3 = zznzVar2.zze;
                            if (zzugVar3 != null) {
                                zznzVar = zznzVar2;
                            }
                        }
                    }
                } else {
                    zznzVar = zznzVar2;
                    j2 = j;
                }
            }
        }
        if (zznzVar == null) {
            String zzn = zzn();
            zznz zznzVar3 = new zznz(this, zzn, i, zzugVar);
            this.zze.put(zzn, zznzVar3);
            return zznzVar3;
        }
        return zznzVar;
    }

    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zznz zznzVar) {
        long j;
        long j2;
        j = zznzVar.zzd;
        if (j != -1) {
            j2 = zznzVar.zzd;
            this.zzi = j2;
        }
        this.zzh = null;
    }

    private final void zzp(zzlu zzluVar) {
        String str;
        long j;
        zzug zzugVar;
        zzug zzugVar2;
        zzug zzugVar3;
        String unused;
        String unused2;
        if (zzluVar.zzb.zzo()) {
            String str2 = this.zzh;
            if (str2 != null) {
                zznz zznzVar = (zznz) this.zze.get(str2);
                zznzVar.getClass();
                zzo(zznzVar);
                return;
            }
            return;
        }
        zznz zznzVar2 = (zznz) this.zze.get(this.zzh);
        zznz zzm = zzm(zzluVar.zzc, zzluVar.zzd);
        str = zzm.zzb;
        this.zzh = str;
        zzi(zzluVar);
        zzug zzugVar4 = zzluVar.zzd;
        if (zzugVar4 != null && zzugVar4.zzb()) {
            if (zznzVar2 != null) {
                long j2 = zzugVar4.zzd;
                j = zznzVar2.zzd;
                if (j == j2) {
                    zzugVar = zznzVar2.zze;
                    if (zzugVar != null) {
                        zzugVar2 = zznzVar2.zze;
                        if (zzugVar2.zzb == zzluVar.zzd.zzb) {
                            zzugVar3 = zznzVar2.zze;
                            if (zzugVar3.zzc == zzluVar.zzd.zzc) {
                                return;
                            }
                        }
                    }
                }
            }
            zzug zzugVar5 = zzluVar.zzd;
            unused = zzm(zzluVar.zzc, new zzug(zzugVar5.zza, zzugVar5.zzd)).zzb;
            unused2 = zzm.zzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    @Nullable
    public final synchronized String zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final synchronized String zzf(zzbq zzbqVar, zzug zzugVar) {
        String str;
        str = zzm(zzbqVar.zzn(zzugVar.zza, this.zzd).zzc, zzugVar).zzb;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final synchronized void zzg(zzlu zzluVar) {
        boolean z;
        zzod zzodVar;
        String str;
        String str2 = this.zzh;
        if (str2 != null) {
            zznz zznzVar = (zznz) this.zze.get(str2);
            zznzVar.getClass();
            zzo(zznzVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zznz zznzVar2 = (zznz) it.next();
            it.remove();
            z = zznzVar2.zzf;
            if (z && (zzodVar = this.zzf) != null) {
                str = zznzVar2.zzb;
                zzodVar.zzd(zzluVar, str, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final void zzh(zzod zzodVar) {
        this.zzf = zzodVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x003a, code lost:
        if (r0 == r10.zzc) goto L21;
     */
    @Override // com.google.android.gms.internal.ads.zzoe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzi(com.google.android.gms.internal.ads.zzlu r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzod r0 = r9.zzf     // Catch: java.lang.Throwable -> Lc6
            r0.getClass()
            com.google.android.gms.internal.ads.zzbq r0 = r10.zzb     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r0.zzo()     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L10
            goto Lc4
        L10:
            com.google.android.gms.internal.ads.zzug r0 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L3c
            long r1 = r9.zzl()     // Catch: java.lang.Throwable -> Lc6
            long r3 = r0.zzd     // Catch: java.lang.Throwable -> Lc6
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Lc4
            java.util.HashMap r0 = r9.zze     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r9.zzh     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zznz r0 = (com.google.android.gms.internal.ads.zznz) r0     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L3c
            long r1 = com.google.android.gms.internal.ads.zznz.zzb(r0)     // Catch: java.lang.Throwable -> Lc6
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L3c
            int r0 = com.google.android.gms.internal.ads.zznz.zza(r0)     // Catch: java.lang.Throwable -> Lc6
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lc6
            if (r0 != r1) goto Lc4
        L3c:
            int r0 = r10.zzc     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzug r1 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zznz r0 = r9.zzm(r0, r1)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r9.zzh     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto L4e
            java.lang.String r1 = com.google.android.gms.internal.ads.zznz.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
            r9.zzh = r1     // Catch: java.lang.Throwable -> Lc6
        L4e:
            com.google.android.gms.internal.ads.zzug r1 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            r2 = 1
            if (r1 == 0) goto L98
            boolean r3 = r1.zzb()     // Catch: java.lang.Throwable -> Lc6
            if (r3 == 0) goto L98
            java.lang.Object r3 = r1.zza     // Catch: java.lang.Throwable -> Lc6
            long r4 = r1.zzd     // Catch: java.lang.Throwable -> Lc6
            int r1 = r1.zzb     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzug r6 = new com.google.android.gms.internal.ads.zzug     // Catch: java.lang.Throwable -> Lc6
            r6.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> Lc6
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zznz r1 = r9.zzm(r1, r6)     // Catch: java.lang.Throwable -> Lc6
            boolean r3 = com.google.android.gms.internal.ads.zznz.zzi(r1)     // Catch: java.lang.Throwable -> Lc6
            if (r3 != 0) goto L98
            com.google.android.gms.internal.ads.zznz.zzf(r1, r2)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzbq r3 = r10.zzb     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzug r4 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzbo r5 = r9.zzd     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r4 = r4.zza     // Catch: java.lang.Throwable -> Lc6
            r3.zzn(r4, r5)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzbo r3 = r9.zzd     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzug r4 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            int r4 = r4.zzb     // Catch: java.lang.Throwable -> Lc6
            r3.zzg(r4)     // Catch: java.lang.Throwable -> Lc6
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.zzei.zzv(r3)     // Catch: java.lang.Throwable -> Lc6
            long r7 = com.google.android.gms.internal.ads.zzei.zzv(r3)     // Catch: java.lang.Throwable -> Lc6
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zznz.zzd(r1)     // Catch: java.lang.Throwable -> Lc6
        L98:
            boolean r1 = com.google.android.gms.internal.ads.zznz.zzi(r0)     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto La4
            com.google.android.gms.internal.ads.zznz.zzf(r0, r2)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zznz.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
        La4:
            java.lang.String r1 = com.google.android.gms.internal.ads.zznz.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r3 = r9.zzh     // Catch: java.lang.Throwable -> Lc6
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lc6
            if (r1 == 0) goto Lc4
            boolean r1 = com.google.android.gms.internal.ads.zznz.zzh(r0)     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto Lc4
            com.google.android.gms.internal.ads.zznz.zze(r0, r2)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzod r1 = r9.zzf     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = com.google.android.gms.internal.ads.zznz.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
            r1.zzc(r10, r0)     // Catch: java.lang.Throwable -> Lc6
            monitor-exit(r9)
            return
        Lc4:
            monitor-exit(r9)
            return
        Lc6:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoa.zzi(com.google.android.gms.internal.ads.zzlu):void");
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final synchronized void zzj(zzlu zzluVar, int i) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        this.zzf.getClass();
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zznz zznzVar = (zznz) it.next();
            if (zznzVar.zzk(zzluVar)) {
                it.remove();
                z = zznzVar.zzf;
                if (z) {
                    str = zznzVar.zzb;
                    boolean equals = str.equals(this.zzh);
                    boolean z3 = false;
                    if (i == 0 && equals) {
                        z2 = zznzVar.zzg;
                        if (z2) {
                            z3 = true;
                        }
                    }
                    if (equals) {
                        zzo(zznzVar);
                    }
                    zzod zzodVar = this.zzf;
                    str2 = zznzVar.zzb;
                    zzodVar.zzd(zzluVar, str2, z3);
                }
            }
        }
        zzp(zzluVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final synchronized void zzk(zzlu zzluVar) {
        boolean z;
        String str;
        String str2;
        this.zzf.getClass();
        zzbq zzbqVar = this.zzg;
        this.zzg = zzluVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zznz zznzVar = (zznz) it.next();
            if (!zznzVar.zzl(zzbqVar, this.zzg) || zznzVar.zzk(zzluVar)) {
                it.remove();
                z = zznzVar.zzf;
                if (z) {
                    str = zznzVar.zzb;
                    if (str.equals(this.zzh)) {
                        zzo(zznzVar);
                    }
                    zzod zzodVar = this.zzf;
                    str2 = zznzVar.zzb;
                    zzodVar.zzd(zzluVar, str2, false);
                }
            }
        }
        zzp(zzluVar);
    }

    public zzoa(zzfvf zzfvfVar) {
        this.zzc = new zzbp();
        this.zzd = new zzbo();
        this.zze = new HashMap();
        this.zzg = zzbq.zza;
        this.zzi = -1L;
    }
}
