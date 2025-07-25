package com.iab.omid.library.mobilefuse;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Omid {
    private static C18357b INSTANCE = new C18357b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m63028a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m63029a();
    }

    public static boolean isActive() {
        return INSTANCE.m63026b();
    }

    public static void updateLastActivity() {
        INSTANCE.m63024c();
    }
}
