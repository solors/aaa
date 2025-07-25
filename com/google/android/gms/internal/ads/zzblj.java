package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzblj implements Runnable {
    final /* synthetic */ zzblm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzblj(zzblm zzblmVar) {
        this.zza = zzblmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzblm.zzc(this.zza);
    }
}
