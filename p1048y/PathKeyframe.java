package p1048y;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import p690h0.C33454j;
import p707i0.Keyframe;

/* renamed from: y.h */
/* loaded from: classes2.dex */
public class PathKeyframe extends Keyframe<PointF> {
    @Nullable

    /* renamed from: q */
    private Path f118362q;

    /* renamed from: r */
    private final Keyframe<PointF> f118363r;

    public PathKeyframe(LottieComposition lottieComposition, Keyframe<PointF> keyframe) {
        super(lottieComposition, keyframe.f91831b, keyframe.f91832c, keyframe.f91833d, keyframe.f91834e, keyframe.f91835f, keyframe.f91836g, keyframe.f91837h);
        this.f118363r = keyframe;
        m1133i();
    }

    /* renamed from: i */
    public void m1133i() {
        boolean z;
        T t;
        T t2;
        T t3 = this.f91832c;
        if (t3 != 0 && (t2 = this.f91831b) != 0 && ((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) {
            z = true;
        } else {
            z = false;
        }
        T t4 = this.f91831b;
        if (t4 != 0 && (t = this.f91832c) != 0 && !z) {
            Keyframe<PointF> keyframe = this.f118363r;
            this.f118362q = C33454j.m23859d((PointF) t4, (PointF) t, keyframe.f91844o, keyframe.f91845p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: j */
    public Path m1132j() {
        return this.f118362q;
    }
}
