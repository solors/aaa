package com.iab.omid.library.smaato;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Omid {
    private static C18560b INSTANCE = new C18560b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m62269a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m62270a();
    }

    public static boolean isActive() {
        return INSTANCE.m62267b();
    }

    public static void updateLastActivity() {
        INSTANCE.m62265c();
    }
}
