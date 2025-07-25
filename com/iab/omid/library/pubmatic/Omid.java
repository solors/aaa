package com.iab.omid.library.pubmatic;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Omid {
    private static C18427b INSTANCE = new C18427b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m62775a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m62776a();
    }

    public static boolean isActive() {
        return INSTANCE.m62773b();
    }

    public static void updateLastActivity() {
        INSTANCE.m62771c();
    }
}
