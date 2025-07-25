package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.InterfaceC14327U;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.util.EnumC15447g;
import com.fyber.inneractive.sdk.web.C15509W;

/* renamed from: com.fyber.inneractive.sdk.flow.x */
/* loaded from: classes4.dex */
public abstract class AbstractC14552x {

    /* renamed from: a */
    public InneractiveAdRequest f27572a;

    /* renamed from: b */
    public AbstractC15386e f27573b;

    /* renamed from: c */
    public final C14388r f27574c;

    /* renamed from: d */
    public final InterfaceC14327U f27575d;

    /* renamed from: e */
    public boolean f27576e = false;

    /* renamed from: f */
    public boolean f27577f = false;

    public AbstractC14552x(InterfaceC14327U interfaceC14327U, C14388r c14388r) {
        this.f27575d = interfaceC14327U;
        this.f27574c = c14388r;
    }

    /* renamed from: a */
    public abstract void mo77811a();

    /* renamed from: a */
    public void mo77810a(String str) {
    }

    /* renamed from: b */
    public C15509W mo77808b() {
        return null;
    }

    /* renamed from: c */
    public AbstractC15386e mo77807c() {
        return this.f27573b;
    }

    /* renamed from: d */
    public abstract boolean mo77806d();

    /* renamed from: e */
    public boolean mo77805e() {
        return false;
    }

    /* renamed from: f */
    public abstract boolean mo77804f();

    public abstract boolean isVideoAd();

    /* renamed from: a */
    public boolean mo77809a(boolean z, EnumC15447g enumC15447g) {
        return false;
    }

    /* renamed from: g */
    public void mo77803g() {
    }
}
