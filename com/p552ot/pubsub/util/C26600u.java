package com.p552ot.pubsub.util;

import android.util.Log;
import com.amazon.p047a.p048a.p071o.KiwiConstants;

/* renamed from: com.ot.pubsub.util.u */
/* loaded from: classes7.dex */
public class C26600u {

    /* renamed from: a */
    private static final String f69833a = "SystemProperties";

    /* renamed from: a */
    public static String m40961a(String str, String str2) {
        try {
            return (String) Class.forName(KiwiConstants.f2713ar).getMethod(KiwiConstants.f2714as, String.class, String.class).invoke(null, str, str2);
        } catch (Exception e) {
            Log.d(C26586j.m41081a(f69833a), "get e", e);
            return str2;
        }
    }

    /* renamed from: a */
    public static String m40963a(String str) {
        return m40961a(str, "");
    }

    /* renamed from: a */
    public static long m40962a(String str, Long l) {
        try {
            return ((Long) Class.forName(KiwiConstants.f2713ar).getMethod("getLong", String.class, Long.TYPE).invoke(null, str, l)).longValue();
        } catch (Exception e) {
            Log.d(C26586j.m41081a(f69833a), "getLong e", e);
            return l.longValue();
        }
    }
}
