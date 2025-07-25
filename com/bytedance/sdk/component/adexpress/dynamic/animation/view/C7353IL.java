package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7464iR;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.view.IL */
/* loaded from: classes3.dex */
public class C7353IL extends ImageView implements IAnimation {

    /* renamed from: IL */
    private float f15875IL;

    /* renamed from: bX */
    private float f15876bX;

    /* renamed from: bg */
    C7354bX f15877bg;
    private float eqN;
    private C7464iR ldr;

    /* renamed from: zx */
    private float f15878zx;

    public C7353IL(Context context) {
        super(context);
        this.f15877bg = new C7354bX();
    }

    public C7464iR getBrickNativeValue() {
        return this.ldr;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.eqN;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.f15875IL;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.f15876bX;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.f15878zx;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        C7464iR c7464iR;
        super.onDraw(canvas);
        this.f15877bg.m89097bg(canvas, this, this);
        if (getRippleValue() != 0.0f && (c7464iR = this.ldr) != null && c7464iR.m88918IL() > 0) {
            ((ViewGroup) getParent()).setClipChildren(false);
            ((ViewGroup) getParent().getParent()).setClipChildren(false);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f15877bg.m89095bg(this, i, i2);
    }

    public void setBrickNativeValue(C7464iR c7464iR) {
        this.ldr = c7464iR;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f) {
        this.eqN = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f) {
        this.f15875IL = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f) {
        this.f15876bX = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f) {
        this.f15878zx = f;
        this.f15877bg.m89096bg(this, f);
    }
}
