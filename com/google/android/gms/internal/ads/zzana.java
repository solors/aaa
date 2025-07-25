package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzana {
    public static zzamy zza(zzdx zzdxVar) throws zzbc {
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        char c2;
        int zzd = zzdxVar.zzd(8);
        int i5 = 5;
        int zzd2 = zzdxVar.zzd(5);
        if (zzd2 == 31) {
            i = zzdxVar.zzd(24);
        } else {
            switch (zzd2) {
                case 0:
                    i = 96000;
                    break;
                case 1:
                    i = 88200;
                    break;
                case 2:
                    i = 64000;
                    break;
                case 3:
                    i = 48000;
                    break;
                case 4:
                    i = 44100;
                    break;
                case 5:
                    i = 32000;
                    break;
                case 6:
                    i = 24000;
                    break;
                case 7:
                    i = 22050;
                    break;
                case 8:
                    i = 16000;
                    break;
                case 9:
                    i = 12000;
                    break;
                case 10:
                    i = 11025;
                    break;
                case 11:
                    i = 8000;
                    break;
                case 12:
                    i = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw zzbc.zzc("Unsupported sampling rate index " + zzd2);
                case 15:
                    i = 57600;
                    break;
                case 16:
                    i = 51200;
                    break;
                case 17:
                    i = 40000;
                    break;
                case 18:
                    i = 38400;
                    break;
                case 19:
                    i = 34150;
                    break;
                case 20:
                    i = 28800;
                    break;
                case 21:
                    i = 25600;
                    break;
                case 22:
                    i = 20000;
                    break;
                case 23:
                    i = 19200;
                    break;
                case 24:
                    i = 17075;
                    break;
                case 25:
                    i = 14400;
                    break;
                case 26:
                    i = 12800;
                    break;
                case 27:
                    i = 9600;
                    break;
            }
        }
        int zzd3 = zzdxVar.zzd(3);
        int i6 = 1;
        if (zzd3 != 0) {
            if (zzd3 != 1) {
                if (zzd3 != 2 && zzd3 != 3) {
                    if (zzd3 == 4) {
                        i2 = 4096;
                    } else {
                        throw zzbc.zzc("Unsupported coreSbrFrameLengthIndex " + zzd3);
                    }
                } else {
                    i2 = 2048;
                }
            } else {
                i2 = 1024;
            }
        } else {
            i2 = 768;
        }
        if (zzd3 != 0 && zzd3 != 1) {
            if (zzd3 != 2) {
                if (zzd3 != 3) {
                    if (zzd3 == 4) {
                        c = 1;
                    } else {
                        throw zzbc.zzc("Unsupported coreSbrFrameLengthIndex " + zzd3);
                    }
                } else {
                    c = 3;
                }
            } else {
                c = 2;
            }
        } else {
            c = 0;
        }
        zzdxVar.zzn(2);
        zze(zzdxVar);
        int zzd4 = zzdxVar.zzd(5);
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = 16;
            if (i7 < zzd4 + 1) {
                int zzd5 = zzdxVar.zzd(3);
                i8 += zzc(zzdxVar, 5, 8, 16) + 1;
                if ((zzd5 == 0 || zzd5 == 2) && zzdxVar.zzp()) {
                    zze(zzdxVar);
                }
                i7++;
            } else {
                int zzc = zzc(zzdxVar, 4, 8, 16) + 1;
                zzdxVar.zzm();
                int i10 = 0;
                while (true) {
                    double d = 2.0d;
                    if (i10 < zzc) {
                        int zzd6 = zzdxVar.zzd(2);
                        if (zzd6 != 0) {
                            if (zzd6 != i6) {
                                if (zzd6 == 3) {
                                    zzc(zzdxVar, 4, 8, i9);
                                    int zzc2 = zzc(zzdxVar, 4, 8, i9);
                                    if (zzdxVar.zzp()) {
                                        zzc(zzdxVar, 8, i9, 0);
                                    }
                                    zzdxVar.zzm();
                                    if (zzc2 > 0) {
                                        zzdxVar.zzn(zzc2 * 8);
                                    }
                                }
                                i3 = zzd;
                            } else {
                                if (zzf(zzdxVar)) {
                                    zzdxVar.zzm();
                                }
                                if (c > 0) {
                                    zzd(zzdxVar);
                                    i4 = zzdxVar.zzd(2);
                                    c2 = c;
                                } else {
                                    i4 = 0;
                                    c2 = 0;
                                }
                                if (i4 > 0) {
                                    zzdxVar.zzn(6);
                                    int zzd7 = zzdxVar.zzd(2);
                                    zzdxVar.zzn(4);
                                    if (zzdxVar.zzp()) {
                                        zzdxVar.zzn(i5);
                                    }
                                    if (i4 == 2 || i4 == 3) {
                                        zzdxVar.zzn(6);
                                    }
                                    if (zzd7 == 2) {
                                        zzdxVar.zzm();
                                    }
                                }
                                i3 = zzd;
                                int floor = ((int) Math.floor(Math.log(i8 - 1) / Math.log(2.0d))) + 1;
                                int zzd8 = zzdxVar.zzd(2);
                                if (zzd8 > 0 && zzdxVar.zzp()) {
                                    zzdxVar.zzn(floor);
                                }
                                if (zzdxVar.zzp()) {
                                    zzdxVar.zzn(floor);
                                }
                                if (c2 == 0 && zzd8 == 0) {
                                    zzdxVar.zzm();
                                }
                            }
                        } else {
                            i3 = zzd;
                            zzf(zzdxVar);
                            if (c > 0) {
                                zzd(zzdxVar);
                            }
                        }
                        i10++;
                        zzd = i3;
                        i5 = 5;
                        i6 = 1;
                        i9 = 16;
                    } else {
                        int i11 = zzd;
                        byte[] bArr = null;
                        if (zzdxVar.zzp()) {
                            int zzc3 = zzc(zzdxVar, 2, 4, 8) + 1;
                            for (int i12 = 0; i12 < zzc3; i12++) {
                                int zzc4 = zzc(zzdxVar, 4, 8, 16);
                                int zzc5 = zzc(zzdxVar, 4, 8, 16);
                                if (zzc4 == 7) {
                                    int zzd9 = zzdxVar.zzd(4) + 1;
                                    zzdxVar.zzn(4);
                                    byte[] bArr2 = new byte[zzd9];
                                    for (int i13 = 0; i13 < zzd9; i13++) {
                                        bArr2[i13] = (byte) zzdxVar.zzd(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzdxVar.zzn(zzc5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (i) {
                            case 14700:
                            case 16000:
                                d = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d = 1.0d;
                                break;
                            default:
                                throw zzbc.zzc("Unsupported sampling rate " + i);
                        }
                        return new zzamy(i11, (int) (i * d), (int) (i2 * d), bArr3, null);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zzb(com.google.android.gms.internal.ads.zzdx r17, com.google.android.gms.internal.ads.zzamx r18) throws com.google.android.gms.internal.ads.zzbc {
        /*
            r0 = r17
            r1 = r18
            r17.zzb()
            r2 = 3
            r3 = 8
            int r2 = zzc(r0, r2, r3, r3)
            r1.zza = r2
            r4 = 0
            r5 = -1
            if (r2 == r5) goto Lc3
            r2 = 2
            int r6 = java.lang.Math.max(r2, r3)
            r7 = 32
            int r6 = java.lang.Math.max(r6, r7)
            r8 = 63
            r9 = 1
            if (r6 > r8) goto L26
            r6 = r9
            goto L27
        L26:
            r6 = r4
        L27:
            com.google.android.gms.internal.ads.zzcw.zzd(r6)
            r10 = 3
            r12 = 255(0xff, double:1.26E-321)
            long r14 = com.google.android.gms.internal.ads.zzgal.zza(r10, r12)
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            com.google.android.gms.internal.ads.zzgal.zza(r14, r5)
            int r5 = r17.zza()
            r14 = -1
            if (r5 >= r2) goto L44
        L42:
            r5 = r14
            goto L6a
        L44:
            long r5 = r0.zze(r2)
            int r16 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r16 != 0) goto L6a
            int r5 = r17.zza()
            if (r5 >= r3) goto L53
            goto L42
        L53:
            long r5 = r0.zze(r3)
            long r10 = r10 + r5
            int r3 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r3 != 0) goto L69
            int r3 = r17.zza()
            if (r3 >= r7) goto L63
            goto L42
        L63:
            long r5 = r0.zze(r7)
            long r5 = r5 + r10
            goto L6a
        L69:
            r5 = r10
        L6a:
            r1.zzb = r5
            int r3 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r3 != 0) goto L71
            return r4
        L71:
            r10 = 16
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 > 0) goto Lad
            r10 = 0
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 != 0) goto L9e
            int r3 = r1.zza
            r5 = 0
            if (r3 == r9) goto L97
            if (r3 == r2) goto L90
            r2 = 17
            if (r3 == r2) goto L89
            goto L9e
        L89:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zza(r0, r5)
            throw r0
        L90:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zza(r0, r5)
            throw r0
        L97:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zza(r0, r5)
            throw r0
        L9e:
            r2 = 11
            r3 = 24
            int r0 = zzc(r0, r2, r3, r3)
            r1.zzc = r0
            r1 = -1
            if (r0 == r1) goto Lac
            return r9
        Lac:
            return r4
        Lad:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Contains sub-stream with an invalid packet label "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zzc(r0)
            throw r0
        Lc3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzana.zzb(com.google.android.gms.internal.ads.zzdx, com.google.android.gms.internal.ads.zzamx):boolean");
    }

    private static int zzc(zzdx zzdxVar, int i, int i2, int i3) {
        boolean z;
        if (Math.max(Math.max(i, i2), i3) <= 31) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzd(z);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        zzgaj.zza(zzgaj.zza(i4, i5), 1 << i3);
        if (zzdxVar.zza() < i) {
            return -1;
        }
        int zzd = zzdxVar.zzd(i);
        if (zzd == i4) {
            if (zzdxVar.zza() < i2) {
                return -1;
            }
            int zzd2 = zzdxVar.zzd(i2);
            int i6 = zzd + zzd2;
            if (zzd2 == i5) {
                if (zzdxVar.zza() < i3) {
                    return -1;
                }
                return i6 + zzdxVar.zzd(i3);
            }
            return i6;
        }
        return zzd;
    }

    private static void zzd(zzdx zzdxVar) {
        zzdxVar.zzn(3);
        zzdxVar.zzn(8);
        boolean zzp = zzdxVar.zzp();
        boolean zzp2 = zzdxVar.zzp();
        if (zzp) {
            zzdxVar.zzn(5);
        }
        if (zzp2) {
            zzdxVar.zzn(6);
        }
    }

    private static void zze(zzdx zzdxVar) {
        int i;
        int zzd;
        int zzd2 = zzdxVar.zzd(2);
        int i2 = 6;
        if (zzd2 == 0) {
            zzdxVar.zzn(6);
            return;
        }
        int i3 = 5;
        int zzc = zzc(zzdxVar, 5, 8, 16) + 1;
        if (zzd2 == 1) {
            zzdxVar.zzn(zzc * 7);
        } else if (zzd2 == 2) {
            boolean zzp = zzdxVar.zzp();
            if (true != zzp) {
                i = 5;
            } else {
                i = 1;
            }
            if (true == zzp) {
                i3 = 7;
            }
            if (true == zzp) {
                i2 = 8;
            }
            int i4 = 0;
            while (i4 < zzc) {
                if (zzdxVar.zzp()) {
                    zzdxVar.zzn(7);
                    zzd = 0;
                } else {
                    if (zzdxVar.zzd(2) == 3 && zzdxVar.zzd(i3) * i != 0) {
                        zzdxVar.zzm();
                    }
                    zzd = zzdxVar.zzd(i2) * i;
                    if (zzd != 0 && zzd != 180) {
                        zzdxVar.zzm();
                    }
                    zzdxVar.zzm();
                }
                if (zzd != 0 && zzd != 180 && zzdxVar.zzp()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    private static boolean zzf(zzdx zzdxVar) {
        zzdxVar.zzn(3);
        boolean zzp = zzdxVar.zzp();
        if (zzp) {
            zzdxVar.zzn(13);
        }
        return zzp;
    }
}
