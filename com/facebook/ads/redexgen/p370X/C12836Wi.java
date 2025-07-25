package com.facebook.ads.redexgen.p370X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.facebook.ads.redexgen.X.Wi */
/* loaded from: assets/audience_network.dex */
public final class C12836Wi implements InterfaceC11917Hi {
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11917Hi
    public final C12835Wh A4y(Looper looper, Handler.Callback callback) {
        return new C12835Wh(new Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11917Hi
    public final long A5p() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11917Hi
    public final long AHK() {
        return SystemClock.uptimeMillis();
    }
}
