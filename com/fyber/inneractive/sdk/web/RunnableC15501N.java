package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.flow.C14540v;
import com.fyber.inneractive.sdk.ignite.EnumC14565j;
import com.fyber.inneractive.sdk.network.EnumC14730t;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.web.N */
/* loaded from: classes4.dex */
public final class RunnableC15501N implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15509W f30677a;

    public RunnableC15501N(C15509W c15509w) {
        this.f30677a = c15509w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C15509W c15509w = this.f30677a;
        c15509w.f30692a.stopLoading();
        IAlog.m76529a("%sonLoadTimeout after %d msec", IAlog.m76531a(c15509w), Long.valueOf(c15509w.f30705n));
        C14540v c14540v = c15509w.f30699h;
        if (c14540v != null && c15509w.f30695d != null) {
            c14540v.m77818a(EnumC14730t.IGNITE_FLOW_FAILED_TO_LOAD_WEBPAGE, c15509w.f30702k, EnumC14565j.LOAD_WEBPAGE_TIMEOUT.m77794a(), c15509w.f30695d);
        }
    }
}
