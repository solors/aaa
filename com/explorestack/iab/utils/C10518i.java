package com.explorestack.iab.utils;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;

/* renamed from: com.explorestack.iab.utils.i */
/* loaded from: classes3.dex */
public class C10518i extends Drawable implements Animatable {

    /* renamed from: i */
    private static final Interpolator f24050i = new LinearInterpolator();

    /* renamed from: j */
    private static final Interpolator f24051j = new animationInterpolatorC10519a();

    /* renamed from: k */
    private static final int[] f24052k = {ViewCompat.MEASURED_STATE_MASK};
    @VisibleForTesting

    /* renamed from: b */
    final C10522d f24053b;

    /* renamed from: c */
    private float f24054c;

    /* renamed from: d */
    private Resources f24055d;

    /* renamed from: f */
    private Animator f24056f;

    /* renamed from: g */
    private float f24057g;

    /* renamed from: h */
    private boolean f24058h;

    /* renamed from: com.explorestack.iab.utils.i$a  reason: invalid class name */
    /* loaded from: classes3.dex */
    class animationInterpolatorC10519a implements Interpolator {

        /* renamed from: a */
        private final float[] f24059a = {0.0f, 1.0E-4f, 2.0E-4f, 5.0E-4f, 9.0E-4f, 0.0014f, 0.002f, 0.0027f, 0.0036f, 0.0046f, 0.0058f, 0.0071f, 0.0085f, 0.0101f, 0.0118f, 0.0137f, 0.0158f, 0.018f, 0.0205f, 0.0231f, 0.0259f, 0.0289f, 0.0321f, 0.0355f, 0.0391f, 0.043f, 0.0471f, 0.0514f, 0.056f, 0.0608f, 0.066f, 0.0714f, 0.0771f, 0.083f, 0.0893f, 0.0959f, 0.1029f, 0.1101f, 0.1177f, 0.1257f, 0.1339f, 0.1426f, 0.1516f, 0.161f, 0.1707f, 0.1808f, 0.1913f, 0.2021f, 0.2133f, 0.2248f, 0.2366f, 0.2487f, 0.2611f, 0.2738f, 0.2867f, 0.2998f, 0.3131f, 0.3265f, 0.34f, 0.3536f, 0.3673f, 0.381f, 0.3946f, 0.4082f, 0.4217f, 0.4352f, 0.4485f, 0.4616f, 0.4746f, 0.4874f, 0.5f, 0.5124f, 0.5246f, 0.5365f, 0.5482f, 0.5597f, 0.571f, 0.582f, 0.5928f, 0.6033f, 0.6136f, 0.6237f, 0.6335f, 0.6431f, 0.6525f, 0.6616f, 0.6706f, 0.6793f, 0.6878f, 0.6961f, 0.7043f, 0.7122f, 0.7199f, 0.7275f, 0.7349f, 0.7421f, 0.7491f, 0.7559f, 0.7626f, 0.7692f, 0.7756f, 0.7818f, 0.7879f, 0.7938f, 0.7996f, 0.8053f, 0.8108f, 0.8162f, 0.8215f, 0.8266f, 0.8317f, 0.8366f, 0.8414f, 0.8461f, 0.8507f, 0.8551f, 0.8595f, 0.8638f, 0.8679f, 0.872f, 0.876f, 0.8798f, 0.8836f, 0.8873f, 0.8909f, 0.8945f, 0.8979f, 0.9013f, 0.9046f, 0.9078f, 0.9109f, 0.9139f, 0.9169f, 0.9198f, 0.9227f, 0.9254f, 0.9281f, 0.9307f, 0.9333f, 0.9358f, 0.9382f, 0.9406f, 0.9429f, 0.9452f, 0.9474f, 0.9495f, 0.9516f, 0.9536f, 0.9556f, 0.9575f, 0.9594f, 0.9612f, 0.9629f, 0.9646f, 0.9663f, 0.9679f, 0.9695f, 0.971f, 0.9725f, 0.9739f, 0.9753f, 0.9766f, 0.9779f, 0.9791f, 0.9803f, 0.9815f, 0.9826f, 0.9837f, 0.9848f, 0.9858f, 0.9867f, 0.9877f, 0.9885f, 0.9894f, 0.9902f, 0.991f, 0.9917f, 0.9924f, 0.9931f, 0.9937f, 0.9944f, 0.9949f, 0.9955f, 0.996f, 0.9964f, 0.9969f, 0.9973f, 0.9977f, 0.998f, 0.9984f, 0.9986f, 0.9989f, 0.9991f, 0.9993f, 0.9995f, 0.9997f, 0.9998f, 0.9999f, 0.9999f, 1.0f, 1.0f};

        /* renamed from: b */
        private final float f24060b = 1.0f / 200;

        animationInterpolatorC10519a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f >= 1.0f) {
                return 1.0f;
            }
            if (f <= 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.f24059a;
            int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
            float f2 = this.f24060b;
            float f3 = (f - (min * f2)) / f2;
            float[] fArr2 = this.f24059a;
            float f4 = fArr2[min];
            return f4 + (f3 * (fArr2[min + 1] - f4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.explorestack.iab.utils.i$b */
    /* loaded from: classes3.dex */
    public class C10520b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b */
        final /* synthetic */ C10522d f24061b;

        C10520b(C10522d c10522d) {
            this.f24061b = c10522d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C10518i.this.m79268o(floatValue, this.f24061b);
            C10518i.this.m79276g(floatValue, this.f24061b, false);
            C10518i.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: com.explorestack.iab.utils.i$d */
    /* loaded from: classes3.dex */
    public static class C10522d {

        /* renamed from: a */
        final RectF f24065a = new RectF();

        /* renamed from: b */
        final Paint f24066b;

        /* renamed from: c */
        final Paint f24067c;

        /* renamed from: d */
        final Paint f24068d;

        /* renamed from: e */
        final Paint f24069e;

        /* renamed from: f */
        float f24070f;

        /* renamed from: g */
        float f24071g;

        /* renamed from: h */
        float f24072h;

        /* renamed from: i */
        float f24073i;

        /* renamed from: j */
        int[] f24074j;

        /* renamed from: k */
        int f24075k;

        /* renamed from: l */
        float f24076l;

        /* renamed from: m */
        float f24077m;

        /* renamed from: n */
        float f24078n;

        /* renamed from: o */
        float f24079o;

        /* renamed from: p */
        int f24080p;

        /* renamed from: q */
        int f24081q;

        C10522d() {
            Paint paint = new Paint();
            this.f24066b = paint;
            Paint paint2 = new Paint();
            this.f24067c = paint2;
            Paint paint3 = new Paint();
            this.f24068d = paint3;
            Paint paint4 = new Paint();
            this.f24069e = paint4;
            this.f24070f = 0.0f;
            this.f24071g = 0.0f;
            this.f24072h = 0.0f;
            this.f24073i = 5.0f;
            this.f24080p = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
            paint4.setColor(0);
        }

        /* renamed from: a */
        int m79265a() {
            return this.f24080p;
        }

        /* renamed from: b */
        void m79264b(float f) {
            this.f24079o = f;
        }

        /* renamed from: c */
        void m79263c(int i) {
            this.f24080p = i;
        }

        /* renamed from: d */
        void m79262d(Canvas canvas, Rect rect) {
            RectF rectF = this.f24065a;
            float f = this.f24079o;
            float f2 = (this.f24073i / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - (this.f24073i / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.f24070f;
            float f4 = this.f24072h;
            float f5 = (f3 + f4) * 360.0f;
            this.f24066b.setColor(this.f24081q);
            this.f24066b.setAlpha(this.f24080p);
            float f6 = this.f24073i / 2.0f;
            rectF.inset(f6, f6);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f24068d);
            float f7 = -f6;
            rectF.inset(f7, f7);
            canvas.drawArc(rectF, f5, ((this.f24071g + f4) * 360.0f) - f5, false, this.f24066b);
        }

        /* renamed from: e */
        void m79261e(ColorFilter colorFilter) {
            this.f24066b.setColorFilter(colorFilter);
        }

        /* renamed from: f */
        void m79260f(Paint.Cap cap) {
            this.f24066b.setStrokeCap(cap);
        }

        /* renamed from: g */
        void m79259g(@NonNull int[] iArr) {
            this.f24074j = iArr;
            m79253m(0);
        }

        /* renamed from: h */
        float m79258h() {
            return this.f24071g;
        }

        /* renamed from: i */
        void m79257i(float f) {
            this.f24071g = f;
        }

        /* renamed from: j */
        void m79256j(int i) {
            this.f24081q = i;
        }

        /* renamed from: k */
        int m79255k() {
            return this.f24074j[m79252n()];
        }

        /* renamed from: l */
        void m79254l(float f) {
            this.f24072h = f;
        }

        /* renamed from: m */
        void m79253m(int i) {
            this.f24075k = i;
            this.f24081q = this.f24074j[i];
        }

        /* renamed from: n */
        int m79252n() {
            return (this.f24075k + 1) % this.f24074j.length;
        }

        /* renamed from: o */
        void m79251o(float f) {
            this.f24070f = f;
        }

        /* renamed from: p */
        float m79250p() {
            return this.f24070f;
        }

        /* renamed from: q */
        void m79249q(float f) {
            this.f24073i = f;
            this.f24066b.setStrokeWidth(f);
        }

        /* renamed from: r */
        int m79248r() {
            return this.f24074j[this.f24075k];
        }

        /* renamed from: s */
        float m79247s() {
            return this.f24077m;
        }

        /* renamed from: t */
        float m79246t() {
            return this.f24078n;
        }

        /* renamed from: u */
        float m79245u() {
            return this.f24076l;
        }

        /* renamed from: v */
        void m79244v() {
            m79253m(m79252n());
        }

        /* renamed from: w */
        void m79243w() {
            this.f24076l = 0.0f;
            this.f24077m = 0.0f;
            this.f24078n = 0.0f;
            m79251o(0.0f);
            m79257i(0.0f);
            m79254l(0.0f);
        }

        /* renamed from: x */
        void m79242x() {
            this.f24076l = this.f24070f;
            this.f24077m = this.f24071g;
            this.f24078n = this.f24072h;
        }
    }

    public C10518i(@NonNull Context context) {
        this.f24055d = context.getResources();
        C10522d c10522d = new C10522d();
        this.f24053b = c10522d;
        c10522d.m79259g(f24052k);
        m79266q(2.5f);
        m79270m();
    }

    /* renamed from: d */
    private int m79279d(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) ((((i2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((i2 >> 16) & 255) - i4) * f))) << 16) | ((i5 + ((int) ((((i2 >> 8) & 255) - i5) * f))) << 8) | (i6 + ((int) (f * ((i2 & 255) - i6))));
    }

    /* renamed from: f */
    private void m79277f(float f, C10522d c10522d) {
        m79268o(f, c10522d);
        c10522d.m79251o(c10522d.m79245u() + (((c10522d.m79247s() - 0.01f) - c10522d.m79245u()) * f));
        c10522d.m79257i(c10522d.m79247s());
        c10522d.m79254l(c10522d.m79246t() + ((((float) (Math.floor(c10522d.m79246t() / 0.8f) + 1.0d)) - c10522d.m79246t()) * f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m79276g(float f, C10522d c10522d, boolean z) {
        float interpolation;
        float f2;
        if (this.f24058h) {
            m79277f(f, c10522d);
        } else if (f != 1.0f || z) {
            float m79246t = c10522d.m79246t();
            if (f < 0.5f) {
                interpolation = c10522d.m79245u();
                f2 = (f24051j.getInterpolation(f / 0.5f) * 0.79f) + interpolation + 0.01f;
            } else {
                float m79245u = c10522d.m79245u() + 0.79f;
                interpolation = m79245u - (((1.0f - f24051j.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = m79245u;
            }
            c10522d.m79251o(interpolation);
            c10522d.m79257i(f2);
            c10522d.m79254l(m79246t + (0.20999998f * f));
            m79269n((f + this.f24057g) * 216.0f);
        }
    }

    /* renamed from: m */
    private void m79270m() {
        C10522d c10522d = this.f24053b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C10520b(c10522d));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f24050i);
        ofFloat.addListener(new C10521c(c10522d));
        this.f24056f = ofFloat;
    }

    /* renamed from: n */
    private void m79269n(float f) {
        this.f24054c = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m79268o(float f, C10522d c10522d) {
        int m79248r;
        if (f > 0.75f) {
            m79248r = m79279d((f - 0.75f) / 0.25f, c10522d.m79248r(), c10522d.m79255k());
        } else {
            m79248r = c10522d.m79248r();
        }
        c10522d.m79256j(m79248r);
    }

    /* renamed from: a */
    public float m79282a() {
        return this.f24053b.f24073i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f24054c, bounds.exactCenterX(), bounds.exactCenterY());
        this.f24053b.m79262d(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void m79278e(float f) {
        this.f24053b.m79264b(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f24053b.m79265a();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public void m79275h(Paint.Cap cap) {
        this.f24053b.m79260f(cap);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f24056f.isRunning();
    }

    /* renamed from: k */
    public void m79272k(int... iArr) {
        this.f24053b.m79259g(iArr);
        this.f24053b.m79253m(0);
        invalidateSelf();
    }

    /* renamed from: q */
    public void m79266q(float f) {
        this.f24053b.m79249q(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f24053b.m79263c(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f24053b.m79261e(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j;
        this.f24056f.cancel();
        this.f24053b.m79242x();
        if (this.f24053b.m79258h() != this.f24053b.m79250p()) {
            this.f24058h = true;
            animator = this.f24056f;
            j = 666;
        } else {
            this.f24053b.m79253m(0);
            this.f24053b.m79243w();
            animator = this.f24056f;
            j = 1332;
        }
        animator.setDuration(j);
        this.f24056f.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f24056f.cancel();
        m79269n(0.0f);
        this.f24053b.m79253m(0);
        this.f24053b.m79243w();
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.explorestack.iab.utils.i$c */
    /* loaded from: classes3.dex */
    public class C10521c implements Animator.AnimatorListener {

        /* renamed from: b */
        final /* synthetic */ C10522d f24063b;

        C10521c(C10522d c10522d) {
            this.f24063b = c10522d;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C10518i.this.m79276g(1.0f, this.f24063b, true);
            this.f24063b.m79242x();
            this.f24063b.m79244v();
            if (C10518i.this.f24058h) {
                C10518i.this.f24058h = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                return;
            }
            C10518i.this.f24057g += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C10518i.this.f24057g = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }
}
