package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes8.dex */
public final class yh2 {

    /* renamed from: c */
    private static yh2 f88219c = new yh2();

    /* renamed from: a */
    private final ArrayList<xh2> f88220a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<xh2> f88221b = new ArrayList<>();

    private yh2() {
    }

    /* renamed from: a */
    public static yh2 m26905a() {
        return f88219c;
    }

    /* renamed from: b */
    public final Collection<xh2> m26903b() {
        return Collections.unmodifiableCollection(this.f88220a);
    }

    /* renamed from: c */
    public final Collection<xh2> m26901c() {
        return Collections.unmodifiableCollection(this.f88221b);
    }

    /* renamed from: a */
    public final void m26904a(xh2 xh2Var) {
        this.f88220a.add(xh2Var);
    }

    /* renamed from: b */
    public final void m26902b(xh2 xh2Var) {
        boolean z = this.f88221b.size() > 0;
        this.f88221b.add(xh2Var);
        if (z) {
            return;
        }
        ej2.m34515a().m34512b();
    }

    /* renamed from: c */
    public final void m26900c(xh2 xh2Var) {
        boolean z = this.f88221b.size() > 0;
        this.f88220a.remove(xh2Var);
        this.f88221b.remove(xh2Var);
        if (!z || this.f88221b.size() > 0) {
            return;
        }
        ej2.m34515a().m34511c();
    }
}
