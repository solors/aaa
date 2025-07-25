package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.util.AbstractC15459m;
import com.fyber.inneractive.sdk.util.C15478v0;
import com.fyber.inneractive.sdk.util.HandlerC15474t0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.fyber.inneractive.sdk.config.e */
/* loaded from: classes4.dex */
public final class C14345e implements InterfaceC14399r {

    /* renamed from: c */
    public C15478v0 f27164c;

    /* renamed from: d */
    public final C14332Z f27165d;

    /* renamed from: f */
    public final C14344d f27167f;

    /* renamed from: a */
    public final AtomicBoolean f27162a = new AtomicBoolean(false);

    /* renamed from: b */
    public boolean f27163b = false;

    /* renamed from: e */
    public final Handler f27166e = new Handler(Looper.getMainLooper(), new C14334b(this));

    public C14345e(C14332Z c14332z) {
        C14335c c14335c = new C14335c(this);
        this.f27167f = new C14344d(this);
        this.f27165d = c14332z;
        Application application = AbstractC15459m.f30607a;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(c14335c);
        }
    }

    /* renamed from: a */
    public final void m77972a() {
        IAConfigManager iAConfigManager = IAConfigManager.f27060O;
        C14411s c14411s = iAConfigManager.f27097u;
        if (!c14411s.f27277d) {
            c14411s.f27276c.add(this);
        }
        C15478v0 c15478v0 = new C15478v0(TimeUnit.MINUTES, iAConfigManager.f27097u.f27275b.m77919a("session_duration", 30, 1));
        this.f27164c = c15478v0;
        c15478v0.f30627e = this.f27167f;
    }

    @Override // com.fyber.inneractive.sdk.config.InterfaceC14399r
    public final void onGlobalConfigChanged(C14411s c14411s, C14396o c14396o) {
        C15478v0 c15478v0 = this.f27164c;
        if (c15478v0 != null) {
            c15478v0.f30626d = false;
            c15478v0.f30628f = 0L;
            HandlerC15474t0 handlerC15474t0 = c15478v0.f30625c;
            if (handlerC15474t0 != null) {
                handlerC15474t0.removeMessages(1932593528);
            }
            C15478v0 c15478v02 = new C15478v0(TimeUnit.MINUTES, c14396o.m77919a("session_duration", 30, 1), this.f27164c.f30628f);
            this.f27164c = c15478v02;
            c15478v02.f30627e = this.f27167f;
        }
        c14411s.f27276c.remove(this);
    }
}
