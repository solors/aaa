package com.yandex.mobile.ads.impl;

import com.ironsource.C21114v8;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class p62 {
    @NotNull

    /* renamed from: a */
    private final kl0 f83729a;

    public p62(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f83729a = videoAd;
    }

    @Nullable
    /* renamed from: a */
    public final String m30832a() {
        String str;
        JSONObject m32502d = this.f83729a.m32502d();
        if (m32502d != null) {
            str = m32502d.optString(C21114v8.C21122h.f54077m);
        } else {
            str = null;
        }
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str;
    }
}
