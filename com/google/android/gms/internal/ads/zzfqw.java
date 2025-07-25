package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CallSuper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public class zzfqw extends Handler {
    public zzfqw() {
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zza(message);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CallSuper
    public void zza(Message message) {
        super.dispatchMessage(message);
    }

    public zzfqw(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
