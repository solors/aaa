package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* renamed from: io.appmetrica.analytics.impl.xi */
/* loaded from: classes9.dex */
public abstract class AbstractC35018xi {
    /* renamed from: a */
    public static void m20774a(String str, Object... objArr) {
        ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format(str, objArr), new Object[0]);
    }

    /* renamed from: a */
    public static String m20775a() {
        StringBuilder sb2 = new StringBuilder(BuildConfig.SDK_BUILD_FLAVOR);
        if (!TextUtils.isEmpty(BuildConfig.SDK_DEPENDENCY)) {
            sb2.append("_binary");
        }
        if (!TextUtils.isEmpty("")) {
            sb2.append("_");
        }
        return sb2.toString();
    }
}
