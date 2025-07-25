package com.yandex.mobile.ads.impl;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class q10 {
    @NotNull

    /* renamed from: a */
    private final o32 f84152a;

    public q10(@NotNull md1 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f84152a = tracker;
    }

    /* renamed from: a */
    public final void m30541a(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("trackingUrl");
        if (queryParameter != null && queryParameter.length() > 0) {
            this.f84152a.mo31187a(queryParameter);
        }
    }
}
