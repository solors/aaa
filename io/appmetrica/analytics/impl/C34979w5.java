package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.w5 */
/* loaded from: classes9.dex */
public final class C34979w5 {
    /* renamed from: a */
    public final EnumC34351Yd m20828a(@NonNull Context context) {
        SafePackageManager safePackageManager = AbstractC34375Zd.f93883a;
        return (EnumC34351Yd) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", EnumC34351Yd.UNDEFINED, new C34327Xd());
    }
}
