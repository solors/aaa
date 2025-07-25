package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzqu extends zzci {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private byte[] zzi;
    private byte[] zzl;
    private int zzh = 0;
    private int zzj = 0;
    private int zzk = 0;

    public zzqu() {
        byte[] bArr = zzei.zzf;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    private final int zzq(int i) {
        boolean z = true;
        int zzr = ((zzr(2000000L) - this.zzh) * this.zzd) - (this.zzi.length >> 1);
        if (zzr < 0) {
            z = false;
        }
        zzcw.zzf(z);
        int i2 = this.zzd;
        return (((int) Math.min((i * 0.2f) + 0.5f, zzr)) / i2) * i2;
    }

    private final int zzr(long j) {
        return (int) ((j * this.zzb.zzb) / 1000000);
    }

    private static int zzs(byte b, byte b2) {
        return (b << 8) | (b2 & 255);
    }

    private final void zzt(boolean z) {
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4 = this.zzk;
        int length = this.zzi.length;
        boolean z4 = true;
        if (i4 != length) {
            if (z) {
                z = true;
            } else {
                return;
            }
        }
        if (this.zzh == 0) {
            if (z) {
                zzu(i4, 3);
                i2 = i4;
            } else {
                if (i4 >= (length >> 1)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zzcw.zzf(z3);
                i2 = this.zzi.length >> 1;
                zzu(i2, 0);
            }
            i = i2;
        } else {
            int i5 = length >> 1;
            int i6 = i4 - i5;
            if (z) {
                int zzq = zzq(i6) + (this.zzi.length >> 1);
                zzu(zzq, 2);
                int i7 = i5 + i6;
                i = zzq;
                i2 = i7;
            } else {
                int zzq2 = zzq(i6);
                zzu(zzq2, 1);
                i = zzq2;
                i2 = i6;
            }
        }
        if (i2 % this.zzd == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzcw.zzg(z2, "bytesConsumed is not aligned to frame size: %s" + i2);
        if (i4 < i) {
            z4 = false;
        }
        zzcw.zzf(z4);
        this.zzk -= i2;
        int i8 = this.zzj + i2;
        this.zzj = i8;
        this.zzj = i8 % this.zzi.length;
        this.zzh = this.zzh + (i / this.zzd);
        this.zzg += (i2 - i) / i3;
    }

    private final void zzu(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        if (i == 0) {
            return;
        }
        boolean z4 = true;
        if (this.zzk >= i) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzd(z);
        if (i2 == 2) {
            int i4 = this.zzj;
            int i5 = this.zzk;
            int i6 = i4 + i5;
            byte[] bArr = this.zzi;
            int length = bArr.length;
            if (i6 <= length) {
                System.arraycopy(bArr, i6 - i, this.zzl, 0, i);
            } else {
                int i7 = i5 - (length - i4);
                if (i7 >= i) {
                    System.arraycopy(bArr, i7 - i, this.zzl, 0, i);
                } else {
                    int i8 = i - i7;
                    System.arraycopy(bArr, length - i8, this.zzl, 0, i8);
                    System.arraycopy(this.zzi, 0, this.zzl, i8, i7);
                }
            }
        } else {
            int i9 = this.zzj;
            int i10 = i9 + i;
            byte[] bArr2 = this.zzi;
            int length2 = bArr2.length;
            if (i10 <= length2) {
                System.arraycopy(bArr2, i9, this.zzl, 0, i);
            } else {
                int i11 = length2 - i9;
                System.arraycopy(bArr2, i9, this.zzl, 0, i11);
                System.arraycopy(this.zzi, 0, this.zzl, i11, i - i11);
            }
        }
        if (i % this.zzd == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzcw.zze(z2, "sizeToOutput is not aligned to frame size: " + i);
        if (this.zzj < this.zzi.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzcw.zzf(z3);
        byte[] bArr3 = this.zzl;
        String str = "byteOutput size is not aligned to frame size " + i;
        if (i % this.zzd != 0) {
            z4 = false;
        }
        zzcw.zze(z4, str);
        if (i2 != 3) {
            for (int i12 = 0; i12 < i; i12 += 2) {
                int i13 = i12 + 1;
                int zzs = zzs(bArr3[i13], bArr3[i12]);
                if (i2 == 0) {
                    i3 = ((((i12 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i3 = 10;
                    if (i2 == 2) {
                        i3 = 10 + (((90000 * i12) / (i - 1)) / 1000);
                    }
                }
                int i14 = (zzs * i3) / 100;
                if (i14 >= 32767) {
                    bArr3[i12] = -1;
                    bArr3[i13] = Byte.MAX_VALUE;
                } else if (i14 <= -32768) {
                    bArr3[i12] = 0;
                    bArr3[i13] = UnsignedBytes.MAX_POWER_OF_TWO;
                } else {
                    bArr3[i12] = (byte) (i14 & 255);
                    bArr3[i13] = (byte) (i14 >> 8);
                }
            }
        }
        zzj(i).put(bArr3, 0, i).flip();
    }

    private static final boolean zzv(byte b, byte b2) {
        if (Math.abs(zzs(b, b2)) > 1024) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zze(ByteBuffer byteBuffer) {
        boolean z;
        int limit;
        int i;
        boolean z2;
        int position;
        while (byteBuffer.hasRemaining() && !zzn()) {
            boolean z3 = true;
            if (this.zzf != 0) {
                if (this.zzj < this.zzi.length) {
                    z = true;
                } else {
                    z = false;
                }
                zzcw.zzf(z);
                int limit2 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 < byteBuffer.limit()) {
                        if (zzv(byteBuffer.get(position2), byteBuffer.get(position2 - 1))) {
                            int i2 = this.zzd;
                            limit = i2 * (position2 / i2);
                            break;
                        }
                        position2 += 2;
                    } else {
                        limit = byteBuffer.limit();
                        break;
                    }
                }
                int position3 = limit - byteBuffer.position();
                int i3 = this.zzj;
                int i4 = this.zzk;
                int i5 = i3 + i4;
                int length = this.zzi.length;
                if (i5 < length) {
                    i = length - i5;
                } else {
                    i5 = i4 - (length - i3);
                    i = i3 - i5;
                }
                int min = Math.min(position3, i);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.zzi, i5, min);
                int i6 = this.zzk + min;
                this.zzk = i6;
                if (i6 <= this.zzi.length) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zzcw.zzf(z2);
                if (limit >= limit2 || position3 >= i) {
                    z3 = false;
                }
                zzt(z3);
                if (z3) {
                    this.zzf = 0;
                    this.zzh = 0;
                }
                byteBuffer.limit(limit2);
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.zzi.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (zzv(byteBuffer.get(limit4), byteBuffer.get(limit4 - 1))) {
                            int i7 = this.zzd;
                            position = ((limit4 / i7) * i7) + i7;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.zzf = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    zzj(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzci, com.google.android.gms.internal.ads.zzch
    public final boolean zzg() {
        if (super.zzg() && this.zze) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    protected final zzcf zzi(zzcf zzcfVar) throws zzcg {
        if (zzcfVar.zzd == 2) {
            if (zzcfVar.zzb == -1) {
                return zzcf.zza;
            }
            return zzcfVar;
        }
        throw new zzcg("Unhandled input format:", zzcfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final void zzk() {
        if (zzg()) {
            int i = this.zzb.zzc;
            this.zzd = i + i;
            int i2 = this.zzd;
            int zzr = ((zzr(100000L) / 2) / i2) * i2;
            int i3 = zzr + zzr;
            if (this.zzi.length != i3) {
                this.zzi = new byte[i3];
                this.zzl = new byte[i3];
            }
        }
        this.zzf = 0;
        this.zzg = 0L;
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final void zzl() {
        if (this.zzk > 0) {
            zzt(true);
            this.zzh = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final void zzm() {
        this.zze = false;
        byte[] bArr = zzei.zzf;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    public final long zzo() {
        return this.zzg;
    }

    public final void zzp(boolean z) {
        this.zze = z;
    }
}
