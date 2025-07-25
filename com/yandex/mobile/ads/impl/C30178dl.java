package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.dl */
/* loaded from: classes8.dex */
public final class C30178dl {
    @NotNull

    /* renamed from: a */
    private final mt1 f78192a;

    public C30178dl(@NotNull mt1 showActivityProvider) {
        Intrinsics.checkNotNullParameter(showActivityProvider, "showActivityProvider");
        this.f78192a = showActivityProvider;
    }

    @NotNull
    /* renamed from: a */
    public final Intent m34890a(@NotNull Context context, @NotNull String browserUrl, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(browserUrl, "browserUrl");
        this.f78192a.getClass();
        Intent intent = new Intent(context, AdActivity.class);
        intent.putExtra("window_type", "window_type_browser");
        intent.putExtra("extra_browser_url", browserUrl);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        intent.putExtra("data_identifier", j);
        return intent;
    }
}
