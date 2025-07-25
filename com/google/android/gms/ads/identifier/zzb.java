package com.google.android.gms.ads.identifier;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
@VisibleForTesting
/* loaded from: classes4.dex */
public final class zzb extends Thread {
    final CountDownLatch zza = new CountDownLatch(1);
    boolean zzb = false;
    private final WeakReference<AdvertisingIdClient> zzc;
    private final long zzd;

    public zzb(AdvertisingIdClient advertisingIdClient, long j) {
        this.zzc = new WeakReference<>(advertisingIdClient);
        this.zzd = j;
        start();
    }

    private final void zza() {
        AdvertisingIdClient advertisingIdClient = this.zzc.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
            this.zzb = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (!this.zza.await(this.zzd, TimeUnit.MILLISECONDS)) {
                zza();
            }
        } catch (InterruptedException unused) {
            zza();
        }
    }
}
