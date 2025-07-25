package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.oe */
/* loaded from: classes8.dex */
public final class C31033oe {
    /* renamed from: a */
    public static boolean m31047a(@NotNull C30723ke appMetricaIdentifiers) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(appMetricaIdentifiers, "appMetricaIdentifiers");
        String m32573a = appMetricaIdentifiers.m32573a();
        String m32572b = appMetricaIdentifiers.m32572b();
        String m32571c = appMetricaIdentifiers.m32571c();
        if (m32571c != null && m32571c.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!(!z)) {
            return false;
        }
        if (m32573a != null && m32573a.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(!z2)) {
            return false;
        }
        if (m32572b != null && m32572b.length() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!(!z3)) {
            return false;
        }
        return true;
    }
}
