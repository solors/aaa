package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.UserManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.Xm */
/* loaded from: classes9.dex */
public final class C34336Xm {
    /* renamed from: a */
    public static boolean m22089a(Context context) {
        return ((Boolean) SystemServiceUtils.accessSystemServiceSafelyOrDefault((UserManager) context.getSystemService(UserManager.class), "detect unlocked user state", "User manager", Boolean.TRUE, new C34312Wm())).booleanValue();
    }
}
