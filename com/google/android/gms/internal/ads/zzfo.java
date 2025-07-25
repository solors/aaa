package com.google.android.gms.internal.ads;

import androidx.annotation.RestrictTo;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public final class zzfo {
    private final zzfm zza;
    private final AtomicLong zzb = new AtomicLong();
    private final ArrayDeque zzc = new ArrayDeque();
    private final PriorityQueue zzd = new PriorityQueue();
    private int zze = -1;

    public zzfo(zzfm zzfmVar) {
        this.zza = zzfmVar;
    }

    private final void zze(int i) {
        long j;
        zzdy zzdyVar;
        while (this.zzd.size() > i) {
            zzfn zzfnVar = (zzfn) this.zzd.poll();
            int i2 = zzei.zza;
            zzfm zzfmVar = this.zza;
            j = zzfnVar.zzb;
            zzdyVar = zzfnVar.zza;
            zzfmVar.zza(j, zzdyVar);
            this.zzc.push(zzfnVar);
        }
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r9 < r2) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(long r9, com.google.android.gms.internal.ads.zzdy r11) {
        /*
            r8 = this;
            int r0 = r8.zze
            if (r0 == 0) goto L53
            r1 = -1
            if (r0 == r1) goto L24
            java.util.PriorityQueue r0 = r8.zzd
            int r0 = r0.size()
            int r2 = r8.zze
            if (r0 < r2) goto L24
            java.util.PriorityQueue r0 = r8.zzd
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.zzfn r0 = (com.google.android.gms.internal.ads.zzfn) r0
            int r2 = com.google.android.gms.internal.ads.zzei.zza
            long r2 = com.google.android.gms.internal.ads.zzfn.zza(r0)
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L24
            goto L53
        L24:
            java.util.ArrayDeque r0 = r8.zzc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L32
            com.google.android.gms.internal.ads.zzfn r0 = new com.google.android.gms.internal.ads.zzfn
            r0.<init>()
            goto L3a
        L32:
            java.util.ArrayDeque r0 = r8.zzc
            java.lang.Object r0 = r0.poll()
            com.google.android.gms.internal.ads.zzfn r0 = (com.google.android.gms.internal.ads.zzfn) r0
        L3a:
            java.util.concurrent.atomic.AtomicLong r2 = r8.zzb
            long r5 = r2.getAndIncrement()
            r2 = r0
            r3 = r9
            r7 = r11
            r2.zzc(r3, r5, r7)
            java.util.PriorityQueue r9 = r8.zzd
            r9.add(r0)
            int r9 = r8.zze
            if (r9 == r1) goto L52
            r8.zze(r9)
        L52:
            return
        L53:
            com.google.android.gms.internal.ads.zzfm r0 = r8.zza
            r0.zza(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfo.zzb(long, com.google.android.gms.internal.ads.zzdy):void");
    }

    public final void zzc() {
        zze(0);
    }

    public final void zzd(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        this.zze = i;
        zze(i);
    }
}
