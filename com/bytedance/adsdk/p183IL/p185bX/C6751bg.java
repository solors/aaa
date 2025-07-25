package com.bytedance.adsdk.p183IL.p185bX;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import com.bytedance.component.sdk.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.bytedance.adsdk.IL.bX.bg */
/* loaded from: classes3.dex */
public class C6751bg {

    /* renamed from: IL */
    private final PointF f14446IL;

    /* renamed from: bX */
    private final PointF f14447bX;

    /* renamed from: bg */
    private final PointF f14448bg;

    public C6751bg() {
        this.f14448bg = new PointF();
        this.f14446IL = new PointF();
        this.f14447bX = new PointF();
    }

    /* renamed from: IL */
    public void m90904IL(float f, float f2) {
        this.f14446IL.set(f, f2);
    }

    /* renamed from: bX */
    public void m90902bX(float f, float f2) {
        this.f14447bX.set(f, f2);
    }

    /* renamed from: bg */
    public void m90900bg(float f, float f2) {
        this.f14448bg.set(f, f2);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f14447bX.x), Float.valueOf(this.f14447bX.y), Float.valueOf(this.f14448bg.x), Float.valueOf(this.f14448bg.y), Float.valueOf(this.f14446IL.x), Float.valueOf(this.f14446IL.y));
    }

    /* renamed from: IL */
    public PointF m90905IL() {
        return this.f14446IL;
    }

    /* renamed from: bX */
    public PointF m90903bX() {
        return this.f14447bX;
    }

    /* renamed from: bg */
    public PointF m90901bg() {
        return this.f14448bg;
    }

    public C6751bg(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f14448bg = pointF;
        this.f14446IL = pointF2;
        this.f14447bX = pointF3;
    }
}
