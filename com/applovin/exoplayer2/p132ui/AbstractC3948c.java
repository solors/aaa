package com.applovin.exoplayer2.p132ui;

import android.graphics.Color;
import com.applovin.impl.AbstractC5863xp;

/* renamed from: com.applovin.exoplayer2.ui.c */
/* loaded from: classes2.dex */
abstract class AbstractC3948c {
    /* renamed from: a */
    public static String m101230a(int i) {
        return AbstractC5863xp.m93012a("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d));
    }

    /* renamed from: a */
    public static String m101229a(String str) {
        return "." + str + ",." + str + " *";
    }
}
