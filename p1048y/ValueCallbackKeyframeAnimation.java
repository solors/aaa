package p1048y;

import androidx.annotation.Nullable;
import java.util.Collections;
import p707i0.Keyframe;
import p707i0.LottieFrameInfo;
import p707i0.LottieValueCallback;

/* renamed from: y.p */
/* loaded from: classes2.dex */
public class ValueCallbackKeyframeAnimation<K, A> extends BaseKeyframeAnimation<K, A> {

    /* renamed from: i */
    private final LottieFrameInfo<A> f118392i;

    /* renamed from: j */
    private final A f118393j;

    public ValueCallbackKeyframeAnimation(LottieValueCallback<A> lottieValueCallback) {
        this(lottieValueCallback, null);
    }

    @Override // p1048y.BaseKeyframeAnimation
    /* renamed from: c */
    float mo1110c() {
        return 1.0f;
    }

    @Override // p1048y.BaseKeyframeAnimation
    /* renamed from: h */
    public A mo1109h() {
        LottieValueCallback<A> lottieValueCallback = this.f118348e;
        A a = this.f118393j;
        return lottieValueCallback.m23246b(0.0f, 0.0f, a, a, m1158f(), m1158f(), m1158f());
    }

    @Override // p1048y.BaseKeyframeAnimation
    /* renamed from: i */
    A mo1108i(Keyframe<K> keyframe, float f) {
        return mo1109h();
    }

    @Override // p1048y.BaseKeyframeAnimation
    /* renamed from: k */
    public void mo1107k() {
        if (this.f118348e != null) {
            super.mo1107k();
        }
    }

    @Override // p1048y.BaseKeyframeAnimation
    /* renamed from: m */
    public void mo1106m(float f) {
        this.f118347d = f;
    }

    public ValueCallbackKeyframeAnimation(LottieValueCallback<A> lottieValueCallback, @Nullable A a) {
        super(Collections.emptyList());
        this.f118392i = new LottieFrameInfo<>();
        m1155n(lottieValueCallback);
        this.f118393j = a;
    }
}
