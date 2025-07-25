package p707i0;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;

/* renamed from: i0.a */
/* loaded from: classes2.dex */
public class Keyframe<T> {
    @Nullable

    /* renamed from: a */
    private final LottieComposition f91830a;
    @Nullable

    /* renamed from: b */
    public final T f91831b;
    @Nullable

    /* renamed from: c */
    public T f91832c;
    @Nullable

    /* renamed from: d */
    public final Interpolator f91833d;
    @Nullable

    /* renamed from: e */
    public final Interpolator f91834e;
    @Nullable

    /* renamed from: f */
    public final Interpolator f91835f;

    /* renamed from: g */
    public final float f91836g;
    @Nullable

    /* renamed from: h */
    public Float f91837h;

    /* renamed from: i */
    private float f91838i;

    /* renamed from: j */
    private float f91839j;

    /* renamed from: k */
    private int f91840k;

    /* renamed from: l */
    private int f91841l;

    /* renamed from: m */
    private float f91842m;

    /* renamed from: n */
    private float f91843n;

    /* renamed from: o */
    public PointF f91844o;

    /* renamed from: p */
    public PointF f91845p;

    public Keyframe(LottieComposition lottieComposition, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, float f, @Nullable Float f2) {
        this.f91838i = -3987645.8f;
        this.f91839j = -3987645.8f;
        this.f91840k = 784923401;
        this.f91841l = 784923401;
        this.f91842m = Float.MIN_VALUE;
        this.f91843n = Float.MIN_VALUE;
        this.f91844o = null;
        this.f91845p = null;
        this.f91830a = lottieComposition;
        this.f91831b = t;
        this.f91832c = t2;
        this.f91833d = interpolator;
        this.f91834e = null;
        this.f91835f = null;
        this.f91836g = f;
        this.f91837h = f2;
    }

    /* renamed from: a */
    public boolean m23256a(@FloatRange(from = 0.0d, m105511to = 1.0d) float f) {
        if (f >= m23252e() && f < m23255b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public float m23255b() {
        if (this.f91830a == null) {
            return 1.0f;
        }
        if (this.f91843n == Float.MIN_VALUE) {
            if (this.f91837h == null) {
                this.f91843n = 1.0f;
            } else {
                this.f91843n = m23252e() + ((this.f91837h.floatValue() - this.f91836g) / this.f91830a.m103394e());
            }
        }
        return this.f91843n;
    }

    /* renamed from: c */
    public float m23254c() {
        if (this.f91839j == -3987645.8f) {
            this.f91839j = ((Float) this.f91832c).floatValue();
        }
        return this.f91839j;
    }

    /* renamed from: d */
    public int m23253d() {
        if (this.f91841l == 784923401) {
            this.f91841l = ((Integer) this.f91832c).intValue();
        }
        return this.f91841l;
    }

    /* renamed from: e */
    public float m23252e() {
        LottieComposition lottieComposition = this.f91830a;
        if (lottieComposition == null) {
            return 0.0f;
        }
        if (this.f91842m == Float.MIN_VALUE) {
            this.f91842m = (this.f91836g - lottieComposition.m103383p()) / this.f91830a.m103394e();
        }
        return this.f91842m;
    }

    /* renamed from: f */
    public float m23251f() {
        if (this.f91838i == -3987645.8f) {
            this.f91838i = ((Float) this.f91831b).floatValue();
        }
        return this.f91838i;
    }

    /* renamed from: g */
    public int m23250g() {
        if (this.f91840k == 784923401) {
            this.f91840k = ((Integer) this.f91831b).intValue();
        }
        return this.f91840k;
    }

    /* renamed from: h */
    public boolean m23249h() {
        if (this.f91833d == null && this.f91834e == null && this.f91835f == null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f91831b + ", endValue=" + this.f91832c + ", startFrame=" + this.f91836g + ", endFrame=" + this.f91837h + ", interpolator=" + this.f91833d + '}';
    }

    public Keyframe(LottieComposition lottieComposition, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, float f, @Nullable Float f2) {
        this.f91838i = -3987645.8f;
        this.f91839j = -3987645.8f;
        this.f91840k = 784923401;
        this.f91841l = 784923401;
        this.f91842m = Float.MIN_VALUE;
        this.f91843n = Float.MIN_VALUE;
        this.f91844o = null;
        this.f91845p = null;
        this.f91830a = lottieComposition;
        this.f91831b = t;
        this.f91832c = t2;
        this.f91833d = null;
        this.f91834e = interpolator;
        this.f91835f = interpolator2;
        this.f91836g = f;
        this.f91837h = f2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Keyframe(LottieComposition lottieComposition, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, @Nullable Interpolator interpolator3, float f, @Nullable Float f2) {
        this.f91838i = -3987645.8f;
        this.f91839j = -3987645.8f;
        this.f91840k = 784923401;
        this.f91841l = 784923401;
        this.f91842m = Float.MIN_VALUE;
        this.f91843n = Float.MIN_VALUE;
        this.f91844o = null;
        this.f91845p = null;
        this.f91830a = lottieComposition;
        this.f91831b = t;
        this.f91832c = t2;
        this.f91833d = interpolator;
        this.f91834e = interpolator2;
        this.f91835f = interpolator3;
        this.f91836g = f;
        this.f91837h = f2;
    }

    public Keyframe(T t) {
        this.f91838i = -3987645.8f;
        this.f91839j = -3987645.8f;
        this.f91840k = 784923401;
        this.f91841l = 784923401;
        this.f91842m = Float.MIN_VALUE;
        this.f91843n = Float.MIN_VALUE;
        this.f91844o = null;
        this.f91845p = null;
        this.f91830a = null;
        this.f91831b = t;
        this.f91832c = t;
        this.f91833d = null;
        this.f91834e = null;
        this.f91835f = null;
        this.f91836g = Float.MIN_VALUE;
        this.f91837h = Float.valueOf(Float.MAX_VALUE);
    }
}
