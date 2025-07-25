package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzxx {
    private final int[] zza;
    private final zzwj[] zzb;
    private final int[] zzc;
    private final int[][][] zzd;
    private final zzwj zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public zzxx(String[] strArr, int[] iArr, zzwj[] zzwjVarArr, int[] iArr2, int[][][] iArr3, zzwj zzwjVar) {
        this.zza = iArr;
        this.zzb = zzwjVarArr;
        this.zzd = iArr3;
        this.zzc = iArr2;
        this.zze = zzwjVar;
    }

    public final int zza(int i, int i2, boolean z) {
        int i3 = this.zzb[i].zzb(i2).zza;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if ((this.zzd[i][i2][i6] & 7) == 4) {
                iArr[i5] = i6;
                i5++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i5);
        String str = null;
        int i7 = 0;
        int i8 = 16;
        boolean z2 = false;
        while (i4 < copyOf.length) {
            String str2 = this.zzb[i].zzb(i2).zzb(copyOf[i4]).zzo;
            int i9 = i7 + 1;
            if (i7 == 0) {
                str = str2;
            } else {
                z2 |= !Objects.equals(str, str2);
            }
            i8 = Math.min(i8, this.zzd[i][i2][i4] & 24);
            i4++;
            i7 = i9;
        }
        if (z2) {
            return Math.min(i8, this.zzc[i]);
        }
        return i8;
    }

    public final int zzb(int i, int i2, int i3) {
        return this.zzd[i][i2][i3];
    }

    public final int zzc(int i) {
        return this.zza[i];
    }

    public final zzwj zzd(int i) {
        return this.zzb[i];
    }

    public final zzwj zze() {
        return this.zze;
    }
}
