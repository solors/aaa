package com.inmobi.media;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.RelativeLayout;
import be.MathJVM;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.B */
/* loaded from: classes6.dex */
public abstract class AbstractC18859B {

    /* renamed from: a */
    public final RelativeLayout f47103a;

    /* renamed from: b */
    public EnumC19232c9 f47104b;

    /* renamed from: c */
    public float f47105c;

    /* renamed from: d */
    public boolean f47106d;

    public AbstractC18859B(RelativeLayout adBackgroundView) {
        Intrinsics.checkNotNullParameter(adBackgroundView, "adBackgroundView");
        this.f47103a = adBackgroundView;
        this.f47104b = AbstractC19246d9.m60379a(AbstractC19338k3.m60124g());
        this.f47105c = 1.0f;
    }

    /* renamed from: a */
    public abstract void mo59905a();

    /* renamed from: a */
    public void mo60565a(EnumC19232c9 orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f47104b = orientation;
    }

    /* renamed from: b */
    public abstract void mo59902b();

    /* renamed from: c */
    public abstract void mo59901c();

    /* renamed from: d */
    public abstract void mo59900d();

    /* renamed from: e */
    public final void m61262e() {
        C19324j3 c19324j3;
        int m103791d;
        RelativeLayout.LayoutParams layoutParams;
        int m103791d2;
        if (this.f47105c == 1.0f) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(10);
            this.f47103a.setLayoutParams(layoutParams2);
            return;
        }
        if (this.f47106d) {
            C19352l3 c19352l3 = AbstractC19338k3.f48430a;
            Context context = this.f47103a.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            c19324j3 = AbstractC19338k3.m60131b(context);
        } else {
            C19352l3 c19352l32 = AbstractC19338k3.f48430a;
            Context context2 = this.f47103a.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Intrinsics.checkNotNullParameter(context2, "context");
            Display m60139a = AbstractC19338k3.m60139a(context2);
            if (m60139a == null) {
                c19324j3 = AbstractC19338k3.f48431b;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                m60139a.getMetrics(displayMetrics);
                c19324j3 = new C19324j3(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        }
        Objects.toString(this.f47104b);
        if (AbstractC19246d9.m60377b(this.f47104b)) {
            m103791d2 = MathJVM.m103791d(c19324j3.f48385a * this.f47105c);
            layoutParams = new RelativeLayout.LayoutParams(m103791d2, -1);
            layoutParams.addRule(9);
        } else {
            m103791d = MathJVM.m103791d(c19324j3.f48386b * this.f47105c);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, m103791d);
            layoutParams3.addRule(10);
            layoutParams = layoutParams3;
        }
        this.f47103a.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    public abstract void mo59899f();

    /* renamed from: g */
    public abstract void mo59898g();
}
