package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzazq extends zzazl {
    private MessageDigest zzb;

    @Override // com.google.android.gms.internal.ads.zzazl
    public final byte[] zzb(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i = 4;
        if (length == 1) {
            int zza = zzazp.zza(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(zza);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int zza2 = zzazp.zza(split[i2]);
                    int i3 = (zza2 >> 16) ^ ((char) zza2);
                    int i4 = i2 + i2;
                    bArr[i4] = (byte) i3;
                    bArr[i4 + 1] = (byte) (i3 >> 8);
                }
            } else {
                bArr = new byte[length];
                for (int i5 = 0; i5 < split.length; i5++) {
                    int zza3 = zzazp.zza(split[i5]);
                    bArr[i5] = (byte) ((zza3 >> 24) ^ (((zza3 & 255) ^ ((zza3 >> 8) & 255)) ^ ((zza3 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.zzb = zza();
        synchronized (this.zza) {
            MessageDigest messageDigest = this.zzb;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.zzb.update(bArr2);
            byte[] digest = this.zzb.digest();
            int length2 = digest.length;
            if (length2 <= 4) {
                i = length2;
            }
            byte[] bArr3 = new byte[i];
            System.arraycopy(digest, 0, bArr3, 0, i);
            return bArr3;
        }
    }
}
