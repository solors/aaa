package com.fyber.inneractive.sdk.flow;

import android.os.Handler;
import com.fyber.inneractive.sdk.interfaces.InterfaceC14576b;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.flow.d */
/* loaded from: classes4.dex */
public final class C14498d {

    /* renamed from: a */
    public Handler f27445a;

    /* renamed from: b */
    public final InterfaceC14576b f27446b;

    /* renamed from: c */
    public final RunnableC14496b f27447c = new RunnableC14496b(this);

    /* renamed from: d */
    public final RunnableC14497c f27448d = new RunnableC14497c(this);

    public C14498d(InterfaceC14576b interfaceC14576b) {
        this.f27446b = interfaceC14576b;
    }

    /* renamed from: a */
    public final void m77865a() {
        IAlog.m76529a("%s : ContentLoadTimeoutHandler destroying timeout handler", IAlog.m76531a(this));
        if (this.f27445a != null) {
            IAlog.m76529a("%s : ContentLoadTimeoutHandler stopping timeout handler", IAlog.m76531a(this));
            Handler handler = this.f27445a;
            if (handler != null) {
                handler.removeCallbacks(this.f27448d);
            }
            this.f27445a.getLooper().quitSafely();
            this.f27445a = null;
        }
    }
}
