package com.applovin.impl;

import android.os.Build;
import java.util.HashSet;

/* renamed from: com.applovin.impl.e8 */
/* loaded from: classes2.dex */
public abstract class AbstractC4309e8 {

    /* renamed from: a */
    public static final String f5789a = "ExoPlayerLib/2.15.1 (Linux; Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.15.1";

    /* renamed from: b */
    private static final HashSet f5790b = new HashSet();

    /* renamed from: c */
    private static String f5791c = "goog.exo.core";

    /* renamed from: a */
    public static synchronized String m99647a() {
        String str;
        synchronized (AbstractC4309e8.class) {
            str = f5791c;
        }
        return str;
    }

    /* renamed from: a */
    public static synchronized void m99646a(String str) {
        synchronized (AbstractC4309e8.class) {
            if (f5790b.add(str)) {
                f5791c += ", " + str;
            }
        }
    }
}
