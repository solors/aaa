package p023b0;

import java.util.List;
import p035c0.GradientColor;
import p1048y.BaseKeyframeAnimation;
import p1048y.GradientColorKeyframeAnimation;
import p707i0.Keyframe;

/* renamed from: b0.c */
/* loaded from: classes2.dex */
public class AnimatableGradientColorValue extends BaseAnimatableValue<GradientColor, GradientColor> {
    public AnimatableGradientColorValue(List<Keyframe<GradientColor>> list) {
        super((List) list);
    }

    @Override // p023b0.AnimatableValue
    /* renamed from: a */
    public BaseKeyframeAnimation<GradientColor, GradientColor> mo103974a() {
        return new GradientColorKeyframeAnimation(this.f1547a);
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
