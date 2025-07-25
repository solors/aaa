package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.C14364k;
import com.fyber.inneractive.sdk.network.timeouts.AbstractC14732a;

/* renamed from: com.fyber.inneractive.sdk.network.timeouts.request.a */
/* loaded from: classes4.dex */
public abstract class AbstractC14734a extends AbstractC14732a {

    /* renamed from: h */
    public int f27914h;

    /* renamed from: i */
    public int f27915i;

    /* renamed from: j */
    public int f27916j;

    /* renamed from: k */
    public int f27917k;

    /* renamed from: l */
    public final String f27918l;

    public AbstractC14734a(String str, C14364k c14364k, String str2) {
        this.f27918l = str2;
        mo77663d(c14364k, str);
    }

    /* renamed from: a */
    public int mo77667a(int i) {
        return 0;
    }

    /* renamed from: a */
    public abstract int mo77662a(C14364k c14364k);

    /* renamed from: a */
    public abstract int mo77661a(C14364k c14364k, String str);

    /* renamed from: b */
    public int mo77666b() {
        return 0;
    }

    /* renamed from: b */
    public abstract int mo77660b(C14364k c14364k, String str);

    /* renamed from: c */
    public int mo77664c() {
        return 0;
    }

    /* renamed from: c */
    public abstract int mo77659c(C14364k c14364k, String str);

    /* renamed from: d */
    public void mo77663d(C14364k c14364k, String str) {
        int mo77660b = mo77660b(c14364k, "read");
        int mo77660b2 = mo77660b(c14364k, "conn");
        int mo77661a = mo77661a(c14364k, str);
        this.f27911f = mo77662a(c14364k);
        this.f27916j = mo77659c(c14364k, "read");
        int mo77659c = mo77659c(c14364k, "conn");
        this.f27917k = mo77659c;
        int i = (this.f27916j * mo77661a) / 100;
        this.f27914h = i;
        this.f27915i = (mo77661a * mo77659c) / 100;
        this.f27914h = Math.max(mo77660b, i);
        this.f27915i = Math.max(mo77660b2, this.f27915i);
    }
}
