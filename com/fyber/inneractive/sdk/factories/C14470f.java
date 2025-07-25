package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.response.EnumC15382a;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.factories.f */
/* loaded from: classes4.dex */
public final class C14470f {

    /* renamed from: a */
    public final HashMap f27381a = new HashMap();

    /* renamed from: a */
    public final void m77892a(EnumC15382a enumC15382a, InterfaceC14469e interfaceC14469e) {
        if (this.f27381a.containsKey(enumC15382a)) {
            IAlog.m76524f("Handler already exists for ad type %s! : %s", enumC15382a, this.f27381a.get(enumC15382a));
        } else {
            this.f27381a.put(enumC15382a, interfaceC14469e);
        }
    }
}
