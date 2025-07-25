package p707i0;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p1048y.BaseKeyframeAnimation;

/* renamed from: i0.c */
/* loaded from: classes2.dex */
public class LottieValueCallback<T> {

    /* renamed from: a */
    private final LottieFrameInfo<T> f91853a;
    @Nullable

    /* renamed from: b */
    private BaseKeyframeAnimation<?, ?> f91854b;
    @Nullable

    /* renamed from: c */
    protected T f91855c;

    public LottieValueCallback() {
        this.f91853a = new LottieFrameInfo<>();
        this.f91855c = null;
    }

    @Nullable
    /* renamed from: a */
    public T mo23247a(LottieFrameInfo<T> lottieFrameInfo) {
        return this.f91855c;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: b */
    public final T m23246b(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return mo23247a(this.f91853a.m23248a(f, f2, t, t2, f3, f4, f5));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: c */
    public final void m23245c(@Nullable BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        this.f91854b = baseKeyframeAnimation;
    }

    public LottieValueCallback(@Nullable T t) {
        this.f91853a = new LottieFrameInfo<>();
        this.f91855c = t;
    }
}
