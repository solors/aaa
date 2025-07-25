package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.c8 */
/* loaded from: classes8.dex */
public final class C30075c8 extends View {
    @NotNull

    /* renamed from: a */
    private final C30339fu f77536a;
    @NotNull

    /* renamed from: b */
    private final Paint f77537b;
    @NotNull

    /* renamed from: c */
    private final Paint f77538c;
    @NotNull

    /* renamed from: d */
    private final Paint f77539d;

    /* renamed from: e */
    private int f77540e;

    /* renamed from: f */
    private int f77541f;

    /* renamed from: g */
    private int f77542g;

    /* renamed from: h */
    private float f77543h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30075c8(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    private final void m35345a() {
        this.f77537b.setColor(this.f77540e);
        this.f77538c.setColor(this.f77542g);
        this.f77539d.setColor(this.f77542g);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(@NotNull Configuration newConfig) {
        int i;
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (this.f77536a.m34080a()) {
            i = -7829368;
        } else {
            i = -1;
        }
        this.f77542g = i;
        m35345a();
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawColor(0);
        float min = Math.min(getWidth(), getHeight());
        float f = min / 2.0f;
        canvas.drawCircle(f, f, f, this.f77537b);
        float f2 = min / 5.0f;
        float f3 = f - f2;
        float f4 = f2 + f;
        canvas.drawLine(f3, f3, f4, f4, this.f77538c);
        canvas.drawLine(f3, f4, f4, f3, this.f77538c);
        float f5 = this.f77543h;
        if (f5 > 0.0f) {
            this.f77539d.setStrokeWidth(f5);
            canvas.drawCircle(f, f, f - this.f77543h, this.f77539d);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 0) {
            m35344a(C31873y7.m27007a());
            m35345a();
            invalidate();
        } else if (1 == event.getAction()) {
            m35344a(this.f77541f);
            m35345a();
            invalidate();
        }
        return super.onTouchEvent(event);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f77541f = i;
        m35344a(i);
        m35345a();
        invalidate();
    }

    public final void setBorderWidth(float f) {
        this.f77543h = f;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30075c8(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30075c8(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77536a = new C30339fu(context);
        this.f77540e = C31956z7.m26329a();
        this.f77541f = C31956z7.m26329a();
        this.f77542g = -1;
        this.f77543h = -1.0f;
        if (attributeSet == null || i == 0) {
            int m26329a = C31956z7.m26329a();
            this.f77541f = m26329a;
            m35344a(m26329a);
        }
        Paint paint = new Paint(0);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f77537b = paint;
        Paint paint2 = new Paint(0);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f77538c = paint2;
        Paint paint3 = new Paint(0);
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        this.f77539d = paint3;
        m35345a();
    }

    /* renamed from: a */
    private final void m35344a(int i) {
        int m35263a = cc2.m35263a(i, 20.0f);
        this.f77540e = m35263a;
        float[] fArr = new float[3];
        Color.colorToHSV(m35263a, fArr);
        if (fArr[2] < 0.5f) {
            this.f77542g = this.f77536a.m34080a() ? -7829368 : -1;
        } else {
            this.f77542g = ViewCompat.MEASURED_STATE_MASK;
        }
    }

    public /* synthetic */ C30075c8(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
