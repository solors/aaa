package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzvr {
    private final zzdy zza = new zzdy(32);
    private zzvq zzb;
    private zzvq zzc;
    private zzvq zzd;
    private long zze;
    private final zzyk zzf;

    public zzvr(zzyk zzykVar) {
        this.zzf = zzykVar;
        zzvq zzvqVar = new zzvq(0L, 65536);
        this.zzb = zzvqVar;
        this.zzc = zzvqVar;
        this.zzd = zzvqVar;
    }

    private final int zzi(int i) {
        zzvq zzvqVar = this.zzd;
        if (zzvqVar.zzc == null) {
            zzyd zzb = this.zzf.zzb();
            zzvq zzvqVar2 = new zzvq(this.zzd.zzb, 65536);
            zzvqVar.zzc = zzb;
            zzvqVar.zzd = zzvqVar2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zzvq zzj(zzvq zzvqVar, long j) {
        while (j >= zzvqVar.zzb) {
            zzvqVar = zzvqVar.zzd;
        }
        return zzvqVar;
    }

    private static zzvq zzk(zzvq zzvqVar, long j, ByteBuffer byteBuffer, int i) {
        zzvq zzj = zzj(zzvqVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (zzj.zzb - j));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j), min);
            i -= min;
            j += min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvq zzl(zzvq zzvqVar, long j, byte[] bArr, int i) {
        zzvq zzj = zzj(zzvqVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzj.zzb - j));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvq zzm(zzvq zzvqVar, zzhh zzhhVar, zzvt zzvtVar, zzdy zzdyVar) {
        zzvq zzvqVar2;
        boolean z;
        if (zzhhVar.zzl()) {
            long j = zzvtVar.zzb;
            int i = 1;
            zzdyVar.zzI(1);
            zzvq zzl = zzl(zzvqVar, j, zzdyVar.zzN(), 1);
            long j2 = j + 1;
            byte b = zzdyVar.zzN()[0];
            int i2 = b & UnsignedBytes.MAX_POWER_OF_TWO;
            int i3 = b & Byte.MAX_VALUE;
            zzhe zzheVar = zzhhVar.zzb;
            byte[] bArr = zzheVar.zza;
            if (bArr == null) {
                zzheVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            zzvqVar2 = zzl(zzl, j2, zzheVar.zza, i3);
            long j3 = j2 + i3;
            if (z) {
                zzdyVar.zzI(2);
                zzvqVar2 = zzl(zzvqVar2, j3, zzdyVar.zzN(), 2);
                j3 += 2;
                i = zzdyVar.zzq();
            }
            int i4 = i;
            int[] iArr = zzheVar.zzd;
            if (iArr == null || iArr.length < i4) {
                iArr = new int[i4];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzheVar.zze;
            if (iArr3 == null || iArr3.length < i4) {
                iArr3 = new int[i4];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i5 = i4 * 6;
                zzdyVar.zzI(i5);
                zzvqVar2 = zzl(zzvqVar2, j3, zzdyVar.zzN(), i5);
                j3 += i5;
                zzdyVar.zzL(0);
                for (int i6 = 0; i6 < i4; i6++) {
                    iArr2[i6] = zzdyVar.zzq();
                    iArr4[i6] = zzdyVar.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzvtVar.zza - ((int) (j3 - zzvtVar.zzb));
            }
            zzads zzadsVar = zzvtVar.zzc;
            int i7 = zzei.zza;
            zzheVar.zzc(i4, iArr2, iArr4, zzadsVar.zzb, zzheVar.zza, zzadsVar.zza, zzadsVar.zzc, zzadsVar.zzd);
            long j4 = zzvtVar.zzb;
            int i8 = (int) (j3 - j4);
            zzvtVar.zzb = j4 + i8;
            zzvtVar.zza -= i8;
        } else {
            zzvqVar2 = zzvqVar;
        }
        if (zzhhVar.zze()) {
            zzdyVar.zzI(4);
            zzvq zzl2 = zzl(zzvqVar2, zzvtVar.zzb, zzdyVar.zzN(), 4);
            int zzp = zzdyVar.zzp();
            zzvtVar.zzb += 4;
            zzvtVar.zza -= 4;
            zzhhVar.zzj(zzp);
            zzvq zzk = zzk(zzl2, zzvtVar.zzb, zzhhVar.zzc, zzp);
            zzvtVar.zzb += zzp;
            int i9 = zzvtVar.zza - zzp;
            zzvtVar.zza = i9;
            ByteBuffer byteBuffer = zzhhVar.zzf;
            if (byteBuffer != null && byteBuffer.capacity() >= i9) {
                zzhhVar.zzf.clear();
            } else {
                zzhhVar.zzf = ByteBuffer.allocate(i9);
            }
            return zzk(zzk, zzvtVar.zzb, zzhhVar.zzf, zzvtVar.zza);
        }
        zzhhVar.zzj(zzvtVar.zza);
        return zzk(zzvqVar2, zzvtVar.zzb, zzhhVar.zzc, zzvtVar.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + i;
        this.zze = j;
        zzvq zzvqVar = this.zzd;
        if (j == zzvqVar.zzb) {
            this.zzd = zzvqVar.zzd;
        }
    }

    public final int zza(zzl zzlVar, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zzvq zzvqVar = this.zzd;
        int zza = zzlVar.zza(zzvqVar.zzc.zza, zzvqVar.zza(this.zze), zzi);
        if (zza == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        zzn(zza);
        return zza;
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        zzvq zzvqVar;
        if (j != -1) {
            while (true) {
                zzvqVar = this.zzb;
                if (j < zzvqVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzvqVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzvqVar.zza) {
                this.zzc = zzvqVar;
            }
        }
    }

    public final void zzd(zzhh zzhhVar, zzvt zzvtVar) {
        zzm(this.zzc, zzhhVar, zzvtVar, this.zza);
    }

    public final void zze(zzhh zzhhVar, zzvt zzvtVar) {
        this.zzc = zzm(this.zzc, zzhhVar, zzvtVar, this.zza);
    }

    public final void zzf() {
        zzvq zzvqVar = this.zzb;
        if (zzvqVar.zzc != null) {
            this.zzf.zzd(zzvqVar);
            zzvqVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzvq zzvqVar2 = this.zzb;
        this.zzc = zzvqVar2;
        this.zzd = zzvqVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzdy zzdyVar, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zzvq zzvqVar = this.zzd;
            zzdyVar.zzH(zzvqVar.zzc.zza, zzvqVar.zza(this.zze), zzi);
            i -= zzi;
            zzn(zzi);
        }
    }
}
