package com.fyber.inneractive.sdk.config;

import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.config.l */
/* loaded from: classes4.dex */
public final class C14393l {

    /* renamed from: a */
    public final HashMap f27224a = new HashMap();

    /* renamed from: a */
    public final boolean m77922a() {
        try {
            if (this.f27224a.containsKey("dsos")) {
                return Boolean.parseBoolean((String) this.f27224a.get("dsos"));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
