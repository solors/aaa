package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.collections._Arrays;
import kotlin.collections._Collections;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class wc1 {
    @NotNull

    /* renamed from: a */
    private static final List<String> f87205a;

    static {
        List<String> m17163p;
        m17163p = C37563v.m17163p("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");
        f87205a = m17163p;
    }

    /* renamed from: a */
    public static void m27979a(@NotNull Context context) throws em0 {
        List m17550c1;
        List m17348D0;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            m17550c1 = _Collections.m17550c1(f87205a);
            String[] requestedPermissions = packageInfo.requestedPermissions;
            if (requestedPermissions != null) {
                Intrinsics.checkNotNullExpressionValue(requestedPermissions, "requestedPermissions");
                m17348D0 = _Arrays.m17348D0(requestedPermissions);
                m17550c1.removeAll(m17348D0);
                if (m17550c1.size() > 0) {
                    C37612s0 c37612s0 = C37612s0.f99333a;
                    String format = String.format("Please, check %s permission in AndroidManifest file.", Arrays.copyOf(new Object[]{m17550c1}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    throw new em0(format, format);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
