package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzazt {
    @VisibleForTesting
    static long zza(long j, int i) {
        long zza;
        if (i == 1) {
            return j;
        }
        int i2 = i >> 1;
        long j2 = (j * j) % 1073807359;
        if ((i & 1) == 0) {
            zza = zza(j2, i2);
        } else {
            zza = j * (zza(j2, i2) % 1073807359);
        }
        return zza % 1073807359;
    }

    @VisibleForTesting
    static String zzb(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb2.append(strArr[i]);
                sb2.append(' ');
                i++;
            } else {
                sb2.append(strArr[i4]);
                return sb2.toString();
            }
        }
    }

    public static void zzc(String[] strArr, int i, int i2, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzd(i, zze(strArr, 0, length), zzb(strArr, 0, length), length, priorityQueue);
            return;
        }
        long zze = zze(strArr, 0, 6);
        zzd(i, zze, zzb(strArr, 0, 6), 6, priorityQueue);
        int i3 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i3 < length2 - 5) {
                String zzb = zzb(strArr, i3, 6);
                zze = ((((((zze + 1073807359) - ((zza(16785407L, 5) * ((zzazp.zza(strArr[i3 - 1]) + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((zzazp.zza(strArr[i3 + 5]) + 2147483647L) % 1073807359)) % 1073807359;
                zzd(i, zze, zzb, length2, priorityQueue);
                i3++;
            } else {
                return;
            }
        }
    }

    @VisibleForTesting
    static void zzd(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        zzazs zzazsVar = new zzazs(j, str, i2);
        if ((priorityQueue.size() != i || (((zzazs) priorityQueue.peek()).zzc <= zzazsVar.zzc && ((zzazs) priorityQueue.peek()).zza <= zzazsVar.zza)) && !priorityQueue.contains(zzazsVar)) {
            priorityQueue.add(zzazsVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(String[] strArr, int i, int i2) {
        long zza = (zzazp.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            zza = (((zza * 16785407) % 1073807359) + ((zzazp.zza(strArr[i3]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return zza;
    }
}
