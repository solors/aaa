package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final /* synthetic */ class zzcqd implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzcqd(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcqf.zzj(this.zza);
    }
}
