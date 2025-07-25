package com.iab.omid.library.applovin;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Omid {
    private static C17800b INSTANCE = new C17800b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m65168a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m65169a();
    }

    public static boolean isActive() {
        return INSTANCE.m65166b();
    }

    public static void updateLastActivity() {
        INSTANCE.m65164c();
    }
}
