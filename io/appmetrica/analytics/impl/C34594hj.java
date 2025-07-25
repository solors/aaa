package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.hj */
/* loaded from: classes9.dex */
public final class C34594hj implements InterfaceC34109Oa {

    /* renamed from: a */
    public final /* synthetic */ String f94550a;

    /* renamed from: b */
    public final /* synthetic */ Map f94551b;

    public C34594hj(String str, Map map) {
        this.f94550a = str;
        this.f94551b = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34109Oa
    /* renamed from: a */
    public final void mo21570a(InterfaceC34133Pa interfaceC34133Pa) {
        interfaceC34133Pa.reportEvent(this.f94550a, this.f94551b);
    }
}
