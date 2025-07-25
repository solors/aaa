package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzals implements Comparable {
    public final int zza;
    public final zzaln zzb;

    public zzals(int i, zzaln zzalnVar) {
        this.zza = i;
        this.zzb = zzalnVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzals) obj).zza);
    }
}
