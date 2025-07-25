package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.EnumC14282c;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.cache.session.a */
/* loaded from: classes4.dex */
public final class C14275a extends HashMap {

    /* renamed from: a */
    public final /* synthetic */ int f26980a = 25;

    public C14275a() {
        EnumC14282c[] values;
        for (EnumC14282c enumC14282c : EnumC14282c.values()) {
            if (enumC14282c != EnumC14282c.NONE) {
                put(enumC14282c, new C14288k(this.f26980a));
            }
        }
    }
}
