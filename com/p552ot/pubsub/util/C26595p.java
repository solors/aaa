package com.p552ot.pubsub.util;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ot.pubsub.util.p */
/* loaded from: classes7.dex */
public class C26595p {

    /* renamed from: a */
    private static final String f69797a = "PermissionUtil";

    /* renamed from: b */
    private static final String f69798b = "android.permission.READ_PRIVILEGED_PHONE_STATE";

    /* renamed from: c */
    private static Set<String> f69799c;

    static {
        try {
            HashSet hashSet = new HashSet();
            f69799c = hashSet;
            hashSet.add("android");
            f69799c.add("com.miui.analytics");
            f69799c.add("com.miui.cit");
            f69799c.add("com.xiaomi.finddevice");
            f69799c.add("com.miui.securitycenter");
            f69799c.add("com.android.settings");
            f69799c.add("com.android.vending");
            f69799c.add("com.google.android.gms");
            f69799c.add("com.xiaomi.factory.mmi");
            f69799c.add("com.miui.qr");
            f69799c.add("com.android.contacts");
            f69799c.add("com.qualcomm.qti.autoregistration");
            f69799c.add("com.miui.tsmclient");
            f69799c.add("com.miui.sekeytool");
            f69799c.add("com.android.updater");
            if ("cn_chinamobile".equals(C26600u.m40963a("ro.miui.cust_variant")) || "cn_chinatelecom".equals(C26600u.m40963a("ro.miui.cust_variant"))) {
                f69799c.add("com.mobiletools.systemhelper");
                f69799c.add("com.miui.dmregservice");
            }
        } catch (Exception e) {
            Log.e(f69797a, "static initializer: " + e.toString());
        }
    }

    /* renamed from: a */
    public static boolean m41018a(Context context, String str) {
        return m41015b(context, str);
    }

    /* renamed from: b */
    public static boolean m41015b(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    /* renamed from: a */
    private static boolean m41017a(String str) {
        Set<String> set;
        return (TextUtils.isEmpty(str) || (set = f69799c) == null || !set.contains(str)) ? false : true;
    }

    /* renamed from: b */
    public static boolean m41016b(Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            return m41015b(context, "android.permission.READ_PHONE_STATE");
        }
        return m41015b(context, f69798b);
    }

    /* renamed from: a */
    public static boolean m41019a(Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            return m41015b(context, "android.permission.READ_PHONE_STATE");
        }
        if (m41020a()) {
            return m41017a(C26577b.m41111e()) && m41015b(context, f69798b);
        }
        return m41015b(context, f69798b);
    }

    /* renamed from: a */
    private static boolean m41020a() {
        try {
            if (C26590l.m41054a() && !C26590l.m41039h()) {
                return "1".equals(C26600u.m40963a("ro.miui.restrict_imei"));
            }
            return false;
        } catch (Exception e) {
            C26586j.m41074b(f69797a, "isRestrictIMEI " + e.toString());
            return false;
        }
    }
}
