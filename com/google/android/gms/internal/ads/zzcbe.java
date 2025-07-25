package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzcbe implements Runnable {
    final /* synthetic */ zzcbg zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbe(zzcbg zzcbgVar) {
        this.zza = zzcbgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceDestroyed", new String[0]);
    }
}
