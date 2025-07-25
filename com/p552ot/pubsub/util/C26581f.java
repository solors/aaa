package com.p552ot.pubsub.util;

import android.content.Context;
import android.os.UserManager;

/* renamed from: com.ot.pubsub.util.f */
/* loaded from: classes7.dex */
public class C26581f {

    /* renamed from: a */
    private static final String f69725a = "FbeUtil";

    private C26581f() {
    }

    /* renamed from: a */
    public static Context m41104a(Context context) {
        if (m41102c(context)) {
            C26586j.m41080a(f69725a, "getSafeContext return origin ctx");
            return context;
        }
        C26586j.m41080a(f69725a, "getSafeContext , create the safe ctx");
        return context.createDeviceProtectedStorageContext();
    }

    /* renamed from: b */
    public static boolean m41103b(Context context) {
        if (m41102c(context)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m41102c(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        if (userManager != null && userManager.isUserUnlocked()) {
            return true;
        }
        return false;
    }
}
