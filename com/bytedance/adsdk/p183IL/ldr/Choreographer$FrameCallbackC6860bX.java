package com.bytedance.adsdk.p183IL.ldr;

import android.view.Choreographer;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.C6873zx;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.bytedance.component.sdk.annotation.MainThread;
import com.inmobi.commons.core.configs.CrashConfig;

/* renamed from: com.bytedance.adsdk.IL.ldr.bX */
/* loaded from: classes3.dex */
public class Choreographer$FrameCallbackC6860bX extends AbstractC6861bg implements Choreographer.FrameCallback {

    /* renamed from: eo */
    private C6832iR f14747eo;

    /* renamed from: IL */
    private float f14741IL = 1.0f;

    /* renamed from: bX */
    private boolean f14745bX = false;
    private long eqN = 0;

    /* renamed from: zx */
    private float f14749zx = 0.0f;
    private float ldr = 0.0f;

    /* renamed from: iR */
    private int f14748iR = 0;

    /* renamed from: Kg */
    private float f14742Kg = -2.14748365E9f;

    /* renamed from: WR */
    private float f14744WR = 2.14748365E9f;

    /* renamed from: bg */
    protected boolean f14746bg = false;

    /* renamed from: VB */
    private boolean f14743VB = false;

    /* renamed from: Fy */
    private boolean m90649Fy() {
        if (m90634eo() < 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: LZ */
    private void m90646LZ() {
        if (this.f14747eo == null) {
            return;
        }
        float f = this.ldr;
        if (f >= this.f14742Kg && f <= this.f14744WR) {
            return;
        }
        throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f14742Kg), Float.valueOf(this.f14744WR), Float.valueOf(this.ldr)));
    }

    private float tuV() {
        C6832iR c6832iR = this.f14747eo;
        if (c6832iR == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / c6832iR.m90739PX()) / Math.abs(this.f14741IL);
    }

    /* renamed from: IL */
    public void m90648IL(float f) {
        m90637bg(this.f14742Kg, f);
    }

    /* renamed from: Kg */
    public void m90647Kg() {
        this.f14747eo = null;
        this.f14742Kg = -2.14748365E9f;
        this.f14744WR = 2.14748365E9f;
    }

    /* renamed from: Lq */
    public float m90645Lq() {
        C6832iR c6832iR = this.f14747eo;
        if (c6832iR == null) {
            return 0.0f;
        }
        float f = this.f14742Kg;
        if (f == -2.14748365E9f) {
            return c6832iR.ldr();
        }
        return f;
    }

    @MainThread
    /* renamed from: PX */
    public void m90644PX() {
        VzQ();
        m90628IL(m90649Fy());
    }

    @MainThread
    /* renamed from: Ta */
    public void m90643Ta() {
        VzQ();
        eqN();
    }

    @MainThread
    /* renamed from: VB */
    public void m90642VB() {
        float m90645Lq;
        this.f14746bg = true;
        m90625bg(m90649Fy());
        if (m90649Fy()) {
            m90645Lq = m90632vb();
        } else {
            m90645Lq = m90645Lq();
        }
        m90638bg((int) m90645Lq);
        this.eqN = 0L;
        this.f14748iR = 0;
        xxp();
    }

    @MainThread
    protected void VzQ() {
        eqN(true);
    }

    /* renamed from: WR */
    public void m90641WR() {
        m90640bX(-m90634eo());
    }

    /* renamed from: bX */
    public void m90639bX(boolean z) {
        this.f14743VB = z;
    }

    /* renamed from: bg */
    public void m90635bg(C6832iR c6832iR) {
        boolean z = this.f14747eo == null;
        this.f14747eo = c6832iR;
        if (z) {
            m90637bg(Math.max(this.f14742Kg, c6832iR.ldr()), Math.min(this.f14744WR, c6832iR.m90725iR()));
        } else {
            m90637bg((int) c6832iR.ldr(), (int) c6832iR.m90725iR());
        }
        float f = this.ldr;
        this.ldr = 0.0f;
        this.f14749zx = 0.0f;
        m90638bg((int) f);
        m90627bX();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        mo90629IL();
        VzQ();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        float m90645Lq;
        float m90632vb;
        xxp();
        if (this.f14747eo != null && isRunning()) {
            C6873zx.m90580bg("LottieValueAnimator#doFrame");
            long j2 = this.eqN;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float tuV = ((float) j3) / tuV();
            float f = this.f14749zx;
            if (m90649Fy()) {
                tuV = -tuV;
            }
            float f2 = f + tuV;
            boolean z = !C6868zx.m90602bX(f2, m90645Lq(), m90632vb());
            float f3 = this.f14749zx;
            float m90604IL = C6868zx.m90604IL(f2, m90645Lq(), m90632vb());
            this.f14749zx = m90604IL;
            if (this.f14743VB) {
                m90604IL = (float) Math.floor(m90604IL);
            }
            this.ldr = m90604IL;
            this.eqN = j;
            if (!this.f14743VB || this.f14749zx != f3) {
                m90627bX();
            }
            if (z) {
                if (getRepeatCount() != -1 && this.f14748iR >= getRepeatCount()) {
                    if (this.f14741IL < 0.0f) {
                        m90632vb = m90645Lq();
                    } else {
                        m90632vb = m90632vb();
                    }
                    this.f14749zx = m90632vb;
                    this.ldr = m90632vb;
                    VzQ();
                    m90628IL(m90649Fy());
                } else {
                    m90626bg();
                    this.f14748iR++;
                    if (getRepeatMode() == 2) {
                        this.f14745bX = !this.f14745bX;
                        m90641WR();
                    } else {
                        if (m90649Fy()) {
                            m90645Lq = m90632vb();
                        } else {
                            m90645Lq = m90645Lq();
                        }
                        this.f14749zx = m90645Lq;
                        this.ldr = m90645Lq;
                    }
                    this.eqN = j;
                }
            }
            m90646LZ();
            C6873zx.m90583IL("LottieValueAnimator#doFrame");
        }
    }

    /* renamed from: eo */
    public float m90634eo() {
        return this.f14741IL;
    }

    @MainThread
    protected void eqN(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f14746bg = false;
        }
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    public float getAnimatedFraction() {
        float m90645Lq;
        float m90632vb;
        float m90645Lq2;
        if (this.f14747eo == null) {
            return 0.0f;
        }
        if (m90649Fy()) {
            m90645Lq = m90632vb() - this.ldr;
            m90632vb = m90632vb();
            m90645Lq2 = m90645Lq();
        } else {
            m90645Lq = this.ldr - m90645Lq();
            m90632vb = m90632vb();
            m90645Lq2 = m90645Lq();
        }
        return m90645Lq / (m90632vb - m90645Lq2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(ldr());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        C6832iR c6832iR = this.f14747eo;
        if (c6832iR == null) {
            return 0L;
        }
        return c6832iR.m90723zx();
    }

    /* renamed from: iR */
    public float m90633iR() {
        return this.ldr;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f14746bg;
    }

    @FloatRange(from = 0.0d, to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    public float ldr() {
        C6832iR c6832iR = this.f14747eo;
        if (c6832iR == null) {
            return 0.0f;
        }
        return (this.ldr - c6832iR.ldr()) / (this.f14747eo.m90725iR() - this.f14747eo.ldr());
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f14745bX) {
            this.f14745bX = false;
            m90641WR();
        }
    }

    /* renamed from: vb */
    public float m90632vb() {
        C6832iR c6832iR = this.f14747eo;
        if (c6832iR == null) {
            return 0.0f;
        }
        float f = this.f14744WR;
        if (f == 2.14748365E9f) {
            return c6832iR.m90725iR();
        }
        return f;
    }

    protected void xxp() {
        if (isRunning()) {
            eqN(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @MainThread
    public void yDt() {
        this.f14746bg = true;
        xxp();
        this.eqN = 0L;
        if (m90649Fy() && m90633iR() == m90645Lq()) {
            m90638bg(m90632vb());
        } else if (!m90649Fy() && m90633iR() == m90632vb()) {
            m90638bg(m90645Lq());
        }
        m90624zx();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.p183IL.ldr.AbstractC6861bg
    /* renamed from: IL */
    public void mo90629IL() {
        super.mo90629IL();
        m90628IL(m90649Fy());
    }

    /* renamed from: bX */
    public void m90640bX(float f) {
        this.f14741IL = f;
    }

    /* renamed from: bg */
    public void m90638bg(float f) {
        if (this.f14749zx == f) {
            return;
        }
        float m90604IL = C6868zx.m90604IL(f, m90645Lq(), m90632vb());
        this.f14749zx = m90604IL;
        if (this.f14743VB) {
            m90604IL = (float) Math.floor(m90604IL);
        }
        this.ldr = m90604IL;
        this.eqN = 0L;
        m90627bX();
    }

    /* renamed from: bg */
    public void m90636bg(int i) {
        m90637bg(i, (int) this.f14744WR);
    }

    /* renamed from: bg */
    public void m90637bg(float f, float f2) {
        if (f <= f2) {
            C6832iR c6832iR = this.f14747eo;
            float ldr = c6832iR == null ? -3.4028235E38f : c6832iR.ldr();
            C6832iR c6832iR2 = this.f14747eo;
            float m90725iR = c6832iR2 == null ? Float.MAX_VALUE : c6832iR2.m90725iR();
            float m90604IL = C6868zx.m90604IL(f, ldr, m90725iR);
            float m90604IL2 = C6868zx.m90604IL(f2, ldr, m90725iR);
            if (m90604IL == this.f14742Kg && m90604IL2 == this.f14744WR) {
                return;
            }
            this.f14742Kg = m90604IL;
            this.f14744WR = m90604IL2;
            m90638bg((int) C6868zx.m90604IL(this.ldr, m90604IL, m90604IL2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }
}
