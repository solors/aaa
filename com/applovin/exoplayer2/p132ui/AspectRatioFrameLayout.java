package com.applovin.exoplayer2.p132ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.applovin.sdk.C6200R;

/* renamed from: com.applovin.exoplayer2.ui.AspectRatioFrameLayout */
/* loaded from: classes2.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a */
    private final RunnableC3944c f4242a;

    /* renamed from: b */
    private float f4243b;

    /* renamed from: c */
    private int f4244c;

    /* renamed from: com.applovin.exoplayer2.ui.AspectRatioFrameLayout$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC3943b {
    }

    /* renamed from: com.applovin.exoplayer2.ui.AspectRatioFrameLayout$c */
    /* loaded from: classes2.dex */
    private final class RunnableC3944c implements Runnable {

        /* renamed from: a */
        private float f4245a;

        /* renamed from: b */
        private float f4246b;

        /* renamed from: c */
        private boolean f4247c;

        /* renamed from: d */
        private boolean f4248d;

        private RunnableC3944c() {
        }

        /* renamed from: a */
        public void m101258a(float f, float f2, boolean z) {
            this.f4245a = f;
            this.f4246b = f2;
            this.f4247c = z;
            if (!this.f4248d) {
                this.f4248d = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4248d = false;
            AspectRatioFrameLayout.m101259a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    static /* synthetic */ InterfaceC3943b m101259a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f4244c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f4243b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4;
        float f6 = (this.f4243b / f5) - 1.0f;
        if (Math.abs(f6) <= 0.01f) {
            this.f4242a.m101258a(this.f4243b, f5, false);
            return;
        }
        int i3 = this.f4244c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 4) {
                        if (f6 > 0.0f) {
                            f = this.f4243b;
                        } else {
                            f2 = this.f4243b;
                        }
                    }
                } else {
                    f = this.f4243b;
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.f4243b;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f6 > 0.0f) {
            f2 = this.f4243b;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.f4243b;
            measuredWidth = (int) (f4 * f);
        }
        this.f4242a.m101258a(this.f4243b, f5, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f4243b != f) {
            this.f4243b = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i) {
        if (this.f4244c != i) {
            this.f4244c = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4244c = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C6200R.styleable.AppLovinAspectRatioFrameLayout, 0, 0);
            try {
                this.f4244c = obtainStyledAttributes.getInt(C6200R.styleable.AppLovinAspectRatioFrameLayout_al_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f4242a = new RunnableC3944c();
    }

    public void setAspectRatioListener(@Nullable InterfaceC3943b interfaceC3943b) {
    }
}
