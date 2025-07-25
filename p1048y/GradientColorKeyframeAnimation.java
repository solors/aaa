package p1048y;

import java.util.List;
import p035c0.GradientColor;
import p707i0.Keyframe;

/* renamed from: y.d */
/* loaded from: classes2.dex */
public class GradientColorKeyframeAnimation extends KeyframeAnimation<GradientColor> {

    /* renamed from: i */
    private final GradientColor f118358i;

    public GradientColorKeyframeAnimation(List<Keyframe<GradientColor>> list) {
        super(list);
        GradientColor gradientColor = list.get(0).f91831b;
        int m103772c = gradientColor != null ? gradientColor.m103772c() : 0;
        this.f118358i = new GradientColor(new float[m103772c], new int[m103772c]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p1048y.BaseKeyframeAnimation
    /* renamed from: p */
    public GradientColor mo1108i(Keyframe<GradientColor> keyframe, float f) {
        this.f118358i.m103771d(keyframe.f91831b, keyframe.f91832c, f);
        return this.f118358i;
    }
}
