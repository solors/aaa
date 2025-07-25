package com.applovin.impl;

import com.applovin.impl.InterfaceC5956z6;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.applovin.impl.y6 */
/* loaded from: classes2.dex */
public interface InterfaceC5897y6 {

    /* renamed from: com.applovin.impl.y6$a */
    /* loaded from: classes2.dex */
    public static class C5898a extends IOException {

        /* renamed from: a */
        public final int f12289a;

        public C5898a(Throwable th, int i) {
            super(th);
            this.f12289a = i;
        }
    }

    /* renamed from: a */
    static void m92816a(InterfaceC5897y6 interfaceC5897y6, InterfaceC5897y6 interfaceC5897y62) {
        if (interfaceC5897y6 == interfaceC5897y62) {
            return;
        }
        if (interfaceC5897y62 != null) {
            interfaceC5897y62.mo92812b(null);
        }
        if (interfaceC5897y6 != null) {
            interfaceC5897y6.mo92815a((InterfaceC5956z6.C5957a) null);
        }
    }

    /* renamed from: a */
    void mo92815a(InterfaceC5956z6.C5957a c5957a);

    /* renamed from: a */
    boolean mo92814a(String str);

    /* renamed from: b */
    int mo92813b();

    /* renamed from: b */
    void mo92812b(InterfaceC5956z6.C5957a c5957a);

    /* renamed from: c */
    boolean mo92811c();

    /* renamed from: d */
    Map mo92810d();

    /* renamed from: e */
    UUID mo92809e();

    /* renamed from: f */
    InterfaceC5895y4 mo92808f();

    C5898a getError();
}
