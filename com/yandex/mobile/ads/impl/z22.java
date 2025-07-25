package com.yandex.mobile.ads.impl;

import android.content.res.Resources;
import be.MathJVM;

/* loaded from: classes8.dex */
public final class z22 {
    /* renamed from: a */
    public static final int m26466a(int i) {
        int m103791d;
        float f = Resources.getSystem().getDisplayMetrics().density;
        if (i >= 0) {
            m103791d = MathJVM.m103791d(i / f);
            return m103791d;
        }
        return i;
    }
}
