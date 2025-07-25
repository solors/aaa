package com.bytedance.adsdk.ugeno.p207WR.ldr;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.InterfaceC7032bX;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.p214bg.C7054ldr;
import com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx;

/* renamed from: com.bytedance.adsdk.ugeno.WR.ldr.bg */
/* loaded from: classes3.dex */
public class C7029bg extends TextView implements InterfaceC7055zx, IAnimation {

    /* renamed from: IL */
    private float f15064IL;

    /* renamed from: bX */
    private C7054ldr f15065bX;

    /* renamed from: bg */
    private InterfaceC7032bX f15066bg;

    public C7029bg(Context context) {
        super(context);
        this.f15065bX = new C7054ldr(this);
    }

    /* renamed from: bg */
    public void m90233bg(InterfaceC7032bX interfaceC7032bX) {
        this.f15066bg = interfaceC7032bX;
    }

    public float getBorderRadius() {
        return this.f15065bX.m90177bg();
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx, com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.f15064IL;
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx
    public float getRubIn() {
        return this.f15065bX.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx
    public float getShine() {
        return this.f15065bX.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx
    public float getStretch() {
        return this.f15065bX.getStretch();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7032bX interfaceC7032bX = this.f15066bg;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90223iR();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7032bX interfaceC7032bX = this.f15066bg;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90228Kg();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        InterfaceC7032bX interfaceC7032bX = this.f15066bg;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90224bg(canvas, this);
            this.f15066bg.mo90225bg(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InterfaceC7032bX interfaceC7032bX = this.f15066bg;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90226bg(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        InterfaceC7032bX interfaceC7032bX = this.f15066bg;
        if (interfaceC7032bX != null) {
            int[] mo90227bg = interfaceC7032bX.mo90227bg(i, i2);
            super.onMeasure(mo90227bg[0], mo90227bg[1]);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC7032bX interfaceC7032bX = this.f15066bg;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90229IL(i, i2, i3, i3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f15065bX.m90175bg(i);
    }

    public void setBorderRadius(float f) {
        C7054ldr c7054ldr = this.f15065bX;
        if (c7054ldr != null) {
            c7054ldr.m90176bg(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.f15064IL = f;
        C7054ldr c7054ldr = this.f15065bX;
        if (c7054ldr != null) {
            c7054ldr.m90179IL(f);
        }
        postInvalidate();
    }

    public void setRubIn(float f) {
        C7054ldr c7054ldr = this.f15065bX;
        if (c7054ldr != null) {
            c7054ldr.m90174zx(f);
        }
    }

    public void setShine(float f) {
        C7054ldr c7054ldr = this.f15065bX;
        if (c7054ldr != null) {
            c7054ldr.m90178bX(f);
        }
    }

    public void setStretch(float f) {
        C7054ldr c7054ldr = this.f15065bX;
        if (c7054ldr != null) {
            c7054ldr.eqN(f);
        }
    }
}
