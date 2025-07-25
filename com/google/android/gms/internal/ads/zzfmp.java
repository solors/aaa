package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfmp implements Runnable {
    final /* synthetic */ zzfmu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmp(zzfmu zzfmuVar) {
        this.zza = zzfmuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfmo zzfmoVar;
        zzfmoVar = this.zza.zzl;
        zzfmoVar.zzb();
    }
}
