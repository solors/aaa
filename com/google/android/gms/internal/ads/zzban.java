package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzban implements Runnable {
    final /* synthetic */ zzbar zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzban(zzbar zzbarVar) {
        this.zza = zzbarVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbar.zzh(this.zza);
    }
}
