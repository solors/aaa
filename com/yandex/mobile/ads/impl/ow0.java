package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nw0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ow0 {
    /* renamed from: a */
    public static boolean m30871a(@NotNull nw0 network) {
        Intrinsics.checkNotNullParameter(network, "network");
        List<nw0.C30984c> m31262b = network.m31262b();
        if (!(m31262b instanceof Collection) || !m31262b.isEmpty()) {
            for (nw0.C30984c c30984c : m31262b) {
                if (!c30984c.m31256c()) {
                    return false;
                }
            }
        }
        return true;
    }
}
