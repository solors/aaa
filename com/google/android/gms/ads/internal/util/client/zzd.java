package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
final class zzd extends Thread {
    final /* synthetic */ String zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(zzf zzfVar, String str) {
        this.zza = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzu(null).zza(this.zza);
    }
}
