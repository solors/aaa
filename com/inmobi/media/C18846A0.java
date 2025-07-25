package com.inmobi.media;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.A0 */
/* loaded from: classes6.dex */
public final class C18846A0 extends Animatable2.AnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ C18860B0 f47072a;

    public C18846A0(C18860B0 c18860b0) {
        this.f47072a = c18860b0;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        super.onAnimationEnd(drawable);
        this.f47072a.m61261e();
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        super.onAnimationStart(drawable);
    }
}
