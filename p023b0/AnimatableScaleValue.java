package p023b0;

import java.util.List;
import p1048y.BaseKeyframeAnimation;
import p1048y.ScaleKeyframeAnimation;
import p707i0.Keyframe;
import p707i0.ScaleXY;

/* renamed from: b0.g */
/* loaded from: classes2.dex */
public class AnimatableScaleValue extends BaseAnimatableValue<ScaleXY, ScaleXY> {
    public AnimatableScaleValue(List<Keyframe<ScaleXY>> list) {
        super((List) list);
    }

    @Override // p023b0.AnimatableValue
    /* renamed from: a */
    public BaseKeyframeAnimation<ScaleXY, ScaleXY> mo103974a() {
        return new ScaleKeyframeAnimation(this.f1547a);
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
