package com.iab.omid.library.pubnativenet;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Omid {
    private static C18497b INSTANCE = new C18497b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m62522a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m62523a();
    }

    public static boolean isActive() {
        return INSTANCE.m62520b();
    }

    public static void updateLastActivity() {
        INSTANCE.m62518c();
    }
}
