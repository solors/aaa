package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzhat {
    private static final zzhaq zza;

    static {
        if (zzhao.zzA() && zzhao.zzB()) {
            int i = zzgvw.zza;
        }
        zza = new zzhar();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ int zzc(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return zzk(b, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return zzj(b, bArr[i]);
        } else if (b > -12) {
            return -1;
        } else {
            return b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0101, code lost:
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzd(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhat.zzd(java.lang.String, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new zzhas(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(int i, byte[] bArr, int i2, int i3) {
        return zza.zza(i, bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzg(ByteBuffer byteBuffer, int i, int i2) throws zzgyg {
        zzhaq zzhaqVar = zza;
        if (byteBuffer.hasArray()) {
            return zzhaqVar.zzb(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        } else if (byteBuffer.isDirect()) {
            return zzhaq.zzc(byteBuffer, i, i2);
        } else {
            return zzhaq.zzc(byteBuffer, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzh(byte[] bArr, int i, int i2) throws zzgyg {
        return zza.zzb(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzi(byte[] bArr, int i, int i2) {
        if (zza.zza(0, bArr, i, i2) != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(int i, int i2) {
        if (i <= -12 && i2 <= -65) {
            return i ^ (i2 << 8);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzk(int i, int i2, int i3) {
        if (i <= -12 && i2 <= -65 && i3 <= -65) {
            return (i ^ (i2 << 8)) ^ (i3 << 16);
        }
        return -1;
    }
}
