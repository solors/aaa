package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import be.MathJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public final class ji0 extends LinearLayout {
    @NotNull

    /* renamed from: a */
    private final C32027zz f80915a;
    @NotNull

    /* renamed from: b */
    private final C30954nl f80916b;
    @NotNull

    /* renamed from: c */
    private final TextView f80917c;
    @NotNull

    /* renamed from: d */
    private final View.OnClickListener f80918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji0(@NotNull Context context, @NotNull C32027zz dimensionConverter) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        this.f80915a = dimensionConverter;
        this.f80916b = new C30954nl(context, dimensionConverter);
        this.f80917c = new TextView(context);
        this.f80918d = new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.uq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ji0.m32919b(ji0.this, view);
            }
        };
        m32921a(context);
    }

    /* renamed from: a */
    public static final void m32920a(ji0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = !this$0.f80916b.isSelected();
        this$0.f80916b.setSelected(z);
        this$0.f80917c.setVisibility(z ? 0 : 8);
    }

    /* renamed from: b */
    public static /* synthetic */ void m32919b(ji0 ji0Var, View view) {
        m32920a(ji0Var, view);
    }

    public final void setDescription(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f80917c.setText(description);
    }

    /* renamed from: a */
    private final void m32921a(Context context) {
        int m103791d;
        int m103791d2;
        int m103791d3;
        setOrientation(0);
        this.f80915a.getClass();
        int m25947a = C32027zz.m25947a(context, 4.0f);
        setPadding(m25947a, m25947a, m25947a, m25947a);
        this.f80916b.setOnClickListener(this.f80918d);
        addView(this.f80916b);
        this.f80915a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        m103791d = MathJVM.m103791d(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        this.f80917c.setPadding(m103791d, m103791d, m103791d, m103791d);
        this.f80915a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        m103791d2 = MathJVM.m103791d(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(m103791d2, SupportMenu.CATEGORY_MASK);
        this.f80917c.setBackgroundDrawable(gradientDrawable);
        addView(this.f80917c);
        this.f80915a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        m103791d3 = MathJVM.m103791d(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams = this.f80917c.getLayoutParams();
        Intrinsics.m17073h(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(m103791d3, 0, m103791d3, m103791d3);
        this.f80917c.setLayoutParams(layoutParams2);
        this.f80917c.setVisibility(8);
    }
}
