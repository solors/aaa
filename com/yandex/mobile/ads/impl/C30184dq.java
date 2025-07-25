package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.dq */
/* loaded from: classes8.dex */
public final class C30184dq {
    @NotNull

    /* renamed from: a */
    private final rb1 f78214a;

    public /* synthetic */ C30184dq() {
        this(new rb1());
    }

    @NotNull
    /* renamed from: a */
    public final gl1 m34873a(@NotNull C30359g3 adConfiguration) {
        String str;
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        gl1 gl1Var = new gl1(new LinkedHashMap(), 2);
        rb1 rb1Var = this.f78214a;
        int m33951o = adConfiguration.m33951o();
        rb1Var.getClass();
        if (m33951o != 1) {
            if (m33951o != 2) {
                str = "undefined";
            } else {
                str = "landscape";
            }
        } else {
            str = "portrait";
        }
        gl1Var.m33814b(str, "orientation");
        return gl1Var;
    }

    public C30184dq(@NotNull rb1 orientationNameProvider) {
        Intrinsics.checkNotNullParameter(orientationNameProvider, "orientationNameProvider");
        this.f78214a = orientationNameProvider;
    }
}
