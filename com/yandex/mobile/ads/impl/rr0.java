package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.tr0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class rr0 implements tr0 {
    @NotNull

    /* renamed from: a */
    private final View f84863a;

    /* renamed from: b */
    private final float f84864b;
    @NotNull

    /* renamed from: c */
    private final Context f84865c;
    @NotNull

    /* renamed from: d */
    private final tr0.C31476a f84866d;

    public /* synthetic */ rr0(View view, float f, Context context) {
        this(view, f, context, new tr0.C31476a());
    }

    @Override // com.yandex.mobile.ads.impl.tr0
    @NotNull
    /* renamed from: a */
    public final tr0.C31476a mo27438a(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        Context context = this.f84865c;
        int i3 = cc2.f77597b;
        Intrinsics.checkNotNullParameter(context, "context");
        int round = Math.round(context.getResources().getDisplayMetrics().heightPixels * this.f84864b);
        ViewGroup.LayoutParams layoutParams = this.f84863a.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            round = (round - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        }
        int max = (int) Math.max(Math.min(size, round), 0.0d);
        tr0.C31476a c31476a = this.f84866d;
        c31476a.f85812a = i;
        c31476a.f85813b = View.MeasureSpec.makeMeasureSpec(max, mode);
        return this.f84866d;
    }

    public rr0(@NotNull View view, float f, @NotNull Context context, @NotNull tr0.C31476a measureSpecHolder) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(measureSpecHolder, "measureSpecHolder");
        this.f84863a = view;
        this.f84864b = f;
        this.f84865c = context;
        this.f84866d = measureSpecHolder;
    }
}
