package com.fyber.inneractive.sdk.config;

import android.os.Handler;
import android.os.Message;
import com.fyber.inneractive.sdk.util.C15478v0;
import com.fyber.inneractive.sdk.util.HandlerC15474t0;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.config.b */
/* loaded from: classes4.dex */
public final class C14334b implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ C14345e f27146a;

    public C14334b(C14345e c14345e) {
        this.f27146a = c14345e;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 123) {
            return false;
        }
        C14345e c14345e = this.f27146a;
        if (c14345e.f27162a.compareAndSet(false, true)) {
            if (c14345e.f27162a.get() && c14345e.f27164c != null) {
                IAlog.m76529a("startCounting", new Object[0]);
                C15478v0 c15478v0 = c14345e.f27164c;
                c15478v0.getClass();
                HandlerC15474t0 handlerC15474t0 = new HandlerC15474t0(c15478v0);
                c15478v0.f30625c = handlerC15474t0;
                c15478v0.f30626d = false;
                handlerC15474t0.sendEmptyMessage(1932593528);
            }
            IAlog.m76529a("Pause signal", new Object[0]);
        }
        return true;
    }
}
