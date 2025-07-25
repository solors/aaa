package com.iab.omid.library.unity3d;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Omid {
    private static C18679b INSTANCE = new C18679b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m61778a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m61779a();
    }

    public static boolean isActive() {
        return INSTANCE.m61776b();
    }

    public static void updateLastActivity() {
        INSTANCE.m61774c();
    }
}
