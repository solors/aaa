package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzacu {
    public static int zza(zzdy zzdyVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzdyVar.zzm() + 1;
            case 7:
                return zzdyVar.zzq() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzaco zzacoVar, zzacy zzacyVar) throws IOException {
        boolean z;
        int i;
        zzacoVar.zzj();
        zzacoVar.zzg(1);
        byte[] bArr = new byte[1];
        zzacoVar.zzh(bArr, 0, 1);
        int i2 = bArr[0] & 1;
        if (1 != i2) {
            z = false;
        } else {
            z = true;
        }
        zzacoVar.zzg(2);
        if (1 != i2) {
            i = 6;
        } else {
            i = 7;
        }
        zzdy zzdyVar = new zzdy(i);
        zzdyVar.zzK(zzacr.zza(zzacoVar, zzdyVar.zzN(), 0, i));
        zzacoVar.zzj();
        zzact zzactVar = new zzact();
        if (zzd(zzdyVar, zzacyVar, z, zzactVar)) {
            return zzactVar.zza;
        }
        throw zzbc.zza(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
        if (r3 != r22.zzf) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
        if ((r21.zzm() * 1000) == r5) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0099, code lost:
        if (r4 == r5) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zzc(com.google.android.gms.internal.ads.zzdy r21, com.google.android.gms.internal.ads.zzacy r22, int r23, com.google.android.gms.internal.ads.zzact r24) {
        /*
            r0 = r21
            r1 = r22
            int r2 = r21.zzd()
            long r3 = r21.zzu()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r23
            long r7 = (long) r7
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r8 = 0
            if (r7 == 0) goto L19
            return r8
        L19:
            r9 = 1
            long r5 = r5 & r9
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            r6 = 1
            if (r5 != 0) goto L23
            r5 = r6
            goto L24
        L23:
            r5 = r8
        L24:
            r7 = 12
            long r11 = r3 >> r7
            r13 = 8
            long r13 = r3 >> r13
            r15 = 4
            long r15 = r3 >> r15
            long r17 = r3 >> r6
            long r3 = r3 & r9
            r19 = 15
            long r6 = r15 & r19
            int r6 = (int) r6
            r7 = 7
            r15 = -1
            if (r6 > r7) goto L41
            int r7 = r1.zzg
            int r7 = r7 + r15
            if (r6 != r7) goto Lb0
            goto L4a
        L41:
            r7 = 10
            if (r6 > r7) goto Lb0
            int r6 = r1.zzg
            r7 = 2
            if (r6 != r7) goto Lb0
        L4a:
            r6 = 7
            long r6 = r17 & r6
            int r6 = (int) r6
            if (r6 != 0) goto L52
            goto L56
        L52:
            int r7 = r1.zzi
            if (r6 != r7) goto Lb0
        L56:
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto Lb0
            r3 = r24
            boolean r3 = zzd(r0, r1, r5, r3)
            if (r3 == 0) goto Lb0
            long r3 = r11 & r19
            int r3 = (int) r3
            int r3 = zza(r0, r3)
            if (r3 == r15) goto Lb0
            int r4 = r1.zzb
            if (r3 > r4) goto Lb0
            long r3 = r13 & r19
            int r5 = r1.zze
            int r3 = (int) r3
            if (r3 != 0) goto L77
            goto L9b
        L77:
            r4 = 11
            if (r3 > r4) goto L80
            int r1 = r1.zzf
            if (r3 == r1) goto L9b
            goto Lb0
        L80:
            r1 = 12
            if (r3 != r1) goto L8d
            int r1 = r21.zzm()
            int r1 = r1 * 1000
            if (r1 != r5) goto Lb0
            goto L9b
        L8d:
            r1 = 14
            if (r3 > r1) goto Lb0
            int r4 = r21.zzq()
            if (r3 != r1) goto L99
            int r4 = r4 * 10
        L99:
            if (r4 != r5) goto Lb0
        L9b:
            int r1 = r21.zzm()
            int r3 = r21.zzd()
            byte[] r0 = r21.zzN()
            int r3 = r3 + r15
            int r0 = com.google.android.gms.internal.ads.zzei.zzg(r0, r2, r3, r8)
            if (r1 != r0) goto Lb0
            r0 = 1
            return r0
        Lb0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacu.zzc(com.google.android.gms.internal.ads.zzdy, com.google.android.gms.internal.ads.zzacy, int, com.google.android.gms.internal.ads.zzact):boolean");
    }

    private static boolean zzd(zzdy zzdyVar, zzacy zzacyVar, boolean z, zzact zzactVar) {
        try {
            long zzx = zzdyVar.zzx();
            if (!z) {
                zzx *= zzacyVar.zzb;
            }
            zzactVar.zza = zzx;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
