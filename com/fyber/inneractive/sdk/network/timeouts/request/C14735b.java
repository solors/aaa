package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.C14364k;

/* renamed from: com.fyber.inneractive.sdk.network.timeouts.request.b */
/* loaded from: classes4.dex */
public final class C14735b extends AbstractC14734a {
    public C14735b(C14364k c14364k, String str) {
        super(str, c14364k, null);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC14734a
    /* renamed from: a */
    public final int mo77661a(C14364k c14364k, String str) {
        c14364k.getClass();
        String str2 = str + "_global_timeout";
        int i = C14364k.m77950d(str) ? 30000 : 10000;
        Integer mo77934a = c14364k.mo77934a(str2);
        return mo77934a != null ? mo77934a.intValue() : i;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC14734a
    /* renamed from: b */
    public final int mo77660b(C14364k c14364k, String str) {
        c14364k.getClass();
        String m77953a = C14364k.m77953a(str, "min", "rat");
        "read".equalsIgnoreCase(str);
        Integer mo77934a = c14364k.mo77934a(m77953a);
        if (mo77934a != null) {
            return mo77934a.intValue();
        }
        return 5000;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC14734a
    /* renamed from: c */
    public final int mo77659c(C14364k c14364k, String str) {
        int i;
        c14364k.getClass();
        String m77953a = C14364k.m77953a(str, "rat_perc");
        if ("read".equalsIgnoreCase(str)) {
            i = 15;
        } else {
            i = 10;
        }
        Integer mo77934a = c14364k.mo77934a(m77953a);
        if (mo77934a != null) {
            return mo77934a.intValue();
        }
        return i;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC14734a
    /* renamed from: a */
    public final int mo77662a(C14364k c14364k) {
        c14364k.getClass();
        Integer mo77934a = c14364k.mo77934a(C14364k.m77953a("timeout", "threshold"));
        if (mo77934a != null) {
            return mo77934a.intValue();
        }
        return 300;
    }
}
