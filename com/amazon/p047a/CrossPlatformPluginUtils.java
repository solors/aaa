package com.amazon.p047a;

import android.app.Activity;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p047a.p048a.p071o.p072a.Assert;

/* renamed from: com.amazon.a.d */
/* loaded from: classes2.dex */
public class CrossPlatformPluginUtils {

    /* renamed from: a */
    private static final KiwiLogger f2841a = new KiwiLogger("CrossPlatformPluginUtils");

    /* renamed from: a */
    private static boolean m102764a() {
        if (AppstoreSDK.m103230b() != null) {
            return AppstoreSDK.m103230b().mo103174h();
        }
        return false;
    }

    /* renamed from: a */
    public static void m102763a(Activity activity) {
        Assert.m102869a(AppstoreSDK.m103223d(), "AppstoreSDK not initialized");
        if (m102764a()) {
            return;
        }
        AppstoreSDK.m103230b().mo103183c(activity);
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2841a;
            kiwiLogger.m102829a("Notified Visibility for activity:" + activity);
        }
    }
}
