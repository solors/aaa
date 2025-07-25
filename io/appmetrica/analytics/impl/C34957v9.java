package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.p724io.IExecutionPolicy;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;

/* renamed from: io.appmetrica.analytics.impl.v9 */
/* loaded from: classes9.dex */
public final class C34957v9 implements IExecutionPolicy {

    /* renamed from: c */
    public static final EnumSet f95506c = EnumSet.of(EnumC34351Yd.OFFLINE);

    /* renamed from: a */
    public final C34979w5 f95507a = new C34979w5();

    /* renamed from: b */
    public final Context f95508b;

    public C34957v9(@NonNull Context context) {
        this.f95508b = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.p724io.IExecutionPolicy
    public final boolean canBeExecuted() {
        C34979w5 c34979w5 = this.f95507a;
        Context context = this.f95508b;
        c34979w5.getClass();
        SafePackageManager safePackageManager = AbstractC34375Zd.f93883a;
        return !f95506c.contains((EnumC34351Yd) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", EnumC34351Yd.UNDEFINED, new C34327Xd()));
    }
}
