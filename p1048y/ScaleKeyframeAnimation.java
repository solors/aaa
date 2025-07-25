package p1048y;

import java.util.List;
import p690h0.MiscUtils;
import p707i0.Keyframe;
import p707i0.LottieValueCallback;
import p707i0.ScaleXY;

/* renamed from: y.k */
/* loaded from: classes2.dex */
public class ScaleKeyframeAnimation extends KeyframeAnimation<ScaleXY> {

    /* renamed from: i */
    private final ScaleXY f118369i;

    public ScaleKeyframeAnimation(List<Keyframe<ScaleXY>> list) {
        super(list);
        this.f118369i = new ScaleXY();
    }

    @Override // p1048y.BaseKeyframeAnimation
    /* renamed from: p */
    public ScaleXY mo1108i(Keyframe<ScaleXY> keyframe, float f) {
        ScaleXY scaleXY;
        ScaleXY scaleXY2;
        ScaleXY scaleXY3 = keyframe.f91831b;
        if (scaleXY3 != null && (scaleXY = keyframe.f91832c) != null) {
            ScaleXY scaleXY4 = scaleXY3;
            ScaleXY scaleXY5 = scaleXY;
            LottieValueCallback<A> lottieValueCallback = this.f118348e;
            if (lottieValueCallback != 0 && (scaleXY2 = (ScaleXY) lottieValueCallback.m23246b(keyframe.f91836g, keyframe.f91837h.floatValue(), scaleXY4, scaleXY5, f, m1159e(), m1158f())) != null) {
                return scaleXY2;
            }
            this.f118369i.m23241d(MiscUtils.m23865k(scaleXY4.m23243b(), scaleXY5.m23243b(), f), MiscUtils.m23865k(scaleXY4.m23242c(), scaleXY5.m23242c(), f));
            return this.f118369i;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
