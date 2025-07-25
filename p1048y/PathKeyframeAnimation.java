package p1048y;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import p707i0.Keyframe;
import p707i0.LottieValueCallback;

/* renamed from: y.i */
/* loaded from: classes2.dex */
public class PathKeyframeAnimation extends KeyframeAnimation<PointF> {

    /* renamed from: i */
    private final PointF f118364i;

    /* renamed from: j */
    private final float[] f118365j;

    /* renamed from: k */
    private final PathMeasure f118366k;

    /* renamed from: l */
    private PathKeyframe f118367l;

    public PathKeyframeAnimation(List<? extends Keyframe<PointF>> list) {
        super(list);
        this.f118364i = new PointF();
        this.f118365j = new float[2];
        this.f118366k = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p1048y.BaseKeyframeAnimation
    /* renamed from: p */
    public PointF mo1108i(Keyframe<PointF> keyframe, float f) {
        PointF pointF;
        PathKeyframe pathKeyframe = (PathKeyframe) keyframe;
        Path m1132j = pathKeyframe.m1132j();
        if (m1132j == null) {
            return keyframe.f91831b;
        }
        LottieValueCallback<A> lottieValueCallback = this.f118348e;
        if (lottieValueCallback != 0 && (pointF = (PointF) lottieValueCallback.m23246b(pathKeyframe.f91836g, pathKeyframe.f91837h.floatValue(), pathKeyframe.f91831b, pathKeyframe.f91832c, m1159e(), f, m1158f())) != null) {
            return pointF;
        }
        if (this.f118367l != pathKeyframe) {
            this.f118366k.setPath(m1132j, false);
            this.f118367l = pathKeyframe;
        }
        PathMeasure pathMeasure = this.f118366k;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f118365j, null);
        PointF pointF2 = this.f118364i;
        float[] fArr = this.f118365j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f118364i;
    }
}
