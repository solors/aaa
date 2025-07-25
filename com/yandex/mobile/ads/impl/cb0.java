package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class cb0 {
    @NotNull

    /* renamed from: a */
    private final mt1 f77580a;

    public cb0(@NotNull mt1 showActivityProvider) {
        Intrinsics.checkNotNullParameter(showActivityProvider, "showActivityProvider");
        this.f77580a = showActivityProvider;
    }

    @NotNull
    /* renamed from: a */
    public final Intent m35320a(@NotNull Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77580a.getClass();
        Intent intent = new Intent(context, AdActivity.class);
        intent.putExtra("window_type", "window_type_fullscreen");
        intent.putExtra("data_identifier", j);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        return intent;
    }
}
