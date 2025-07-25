package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzham extends zzhan {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzham(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final byte zza(long j) {
        return Memory.peekByte(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final double zzb(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final float zzc(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final void zzd(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final void zze(Object obj, long j, boolean z) {
        if (zzhao.zzb) {
            zzhao.zzG(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzhao.zzH(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final void zzf(Object obj, long j, byte b) {
        if (zzhao.zzb) {
            zzhao.zzG(obj, j, b);
        } else {
            zzhao.zzH(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final void zzg(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final void zzh(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zzi(Object obj, long j) {
        if (zzhao.zzb) {
            return zzhao.zzw(obj, j);
        }
        return zzhao.zzx(obj, j);
    }
}
