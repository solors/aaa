package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
final class zzmj implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzmh zzb;

    public zzmj(zzmh zzmhVar, long j) {
        this.zza = j;
        this.zzb = zzmhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmh.zza(this.zzb, this.zza);
    }
}
