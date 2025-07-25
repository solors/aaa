package com.yandex.mobile.ads.impl;

import com.monetization.ads.video.parser.offset.VastTimeOffset;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class i12 {
    @NotNull

    /* renamed from: a */
    private final String f80291a;
    @NotNull

    /* renamed from: b */
    private final String f80292b;
    @Nullable

    /* renamed from: c */
    private final VastTimeOffset f80293c;

    public i12(@NotNull String event, @NotNull String trackingUrl, @Nullable VastTimeOffset vastTimeOffset) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(trackingUrl, "trackingUrl");
        this.f80291a = event;
        this.f80292b = trackingUrl;
        this.f80293c = vastTimeOffset;
    }

    @NotNull
    /* renamed from: a */
    public final String m33392a() {
        return this.f80291a;
    }

    @Nullable
    /* renamed from: b */
    public final VastTimeOffset m33391b() {
        return this.f80293c;
    }

    @NotNull
    /* renamed from: c */
    public final String m33390c() {
        return this.f80292b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i12)) {
            return false;
        }
        i12 i12Var = (i12) obj;
        if (Intrinsics.m17075f(this.f80291a, i12Var.f80291a) && Intrinsics.m17075f(this.f80292b, i12Var.f80292b) && Intrinsics.m17075f(this.f80293c, i12Var.f80293c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int m31189a = C31014o3.m31189a(this.f80292b, this.f80291a.hashCode() * 31, 31);
        VastTimeOffset vastTimeOffset = this.f80293c;
        if (vastTimeOffset == null) {
            hashCode = 0;
        } else {
            hashCode = vastTimeOffset.hashCode();
        }
        return m31189a + hashCode;
    }

    @NotNull
    public final String toString() {
        String str = this.f80291a;
        String str2 = this.f80292b;
        VastTimeOffset vastTimeOffset = this.f80293c;
        return "TrackingEvent(event=" + str + ", trackingUrl=" + str2 + ", offset=" + vastTimeOffset + ")";
    }
}
