package com.iab.omid.library.appodeal;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Omid {
    private static C17868b INSTANCE = new C17868b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m64927a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m64928a();
    }

    public static boolean isActive() {
        return INSTANCE.m64925b();
    }

    public static void updateLastActivity() {
        INSTANCE.m64923c();
    }
}
