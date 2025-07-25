package com.iab.omid.library.mmadbridge;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Omid {
    private static C18287b INSTANCE = new C18287b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m63281a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m63282a();
    }

    public static boolean isActive() {
        return INSTANCE.m63279b();
    }

    public static void updateLastActivity() {
        INSTANCE.m63277c();
    }
}
