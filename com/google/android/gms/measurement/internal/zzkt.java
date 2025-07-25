package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzkt implements Runnable {
    private final /* synthetic */ zzks zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkt(zzks zzksVar) {
        this.zza = zzksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp zzkpVar;
        zzks zzksVar = this.zza;
        zzkpVar = zzksVar.zzh;
        zzksVar.zza = zzkpVar;
    }
}
