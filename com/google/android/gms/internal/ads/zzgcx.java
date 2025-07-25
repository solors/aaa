package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgax;
import com.ironsource.C21114v8;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzgcx extends zzgax.zzi implements Runnable {
    private final Runnable zza;

    public zzgcx(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzd(th);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgax
    public final String zza() {
        String obj = this.zza.toString();
        return "task=[" + obj + C21114v8.C21123i.f54139e;
    }
}
