package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzabk {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzabi zza(byte[] bArr) throws zzbc {
        return zzb(new zzdx(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b4, code lost:
        if (r11 != 3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzabi zzb(com.google.android.gms.internal.ads.zzdx r11, boolean r12) throws com.google.android.gms.internal.ads.zzbc {
        /*
            int r0 = zzc(r11)
            int r1 = zzd(r11)
            r2 = 4
            int r3 = r11.zzd(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "mp4a.40."
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r5 = 5
            r6 = 22
            if (r0 == r5) goto L27
            r5 = 29
            if (r0 != r5) goto L35
        L27:
            int r1 = zzd(r11)
            int r0 = zzc(r11)
            if (r0 != r6) goto L35
            int r3 = r11.zzd(r2)
        L35:
            if (r12 == 0) goto Ld4
            r12 = 17
            r5 = 6
            r7 = 1
            r8 = 2
            r9 = 3
            if (r0 == r7) goto L65
            if (r0 == r8) goto L65
            if (r0 == r9) goto L65
            if (r0 == r2) goto L65
            if (r0 == r5) goto L65
            r2 = 7
            if (r0 == r2) goto L65
            if (r0 == r12) goto L65
            switch(r0) {
                case 19: goto L65;
                case 20: goto L65;
                case 21: goto L65;
                case 22: goto L65;
                case 23: goto L65;
                default: goto L4f;
            }
        L4f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Unsupported audio object type: "
            r11.append(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.zzbc r11 = com.google.android.gms.internal.ads.zzbc.zzc(r11)
            throw r11
        L65:
            boolean r2 = r11.zzp()
            if (r2 == 0) goto L72
            java.lang.String r2 = "AacUtil"
            java.lang.String r10 = "Unexpected frameLengthFlag = 1"
            com.google.android.gms.internal.ads.zzdo.zzf(r2, r10)
        L72:
            boolean r2 = r11.zzp()
            if (r2 == 0) goto L7d
            r2 = 14
            r11.zzn(r2)
        L7d:
            boolean r2 = r11.zzp()
            if (r3 == 0) goto Lce
            r10 = 20
            if (r0 == r5) goto L8a
            if (r0 != r10) goto L8d
            r0 = r10
        L8a:
            r11.zzn(r9)
        L8d:
            if (r2 == 0) goto Laa
            if (r0 != r6) goto L97
            r2 = 16
            r11.zzn(r2)
            goto L98
        L97:
            r6 = r0
        L98:
            if (r6 == r12) goto La4
            r12 = 19
            if (r6 == r12) goto La4
            if (r6 == r10) goto La4
            r12 = 23
            if (r6 != r12) goto La7
        La4:
            r11.zzn(r9)
        La7:
            r11.zzn(r7)
        Laa:
            switch(r0) {
                case 17: goto Lae;
                case 18: goto Lad;
                case 19: goto Lae;
                case 20: goto Lae;
                case 21: goto Lae;
                case 22: goto Lae;
                case 23: goto Lae;
                default: goto Lad;
            }
        Lad:
            goto Ld4
        Lae:
            int r11 = r11.zzd(r8)
            if (r11 == r8) goto Lb7
            if (r11 == r9) goto Lb8
            goto Ld4
        Lb7:
            r9 = r11
        Lb8:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Unsupported epConfig: "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.zzbc r11 = com.google.android.gms.internal.ads.zzbc.zzc(r11)
            throw r11
        Lce:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            r11.<init>()
            throw r11
        Ld4:
            int[] r11 = com.google.android.gms.internal.ads.zzabk.zzc
            r11 = r11[r3]
            r12 = -1
            r0 = 0
            if (r11 == r12) goto Le2
            com.google.android.gms.internal.ads.zzabi r12 = new com.google.android.gms.internal.ads.zzabi
            r12.<init>(r1, r11, r4, r0)
            return r12
        Le2:
            com.google.android.gms.internal.ads.zzbc r11 = com.google.android.gms.internal.ads.zzbc.zza(r0, r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabk.zzb(com.google.android.gms.internal.ads.zzdx, boolean):com.google.android.gms.internal.ads.zzabi");
    }

    private static int zzc(zzdx zzdxVar) {
        int zzd = zzdxVar.zzd(5);
        if (zzd == 31) {
            return zzdxVar.zzd(6) + 32;
        }
        return zzd;
    }

    private static int zzd(zzdx zzdxVar) throws zzbc {
        int zzd = zzdxVar.zzd(4);
        if (zzd == 15) {
            if (zzdxVar.zza() >= 24) {
                return zzdxVar.zzd(24);
            }
            throw zzbc.zza("AAC header insufficient data", null);
        } else if (zzd < 13) {
            return zzb[zzd];
        } else {
            throw zzbc.zza("AAC header wrong Sampling Frequency Index", null);
        }
    }
}
