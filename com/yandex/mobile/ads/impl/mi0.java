package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class mi0 {
    @NotNull

    /* renamed from: a */
    private final Context f82221a;

    public mi0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82221a = context;
    }

    @NotNull
    /* renamed from: a */
    public final File m31997a() {
        File file = new File(this.f82221a.getCacheDir(), "debug_panel");
        file.mkdir();
        return new File(file, "monetization_ads_debug_panel_report.txt");
    }
}
