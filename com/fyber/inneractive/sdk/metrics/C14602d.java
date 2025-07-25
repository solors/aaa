package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.metrics.d */
/* loaded from: classes4.dex */
public final class C14602d {

    /* renamed from: d */
    public static final C14602d f27666d = new C14602d();

    /* renamed from: a */
    public final HashMap f27667a = new HashMap();

    /* renamed from: b */
    public final HashMap f27668b = new HashMap();

    /* renamed from: c */
    public final C14604f f27669c = new C14604f();

    /* renamed from: a */
    public final InterfaceC14605g m77771a(String str) {
        try {
            if (str == null) {
                return this.f27669c;
            }
            InterfaceC14605g interfaceC14605g = (InterfaceC14605g) this.f27667a.get(str);
            if (interfaceC14605g == null) {
                C14603e c14603e = new C14603e();
                this.f27667a.put(str, c14603e);
                return c14603e;
            }
            return interfaceC14605g;
        } catch (Exception unused) {
            return this.f27669c;
        }
    }

    /* renamed from: b */
    public final C14607i m77770b(String str) {
        C14607i c14607i = (C14607i) this.f27668b.get(str);
        if (c14607i == null) {
            c14607i = new C14607i();
        }
        this.f27668b.put(str, c14607i);
        return c14607i;
    }
}
