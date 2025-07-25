package p1048y;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.Collections;
import p707i0.Keyframe;
import p707i0.LottieValueCallback;

/* renamed from: y.m */
/* loaded from: classes2.dex */
public class SplitDimensionPathKeyframeAnimation extends BaseKeyframeAnimation<PointF, PointF> {

    /* renamed from: i */
    private final PointF f118372i;

    /* renamed from: j */
    private final PointF f118373j;

    /* renamed from: k */
    private final BaseKeyframeAnimation<Float, Float> f118374k;

    /* renamed from: l */
    private final BaseKeyframeAnimation<Float, Float> f118375l;
    @Nullable

    /* renamed from: m */
    protected LottieValueCallback<Float> f118376m;
    @Nullable

    /* renamed from: n */
    protected LottieValueCallback<Float> f118377n;

    public SplitDimensionPathKeyframeAnimation(BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation, BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2) {
        super(Collections.emptyList());
        this.f118372i = new PointF();
        this.f118373j = new PointF();
        this.f118374k = baseKeyframeAnimation;
        this.f118375l = baseKeyframeAnimation2;
        mo1106m(m1158f());
    }

    @Override // p1048y.BaseKeyframeAnimation
    /* renamed from: m */
    public void mo1106m(float f) {
        this.f118374k.mo1106m(f);
        this.f118375l.mo1106m(f);
        this.f118372i.set(this.f118374k.mo1109h().floatValue(), this.f118375l.mo1109h().floatValue());
        for (int i = 0; i < this.f118344a.size(); i++) {
            this.f118344a.get(i).mo1153e();
        }
    }

    @Override // p1048y.BaseKeyframeAnimation
    /* renamed from: p */
    public PointF mo1109h() {
        return mo1108i(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p1048y.BaseKeyframeAnimation
    /* renamed from: q */
    public PointF mo1108i(Keyframe<PointF> keyframe, float f) {
        Float f2;
        Keyframe<Float> m1161b;
        float floatValue;
        Keyframe<Float> m1161b2;
        float floatValue2;
        Float f3 = null;
        if (this.f118376m != null && (m1161b2 = this.f118374k.m1161b()) != null) {
            float m1160d = this.f118374k.m1160d();
            Float f4 = m1161b2.f91837h;
            LottieValueCallback<Float> lottieValueCallback = this.f118376m;
            float f5 = m1161b2.f91836g;
            if (f4 == null) {
                floatValue2 = f5;
            } else {
                floatValue2 = f4.floatValue();
            }
            f2 = lottieValueCallback.m23246b(f5, floatValue2, m1161b2.f91831b, m1161b2.f91832c, f, f, m1160d);
        } else {
            f2 = null;
        }
        if (this.f118377n != null && (m1161b = this.f118375l.m1161b()) != null) {
            float m1160d2 = this.f118375l.m1160d();
            Float f6 = m1161b.f91837h;
            LottieValueCallback<Float> lottieValueCallback2 = this.f118377n;
            float f7 = m1161b.f91836g;
            if (f6 == null) {
                floatValue = f7;
            } else {
                floatValue = f6.floatValue();
            }
            f3 = lottieValueCallback2.m23246b(f7, floatValue, m1161b.f91831b, m1161b.f91832c, f, f, m1160d2);
        }
        if (f2 == null) {
            this.f118373j.set(this.f118372i.x, 0.0f);
        } else {
            this.f118373j.set(f2.floatValue(), 0.0f);
        }
        if (f3 == null) {
            PointF pointF = this.f118373j;
            pointF.set(pointF.x, this.f118372i.y);
        } else {
            PointF pointF2 = this.f118373j;
            pointF2.set(pointF2.x, f3.floatValue());
        }
        return this.f118373j;
    }

    /* renamed from: r */
    public void m1123r(@Nullable LottieValueCallback<Float> lottieValueCallback) {
        LottieValueCallback<Float> lottieValueCallback2 = this.f118376m;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.m23245c(null);
        }
        this.f118376m = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.m23245c(this);
        }
    }

    /* renamed from: s */
    public void m1122s(@Nullable LottieValueCallback<Float> lottieValueCallback) {
        LottieValueCallback<Float> lottieValueCallback2 = this.f118377n;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.m23245c(null);
        }
        this.f118377n = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.m23245c(this);
        }
    }
}
