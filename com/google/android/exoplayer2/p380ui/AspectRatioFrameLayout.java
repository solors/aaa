package com.google.android.exoplayer2.p380ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout */
/* loaded from: classes4.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public static final int RESIZE_MODE_FILL = 3;
    public static final int RESIZE_MODE_FIT = 0;
    public static final int RESIZE_MODE_FIXED_HEIGHT = 2;
    public static final int RESIZE_MODE_FIXED_WIDTH = 1;
    public static final int RESIZE_MODE_ZOOM = 4;

    /* renamed from: b */
    private final AspectRatioUpdateDispatcher f35234b;
    @Nullable

    /* renamed from: c */
    private AspectRatioListener f35235c;

    /* renamed from: d */
    private float f35236d;

    /* renamed from: f */
    private int f35237f;

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$AspectRatioListener */
    /* loaded from: classes4.dex */
    public interface AspectRatioListener {
        void onAspectRatioUpdated(float f, float f2, boolean z);
    }

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$AspectRatioUpdateDispatcher */
    /* loaded from: classes4.dex */
    private final class AspectRatioUpdateDispatcher implements Runnable {

        /* renamed from: b */
        private float f35238b;

        /* renamed from: c */
        private float f35239c;

        /* renamed from: d */
        private boolean f35240d;

        /* renamed from: f */
        private boolean f35241f;

        private AspectRatioUpdateDispatcher() {
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35241f = false;
            if (AspectRatioFrameLayout.this.f35235c == null) {
                return;
            }
            AspectRatioFrameLayout.this.f35235c.onAspectRatioUpdated(this.f35238b, this.f35239c, this.f35240d);
        }

        public void scheduleUpdate(float f, float f2, boolean z) {
            this.f35238b = f;
            this.f35239c = f2;
            this.f35240d = z;
            if (!this.f35241f) {
                this.f35241f = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$ResizeMode */
    /* loaded from: classes4.dex */
    public @interface ResizeMode {
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public int getResizeMode() {
        return this.f35237f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f35236d <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4;
        float f6 = (this.f35236d / f5) - 1.0f;
        if (Math.abs(f6) <= 0.01f) {
            this.f35234b.scheduleUpdate(this.f35236d, f5, false);
            return;
        }
        int i3 = this.f35237f;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 4) {
                        if (f6 > 0.0f) {
                            f = this.f35236d;
                        } else {
                            f2 = this.f35236d;
                        }
                    }
                } else {
                    f = this.f35236d;
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.f35236d;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f6 > 0.0f) {
            f2 = this.f35236d;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.f35236d;
            measuredWidth = (int) (f4 * f);
        }
        this.f35234b.scheduleUpdate(this.f35236d, f5, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f35236d != f) {
            this.f35236d = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable AspectRatioListener aspectRatioListener) {
        this.f35235c = aspectRatioListener;
    }

    public void setResizeMode(int i) {
        if (this.f35237f != i) {
            this.f35237f = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35237f = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C16096R.styleable.AspectRatioFrameLayout, 0, 0);
            try {
                this.f35237f = obtainStyledAttributes.getInt(C16096R.styleable.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f35234b = new AspectRatioUpdateDispatcher();
    }
}
