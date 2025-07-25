package com.chartboost.sdk.impl;

import android.content.Context;

/* renamed from: com.chartboost.sdk.impl.tc */
/* loaded from: classes3.dex */
public class C10231tc {

    /* renamed from: a */
    public boolean f23206a;

    /* renamed from: a */
    public String m80479a() {
        return "1.5.0-Chartboost";
    }

    /* renamed from: b */
    public final void m80475b(Context context) {
        AbstractC10085nd.m80982a(context, "Application Context cannot be null");
    }

    /* renamed from: c */
    public void m80474c() {
        AbstractC10085nd.m80985a();
        C9818dc.m81774a().m81770d();
    }

    /* renamed from: a */
    public void m80478a(Context context) {
        m80475b(context);
        if (m80476b()) {
            return;
        }
        m80477a(true);
        C10177rd.m80642c().m80645a(context);
        C10084nc.m80986g().m81966a(context);
        AbstractC9872gc.m81601a(context);
        AbstractC10359xc.m80057a(context);
        AbstractC9873gd.m81599a(context);
        C10105od.m80876b().m80877a(context);
        C9818dc.m81774a().m81773a(context);
        C10205sd.m80587b().m80591a(context);
    }

    /* renamed from: b */
    public boolean m80476b() {
        return this.f23206a;
    }

    /* renamed from: a */
    public void m80477a(boolean z) {
        this.f23206a = z;
    }
}
