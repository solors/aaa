package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.util.t0 */
/* loaded from: classes4.dex */
public final class HandlerC15474t0 extends Handler {

    /* renamed from: a */
    public final WeakReference f30622a;

    public HandlerC15474t0(C15478v0 c15478v0) {
        super(Looper.getMainLooper());
        this.f30622a = new WeakReference(c15478v0);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        C15478v0 c15478v0 = (C15478v0) this.f30622a.get();
        if (c15478v0 != null && message.what == 1932593528 && !c15478v0.f30626d) {
            c15478v0.m76450a(message.getWhen());
        }
    }
}
