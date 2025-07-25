package com.mbridge.msdk.dycreator.p422e;

import android.util.Log;

/* compiled from: Logger.java */
/* renamed from: com.mbridge.msdk.dycreator.e.g */
/* loaded from: classes6.dex */
public final class C21890g {

    /* renamed from: a */
    public static boolean f55963a = false;

    /* renamed from: a */
    public static void m52938a(String str) {
        if (f55963a) {
            new SecurityManager();
            Log.e(new Throwable().getStackTrace()[1].getFileName(), str);
        }
    }
}
