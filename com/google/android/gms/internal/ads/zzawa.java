package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzawa implements Runnable {
    final /* synthetic */ zzawd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawa(zzawd zzawdVar) {
        this.zza = zzawdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzv();
    }
}
