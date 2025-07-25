package com.iab.omid.library.ironsrc;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Omid {
    private static C18229b INSTANCE = new C18229b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m63513a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m63514a();
    }

    public static boolean isActive() {
        return INSTANCE.m63511b();
    }

    public static void updateLastActivity() {
        INSTANCE.m63509c();
    }
}
