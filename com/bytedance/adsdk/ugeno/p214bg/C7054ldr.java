package com.bytedance.adsdk.ugeno.p214bg;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* renamed from: com.bytedance.adsdk.ugeno.bg.ldr */
/* loaded from: classes3.dex */
public class C7054ldr implements InterfaceC7055zx {

    /* renamed from: IL */
    private float f15140IL;

    /* renamed from: bX */
    private float f15141bX;

    /* renamed from: bg */
    private View f15142bg;
    private float eqN;
    private float ldr;

    /* renamed from: zx */
    private float f15143zx;

    public C7054ldr(View view) {
        this.f15142bg = view;
    }

    /* renamed from: IL */
    public void m90179IL(float f) {
        View view = this.f15142bg;
        if (view == null) {
            return;
        }
        this.f15141bX = f;
        view.postInvalidate();
    }

    /* renamed from: bX */
    public void m90178bX(float f) {
        View view = this.f15142bg;
        if (view == null) {
            return;
        }
        this.eqN = f;
        view.postInvalidate();
    }

    /* renamed from: bg */
    public void m90176bg(float f) {
        View view = this.f15142bg;
        if (view == null) {
            return;
        }
        this.f15140IL = f;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f);
        }
    }

    public void eqN(float f) {
        this.f15143zx = f;
        this.f15142bg.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx, com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.f15141bX;
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx
    public float getRubIn() {
        return this.ldr;
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx
    public float getShine() {
        return this.eqN;
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx
    public float getStretch() {
        return this.f15143zx;
    }

    /* renamed from: zx */
    public void m90174zx(float f) {
        this.ldr = f;
        this.f15142bg.postInvalidate();
    }

    /* renamed from: bg */
    public float m90177bg() {
        return this.f15140IL;
    }

    /* renamed from: bg */
    public void m90175bg(int i) {
        View view = this.f15142bg;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i);
        }
    }
}
