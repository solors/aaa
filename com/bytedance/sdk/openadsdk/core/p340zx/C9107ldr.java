package com.bytedance.sdk.openadsdk.core.p340zx;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.bytedance.sdk.openadsdk.core.zx.ldr */
/* loaded from: classes3.dex */
public class C9107ldr extends FrameLayout {

    /* renamed from: IL */
    private int f20326IL;

    /* renamed from: Kg */
    private boolean f20327Kg;

    /* renamed from: bX */
    private Drawable f20328bX;

    /* renamed from: bg */
    private int f20329bg;
    private Drawable eqN;

    /* renamed from: iR */
    private ValueAnimator f20330iR;
    private boolean ldr;

    /* renamed from: zx */
    private Drawable f20331zx;

    public C9107ldr(Context context) {
        super(context);
        this.f20329bg = 100;
    }

    /* renamed from: bg */
    private void m83535bg() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 10000);
        this.f20330iR = ofInt;
        ofInt.setDuration(2000L);
        this.f20330iR.setRepeatCount(-1);
        this.f20330iR.setInterpolator(new LinearInterpolator());
        this.f20330iR.setRepeatMode(1);
        this.f20330iR.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.zx.ldr.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9107ldr.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.f20330iR.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ldr = true;
        if (this.f20331zx != null) {
            m83535bg();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.ldr = false;
        ValueAnimator valueAnimator = this.f20330iR;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f20330iR.removeAllUpdateListeners();
            this.f20330iR = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            if (this.f20327Kg) {
                this.f20327Kg = false;
                ValueAnimator valueAnimator = this.f20330iR;
                if (valueAnimator != null) {
                    valueAnimator.resume();
                    return;
                } else {
                    m83535bg();
                    return;
                }
            }
            return;
        }
        ValueAnimator valueAnimator2 = this.f20330iR;
        if (valueAnimator2 != null && !this.f20327Kg) {
            this.f20327Kg = true;
            valueAnimator2.pause();
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.f20331zx = drawable;
        setProgressDrawable(drawable);
        if (this.ldr && this.f20330iR == null) {
            m83535bg();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(C9102WR.m83538bg(this, layoutParams));
    }

    public void setMax(int i) {
        this.f20329bg = i;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    public void setProgress(int i) {
        this.f20326IL = i;
        Drawable drawable = this.f20328bX;
        if (drawable != null) {
            drawable.setLevel((int) ((i * 10000.0f) / this.f20329bg));
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        this.eqN = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.eqN;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                Drawable drawable3 = ((LayerDrawable) this.eqN).getDrawable(i);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.f20328bX = drawable3;
                }
            }
        }
        Drawable drawable4 = this.eqN;
        if (drawable4 instanceof RotateDrawable) {
            this.f20328bX = drawable4;
        }
    }

    public C9107ldr(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20329bg = 100;
    }
}
