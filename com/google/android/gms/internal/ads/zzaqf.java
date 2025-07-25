package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@VisibleForTesting
/* loaded from: classes5.dex */
final class zzaqf {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzaqf(java.lang.String r14, com.google.android.gms.internal.ads.zzaov r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.zzb
            long r3 = r15.zzc
            long r5 = r15.zzd
            long r7 = r15.zze
            long r9 = r15.zzf
            java.util.List r0 = r15.zzh
            if (r0 == 0) goto L10
        Le:
            r11 = r0
            goto L44
        L10:
            java.util.Map r15 = r15.zzg
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L23:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto Le
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.zzape r11 = new com.google.android.gms.internal.ads.zzape
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L23
        L44:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqf.<init>(java.lang.String, com.google.android.gms.internal.ads.zzaov):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaqf zza(zzaqg zzaqgVar) throws IOException {
        List arrayList;
        if (zzaqi.zze(zzaqgVar) == 538247942) {
            String zzh = zzaqi.zzh(zzaqgVar);
            String zzh2 = zzaqi.zzh(zzaqgVar);
            long zzf = zzaqi.zzf(zzaqgVar);
            long zzf2 = zzaqi.zzf(zzaqgVar);
            long zzf3 = zzaqi.zzf(zzaqgVar);
            long zzf4 = zzaqi.zzf(zzaqgVar);
            int zze = zzaqi.zze(zzaqgVar);
            if (zze >= 0) {
                if (zze == 0) {
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = new ArrayList();
                }
                List list = arrayList;
                for (int i = 0; i < zze; i++) {
                    list.add(new zzape(zzaqi.zzh(zzaqgVar).intern(), zzaqi.zzh(zzaqgVar).intern()));
                }
                return new zzaqf(zzh, zzh2, zzf, zzf2, zzf3, zzf4, list);
            }
            throw new IOException("readHeaderList size=" + zze);
        }
        throw new IOException();
    }

    private zzaqf(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }
}
