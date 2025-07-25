package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.C14364k;

/* renamed from: com.fyber.inneractive.sdk.network.timeouts.request.d */
/* loaded from: classes4.dex */
public final class C14737d extends AbstractC14734a {
    public C14737d(String str, C14364k c14364k, String str2) {
        super(str, c14364k, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC14734a
    /* renamed from: a */
    public final int mo77661a(C14364k c14364k, String str) {
        return c14364k.m77951c(str, this.f27918l);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC14734a
    /* renamed from: b */
    public final int mo77660b(C14364k c14364k, String str) {
        int i;
        String str2 = this.f27918l;
        c14364k.getClass();
        String m77953a = C14364k.m77953a(str, "min", "rat", C14364k.m77949e(str2));
        "read".equalsIgnoreCase(str);
        Integer mo77934a = c14364k.mo77934a(C14364k.m77953a(str, "min", "rat", "all_mediators"));
        if (mo77934a != null) {
            i = mo77934a.intValue();
        } else {
            i = 5000;
        }
        Integer mo77934a2 = c14364k.mo77934a(m77953a);
        if (mo77934a2 != null) {
            return mo77934a2.intValue();
        }
        return i;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC14734a
    /* renamed from: c */
    public final int mo77659c(C14364k c14364k, String str) {
        int i;
        String str2 = this.f27918l;
        c14364k.getClass();
        String m77953a = C14364k.m77953a(str, "rat", "perc", C14364k.m77949e(str2));
        String m77953a2 = C14364k.m77953a(str, "rat", "perc", "all_mediators");
        if ("read".equalsIgnoreCase(str)) {
            i = 15;
        } else {
            i = 10;
        }
        Integer mo77934a = c14364k.mo77934a(m77953a2);
        if (mo77934a != null) {
            i = mo77934a.intValue();
        }
        Integer mo77934a2 = c14364k.mo77934a(m77953a);
        if (mo77934a2 != null) {
            return mo77934a2.intValue();
        }
        return i;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC14734a
    /* renamed from: a */
    public final int mo77662a(C14364k c14364k) {
        String str = this.f27918l;
        c14364k.getClass();
        String m77953a = C14364k.m77953a("timeout", "threshold", C14364k.m77949e(str));
        Integer mo77934a = c14364k.mo77934a(C14364k.m77953a("timeout", "threshold", "all_mediators"));
        int intValue = mo77934a != null ? mo77934a.intValue() : 300;
        Integer mo77934a2 = c14364k.mo77934a(m77953a);
        return mo77934a2 != null ? mo77934a2.intValue() : intValue;
    }
}
