package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ft */
/* loaded from: classes8.dex */
public final class C30338ft {
    @NotNull

    /* renamed from: a */
    private final View f79305a;
    @NotNull

    /* renamed from: b */
    private final RectF f79306b;
    @NotNull

    /* renamed from: c */
    private final Path f79307c;
    @Nullable

    /* renamed from: d */
    private final float[] f79308d;

    public /* synthetic */ C30338ft(View view, float f, float f2, float f3, float f4) {
        this(view, f, f2, f3, f4, new RectF(), new Path());
    }

    /* renamed from: a */
    private static float[] m34085a(float f, float f2, float f3, float f4) {
        if (f > 0.0f || f2 > 0.0f || f3 > 0.0f || f4 > 0.0f) {
            return new float[]{f, f, f2, f2, f3, f3, f4, f4};
        }
        return null;
    }

    /* renamed from: a */
    public final void m34084a(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f79308d == null || this.f79307c.isEmpty()) {
            return;
        }
        canvas.clipPath(this.f79307c);
    }

    public C30338ft(@NotNull View roundView, float f, float f2, float f3, float f4, @NotNull RectF clipRect, @NotNull Path clipPath) {
        Intrinsics.checkNotNullParameter(roundView, "roundView");
        Intrinsics.checkNotNullParameter(clipRect, "clipRect");
        Intrinsics.checkNotNullParameter(clipPath, "clipPath");
        this.f79305a = roundView;
        this.f79306b = clipRect;
        this.f79307c = clipPath;
        this.f79308d = m34085a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public final void m34086a() {
        if (this.f79308d != null) {
            int measuredWidth = this.f79305a.getMeasuredWidth();
            int measuredHeight = this.f79305a.getMeasuredHeight();
            int paddingLeft = this.f79305a.getPaddingLeft();
            int paddingTop = this.f79305a.getPaddingTop();
            int paddingRight = measuredWidth - this.f79305a.getPaddingRight();
            int paddingBottom = measuredHeight - this.f79305a.getPaddingBottom();
            if (paddingLeft >= paddingRight || paddingTop >= paddingBottom) {
                return;
            }
            this.f79306b.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
            this.f79307c.reset();
            this.f79307c.addRoundRect(this.f79306b, this.f79308d, Path.Direction.CW);
        }
    }
}
