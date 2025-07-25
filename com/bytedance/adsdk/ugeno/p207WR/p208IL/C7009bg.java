package com.bytedance.adsdk.ugeno.p207WR.p208IL;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.InterfaceC7032bX;
import com.bytedance.adsdk.ugeno.core.C7077eo;
import java.util.Map;

/* renamed from: com.bytedance.adsdk.ugeno.WR.IL.bg */
/* loaded from: classes3.dex */
public class C7009bg extends FrameLayout {

    /* renamed from: IL */
    private Map<Integer, C7077eo> f15006IL;

    /* renamed from: bg */
    private InterfaceC7032bX f15007bg;

    public C7009bg(Context context) {
        super(context);
    }

    /* renamed from: bg */
    public void m90285bg(InterfaceC7032bX interfaceC7032bX) {
        this.f15007bg = interfaceC7032bX;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7032bX interfaceC7032bX = this.f15007bg;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90223iR();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7032bX interfaceC7032bX = this.f15007bg;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90228Kg();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, C7077eo> map = this.f15006IL;
        if (map != null && map.containsKey(4)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InterfaceC7032bX interfaceC7032bX = this.f15007bg;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.ldr();
        }
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC7032bX interfaceC7032bX2 = this.f15007bg;
        if (interfaceC7032bX2 != null) {
            interfaceC7032bX2.mo90226bg(i, i2, i3, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        InterfaceC7032bX interfaceC7032bX = this.f15007bg;
        if (interfaceC7032bX != null) {
            int[] mo90227bg = interfaceC7032bX.mo90227bg(i, i2);
            super.onMeasure(mo90227bg[0], mo90227bg[1]);
        } else {
            super.onMeasure(i, i2);
        }
        InterfaceC7032bX interfaceC7032bX2 = this.f15007bg;
        if (interfaceC7032bX2 != null) {
            interfaceC7032bX2.mo90222zx();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC7032bX interfaceC7032bX = this.f15007bg;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90229IL(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setEventMap(Map<Integer, C7077eo> map) {
        this.f15006IL = map;
    }
}
