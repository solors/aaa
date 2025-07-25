package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzgcq {
    private final zzfvm zza = new zzfvm();
    private final String zzb;
    private volatile Logger zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgcq(Class cls) {
        this.zzb = cls.getName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Logger zza() {
        Logger logger = this.zzc;
        if (logger != null) {
            return logger;
        }
        synchronized (this.zza) {
            Logger logger2 = this.zzc;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.zzb);
            this.zzc = logger3;
            return logger3;
        }
    }
}
