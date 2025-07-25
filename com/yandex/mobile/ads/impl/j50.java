package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class j50 {
    @NotNull

    /* renamed from: a */
    private final List<i50> f80753a;

    public /* synthetic */ j50(h62 h62Var) {
        this(h62Var, h62Var.m33606a());
    }

    /* renamed from: a */
    public final boolean m33043a() {
        Intrinsics.checkNotNullParameter("ad_system", "type");
        Intrinsics.checkNotNullParameter("adfox", "value");
        List<i50> list = this.f80753a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (i50 i50Var : list) {
                if (Intrinsics.m17075f(i50Var.m33365a(), "ad_system") && Intrinsics.m17075f(i50Var.m33364b(), "adfox")) {
                    return true;
                }
            }
        }
        return false;
    }

    public j50(@NotNull h62 videoAdExtensions, @NotNull List<i50> extensions) {
        Intrinsics.checkNotNullParameter(videoAdExtensions, "videoAdExtensions");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f80753a = extensions;
    }
}
