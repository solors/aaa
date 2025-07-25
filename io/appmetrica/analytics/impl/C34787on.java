package io.appmetrica.analytics.impl;

import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.on */
/* loaded from: classes9.dex */
public final class C34787on {
    /* renamed from: a */
    public static boolean m21188a(String str) {
        UUID uuid;
        if (str == null || str.length() != 32) {
            return false;
        }
        try {
            uuid = UUID.fromString(m21187b(str));
        } catch (Throwable unused) {
            uuid = null;
        }
        if (uuid == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static String m21187b(String str) {
        return str.substring(0, 8) + "-" + str.substring(8, 12) + "-" + str.substring(12, 16) + "-" + str.substring(16, 20) + "-" + str.substring(20, 32);
    }
}
