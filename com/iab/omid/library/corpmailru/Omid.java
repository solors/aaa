package com.iab.omid.library.corpmailru;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Omid {
    private static C18046b INSTANCE = new C18046b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m64210a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m64211a();
    }

    public static boolean isActive() {
        return INSTANCE.m64208b();
    }
}
