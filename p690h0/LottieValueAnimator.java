package p690h0;

import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;
import com.inmobi.commons.core.configs.CrashConfig;

/* renamed from: h0.g */
/* loaded from: classes2.dex */
public class LottieValueAnimator extends BaseLottieAnimator implements Choreographer.FrameCallback {
    @Nullable

    /* renamed from: l */
    private LottieComposition f91295l;

    /* renamed from: d */
    private float f91288d = 1.0f;

    /* renamed from: f */
    private boolean f91289f = false;

    /* renamed from: g */
    private long f91290g = 0;

    /* renamed from: h */
    private float f91291h = 0.0f;

    /* renamed from: i */
    private int f91292i = 0;

    /* renamed from: j */
    private float f91293j = -2.14748365E9f;

    /* renamed from: k */
    private float f91294k = 2.14748365E9f;
    @VisibleForTesting

    /* renamed from: m */
    protected boolean f91296m = false;

    /* renamed from: C */
    private void m23897C() {
        if (this.f91295l == null) {
            return;
        }
        float f = this.f91291h;
        if (f >= this.f91293j && f <= this.f91294k) {
            return;
        }
        throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f91293j), Float.valueOf(this.f91294k), Float.valueOf(this.f91291h)));
    }

    /* renamed from: k */
    private float m23892k() {
        LottieComposition lottieComposition = this.f91295l;
        if (lottieComposition == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / lottieComposition.m103390i()) / Math.abs(this.f91288d);
    }

    /* renamed from: o */
    private boolean m23888o() {
        if (m23889n() < 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public void m23899A(int i) {
        m23877z(i, (int) this.f91294k);
    }

    /* renamed from: B */
    public void m23898B(float f) {
        this.f91288d = f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        m23916b();
        m23884s();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        float m23890m;
        float m23891l;
        m23885r();
        if (this.f91295l != null && isRunning()) {
            L.m103402a("LottieValueAnimator#doFrame");
            long j2 = this.f91290g;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float m23892k = ((float) j3) / m23892k();
            float f = this.f91291h;
            if (m23888o()) {
                m23892k = -m23892k;
            }
            float f2 = f + m23892k;
            this.f91291h = f2;
            boolean z = !MiscUtils.m23871e(f2, m23890m(), m23891l());
            this.f91291h = MiscUtils.m23873c(this.f91291h, m23890m(), m23891l());
            this.f91290g = j;
            m23912f();
            if (z) {
                if (getRepeatCount() != -1 && this.f91292i >= getRepeatCount()) {
                    if (this.f91288d < 0.0f) {
                        m23891l = m23890m();
                    } else {
                        m23891l = m23891l();
                    }
                    this.f91291h = m23891l;
                    m23884s();
                    m23915c(m23888o());
                } else {
                    m23914d();
                    this.f91292i++;
                    if (getRepeatMode() == 2) {
                        this.f91289f = !this.f91289f;
                        m23881v();
                    } else {
                        if (m23888o()) {
                            m23890m = m23891l();
                        } else {
                            m23890m = m23890m();
                        }
                        this.f91291h = m23890m;
                    }
                    this.f91290g = j;
                }
            }
            m23897C();
            L.m103401b("LottieValueAnimator#doFrame");
        }
    }

    /* renamed from: g */
    public void m23896g() {
        this.f91295l = null;
        this.f91293j = -2.14748365E9f;
        this.f91294k = 2.14748365E9f;
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, m105511to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    public float getAnimatedFraction() {
        float m23890m;
        float m23891l;
        float m23890m2;
        if (this.f91295l == null) {
            return 0.0f;
        }
        if (m23888o()) {
            m23890m = m23891l() - this.f91291h;
            m23891l = m23891l();
            m23890m2 = m23890m();
        } else {
            m23890m = this.f91291h - m23890m();
            m23891l = m23891l();
            m23890m2 = m23890m();
        }
        return m23890m / (m23891l - m23890m2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(m23894i());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        LottieComposition lottieComposition = this.f91295l;
        if (lottieComposition == null) {
            return 0L;
        }
        return lottieComposition.m103395d();
    }

    @MainThread
    /* renamed from: h */
    public void m23895h() {
        m23884s();
        m23915c(m23888o());
    }

    @FloatRange(from = 0.0d, m105511to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    /* renamed from: i */
    public float m23894i() {
        LottieComposition lottieComposition = this.f91295l;
        if (lottieComposition == null) {
            return 0.0f;
        }
        return (this.f91291h - lottieComposition.m103383p()) / (this.f91295l.m103393f() - this.f91295l.m103383p());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f91296m;
    }

    /* renamed from: j */
    public float m23893j() {
        return this.f91291h;
    }

    /* renamed from: l */
    public float m23891l() {
        LottieComposition lottieComposition = this.f91295l;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.f91294k;
        if (f == 2.14748365E9f) {
            return lottieComposition.m103393f();
        }
        return f;
    }

    /* renamed from: m */
    public float m23890m() {
        LottieComposition lottieComposition = this.f91295l;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.f91293j;
        if (f == -2.14748365E9f) {
            return lottieComposition.m103383p();
        }
        return f;
    }

    /* renamed from: n */
    public float m23889n() {
        return this.f91288d;
    }

    @MainThread
    /* renamed from: p */
    public void m23887p() {
        m23884s();
    }

    @MainThread
    /* renamed from: q */
    public void m23886q() {
        float m23890m;
        this.f91296m = true;
        m23913e(m23888o());
        if (m23888o()) {
            m23890m = m23891l();
        } else {
            m23890m = m23890m();
        }
        m23879x((int) m23890m);
        this.f91290g = 0L;
        this.f91292i = 0;
        m23885r();
    }

    /* renamed from: r */
    protected void m23885r() {
        if (isRunning()) {
            m23883t(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @MainThread
    /* renamed from: s */
    protected void m23884s() {
        m23883t(true);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f91289f) {
            this.f91289f = false;
            m23881v();
        }
    }

    @MainThread
    /* renamed from: t */
    protected void m23883t(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f91296m = false;
        }
    }

    @MainThread
    /* renamed from: u */
    public void m23882u() {
        this.f91296m = true;
        m23885r();
        this.f91290g = 0L;
        if (m23888o() && m23893j() == m23890m()) {
            this.f91291h = m23891l();
        } else if (!m23888o() && m23893j() == m23891l()) {
            this.f91291h = m23890m();
        }
    }

    /* renamed from: v */
    public void m23881v() {
        m23898B(-m23889n());
    }

    /* renamed from: w */
    public void m23880w(LottieComposition lottieComposition) {
        boolean z;
        if (this.f91295l == null) {
            z = true;
        } else {
            z = false;
        }
        this.f91295l = lottieComposition;
        if (z) {
            m23877z((int) Math.max(this.f91293j, lottieComposition.m103383p()), (int) Math.min(this.f91294k, lottieComposition.m103393f()));
        } else {
            m23877z((int) lottieComposition.m103383p(), (int) lottieComposition.m103393f());
        }
        float f = this.f91291h;
        this.f91291h = 0.0f;
        m23879x((int) f);
        m23912f();
    }

    /* renamed from: x */
    public void m23879x(float f) {
        if (this.f91291h == f) {
            return;
        }
        this.f91291h = MiscUtils.m23873c(f, m23890m(), m23891l());
        this.f91290g = 0L;
        m23912f();
    }

    /* renamed from: y */
    public void m23878y(float f) {
        m23877z(this.f91293j, f);
    }

    /* renamed from: z */
    public void m23877z(float f, float f2) {
        float m103383p;
        float m103393f;
        if (f <= f2) {
            LottieComposition lottieComposition = this.f91295l;
            if (lottieComposition == null) {
                m103383p = -3.4028235E38f;
            } else {
                m103383p = lottieComposition.m103383p();
            }
            LottieComposition lottieComposition2 = this.f91295l;
            if (lottieComposition2 == null) {
                m103393f = Float.MAX_VALUE;
            } else {
                m103393f = lottieComposition2.m103393f();
            }
            float m23873c = MiscUtils.m23873c(f, m103383p, m103393f);
            float m23873c2 = MiscUtils.m23873c(f2, m103383p, m103393f);
            if (m23873c != this.f91293j || m23873c2 != this.f91294k) {
                this.f91293j = m23873c;
                this.f91294k = m23873c2;
                m23879x((int) MiscUtils.m23873c(this.f91291h, m23873c, m23873c2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }
}
