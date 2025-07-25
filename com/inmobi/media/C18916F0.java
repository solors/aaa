package com.inmobi.media;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.C18916F0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.F0 */
/* loaded from: classes6.dex */
public final class C18916F0 {

    /* renamed from: a */
    public final String f47228a = C18916F0.class.getSimpleName();

    /* renamed from: b */
    public final ArrayList f47229b = new ArrayList();

    /* renamed from: c */
    public boolean f47230c;

    /* renamed from: a */
    public static C18902E0 m61124a(ValueAnimator valueAnimator, C19149W6 c19149w6) {
        valueAnimator.setDuration(0L);
        valueAnimator.setStartDelay(0L);
        C18993K7 c18993k7 = c19149w6.f47904d.f47976k;
        if (c18993k7 != null) {
            C18979J7 c18979j7 = c18993k7.f47401a;
            C18979J7 c18979j72 = c18993k7.f47402b;
            if (c18979j72 != null) {
                valueAnimator.setDuration(c18979j72.m60989a() * 1000);
            }
            if (c18979j7 != null) {
                valueAnimator.setStartDelay(c18979j7.m60989a() * 1000);
            }
        }
        return new C18902E0(valueAnimator);
    }

    /* renamed from: b */
    public static ValueAnimator m61119b(final View view, float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        final C19230c7 c19230c7 = layoutParams instanceof C19230c7 ? (C19230c7) layoutParams : null;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o3.w
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C18916F0.m61118b(c19230c7, view, valueAnimator);
            }
        });
        Intrinsics.m17074g(ofFloat);
        return ofFloat;
    }

    /* renamed from: b */
    public static final void m61118b(C19230c7 c19230c7, View view, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        if (c19230c7 != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.m17073h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c19230c7.f48129b = (int) ((Float) animatedValue).floatValue();
        }
        view.setLayoutParams(c19230c7);
        view.requestLayout();
    }

    /* renamed from: b */
    public final void m61120b() {
        if (this.f47230c) {
            this.f47230c = false;
            Iterator it = this.f47229b.iterator();
            while (it.hasNext()) {
                C18902E0 c18902e0 = (C18902E0) it.next();
                Animator animator = c18902e0.f47190a;
                Intrinsics.m17073h(animator, "null cannot be cast to non-null type android.animation.ValueAnimator");
                ValueAnimator valueAnimator = (ValueAnimator) animator;
                c18902e0.f47191b = valueAnimator.getCurrentPlayTime();
                if (valueAnimator.getAnimatedFraction() == 1.0d) {
                    c18902e0.f47192c = true;
                }
                valueAnimator.cancel();
            }
        }
    }

    /* renamed from: a */
    public static ValueAnimator m61123a(final View view, float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        final C19230c7 c19230c7 = layoutParams instanceof C19230c7 ? (C19230c7) layoutParams : null;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o3.x
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C18916F0.m61122a(c19230c7, view, valueAnimator);
            }
        });
        Intrinsics.m17074g(ofFloat);
        return ofFloat;
    }

    /* renamed from: a */
    public static final void m61122a(C19230c7 c19230c7, View view, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        if (c19230c7 != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.m17073h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c19230c7.f48128a = (int) ((Float) animatedValue).floatValue();
        }
        view.setLayoutParams(c19230c7);
        view.requestLayout();
    }

    /* renamed from: a */
    public final void m61121a(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18902E0 c18902e0 = (C18902E0) it.next();
            if (!c18902e0.f47192c) {
                Animator animator = c18902e0.f47190a;
                Intrinsics.m17073h(animator, "null cannot be cast to non-null type android.animation.ValueAnimator");
                ValueAnimator valueAnimator = (ValueAnimator) animator;
                valueAnimator.setCurrentPlayTime(c18902e0.f47191b);
                valueAnimator.start();
            }
            if (!this.f47229b.contains(c18902e0)) {
                this.f47229b.add(c18902e0);
            }
        }
    }

    /* renamed from: a */
    public final void m61125a() {
        Iterator it = this.f47229b.iterator();
        while (it.hasNext()) {
            ((C18902E0) it.next()).f47190a.cancel();
        }
        this.f47229b.clear();
    }
}
