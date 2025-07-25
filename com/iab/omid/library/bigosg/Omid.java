package com.iab.omid.library.bigosg;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Omid {
    private static C17934b INSTANCE = new C17934b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m64664a(context.getApplicationContext());
    }

    public static boolean activateWithOmidApiVersion(String str, Context context) {
        INSTANCE.m64664a(context.getApplicationContext());
        return true;
    }

    public static String getVersion() {
        return INSTANCE.m64665a();
    }

    public static boolean isActive() {
        return INSTANCE.m64661b();
    }

    public static boolean isCompatibleWithOmidApiVersion(String str) {
        return INSTANCE.m64663a(str);
    }
}
