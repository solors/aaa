package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.EnumC14282c;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.cache.session.h */
/* loaded from: classes4.dex */
public final class C14285h extends HashMap {
    public C14285h() {
        EnumC14282c[] values;
        for (EnumC14282c enumC14282c : EnumC14282c.values()) {
            if (enumC14282c != EnumC14282c.NONE) {
                put(enumC14282c, new C14284g(0, 0, 0, System.currentTimeMillis()));
            }
        }
    }
}
