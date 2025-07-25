package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes5.dex */
final class zzid implements Runnable {
    private final /* synthetic */ zzbd zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ zzhn zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzid(zzhn zzhnVar, zzbd zzbdVar, zzo zzoVar) {
        this.zza = zzbdVar;
        this.zzb = zzoVar;
        this.zzc = zzhnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzc(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }
}
