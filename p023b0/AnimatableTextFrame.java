package p023b0;

import java.util.List;
import p001a0.DocumentData;
import p1048y.TextKeyframeAnimation;
import p707i0.Keyframe;

/* renamed from: b0.j */
/* loaded from: classes2.dex */
public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {
    public AnimatableTextFrame(List<Keyframe<DocumentData>> list) {
        super((List) list);
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

    @Override // p023b0.AnimatableValue
    /* renamed from: d */
    public TextKeyframeAnimation mo103974a() {
        return new TextKeyframeAnimation(this.f1547a);
    }

    @Override // p023b0.BaseAnimatableValue
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
