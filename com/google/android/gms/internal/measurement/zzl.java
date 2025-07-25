package com.google.android.gms.internal.measurement;

import com.google.common.annotations.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzl {
    @VisibleForTesting
    private Map<String, Callable<? extends zzal>> zza = new HashMap();

    public final zzaq zza(String str) {
        if (this.zza.containsKey(str)) {
            try {
                return this.zza.get(str).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: " + str);
            }
        }
        return zzaq.zzc;
    }

    public final void zza(String str, Callable<? extends zzal> callable) {
        this.zza.put(str, callable);
    }
}
