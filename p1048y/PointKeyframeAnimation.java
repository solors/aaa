package p1048y;

import android.graphics.PointF;
import java.util.List;
import p707i0.Keyframe;
import p707i0.LottieValueCallback;

/* renamed from: y.j */
/* loaded from: classes2.dex */
public class PointKeyframeAnimation extends KeyframeAnimation<PointF> {

    /* renamed from: i */
    private final PointF f118368i;

    public PointKeyframeAnimation(List<Keyframe<PointF>> list) {
        super(list);
        this.f118368i = new PointF();
    }

    @Override // p1048y.BaseKeyframeAnimation
    /* renamed from: p */
    public PointF mo1108i(Keyframe<PointF> keyframe, float f) {
        return mo1130j(keyframe, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p1048y.BaseKeyframeAnimation
    /* renamed from: q */
    public PointF mo1130j(Keyframe<PointF> keyframe, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = keyframe.f91831b;
        if (pointF3 != null && (pointF = keyframe.f91832c) != null) {
            PointF pointF4 = pointF3;
            PointF pointF5 = pointF;
            LottieValueCallback<A> lottieValueCallback = this.f118348e;
            if (lottieValueCallback != 0 && (pointF2 = (PointF) lottieValueCallback.m23246b(keyframe.f91836g, keyframe.f91837h.floatValue(), pointF4, pointF5, f, m1159e(), m1158f())) != null) {
                return pointF2;
            }
            PointF pointF6 = this.f118368i;
            float f4 = pointF4.x;
            float f5 = f4 + (f2 * (pointF5.x - f4));
            float f6 = pointF4.y;
            pointF6.set(f5, f6 + (f3 * (pointF5.y - f6)));
            return this.f118368i;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
