package com.fyber.inneractive.sdk.player.p376ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.config.C14326T;
import com.fyber.inneractive.sdk.config.InterfaceC14327U;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.AbstractC15459m;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.C15446f0;
import com.fyber.inneractive.sdk.util.C15448g0;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.ui.e */
/* loaded from: classes4.dex */
public abstract class AbstractC15187e extends RelativeLayout implements InterfaceC15195m {

    /* renamed from: a */
    public final C15446f0 f30043a;

    /* renamed from: b */
    public final int f30044b;

    /* renamed from: c */
    public InterfaceC14327U f30045c;

    /* renamed from: d */
    public UnitDisplayType f30046d;

    /* renamed from: e */
    public boolean f30047e;

    /* renamed from: f */
    public boolean f30048f;

    /* renamed from: g */
    public InterfaceC15196n f30049g;

    /* renamed from: h */
    public boolean f30050h;

    public AbstractC15187e(Context context) {
        super(context, null, 0);
        this.f30043a = new C15446f0();
        this.f30044b = 0;
        this.f30047e = false;
        this.f30048f = false;
        this.f30050h = false;
        this.f30044b = Math.min(AbstractC15459m.m76476f(), AbstractC15459m.m76477e());
    }

    /* renamed from: a */
    public abstract void mo77086a(C15448g0 c15448g0, int i, int i2);

    @Override // com.fyber.inneractive.sdk.player.p376ui.InterfaceC15195m
    /* renamed from: a */
    public boolean mo77079a() {
        return false;
    }

    /* renamed from: b */
    public void mo77081b() {
        this.f30050h = true;
    }

    /* renamed from: c */
    public void mo77080c() {
        this.f30050h = false;
    }

    /* renamed from: d */
    public final void m77090d() {
        boolean z;
        if (isShown() && hasWindowFocus() && this.f30048f && !this.f30050h) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            z = getGlobalVisibleRect(new Rect());
        }
        if (z != this.f30047e && this.f30049g != null) {
            IAlog.m76529a("%supdateVisibility changing to %s", IAlog.m76531a(this), Boolean.valueOf(z));
            this.f30047e = z;
            this.f30049g.mo77083a(z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        IAlog.m76529a("%sGot onAttachedToWindow: mIsAttached = %s", IAlog.m76531a(this), Boolean.valueOf(this.f30048f));
        this.f30048f = true;
        InterfaceC15196n interfaceC15196n = this.f30049g;
        if (interfaceC15196n != null) {
            interfaceC15196n.mo77084a();
        }
        m77090d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IAlog.m76529a("%sGot onDetachedFromWindow: mIsAttached = %s", IAlog.m76531a(this), Boolean.valueOf(this.f30048f));
        this.f30048f = false;
        InterfaceC15196n interfaceC15196n = this.f30049g;
        if (interfaceC15196n != null) {
            interfaceC15196n.mo77082c();
        }
        m77090d();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (equals(view)) {
            IAlog.m76529a("%sgot onVisibilityChanged with %d", IAlog.m76531a(this), Integer.valueOf(i));
            m77090d();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        IAlog.m76529a("%sgot onWindowFocusChanged with: %s", IAlog.m76531a(this), Boolean.valueOf(z));
        AbstractC15465p.f30612b.postDelayed(new RunnableC15186d(this, z), 500L);
    }

    public void setListener(InterfaceC15196n interfaceC15196n) {
        this.f30049g = interfaceC15196n;
    }

    public void setUnitConfig(InterfaceC14327U interfaceC14327U) {
        UnitDisplayType unitDisplayType;
        this.f30045c = interfaceC14327U;
        C14326T c14326t = (C14326T) interfaceC14327U;
        if (c14326t.f27124e == null) {
            unitDisplayType = c14326t.f27125f.f27136j;
        } else {
            unitDisplayType = UnitDisplayType.DEFAULT;
        }
        this.f30046d = unitDisplayType;
    }
}
