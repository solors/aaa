package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7j */
/* loaded from: assets/audience_network.dex */
public class C113257j extends ContextWrapper {
    public final InterfaceC113277l A00;
    public final AtomicReference<String> A01;

    public C113257j(Context context, InterfaceC113277l interfaceC113277l) {
        super(context.getApplicationContext());
        this.A01 = new AtomicReference<>();
        this.A00 = interfaceC113277l;
    }

    public final InterfaceC112766j A00() {
        return this.A00.A6j();
    }

    public final C13028Zr A01() {
        return this.A00.A8F(this);
    }

    public final InterfaceC113267k A02() {
        return this.A00.A6Y(this);
    }

    public final InterfaceC113287m A03() {
        return this.A00.A7J(this);
    }

    public final InterfaceC113307o A04() {
        return this.A00.A8E(this);
    }

    public final InterfaceC113317p A05() {
        return this.A00.A8U();
    }

    public final InterfaceC1134280 A06() {
        return this.A00.A77(this);
    }

    public final InterfaceC113558D A07() {
        return this.A00.A79(this);
    }

    public final C113848h A08() {
        return this.A00.A8M();
    }

    public final InterfaceC12000J7 A09() {
        return this.A00.A6H(A01());
    }

    public final InterfaceC12012JJ A0A() {
        return this.A00.A8G(A01());
    }

    public final String A0B() {
        return this.A01.get();
    }

    public final void A0C(String str) {
        this.A01.set(str);
    }
}
