package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzahn {
    private final zzdy zza = new zzdy(8);
    private int zzb;

    private final long zzb(zzaco zzacoVar) throws IOException {
        int i;
        zzacc zzaccVar = (zzacc) zzacoVar;
        int i2 = 0;
        zzaccVar.zzm(this.zza.zzN(), 0, 1, false);
        int i3 = this.zza.zzN()[0] & 255;
        if (i3 != 0) {
            int i4 = 128;
            int i5 = 0;
            while (true) {
                i = i5 + 1;
                if ((i3 & i4) != 0) {
                    break;
                }
                i4 >>= 1;
                i5 = i;
            }
            int i6 = i3 & (~i4);
            zzaccVar.zzm(this.zza.zzN(), 1, i5, false);
            while (i2 < i5) {
                i2++;
                i6 = (this.zza.zzN()[i2] & 255) + (i6 << 8);
            }
            this.zzb += i;
            return i6;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zzaco zzacoVar) throws IOException {
        long zzb;
        int i;
        long zzd = zzacoVar.zzd();
        int i2 = (zzd > (-1L) ? 1 : (zzd == (-1L) ? 0 : -1));
        long j = 1024;
        if (i2 != 0 && zzd <= 1024) {
            j = zzd;
        }
        zzacc zzaccVar = (zzacc) zzacoVar;
        zzaccVar.zzm(this.zza.zzN(), 0, 4, false);
        long zzu = this.zza.zzu();
        this.zzb = 4;
        while (zzu != 440786851) {
            int i3 = (int) j;
            int i4 = this.zzb + 1;
            this.zzb = i4;
            if (i4 == i3) {
                return false;
            }
            zzaccVar.zzm(this.zza.zzN(), 0, 1, false);
            zzu = ((zzu << 8) & (-256)) | (this.zza.zzN()[0] & 255);
        }
        long zzb2 = zzb(zzacoVar);
        long j2 = this.zzb;
        if (zzb2 != Long.MIN_VALUE) {
            long j3 = j2 + zzb2;
            if (i2 == 0 || j3 < zzd) {
                while (true) {
                    int i5 = (this.zzb > j3 ? 1 : (this.zzb == j3 ? 0 : -1));
                    if (i5 < 0) {
                        if (zzb(zzacoVar) == Long.MIN_VALUE || (zzb(zzacoVar)) < 0) {
                            return false;
                        }
                        if (i != 0) {
                            int i6 = (int) zzb;
                            zzaccVar.zzl(i6, false);
                            this.zzb += i6;
                        }
                    } else if (i5 == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
