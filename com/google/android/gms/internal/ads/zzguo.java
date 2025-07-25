package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzguo {
    public static final void zza(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i >= 0 && byteBuffer2.remaining() >= i && byteBuffer3.remaining() >= i && byteBuffer.remaining() >= i) {
            for (int i2 = 0; i2 < i; i2++) {
                byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
            }
            return;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static byte[] zzb(byte[]... bArr) throws GeneralSecurityException {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < bArr.length) {
                int length = bArr[i].length;
                if (i2 <= Integer.MAX_VALUE - length) {
                    i2 += length;
                    i++;
                } else {
                    throw new GeneralSecurityException("exceeded size limit");
                }
            } else {
                byte[] bArr2 = new byte[i2];
                int i3 = 0;
                for (byte[] bArr3 : bArr) {
                    int length2 = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i3, length2);
                    i3 += length2;
                }
                return bArr2;
            }
        }
    }

    public static final byte[] zzc(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr.length - 16 >= i) {
            byte[] bArr3 = new byte[16];
            for (int i4 = 0; i4 < 16; i4++) {
                bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4]);
            }
            return bArr3;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }
}
