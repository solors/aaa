package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.Oh */
/* loaded from: classes9.dex */
public final class C34116Oh extends C34705lm {

    /* renamed from: e */
    public final RunnableC34092Nh f93313e;

    /* renamed from: f */
    public final ICommonExecutor f93314f;

    public C34116Oh(@NonNull C34580h5 c34580h5, @NonNull InterfaceC34119Ok interfaceC34119Ok, @NonNull ICommonExecutor iCommonExecutor) {
        super(c34580h5, interfaceC34119Ok);
        this.f93313e = new RunnableC34092Nh(this);
        this.f93314f = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C34705lm
    /* renamed from: a */
    public final void mo21405a() {
        this.f93314f.remove(this.f93313e);
    }

    @Override // io.appmetrica.analytics.impl.C34705lm
    /* renamed from: f */
    public final void mo21400f() {
        this.f94877d.mo21772a();
        C33897Fg c33897Fg = (C33897Fg) ((C34580h5) this.f94874a).f94504l.m20888a();
        if (c33897Fg.f92851l.mo21502a(c33897Fg.f92850k)) {
            String str = c33897Fg.f92853n;
            if (!TextUtils.isEmpty(str) && !"-1".equals(str)) {
                try {
                    NetworkTask m21031a = C34857rd.m21031a((C34580h5) this.f94874a);
                    C34693la.f94825C.getClass();
                    NetworkServiceLocator.getInstance().getNetworkCore().startTask(m21031a);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: g */
    public final void m22374g() {
        synchronized (this.f94875b) {
            if (!this.f94876c) {
                this.f93314f.remove(this.f93313e);
                m22373h();
            }
        }
    }

    /* renamed from: h */
    public final void m22373h() {
        if (((C33897Fg) ((C34580h5) this.f94874a).f94504l.m20888a()).f92847h > 0) {
            this.f93314f.executeDelayed(this.f93313e, TimeUnit.SECONDS.toMillis(((C33897Fg) ((C34580h5) this.f94874a).f94504l.m20888a()).f92847h));
        }
    }
}
