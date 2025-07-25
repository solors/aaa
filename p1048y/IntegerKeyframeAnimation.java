package p1048y;

import java.util.List;
import p690h0.MiscUtils;
import p707i0.Keyframe;
import p707i0.LottieValueCallback;

/* renamed from: y.e */
/* loaded from: classes2.dex */
public class IntegerKeyframeAnimation extends KeyframeAnimation<Integer> {
    public IntegerKeyframeAnimation(List<Keyframe<Integer>> list) {
        super(list);
    }

    /* renamed from: p */
    public int m1139p() {
        return m1138q(m1161b(), m1160d());
    }

    /* renamed from: q */
    int m1138q(Keyframe<Integer> keyframe, float f) {
        Integer num;
        if (keyframe.f91831b != null && keyframe.f91832c != null) {
            LottieValueCallback<A> lottieValueCallback = this.f118348e;
            if (lottieValueCallback != 0 && (num = (Integer) lottieValueCallback.m23246b(keyframe.f91836g, keyframe.f91837h.floatValue(), keyframe.f91831b, keyframe.f91832c, f, m1159e(), m1158f())) != null) {
                return num.intValue();
            }
            return MiscUtils.m23864l(keyframe.m23250g(), keyframe.m23253d(), f);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p1048y.BaseKeyframeAnimation
    /* renamed from: r */
    public Integer mo1108i(Keyframe<Integer> keyframe, float f) {
        return Integer.valueOf(m1138q(keyframe, f));
    }
}
