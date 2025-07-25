package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzadi {
    public static int zza(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int zzb(ByteBuffer byteBuffer) {
        int i;
        byte b = 0;
        if ((byteBuffer.get(5) & 2) == 0) {
            i = 0;
        } else {
            byte b2 = byteBuffer.get(26);
            int i2 = 28;
            int i3 = 28;
            for (int i4 = 0; i4 < b2; i4++) {
                i3 += byteBuffer.get(i4 + 27);
            }
            byte b3 = byteBuffer.get(i3 + 26);
            for (int i5 = 0; i5 < b3; i5++) {
                i2 += byteBuffer.get(i3 + 27 + i5);
            }
            i = i3 + i2;
        }
        int i6 = byteBuffer.get(i + 26) + 27 + i;
        byte b4 = byteBuffer.get(i6);
        if (byteBuffer.limit() - i6 > 1) {
            b = byteBuffer.get(i6 + 1);
        }
        return (int) ((zzg(b4, b) * 48000) / 1000000);
    }

    public static int zzc(ByteBuffer byteBuffer) {
        byte b = 0;
        byte b2 = byteBuffer.get(0);
        if (byteBuffer.limit() > 1) {
            b = byteBuffer.get(1);
        }
        return (int) ((zzg(b2, b) * 48000) / 1000000);
    }

    public static long zzd(byte[] bArr) {
        byte b = 0;
        byte b2 = bArr[0];
        if (bArr.length > 1) {
            b = bArr[1];
        }
        return zzg(b2, b);
    }

    public static List zze(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzi(zzh(zza(bArr))));
        arrayList.add(zzi(zzh(3840L)));
        return arrayList;
    }

    public static boolean zzf(long j, long j2) {
        if (j - j2 <= zzh(3840L) / 1000) {
            return true;
        }
        return false;
    }

    private static long zzg(byte b, byte b2) {
        int i;
        int i2;
        int i3 = b & 255;
        int i4 = i3 & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i6 & 1);
        } else if (i6 == 3) {
            i2 = 60000;
        } else {
            i2 = 10000 << i6;
        }
        return i * i2;
    }

    private static long zzh(long j) {
        return (j * 1000000000) / 48000;
    }

    private static byte[] zzi(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
