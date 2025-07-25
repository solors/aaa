package com.iab.omid.library.fyber;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Omid {
    private static C18100b INSTANCE = new C18100b();

    /* renamed from: a */
    public static final /* synthetic */ int f45526a = 0;

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m64010a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m64011a();
    }

    public static boolean isActive() {
        return INSTANCE.m64008b();
    }

    public static void updateLastActivity() {
        INSTANCE.m64006c();
    }
}
