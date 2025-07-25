package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.C29880R;
import com.yandex.mobile.ads.impl.C30338ft;
import com.yandex.mobile.ads.impl.C31833xp;
import com.yandex.mobile.ads.impl.bu1;
import com.yandex.mobile.ads.impl.rr0;
import com.yandex.mobile.ads.impl.sr0;
import com.yandex.mobile.ads.impl.tr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class ExtendedViewContainer extends FrameLayout {
    @NotNull

    /* renamed from: a */
    private final C30338ft f66441a;
    @NotNull

    /* renamed from: b */
    private tr0 f66442b;
    @NotNull

    /* renamed from: c */
    private tr0 f66443c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedViewContainer(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    private final C31833xp m44293a(float f, float f2) {
        Intrinsics.checkNotNullParameter(this, "view");
        Context applicationContext = getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        sr0 sr0Var = new sr0(this, f, applicationContext, new tr0.C31476a());
        Intrinsics.checkNotNullParameter(this, "view");
        Context applicationContext2 = getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        return new C31833xp(sr0Var, new rr0(this, f2, applicationContext2));
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f66441a.m34084a(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        tr0.C31476a mo27438a = this.f66443c.mo27438a(i, i2);
        super.onMeasure(mo27438a.f85812a, mo27438a.f85813b);
        this.f66441a.m34086a();
    }

    public final void setMeasureSpecProvider(@NotNull tr0 measureSpecProvider) {
        Intrinsics.checkNotNullParameter(measureSpecProvider, "measureSpecProvider");
        this.f66443c = new C31833xp(this.f66442b, measureSpecProvider);
        requestLayout();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedViewContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ExtendedViewContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedViewContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(context, "context");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29880R.styleable.MonetizationAdsInternalExtendedContainer, i, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C29880R.styleable.f76497x2a0a5f5, 0);
            i3 = obtainStyledAttributes.getDimensionPixelSize(C29880R.styleable.f76500x6cd73295, dimensionPixelSize);
            i4 = obtainStyledAttributes.getDimensionPixelSize(C29880R.styleable.f76501xaa9b77e8, dimensionPixelSize);
            i5 = obtainStyledAttributes.getDimensionPixelSize(C29880R.styleable.f76496x4bcd912c, dimensionPixelSize);
            i2 = obtainStyledAttributes.getDimensionPixelSize(C29880R.styleable.f76495xb41ae0d1, dimensionPixelSize);
            this.f66442b = m44293a(obtainStyledAttributes.getFloat(C29880R.styleable.f76499xe7ded855, 1.0f), obtainStyledAttributes.getFloat(C29880R.styleable.f76498xfa2d3878, 1.0f));
            obtainStyledAttributes.recycle();
        } else {
            this.f66442b = new bu1();
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        this.f66443c = this.f66442b;
        this.f66441a = new C30338ft(this, i3, i4, i5, i2);
        setWillNotDraw(false);
    }
}
