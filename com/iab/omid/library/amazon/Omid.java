package com.iab.omid.library.amazon;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Omid {
    private static C17739b INSTANCE = new C17739b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m65409a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m65410a();
    }

    public static boolean isActive() {
        return INSTANCE.m65407b();
    }

    public static void updateLastActivity() {
        INSTANCE.m65405c();
    }
}
