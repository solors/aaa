package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import com.google.firebase.ktx.BuildConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.inmobi.media.R3 */
/* loaded from: classes6.dex */
public final class C19081R3 extends ImageView implements InterfaceC19043O3 {

    /* renamed from: a */
    public InterfaceC19056P3 f47654a;

    /* renamed from: b */
    public float f47655b;

    /* renamed from: c */
    public boolean f47656c;

    /* renamed from: d */
    public String f47657d;

    public C19081R3(Context context) {
        super(context, null);
        this.f47655b = 1.0f;
        this.f47656c = true;
        this.f47657d = BuildConfig.VERSION_NAME;
        setLayerType(1, null);
    }

    private final int getDensity() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (getContext() instanceof Activity) {
            Context context = getContext();
            Intrinsics.m17073h(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.densityDpi;
        }
        return 240;
    }

    private final float getScale() {
        float density = getContext().getResources().getDisplayMetrics().densityDpi / getDensity();
        this.f47655b = density;
        if (density < 0.1f) {
            this.f47655b = 0.1f;
        }
        if (this.f47655b > 5.0f) {
            this.f47655b = 5.0f;
        }
        return this.f47655b;
    }

    /* renamed from: a */
    public final void m60746a(Canvas canvas) {
        int i;
        float f;
        float f2;
        canvas.save();
        float f3 = this.f47655b;
        canvas.scale(f3, f3);
        float width = getWidth();
        float height = getHeight();
        InterfaceC19056P3 interfaceC19056P3 = this.f47654a;
        int i2 = 0;
        if (interfaceC19056P3 != null) {
            i = interfaceC19056P3.mo60792d();
        } else {
            i = 0;
        }
        float f4 = i * this.f47655b;
        InterfaceC19056P3 interfaceC19056P32 = this.f47654a;
        if (interfaceC19056P32 != null) {
            i2 = interfaceC19056P32.mo60799a();
        }
        float f5 = i2 * this.f47655b;
        String str = this.f47657d;
        if (Intrinsics.m17075f(str, "aspectFill")) {
            float max = Math.max(height / f5, width / f4);
            float f6 = width - (f4 * max);
            float f7 = 2;
            float f8 = this.f47655b * max;
            f = (f6 / f7) / f8;
            f2 = ((height - (f5 * max)) / f7) / f8;
            canvas.scale(max, max);
        } else if (Intrinsics.m17075f(str, "aspectFit")) {
            float min = Math.min(height / f5, width / f4);
            float f9 = width - (f4 * min);
            float f10 = 2;
            float f11 = this.f47655b * min;
            f = (f9 / f10) / f11;
            f2 = ((height - (f5 * min)) / f10) / f11;
            canvas.scale(min, min);
        } else {
            canvas.scale(width / f4, height / f5);
            f = 0.0f;
            f2 = 0.0f;
        }
        InterfaceC19056P3 interfaceC19056P33 = this.f47654a;
        if (interfaceC19056P33 != null) {
            interfaceC19056P33.mo60798a(canvas, f, f2);
        }
        canvas.restore();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        InterfaceC19056P3 interfaceC19056P3 = this.f47654a;
        if (interfaceC19056P3 != null) {
            if (interfaceC19056P3.mo60793c()) {
                interfaceC19056P3.mo60794b();
                m60746a(canvas);
                if (this.f47656c) {
                    postInvalidateOnAnimation();
                    return;
                }
                return;
            }
            m60746a(canvas);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        if (getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f47656c = z2;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        this.f47655b = getScale();
        Drawable drawable = getDrawable();
        InterfaceC19056P3 interfaceC19056P3 = this.f47654a;
        int i4 = 1;
        if (drawable != null) {
            i3 = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (i3 <= 0) {
                i3 = 1;
            }
            if (intrinsicHeight > 0) {
                i4 = intrinsicHeight;
            }
        } else if (interfaceC19056P3 != null) {
            int mo60792d = interfaceC19056P3.mo60792d();
            int mo60799a = interfaceC19056P3.mo60799a();
            if (mo60792d <= 0) {
                mo60792d = 1;
            }
            if (mo60799a > 0) {
                i4 = mo60799a;
            }
            i3 = mo60792d;
        } else {
            i4 = 0;
            i3 = 0;
        }
        setMeasuredDimension(View.resolveSize(Math.max(getPaddingLeft() + getPaddingRight() + i3, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(getPaddingTop() + getPaddingBottom() + i4, getSuggestedMinimumHeight()), i2));
    }

    @Override // android.view.View
    public final void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.f47656c = z;
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f47656c = z;
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f47656c = z;
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public final void setContentMode(@NotNull String contentMode) {
        Intrinsics.checkNotNullParameter(contentMode, "contentMode");
        this.f47657d = contentMode;
    }

    public final void setGifImpl(@Nullable InterfaceC19056P3 interfaceC19056P3) {
        this.f47654a = interfaceC19056P3;
        if (interfaceC19056P3 != null) {
            interfaceC19056P3.mo60797a(this);
            interfaceC19056P3.start();
        }
        requestLayout();
    }

    public final void setPaused(boolean z) {
        InterfaceC19056P3 interfaceC19056P3 = this.f47654a;
        if (interfaceC19056P3 != null) {
            interfaceC19056P3.mo60795a(z);
        }
    }

    private static /* synthetic */ void getMContentMode$annotations() {
    }
}
