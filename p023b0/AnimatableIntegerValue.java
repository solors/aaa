package p023b0;

import java.util.List;
import p1048y.BaseKeyframeAnimation;
import p1048y.IntegerKeyframeAnimation;
import p707i0.Keyframe;

/* renamed from: b0.d */
/* loaded from: classes2.dex */
public class AnimatableIntegerValue extends BaseAnimatableValue<Integer, Integer> {
    public AnimatableIntegerValue(List<Keyframe<Integer>> list) {
        super((List) list);
    }

    @Override // p023b0.AnimatableValue
    /* renamed from: a */
    public BaseKeyframeAnimation<Integer, Integer> mo103974a() {
        return new IntegerKeyframeAnimation(this.f1547a);
    }

    @Override // p023b0.BaseAnimatableValue, p023b0.AnimatableValue
    /* renamed from: b */
    public /* bridge */ /* synthetic */ List mo103973b() {
        return super.mo103973b();
    }

    @Override // p023b0.BaseAnimatableValue, p023b0.AnimatableValue
    /* renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo103972c() {
        return super.mo103972c();
    }

    @Override // p023b0.BaseAnimatableValue
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
