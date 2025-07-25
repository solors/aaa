package p1048y;

import android.graphics.Path;
import java.util.List;
import p035c0.ShapeData;
import p690h0.MiscUtils;
import p707i0.Keyframe;

/* renamed from: y.l */
/* loaded from: classes2.dex */
public class ShapeKeyframeAnimation extends BaseKeyframeAnimation<ShapeData, Path> {

    /* renamed from: i */
    private final ShapeData f118370i;

    /* renamed from: j */
    private final Path f118371j;

    public ShapeKeyframeAnimation(List<Keyframe<ShapeData>> list) {
        super(list);
        this.f118370i = new ShapeData();
        this.f118371j = new Path();
    }

    @Override // p1048y.BaseKeyframeAnimation
    /* renamed from: p */
    public Path mo1108i(Keyframe<ShapeData> keyframe, float f) {
        this.f118370i.m103718c(keyframe.f91831b, keyframe.f91832c, f);
        MiscUtils.m23867i(this.f118370i, this.f118371j);
        return this.f118371j;
    }
}
