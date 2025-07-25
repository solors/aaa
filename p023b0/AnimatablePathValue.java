package p023b0;

import android.graphics.PointF;
import java.util.List;
import p1048y.BaseKeyframeAnimation;
import p1048y.PathKeyframeAnimation;
import p1048y.PointKeyframeAnimation;
import p707i0.Keyframe;

/* renamed from: b0.e */
/* loaded from: classes2.dex */
public class AnimatablePathValue implements AnimatableValue<PointF, PointF> {

    /* renamed from: a */
    private final List<Keyframe<PointF>> f1531a;

    public AnimatablePathValue(List<Keyframe<PointF>> list) {
        this.f1531a = list;
    }

    @Override // p023b0.AnimatableValue
    /* renamed from: a */
    public BaseKeyframeAnimation<PointF, PointF> mo103974a() {
        if (this.f1531a.get(0).m23249h()) {
            return new PointKeyframeAnimation(this.f1531a);
        }
        return new PathKeyframeAnimation(this.f1531a);
    }

    @Override // p023b0.AnimatableValue
    /* renamed from: b */
    public List<Keyframe<PointF>> mo103973b() {
        return this.f1531a;
    }

    @Override // p023b0.AnimatableValue
    /* renamed from: c */
    public boolean mo103972c() {
        if (this.f1531a.size() != 1 || !this.f1531a.get(0).m23249h()) {
            return false;
        }
        return true;
    }
}
