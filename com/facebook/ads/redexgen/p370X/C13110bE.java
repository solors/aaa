package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bE */
/* loaded from: assets/audience_network.dex */
public final class C13110bE implements InterfaceC110292g {
    private C110302h A00(InterfaceC110282f interfaceC110282f) {
        return (C110302h) interfaceC110282f.A6h();
    }

    public final void A01(InterfaceC110282f interfaceC110282f) {
        if (!interfaceC110282f.A8e()) {
            interfaceC110282f.AGe(0, 0, 0, 0);
            return;
        }
        float A7k = A7k(interfaceC110282f);
        float A8A = A8A(interfaceC110282f);
        float elevation = C110322j.A00(A7k, A8A, interfaceC110282f.A89());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = C110322j.A01(A7k, A8A, interfaceC110282f.A89());
        int ceil = (int) Math.ceil(elevation2);
        interfaceC110282f.AGe(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final ColorStateList A6U(InterfaceC110282f interfaceC110282f) {
        return A00(interfaceC110282f).A05();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final float A7H(InterfaceC110282f interfaceC110282f) {
        return interfaceC110282f.A6i().getElevation();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final float A7k(InterfaceC110282f interfaceC110282f) {
        return A00(interfaceC110282f).A03();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final float A7p(InterfaceC110282f interfaceC110282f) {
        return A8A(interfaceC110282f) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final float A7q(InterfaceC110282f interfaceC110282f) {
        return A8A(interfaceC110282f) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final float A8A(InterfaceC110282f interfaceC110282f) {
        return A00(interfaceC110282f).A04();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final void A9G() {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final void A9H(InterfaceC110282f interfaceC110282f, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C110302h background = new C110302h(colorStateList, f);
        interfaceC110282f.AGK(background);
        View view = interfaceC110282f.A6i();
        view.setClipToOutline(true);
        view.setElevation(f2);
        AGW(interfaceC110282f, f3);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final void ABY(InterfaceC110282f interfaceC110282f) {
        AGW(interfaceC110282f, A7k(interfaceC110282f));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final void ADD(InterfaceC110282f interfaceC110282f) {
        AGW(interfaceC110282f, A7k(interfaceC110282f));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final void AGJ(InterfaceC110282f interfaceC110282f, ColorStateList colorStateList) {
        A00(interfaceC110282f).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final void AGP(InterfaceC110282f interfaceC110282f, float f) {
        interfaceC110282f.A6i().setElevation(f);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final void AGW(InterfaceC110282f interfaceC110282f, float f) {
        A00(interfaceC110282f).A07(f, interfaceC110282f.A8e(), interfaceC110282f.A89());
        A01(interfaceC110282f);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final void AGc(InterfaceC110282f interfaceC110282f, float f) {
        A00(interfaceC110282f).A06(f);
    }
}
