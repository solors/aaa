package com.iab.omid.library.taurusx;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Omid {
    private static C18622b INSTANCE = new C18622b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m62013a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m62014a();
    }

    public static boolean isActive() {
        return INSTANCE.m62011b();
    }

    public static void updateLastActivity() {
        INSTANCE.m62009c();
    }
}
