package com.inmobi.ads;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.C18874C0;
import com.inmobi.media.C18888D0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.ads.b */
/* loaded from: classes6.dex */
public abstract class AbstractC18834b {
    /* renamed from: a */
    public static final Animation m61289a(InMobiBanner.AnimationType animationType, float f, float f2) {
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        int i = AbstractC18833a.f47044a[animationType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                C18888D0 c18888d0 = new C18888D0(f / 2.0f, f2 / 2.0f);
                c18888d0.setDuration(500L);
                c18888d0.setFillAfter(false);
                c18888d0.setInterpolator(new AccelerateInterpolator());
                return c18888d0;
            }
            C18874C0 c18874c0 = new C18874C0(f / 2.0f, f2 / 2.0f);
            c18874c0.setDuration(500L);
            c18874c0.setFillAfter(false);
            c18874c0.setInterpolator(new AccelerateInterpolator());
            return c18874c0;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.5f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setFillAfter(false);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        return alphaAnimation;
    }
}
