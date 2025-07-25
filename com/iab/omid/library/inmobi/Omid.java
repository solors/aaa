package com.iab.omid.library.inmobi;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Omid {
    private static C18170b INSTANCE = new C18170b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m63757a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m63758a();
    }

    public static boolean isActive() {
        return INSTANCE.m63755b();
    }

    public static void updateLastActivity() {
        INSTANCE.m63753c();
    }
}
