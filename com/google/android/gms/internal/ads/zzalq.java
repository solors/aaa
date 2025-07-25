package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzalq {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzalp
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return zzalq.zzb((zzalq) obj, (zzalq) obj2);
        }
    };
    private final zzalr zzb;
    private final int zzc;

    public /* synthetic */ zzalq(zzalr zzalrVar, int i, zzalu zzaluVar) {
        this.zzb = zzalrVar;
        this.zzc = i;
    }

    public static /* synthetic */ int zzb(zzalq zzalqVar, zzalq zzalqVar2) {
        return Integer.compare(zzalqVar.zzb.zzb, zzalqVar2.zzb.zzb);
    }
}
