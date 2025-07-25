package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.tr0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class sr0 implements tr0 {
    @NotNull

    /* renamed from: a */
    private final View f85345a;

    /* renamed from: b */
    private final float f85346b;
    @NotNull

    /* renamed from: c */
    private final Context f85347c;
    @NotNull

    /* renamed from: d */
    private final tr0.C31476a f85348d;

    public sr0(@NotNull View view, float f, @NotNull Context context, @NotNull tr0.C31476a measureSpecHolder) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(measureSpecHolder, "measureSpecHolder");
        this.f85345a = view;
        this.f85346b = f;
        this.f85347c = context;
        this.f85348d = measureSpecHolder;
    }

    @Override // com.yandex.mobile.ads.impl.tr0
    @NotNull
    /* renamed from: a */
    public final tr0.C31476a mo27438a(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        Context context = this.f85347c;
        int i3 = cc2.f77597b;
        Intrinsics.checkNotNullParameter(context, "context");
        int round = Math.round(context.getResources().getDisplayMetrics().widthPixels * this.f85346b);
        ViewGroup.LayoutParams layoutParams = this.f85345a.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            round = (round - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        }
        int max = (int) Math.max(Math.min(size, round), 0.0d);
        this.f85348d.f85812a = View.MeasureSpec.makeMeasureSpec(max, mode);
        tr0.C31476a c31476a = this.f85348d;
        c31476a.f85813b = i2;
        return c31476a;
    }
}
