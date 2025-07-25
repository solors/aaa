package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final /* synthetic */ class zzcfl implements Runnable {
    public final /* synthetic */ zzcex zza;

    public /* synthetic */ zzcfl(zzcex zzcexVar) {
        this.zza = zzcexVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.destroy();
    }
}
