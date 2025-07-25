package p1048y;

import java.util.List;
import p690h0.MiscUtils;
import p707i0.Keyframe;
import p707i0.LottieValueCallback;

/* renamed from: y.c */
/* loaded from: classes2.dex */
public class FloatKeyframeAnimation extends KeyframeAnimation<Float> {
    public FloatKeyframeAnimation(List<Keyframe<Float>> list) {
        super(list);
    }

    /* renamed from: p */
    public float m1143p() {
        return m1142q(m1161b(), m1160d());
    }

    /* renamed from: q */
    float m1142q(Keyframe<Float> keyframe, float f) {
        Float f2;
        if (keyframe.f91831b != null && keyframe.f91832c != null) {
            LottieValueCallback<A> lottieValueCallback = this.f118348e;
            if (lottieValueCallback != 0 && (f2 = (Float) lottieValueCallback.m23246b(keyframe.f91836g, keyframe.f91837h.floatValue(), keyframe.f91831b, keyframe.f91832c, f, m1159e(), m1158f())) != null) {
                return f2.floatValue();
            }
            return MiscUtils.m23865k(keyframe.m23251f(), keyframe.m23254c(), f);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p1048y.BaseKeyframeAnimation
    /* renamed from: r */
    public Float mo1108i(Keyframe<Float> keyframe, float f) {
        return Float.valueOf(m1142q(keyframe, f));
    }
}
