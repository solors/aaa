package p023b0;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import p035c0.ContentModel;
import p1032x.InterfaceC44659c;
import p1048y.TransformKeyframeAnimation;
import p629d0.BaseLayer;

/* renamed from: b0.l */
/* loaded from: classes2.dex */
public class AnimatableTransform implements ContentModel {
    @Nullable

    /* renamed from: a */
    private final AnimatablePathValue f1538a;
    @Nullable

    /* renamed from: b */
    private final AnimatableValue<PointF, PointF> f1539b;
    @Nullable

    /* renamed from: c */
    private final AnimatableScaleValue f1540c;
    @Nullable

    /* renamed from: d */
    private final AnimatableFloatValue f1541d;
    @Nullable

    /* renamed from: e */
    private final AnimatableIntegerValue f1542e;
    @Nullable

    /* renamed from: f */
    private final AnimatableFloatValue f1543f;
    @Nullable

    /* renamed from: g */
    private final AnimatableFloatValue f1544g;
    @Nullable

    /* renamed from: h */
    private final AnimatableFloatValue f1545h;
    @Nullable

    /* renamed from: i */
    private final AnimatableFloatValue f1546i;

    public AnimatableTransform() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // p035c0.ContentModel
    @Nullable
    /* renamed from: a */
    public InterfaceC44659c mo103692a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return null;
    }

    /* renamed from: b */
    public TransformKeyframeAnimation m103984b() {
        return new TransformKeyframeAnimation(this);
    }

    @Nullable
    /* renamed from: c */
    public AnimatablePathValue m103983c() {
        return this.f1538a;
    }

    @Nullable
    /* renamed from: d */
    public AnimatableFloatValue m103982d() {
        return this.f1546i;
    }

    @Nullable
    /* renamed from: e */
    public AnimatableIntegerValue m103981e() {
        return this.f1542e;
    }

    @Nullable
    /* renamed from: f */
    public AnimatableValue<PointF, PointF> m103980f() {
        return this.f1539b;
    }

    @Nullable
    /* renamed from: g */
    public AnimatableFloatValue m103979g() {
        return this.f1541d;
    }

    @Nullable
    /* renamed from: h */
    public AnimatableScaleValue m103978h() {
        return this.f1540c;
    }

    @Nullable
    /* renamed from: i */
    public AnimatableFloatValue m103977i() {
        return this.f1543f;
    }

    @Nullable
    /* renamed from: j */
    public AnimatableFloatValue m103976j() {
        return this.f1544g;
    }

    @Nullable
    /* renamed from: k */
    public AnimatableFloatValue m103975k() {
        return this.f1545h;
    }

    public AnimatableTransform(@Nullable AnimatablePathValue animatablePathValue, @Nullable AnimatableValue<PointF, PointF> animatableValue, @Nullable AnimatableScaleValue animatableScaleValue, @Nullable AnimatableFloatValue animatableFloatValue, @Nullable AnimatableIntegerValue animatableIntegerValue, @Nullable AnimatableFloatValue animatableFloatValue2, @Nullable AnimatableFloatValue animatableFloatValue3, @Nullable AnimatableFloatValue animatableFloatValue4, @Nullable AnimatableFloatValue animatableFloatValue5) {
        this.f1538a = animatablePathValue;
        this.f1539b = animatableValue;
        this.f1540c = animatableScaleValue;
        this.f1541d = animatableFloatValue;
        this.f1542e = animatableIntegerValue;
        this.f1545h = animatableFloatValue2;
        this.f1546i = animatableFloatValue3;
        this.f1543f = animatableFloatValue4;
        this.f1544g = animatableFloatValue5;
    }
}
