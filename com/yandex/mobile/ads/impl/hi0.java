package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.internal.view.SupportMenu;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class hi0 {
    @NotNull

    /* renamed from: a */
    private final kc2 f80071a;
    @NotNull

    /* renamed from: b */
    private final C31996zk f80072b;
    @NotNull

    /* renamed from: c */
    private final C32027zz f80073c;
    @NotNull

    /* renamed from: d */
    private final WeakHashMap<FrameLayout, WeakReference<C31903yk>> f80074d;
    @NotNull

    /* renamed from: e */
    private final WeakHashMap<FrameLayout, WeakReference<ji0>> f80075e;

    public /* synthetic */ hi0() {
        this(new kc2(), new C31996zk(), new C32027zz());
    }

    /* renamed from: a */
    public final void m33550a(@NotNull FrameLayout adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        WeakReference<C31903yk> weakReference = this.f80074d.get(adView);
        C31903yk c31903yk = weakReference != null ? weakReference.get() : null;
        if (c31903yk != null) {
            this.f80074d.remove(adView);
            adView.removeView(c31903yk);
        }
        WeakReference<ji0> weakReference2 = this.f80075e.get(adView);
        ji0 ji0Var = weakReference2 != null ? weakReference2.get() : null;
        if (ji0Var != null) {
            this.f80075e.remove(adView);
            adView.removeView(ji0Var);
        }
    }

    public hi0(@NotNull kc2 descriptionCreator, @NotNull C31996zk borderViewManager, @NotNull C32027zz dimensionConverter) {
        Intrinsics.checkNotNullParameter(descriptionCreator, "descriptionCreator");
        Intrinsics.checkNotNullParameter(borderViewManager, "borderViewManager");
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        this.f80071a = descriptionCreator;
        this.f80072b = borderViewManager;
        this.f80073c = dimensionConverter;
        this.f80074d = new WeakHashMap<>();
        this.f80075e = new WeakHashMap<>();
    }

    /* renamed from: a */
    public final void m33549a(@NotNull FrameLayout adView, @NotNull g42 validationResult, boolean z) {
        ji0 ji0Var;
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        Intrinsics.checkNotNullParameter(adView, "adView");
        WeakReference<C31903yk> weakReference = this.f80074d.get(adView);
        C31903yk borderView = weakReference != null ? weakReference.get() : null;
        if (borderView == null) {
            Context context = adView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            borderView = new C31903yk(context, this.f80073c, new w20());
            this.f80074d.put(adView, new WeakReference<>(borderView));
            adView.addView(borderView);
        }
        this.f80072b.getClass();
        Intrinsics.checkNotNullParameter(borderView, "borderView");
        borderView.setColor(z ? SupportMenu.CATEGORY_MASK : -16711936);
        if (z) {
            WeakReference<ji0> weakReference2 = this.f80075e.get(adView);
            ji0Var = weakReference2 != null ? weakReference2.get() : null;
            if (ji0Var == null) {
                Context context2 = adView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                ji0Var = new ji0(context2, new C32027zz());
                this.f80075e.put(adView, new WeakReference<>(ji0Var));
                adView.addView(ji0Var);
            }
            this.f80071a.getClass();
            ji0Var.setDescription(kc2.m32593a(validationResult));
            return;
        }
        WeakReference<ji0> weakReference3 = this.f80075e.get(adView);
        ji0Var = weakReference3 != null ? weakReference3.get() : null;
        if (ji0Var != null) {
            this.f80075e.remove(adView);
            adView.removeView(ji0Var);
        }
    }
}
