package p023b0;

import android.graphics.PointF;
import java.util.List;
import p1048y.BaseKeyframeAnimation;
import p1048y.SplitDimensionPathKeyframeAnimation;
import p707i0.Keyframe;

/* renamed from: b0.i */
/* loaded from: classes2.dex */
public class AnimatableSplitDimensionPathValue implements AnimatableValue<PointF, PointF> {

    /* renamed from: a */
    private final AnimatableFloatValue f1532a;

    /* renamed from: b */
    private final AnimatableFloatValue f1533b;

    public AnimatableSplitDimensionPathValue(AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2) {
        this.f1532a = animatableFloatValue;
        this.f1533b = animatableFloatValue2;
    }

    @Override // p023b0.AnimatableValue
    /* renamed from: a */
    public BaseKeyframeAnimation<PointF, PointF> mo103974a() {
        return new SplitDimensionPathKeyframeAnimation(this.f1532a.mo103974a(), this.f1533b.mo103974a());
    }

    @Override // p023b0.AnimatableValue
    /* renamed from: b */
    public List<Keyframe<PointF>> mo103973b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p023b0.AnimatableValue
    /* renamed from: c */
    public boolean mo103972c() {
        if (this.f1532a.mo103972c() && this.f1533b.mo103972c()) {
            return true;
        }
        return false;
    }
}
