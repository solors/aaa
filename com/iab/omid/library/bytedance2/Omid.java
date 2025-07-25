package com.iab.omid.library.bytedance2;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Omid {
    private static C17982b INSTANCE = new C17982b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m64460a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m64461a();
    }

    public static boolean isActive() {
        return INSTANCE.m64458b();
    }

    public static void updateLastActivity() {
        INSTANCE.m64456c();
    }
}
