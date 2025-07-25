package com.five_corp.p372ad.internal;

import com.five_corp.p372ad.internal.bgtask.C13715b;
import com.five_corp.p372ad.internal.cache.C13749v;
import com.five_corp.p372ad.internal.cache.C13750w;
import com.five_corp.p372ad.internal.cache.InterfaceC13751x;
import com.five_corp.p372ad.internal.context.C13755d;
import com.five_corp.p372ad.internal.http.C13804d;

/* renamed from: com.five_corp.ad.internal.m */
/* loaded from: classes4.dex */
public final class C13837m implements InterfaceC13751x {

    /* renamed from: a */
    public final C13755d f25832a;

    /* renamed from: b */
    public final C13619E f25833b;

    /* renamed from: c */
    public final C13822l f25834c;

    /* renamed from: d */
    public final C13749v f25835d;

    /* renamed from: e */
    public final C13715b f25836e;

    /* renamed from: f */
    public final C13804d f25837f;

    /* renamed from: g */
    public final C14065p f25838g;

    /* renamed from: h */
    public final Object f25839h = new Object();

    /* renamed from: i */
    public boolean f25840i = false;

    /* renamed from: j */
    public C13750w f25841j;

    public C13837m(C13755d c13755d, C13619E c13619e, C13822l c13822l, C13749v c13749v, C13715b c13715b, C13804d c13804d, C14065p c14065p, C13750w c13750w) {
        this.f25832a = c13755d;
        this.f25833b = c13619e;
        this.f25834c = c13822l;
        this.f25835d = c13749v;
        this.f25836e = c13715b;
        this.f25837f = c13804d;
        this.f25838g = c14065p;
        this.f25841j = c13750w;
    }

    @Override // com.five_corp.p372ad.internal.cache.InterfaceC13751x
    /* renamed from: a */
    public final void mo78129a(C13750w c13750w) {
        synchronized (this.f25839h) {
            this.f25841j = c13750w;
        }
    }

    /* renamed from: a */
    public final void m78268a(int i) {
        synchronized (this.f25839h) {
            if (this.f25840i) {
                return;
            }
            this.f25840i = true;
            this.f25836e.m78424a(new C13819i(this.f25832a, this.f25833b, this.f25834c, this.f25835d, this.f25837f, this.f25838g, i, this));
        }
    }
}
