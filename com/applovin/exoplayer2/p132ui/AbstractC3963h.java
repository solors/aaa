package com.applovin.exoplayer2.p132ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.impl.AbstractC4100b1;
import com.applovin.impl.C3989a5;
import com.applovin.impl.InterfaceC5965zb;

/* renamed from: com.applovin.exoplayer2.ui.h */
/* loaded from: classes2.dex */
abstract class AbstractC3963h {
    /* renamed from: a */
    public static float m101113a(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else if (i != 1) {
            if (i != 2) {
                return -3.4028235E38f;
            }
            return f;
        } else {
            f2 = i2;
        }
        return f * f2;
    }

    /* renamed from: b */
    public static void m101109b(C3989a5.C3991b c3991b) {
        c3991b.m101041b(-3.4028235E38f, Integer.MIN_VALUE);
        if (c3991b.m101032e() instanceof Spanned) {
            if (!(c3991b.m101032e() instanceof Spannable)) {
                c3991b.m101044a(SpannableString.valueOf(c3991b.m101032e()));
            }
            m101112a((Spannable) AbstractC4100b1.m100583a(c3991b.m101032e()), new Predicate() { // from class: com.applovin.exoplayer2.ui.q
                @Override // com.applovin.exoplayer2.common.base.Predicate
                public final boolean apply(Object obj) {
                    return AbstractC3963h.m101107c(obj);
                }
            });
        }
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m101107c(Object obj) {
        return m101108b(obj);
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m101106d(Object obj) {
        return m101110a(obj);
    }

    /* renamed from: a */
    public static void m101111a(C3989a5.C3991b c3991b) {
        c3991b.m101043b();
        if (c3991b.m101032e() instanceof Spanned) {
            if (!(c3991b.m101032e() instanceof Spannable)) {
                c3991b.m101044a(SpannableString.valueOf(c3991b.m101032e()));
            }
            m101112a((Spannable) AbstractC4100b1.m100583a(c3991b.m101032e()), new Predicate() { // from class: com.applovin.exoplayer2.ui.r
                @Override // com.applovin.exoplayer2.common.base.Predicate
                public final boolean apply(Object obj) {
                    return AbstractC3963h.m101106d(obj);
                }
            });
        }
        m101109b(c3991b);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m101108b(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m101110a(Object obj) {
        return !(obj instanceof InterfaceC5965zb);
    }

    /* renamed from: a */
    private static void m101112a(Spannable spannable, Predicate predicate) {
        Object[] spans;
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (predicate.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }
}
