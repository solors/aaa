package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ec2 {

    /* renamed from: com.yandex.mobile.ads.impl.ec2$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC30229a {
        /* renamed from: b */
        boolean mo34637b();
    }

    /* renamed from: a */
    public static boolean m34638a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (((InterfaceC30229a) view).mo34637b() && view.hasWindowFocus() && !cc2.m35250d(view)) {
            return true;
        }
        return false;
    }
}
