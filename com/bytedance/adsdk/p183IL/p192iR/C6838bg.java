package com.bytedance.adsdk.p183IL.p192iR;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.component.sdk.annotation.FloatRange;

/* renamed from: com.bytedance.adsdk.IL.iR.bg */
/* loaded from: classes3.dex */
public class C6838bg<T> {

    /* renamed from: IL */
    public T f14681IL;

    /* renamed from: Kg */
    public PointF f14682Kg;

    /* renamed from: Lq */
    private float f14683Lq;

    /* renamed from: PX */
    private float f14684PX;

    /* renamed from: Ta */
    private int f14685Ta;

    /* renamed from: VB */
    private float f14686VB;

    /* renamed from: WR */
    public PointF f14687WR;

    /* renamed from: bX */
    public final Interpolator f14688bX;

    /* renamed from: bg */
    public final T f14689bg;

    /* renamed from: eo */
    private final C6832iR f14690eo;
    public final Interpolator eqN;

    /* renamed from: iR */
    public Float f14691iR;
    public final float ldr;

    /* renamed from: vb */
    private float f14692vb;
    private int yDt;

    /* renamed from: zx */
    public final Interpolator f14693zx;

    public C6838bg(C6832iR c6832iR, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f14686VB = -3987645.8f;
        this.f14684PX = -3987645.8f;
        this.f14685Ta = 784923401;
        this.yDt = 784923401;
        this.f14683Lq = Float.MIN_VALUE;
        this.f14692vb = Float.MIN_VALUE;
        this.f14682Kg = null;
        this.f14687WR = null;
        this.f14690eo = c6832iR;
        this.f14689bg = t;
        this.f14681IL = t2;
        this.f14688bX = interpolator;
        this.eqN = null;
        this.f14693zx = null;
        this.ldr = f;
        this.f14691iR = f2;
    }

    /* renamed from: Kg */
    public int m90718Kg() {
        if (this.f14685Ta == 784923401) {
            this.f14685Ta = ((Integer) this.f14689bg).intValue();
        }
        return this.f14685Ta;
    }

    /* renamed from: WR */
    public int m90717WR() {
        if (this.yDt == 784923401) {
            this.yDt = ((Integer) this.f14681IL).intValue();
        }
        return this.yDt;
    }

    /* renamed from: bX */
    public float m90716bX() {
        C6832iR c6832iR = this.f14690eo;
        if (c6832iR == null) {
            return 0.0f;
        }
        if (this.f14683Lq == Float.MIN_VALUE) {
            this.f14683Lq = (this.ldr - c6832iR.ldr()) / this.f14690eo.xxp();
        }
        return this.f14683Lq;
    }

    /* renamed from: bg */
    public C6838bg<T> m90714bg(T t, T t2) {
        return new C6838bg<>(t, t2);
    }

    public float eqN() {
        if (this.f14690eo == null) {
            return 1.0f;
        }
        if (this.f14692vb == Float.MIN_VALUE) {
            if (this.f14691iR == null) {
                this.f14692vb = 1.0f;
            } else {
                this.f14692vb = m90716bX() + ((this.f14691iR.floatValue() - this.ldr) / this.f14690eo.xxp());
            }
        }
        return this.f14692vb;
    }

    /* renamed from: iR */
    public float m90713iR() {
        if (this.f14684PX == -3987645.8f) {
            this.f14684PX = ((Float) this.f14681IL).floatValue();
        }
        return this.f14684PX;
    }

    public float ldr() {
        if (this.f14686VB == -3987645.8f) {
            this.f14686VB = ((Float) this.f14689bg).floatValue();
        }
        return this.f14686VB;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f14689bg + ", endValue=" + this.f14681IL + ", startFrame=" + this.ldr + ", endFrame=" + this.f14691iR + ", interpolator=" + this.f14688bX + '}';
    }

    /* renamed from: zx */
    public boolean m90712zx() {
        if (this.f14688bX == null && this.eqN == null && this.f14693zx == null) {
            return true;
        }
        return false;
    }

    /* renamed from: bg */
    public boolean m90715bg(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        return f >= m90716bX() && f < eqN();
    }

    public C6838bg(C6832iR c6832iR, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.f14686VB = -3987645.8f;
        this.f14684PX = -3987645.8f;
        this.f14685Ta = 784923401;
        this.yDt = 784923401;
        this.f14683Lq = Float.MIN_VALUE;
        this.f14692vb = Float.MIN_VALUE;
        this.f14682Kg = null;
        this.f14687WR = null;
        this.f14690eo = c6832iR;
        this.f14689bg = t;
        this.f14681IL = t2;
        this.f14688bX = null;
        this.eqN = interpolator;
        this.f14693zx = interpolator2;
        this.ldr = f;
        this.f14691iR = f2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C6838bg(C6832iR c6832iR, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.f14686VB = -3987645.8f;
        this.f14684PX = -3987645.8f;
        this.f14685Ta = 784923401;
        this.yDt = 784923401;
        this.f14683Lq = Float.MIN_VALUE;
        this.f14692vb = Float.MIN_VALUE;
        this.f14682Kg = null;
        this.f14687WR = null;
        this.f14690eo = c6832iR;
        this.f14689bg = t;
        this.f14681IL = t2;
        this.f14688bX = interpolator;
        this.eqN = interpolator2;
        this.f14693zx = interpolator3;
        this.ldr = f;
        this.f14691iR = f2;
    }

    public C6838bg(T t) {
        this.f14686VB = -3987645.8f;
        this.f14684PX = -3987645.8f;
        this.f14685Ta = 784923401;
        this.yDt = 784923401;
        this.f14683Lq = Float.MIN_VALUE;
        this.f14692vb = Float.MIN_VALUE;
        this.f14682Kg = null;
        this.f14687WR = null;
        this.f14690eo = null;
        this.f14689bg = t;
        this.f14681IL = t;
        this.f14688bX = null;
        this.eqN = null;
        this.f14693zx = null;
        this.ldr = Float.MIN_VALUE;
        this.f14691iR = Float.valueOf(Float.MAX_VALUE);
    }

    private C6838bg(T t, T t2) {
        this.f14686VB = -3987645.8f;
        this.f14684PX = -3987645.8f;
        this.f14685Ta = 784923401;
        this.yDt = 784923401;
        this.f14683Lq = Float.MIN_VALUE;
        this.f14692vb = Float.MIN_VALUE;
        this.f14682Kg = null;
        this.f14687WR = null;
        this.f14690eo = null;
        this.f14689bg = t;
        this.f14681IL = t2;
        this.f14688bX = null;
        this.eqN = null;
        this.f14693zx = null;
        this.ldr = Float.MIN_VALUE;
        this.f14691iR = Float.valueOf(Float.MAX_VALUE);
    }
}
