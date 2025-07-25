package com.google.android.gms.internal.play_billing;

import java.io.Closeable;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes5.dex */
public final class zzdc implements Closeable {
    private static final ThreadLocal zza = new zzdb();
    private int zzb = 0;

    public static int zza() {
        return ((zzdc) zza.get()).zzb;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.zzb;
        if (i > 0) {
            this.zzb = i - 1;
            return;
        }
        throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
    }
}
