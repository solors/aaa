package com.monetization.ads.mediation.banner;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import be.MathJVM;
import com.yandex.mobile.ads.impl.C30452ha;
import com.yandex.mobile.ads.impl.gb2;
import com.yandex.mobile.ads.impl.qm0;
import com.yandex.mobile.ads.impl.qu1;
import com.yandex.mobile.ads.impl.xj1;
import com.yandex.mobile.ads.impl.yj1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.monetization.ads.mediation.banner.d */
/* loaded from: classes7.dex */
public final class C25601d {

    /* renamed from: d */
    static final /* synthetic */ KProperty<Object>[] f66467d = {C30452ha.m33588a(C25601d.class, "adView", "getAdView()Landroid/view/ViewGroup;", 0)};
    @Nullable

    /* renamed from: a */
    private final qu1 f66468a;
    @NotNull

    /* renamed from: b */
    private final Handler f66469b = new Handler(Looper.getMainLooper());
    @NotNull

    /* renamed from: c */
    private final xj1 f66470c;

    /* renamed from: com.monetization.ads.mediation.banner.d$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC25602a {
        /* renamed from: a */
        void mo44278a();
    }

    public C25601d(@Nullable qm0 qm0Var, @Nullable qu1 qu1Var) {
        this.f66468a = qu1Var;
        this.f66470c = yj1.m26872a(qm0Var);
    }

    /* renamed from: a */
    public static final ViewGroup m44282a(C25601d c25601d) {
        return (ViewGroup) c25601d.f66470c.getValue(c25601d, f66467d[0]);
    }

    /* renamed from: b */
    public static /* synthetic */ void m44279b(C25601d c25601d, View view, InterfaceC25602a interfaceC25602a) {
        m44281a(c25601d, view, interfaceC25602a);
    }

    /* renamed from: a */
    public static final void m44281a(C25601d this$0, View contentView, InterfaceC25602a contentViewShowListener) {
        RelativeLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(contentView, "$contentView");
        Intrinsics.checkNotNullParameter(contentViewShowListener, "$contentViewShowListener");
        ViewGroup viewGroup = (ViewGroup) this$0.f66470c.getValue(this$0, f66467d[0]);
        if (viewGroup != null && viewGroup.indexOfChild(contentView) == -1) {
            qu1 qu1Var = this$0.f66468a;
            if (qu1Var == null) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            } else {
                int height = qu1Var.getHeight();
                float f = Resources.getSystem().getDisplayMetrics().density;
                if (height >= 0) {
                    height = MathJVM.m103791d(height * f);
                }
                int width = this$0.f66468a.getWidth();
                float f2 = Resources.getSystem().getDisplayMetrics().density;
                if (width >= 0) {
                    width = MathJVM.m103791d(width * f2);
                }
                contentView.measure(0, 0);
                int measuredHeight = contentView.getMeasuredHeight();
                int measuredWidth = contentView.getMeasuredWidth();
                layoutParams = new RelativeLayout.LayoutParams(Math.min(width, measuredWidth), Math.min(height, measuredHeight));
            }
            layoutParams.addRule(13);
            gb2.m33890a(contentView);
            viewGroup.addView(contentView, layoutParams);
            viewGroup.setVisibility(0);
            contentView.setVisibility(0);
        }
        contentView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC25603e(this$0, contentView, contentViewShowListener));
    }

    /* renamed from: a */
    public final void m44283a(@NotNull final View contentView, @NotNull final InterfaceC25602a contentViewShowListener) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(contentViewShowListener, "contentViewShowListener");
        this.f66469b.post(new Runnable() { // from class: com.monetization.ads.mediation.banner.f
            @Override // java.lang.Runnable
            public final void run() {
                C25601d.m44279b(C25601d.this, contentView, contentViewShowListener);
            }
        });
    }
}
