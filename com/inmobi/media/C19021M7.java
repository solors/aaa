package com.inmobi.media;

import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.M7 */
/* loaded from: classes6.dex */
public final class C19021M7 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final WeakReference f47515a;

    public C19021M7(C19047O7 view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f47515a = new WeakReference(view);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        C19047O7 c19047o7 = (C19047O7) this.f47515a.get();
        if (c19047o7 == null) {
            return;
        }
        int visibility = c19047o7.getVisibility();
        if (visibility != 4 && visibility != 8) {
            Object animatedValue = animation.getAnimatedValue();
            Intrinsics.m17073h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c19047o7.f47590l = 360 * ((Float) animatedValue).floatValue();
            c19047o7.invalidate();
            return;
        }
        Object animatedValue2 = animation.getAnimatedValue();
        Intrinsics.m17073h(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        if (((Float) animatedValue2).floatValue() >= 1.0d) {
            c19047o7.m60831a();
        }
    }
}
