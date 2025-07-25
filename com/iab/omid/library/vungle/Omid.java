package com.iab.omid.library.vungle;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Omid {
    private static C18738b INSTANCE = new C18738b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m61547a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m61548a();
    }

    public static boolean isActive() {
        return INSTANCE.m61545b();
    }

    public static void updateLastActivity() {
        INSTANCE.m61543c();
    }
}
