package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzhar extends zzhaq {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0080, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzhaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhar.zza(int, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhaq
    public final String zzb(byte[] bArr, int i, int i2) throws zzgyg {
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!zzhap.zzd(b)) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            while (i < i3) {
                int i5 = i + 1;
                byte b2 = bArr[i];
                if (zzhap.zzd(b2)) {
                    int i6 = i4 + 1;
                    cArr[i4] = (char) b2;
                    i = i5;
                    while (true) {
                        i4 = i6;
                        if (i < i3) {
                            byte b3 = bArr[i];
                            if (zzhap.zzd(b3)) {
                                i++;
                                i6 = i4 + 1;
                                cArr[i4] = (char) b3;
                            }
                        }
                    }
                } else if (zzhap.zzf(b2)) {
                    if (i5 < i3) {
                        zzhap.zzc(b2, bArr[i5], cArr, i4);
                        i4++;
                        i = i5 + 1;
                    } else {
                        throw new zzgyg("Protocol message had invalid UTF-8.");
                    }
                } else if (zzhap.zze(b2)) {
                    if (i5 < i3 - 1) {
                        int i7 = i5 + 1;
                        zzhap.zzb(b2, bArr[i5], bArr[i7], cArr, i4);
                        i4++;
                        i = i7 + 1;
                    } else {
                        throw new zzgyg("Protocol message had invalid UTF-8.");
                    }
                } else if (i5 < i3 - 2) {
                    int i8 = i5 + 1;
                    byte b4 = bArr[i5];
                    int i9 = i8 + 1;
                    zzhap.zza(b2, b4, bArr[i8], bArr[i9], cArr, i4);
                    i4 += 2;
                    i = i9 + 1;
                } else {
                    throw new zzgyg("Protocol message had invalid UTF-8.");
                }
            }
            return new String(cArr, 0, i4);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
