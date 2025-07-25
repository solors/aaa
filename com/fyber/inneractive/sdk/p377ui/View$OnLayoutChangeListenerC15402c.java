package com.fyber.inneractive.sdk.p377ui;

import android.view.View;
import com.fyber.inneractive.sdk.p377ui.IFyberAdIdentifier;

/* renamed from: com.fyber.inneractive.sdk.ui.c */
/* loaded from: classes4.dex */
public final class View$OnLayoutChangeListenerC15402c implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ FyberAdIdentifierLocal f30541a;

    public View$OnLayoutChangeListenerC15402c(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f30541a = fyberAdIdentifierLocal;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        FyberAdIdentifierLocal fyberAdIdentifierLocal;
        this.f30541a.f30519q = this.f30541a.f30516n.getWidth() + fyberAdIdentifierLocal.f30516n.getWidth();
        FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.f30541a;
        IFyberAdIdentifier.Corner corner = fyberAdIdentifierLocal2.f30537k;
        if (corner == IFyberAdIdentifier.Corner.TOP_LEFT || corner == IFyberAdIdentifier.Corner.BOTTOM_LEFT) {
            fyberAdIdentifierLocal2.f30519q *= -1.0f;
        }
        fyberAdIdentifierLocal2.f30516n.setTranslationX(fyberAdIdentifierLocal2.f30519q);
        FyberAdIdentifierLocal fyberAdIdentifierLocal3 = this.f30541a;
        if (fyberAdIdentifierLocal3.f30517o) {
            fyberAdIdentifierLocal3.m76545a();
        }
    }
}
