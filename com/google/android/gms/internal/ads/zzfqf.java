package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzfqf implements Closeable {
    public static zzfqr zza() {
        return new zzfqr();
    }

    public static zzfqr zzb(final int i, zzfqq zzfqqVar) {
        return new zzfqr(new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqd
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                return zzfqf.zzd(i);
            }
        }, new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqe
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                return zzfqf.zze();
            }
        }, zzfqqVar);
    }

    public static zzfqr zzc(zzfvf<Integer> zzfvfVar, zzfvf<Integer> zzfvfVar2, zzfqq zzfqqVar) {
        return new zzfqr(zzfvfVar, zzfvfVar2, zzfqqVar);
    }

    public static /* synthetic */ Integer zzd(int i) {
        return Integer.valueOf(i);
    }

    public static /* synthetic */ Integer zze() {
        return -1;
    }
}
