package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgvo {
    private final byte[] zza;

    private zzgvo(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    public static zzgvo zzb(byte[] bArr) {
        if (bArr != null) {
            return new zzgvo(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgvo)) {
            return false;
        }
        return Arrays.equals(((zzgvo) obj).zza, this.zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b : bArr) {
            int i = b & 255;
            sb2.append("0123456789abcdef".charAt(i >> 4));
            sb2.append("0123456789abcdef".charAt(i & 15));
        }
        return "Bytes(" + sb2.toString() + ")";
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzc() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
