package com.five_corp.p372ad.internal;

/* renamed from: com.five_corp.ad.internal.p */
/* loaded from: classes4.dex */
public final class C14065p {

    /* renamed from: a */
    public final Object f26237a = new Object();

    /* renamed from: b */
    public C14068s f26238b = null;

    /* renamed from: a */
    public final boolean m78144a() {
        boolean z;
        synchronized (this.f26237a) {
            z = this.f26238b == null;
        }
        return z;
    }

    /* renamed from: a */
    public final void m78143a(C14068s c14068s) {
        c14068s.m78136b();
        synchronized (this.f26237a) {
            this.f26238b = c14068s;
        }
    }
}
