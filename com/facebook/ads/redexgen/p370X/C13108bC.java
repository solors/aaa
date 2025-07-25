package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: com.facebook.ads.redexgen.X.bC */
/* loaded from: assets/audience_network.dex */
public class C13108bC implements InterfaceC110292g {
    public final RectF A00 = new RectF();

    private C110322j A00(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new C110322j(context.getResources(), colorStateList, f, f2, f3);
    }

    private C110322j A01(InterfaceC110282f interfaceC110282f) {
        return (C110322j) interfaceC110282f.A6h();
    }

    public final void A02(InterfaceC110282f interfaceC110282f) {
        Rect rect = new Rect();
        A01(interfaceC110282f).A0K(rect);
        interfaceC110282f.AGX((int) Math.ceil(A7q(interfaceC110282f)), (int) Math.ceil(A7p(interfaceC110282f)));
        interfaceC110282f.AGe(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final ColorStateList A6U(InterfaceC110282f interfaceC110282f) {
        return A01(interfaceC110282f).A0F();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final float A7H(InterfaceC110282f interfaceC110282f) {
        return A01(interfaceC110282f).A0E();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final float A7k(InterfaceC110282f interfaceC110282f) {
        return A01(interfaceC110282f).A0B();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final float A7p(InterfaceC110282f interfaceC110282f) {
        return A01(interfaceC110282f).A0C();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final float A7q(InterfaceC110282f interfaceC110282f) {
        return A01(interfaceC110282f).A0D();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final float A8A(InterfaceC110282f interfaceC110282f) {
        return A01(interfaceC110282f).A0A();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public void A9G() {
        C110322j.A0G = new C13109bD(this);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final void A9H(InterfaceC110282f interfaceC110282f, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C110322j A00 = A00(context, colorStateList, f, f2, f3);
        A00.A0L(interfaceC110282f.A89());
        interfaceC110282f.AGK(A00);
        A02(interfaceC110282f);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final void ABY(InterfaceC110282f interfaceC110282f) {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final void ADD(InterfaceC110282f interfaceC110282f) {
        A01(interfaceC110282f).A0L(interfaceC110282f.A89());
        A02(interfaceC110282f);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final void AGJ(InterfaceC110282f interfaceC110282f, ColorStateList colorStateList) {
        A01(interfaceC110282f).A0J(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final void AGP(InterfaceC110282f interfaceC110282f, float f) {
        A01(interfaceC110282f).A0I(f);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final void AGW(InterfaceC110282f interfaceC110282f, float f) {
        A01(interfaceC110282f).A0H(f);
        A02(interfaceC110282f);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110292g
    public final void AGc(InterfaceC110282f interfaceC110282f, float f) {
        A01(interfaceC110282f).A0G(f);
        A02(interfaceC110282f);
    }
}
