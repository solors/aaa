package com.applovin.impl;

import android.text.Spannable;

/* renamed from: com.applovin.impl.pk */
/* loaded from: classes2.dex */
public abstract class AbstractC5127pk {
    /* renamed from: a */
    public static void m96534a(Spannable spannable, Object obj, int i, int i2, int i3) {
        Object[] spans;
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i && spannable.getSpanEnd(obj2) == i2 && spannable.getSpanFlags(obj2) == i3) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i, i2, i3);
    }
}
