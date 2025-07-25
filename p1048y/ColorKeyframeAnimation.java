package p1048y;

import java.util.List;
import p690h0.GammaEvaluator;
import p690h0.MiscUtils;
import p707i0.Keyframe;
import p707i0.LottieValueCallback;

/* renamed from: y.b */
/* loaded from: classes2.dex */
public class ColorKeyframeAnimation extends KeyframeAnimation<Integer> {
    public ColorKeyframeAnimation(List<Keyframe<Integer>> list) {
        super(list);
    }

    /* renamed from: p */
    public int m1146p() {
        return m1145q(m1161b(), m1160d());
    }

    /* renamed from: q */
    public int m1145q(Keyframe<Integer> keyframe, float f) {
        Integer num;
        Integer num2 = keyframe.f91831b;
        if (num2 != null && keyframe.f91832c != null) {
            int intValue = num2.intValue();
            int intValue2 = keyframe.f91832c.intValue();
            LottieValueCallback<A> lottieValueCallback = this.f118348e;
            if (lottieValueCallback != 0 && (num = (Integer) lottieValueCallback.m23246b(keyframe.f91836g, keyframe.f91837h.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, m1159e(), m1158f())) != null) {
                return num.intValue();
            }
            return GammaEvaluator.m23909c(MiscUtils.m23873c(f, 0.0f, 1.0f), intValue, intValue2);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p1048y.BaseKeyframeAnimation
    /* renamed from: r */
    public Integer mo1108i(Keyframe<Integer> keyframe, float f) {
        return Integer.valueOf(m1145q(keyframe, f));
    }
}
