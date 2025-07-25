package com.five_corp.p372ad.internal;

import com.five_corp.p372ad.FiveAdInterface;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.five_corp.ad.internal.D */
/* loaded from: classes4.dex */
public final class C13618D {

    /* renamed from: a */
    public final FiveAdInterface f25134a;

    /* renamed from: b */
    public final AtomicReference f25135b = new AtomicReference(null);

    /* renamed from: c */
    public final AtomicReference f25136c = new AtomicReference(null);

    /* renamed from: d */
    public final AtomicReference f25137d = new AtomicReference(null);

    /* renamed from: e */
    public final AtomicReference f25138e = new AtomicReference(null);

    /* renamed from: f */
    public final AtomicReference f25139f = new AtomicReference(null);

    public C13618D(FiveAdInterface fiveAdInterface) {
        this.f25134a = fiveAdInterface;
    }

    /* renamed from: a */
    public final void m78489a() {
        InterfaceC14162z interfaceC14162z = (InterfaceC14162z) this.f25138e.get();
        if (interfaceC14162z != null) {
            interfaceC14162z.mo78040c();
        }
    }

    /* renamed from: b */
    public final void m78488b() {
        InterfaceC14162z interfaceC14162z = (InterfaceC14162z) this.f25138e.get();
        if (interfaceC14162z != null) {
            interfaceC14162z.mo78041b();
        }
    }
}
