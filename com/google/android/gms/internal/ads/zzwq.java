package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzwq extends zzws {
    /* JADX INFO: Access modifiers changed from: protected */
    public zzwq(zzbr zzbrVar, int[] iArr, int i, zzyj zzyjVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzcx zzcxVar) {
        super(zzbrVar, iArr, 0);
        zzfxn.zzl(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfxn zzh(zzxu[] zzxuVarArr) {
        int i;
        int i2;
        zzfxn zzi;
        double d;
        long j;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i4 >= 2) {
                break;
            }
            zzxu zzxuVar = zzxuVarArr[i4];
            if (zzxuVar != null && zzxuVar.zzb.length > 1) {
                zzfxk zzfxkVar = new zzfxk();
                zzfxkVar.zzf(new zzwo(0L, 0L));
                arrayList.add(zzfxkVar);
            } else {
                arrayList.add(null);
            }
            i4++;
        }
        long[][] jArr = new long[2];
        for (int i5 = 0; i5 < 2; i5++) {
            zzxu zzxuVar2 = zzxuVarArr[i5];
            if (zzxuVar2 == null) {
                jArr[i5] = new long[0];
            } else {
                jArr[i5] = new long[zzxuVar2.zzb.length];
                int i6 = 0;
                while (true) {
                    int[] iArr = zzxuVar2.zzb;
                    if (i6 >= iArr.length) {
                        break;
                    }
                    long j2 = zzxuVar2.zza.zzb(iArr[i6]).zzj;
                    long[] jArr2 = jArr[i5];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr2[i6] = j2;
                    i6++;
                }
                Arrays.sort(jArr[i5]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i7 = 0; i7 < 2; i7++) {
            long[] jArr4 = jArr[i7];
            if (jArr4.length == 0) {
                j = 0;
            } else {
                j = jArr4[0];
            }
            jArr3[i7] = j;
        }
        zzi(arrayList, jArr3);
        zzfxy zza = zzfyt.zzc(zzfyy.zzc()).zzb(2).zza();
        int i8 = 0;
        while (i8 < i) {
            int length = jArr[i8].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i9 = i3;
                while (true) {
                    long[] jArr5 = jArr[i8];
                    double d2 = 0.0d;
                    if (i9 >= jArr5.length) {
                        break;
                    }
                    long j3 = jArr5[i9];
                    if (j3 != -1) {
                        d2 = Math.log(j3);
                    }
                    dArr[i9] = d2;
                    i9++;
                }
                int i10 = length - 1;
                double d3 = dArr[i10] - dArr[i3];
                int i11 = i3;
                while (i11 < i10) {
                    double d4 = dArr[i11];
                    i11++;
                    double d5 = d4 + dArr[i11];
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = ((d5 * 0.5d) - dArr[i3]) / d3;
                    }
                    zza.zzq(Double.valueOf(d), Integer.valueOf(i8));
                    i3 = 0;
                }
            }
            i8++;
            i3 = 0;
            i = 2;
            i2 = 1;
        }
        zzfxn zzl = zzfxn.zzl(zza.zzr());
        for (int i12 = 0; i12 < zzl.size(); i12++) {
            int intValue = ((Integer) zzl.get(i12)).intValue();
            int i13 = iArr2[intValue] + 1;
            iArr2[intValue] = i13;
            jArr3[intValue] = jArr[intValue][i13];
            zzi(arrayList, jArr3);
        }
        for (int i14 = 0; i14 < 2; i14++) {
            if (arrayList.get(i14) != null) {
                long j4 = jArr3[i14];
                jArr3[i14] = j4 + j4;
            }
        }
        zzi(arrayList, jArr3);
        zzfxk zzfxkVar2 = new zzfxk();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            zzfxk zzfxkVar3 = (zzfxk) arrayList.get(i15);
            if (zzfxkVar3 == null) {
                zzi = zzfxn.zzn();
            } else {
                zzi = zzfxkVar3.zzi();
            }
            zzfxkVar2.zzf(zzi);
        }
        return zzfxkVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfxk zzfxkVar = (zzfxk) list.get(i2);
            if (zzfxkVar != null) {
                zzfxkVar.zzf(new zzwo(j, jArr[i2]));
            }
        }
    }
}
