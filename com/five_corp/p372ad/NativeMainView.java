package com.five_corp.p372ad;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.five_corp.p372ad.internal.logger.C13836a;

/* renamed from: com.five_corp.ad.NativeMainView */
/* loaded from: classes4.dex */
public class NativeMainView extends FrameLayout {

    /* renamed from: a */
    public final FrameLayout f25051a;

    /* renamed from: b */
    public final C13836a f25052b;

    /* renamed from: c */
    public double f25053c;

    /* renamed from: d */
    public final int f25054d;

    /* renamed from: e */
    public boolean f25055e;

    public NativeMainView(Context context, FrameLayout frameLayout, C13836a c13836a, int i) {
        super(context);
        this.f25055e = false;
        this.f25051a = frameLayout;
        this.f25052b = c13836a;
        this.f25053c = 0.0d;
        this.f25054d = i;
        addView(frameLayout);
    }

    public int getLogicalHeight() {
        if (this.f25055e) {
            return getHeight();
        }
        int i = this.f25054d;
        double d = this.f25053c;
        if (d == 0.0d) {
            return 0;
        }
        return (int) (i * d);
    }

    public int getLogicalWidth() {
        if (this.f25055e) {
            return getWidth();
        }
        return this.f25054d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.f25055e = true;
        } catch (Throwable th) {
            this.f25052b.m78269a(th);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return callOnClick();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        FrameLayout.LayoutParams layoutParams;
        FrameLayout frameLayout;
        try {
            int i3 = this.f25054d;
            int i4 = 0;
            if (i3 > 0) {
                i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                int i5 = this.f25054d;
                double d = this.f25053c;
                if (d != 0.0d) {
                    i4 = (int) (i5 * d);
                }
                i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else if (View.MeasureSpec.getMode(i) == 0) {
                int size = View.MeasureSpec.getSize(i2);
                double d2 = this.f25053c;
                if (d2 != 0.0d) {
                    i4 = (int) (size / d2);
                }
                i = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else if (View.MeasureSpec.getMode(i2) == 0) {
                int size2 = View.MeasureSpec.getSize(i);
                double d3 = this.f25053c;
                if (d3 != 0.0d) {
                    i4 = (int) (size2 * d3);
                }
                i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            }
            int size3 = View.MeasureSpec.getSize(i);
            int size4 = View.MeasureSpec.getSize(i2);
            double d4 = this.f25053c;
            if (d4 != 0.0d) {
                double d5 = size4;
                double d6 = size3;
                if (d5 < d4 * d6) {
                    frameLayout = this.f25051a;
                    layoutParams = new FrameLayout.LayoutParams((int) (d5 / this.f25053c), size4, 17);
                } else {
                    FrameLayout frameLayout2 = this.f25051a;
                    layoutParams = new FrameLayout.LayoutParams(size3, (int) (d6 * this.f25053c), 17);
                    frameLayout = frameLayout2;
                }
                frameLayout.setLayoutParams(layoutParams);
            }
        } catch (Throwable th) {
            this.f25052b.m78269a(th);
        }
        super.onMeasure(i, i2);
    }

    public void setConfigHeightToWidthRatio(double d) {
        this.f25053c = d;
    }
}
