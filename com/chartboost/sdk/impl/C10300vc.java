package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.chartboost.sdk.impl.vc */
/* loaded from: classes3.dex */
public class C10300vc {

    /* renamed from: c */
    public static C10300vc f23396c = new C10300vc();

    /* renamed from: a */
    public final ArrayList f23397a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f23398b = new ArrayList();

    /* renamed from: c */
    public static C10300vc m80229c() {
        return f23396c;
    }

    /* renamed from: a */
    public Collection m80233a() {
        return Collections.unmodifiableCollection(this.f23398b);
    }

    /* renamed from: b */
    public Collection m80231b() {
        return Collections.unmodifiableCollection(this.f23397a);
    }

    /* renamed from: d */
    public boolean m80227d() {
        if (this.f23398b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m80232a(C9746bc c9746bc) {
        this.f23397a.add(c9746bc);
    }

    /* renamed from: b */
    public void m80230b(C9746bc c9746bc) {
        boolean m80227d = m80227d();
        this.f23397a.remove(c9746bc);
        this.f23398b.remove(c9746bc);
        if (!m80227d || m80227d()) {
            return;
        }
        C10177rd.m80642c().m80640e();
    }

    /* renamed from: c */
    public void m80228c(C9746bc c9746bc) {
        boolean m80227d = m80227d();
        this.f23398b.add(c9746bc);
        if (m80227d) {
            return;
        }
        C10177rd.m80642c().m80641d();
    }
}
