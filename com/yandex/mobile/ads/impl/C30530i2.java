package com.yandex.mobile.ads.impl;

import com.monetization.ads.video.parser.vmap.configurator.AdBreakParameters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.i2 */
/* loaded from: classes8.dex */
public final class C30530i2 implements pa2 {
    @NotNull

    /* renamed from: a */
    private final C31958z8 f80295a;
    @Nullable

    /* renamed from: b */
    private final String f80296b;
    @NotNull

    /* renamed from: c */
    private final a02 f80297c;
    @NotNull

    /* renamed from: d */
    private final List<String> f80298d;
    @NotNull

    /* renamed from: e */
    private final Map<String, List<String>> f80299e;
    @Nullable

    /* renamed from: f */
    private AdBreakParameters f80300f;

    public C30530i2(@NotNull C31958z8 adSource, @Nullable String str, @NotNull a02 timeOffset, @NotNull List breakTypes, @NotNull ArrayList extensions, @NotNull HashMap trackingEvents) {
        Intrinsics.checkNotNullParameter(adSource, "adSource");
        Intrinsics.checkNotNullParameter(timeOffset, "timeOffset");
        Intrinsics.checkNotNullParameter(breakTypes, "breakTypes");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        this.f80295a = adSource;
        this.f80296b = str;
        this.f80297c = timeOffset;
        this.f80298d = breakTypes;
        this.f80299e = trackingEvents;
    }

    @Override // com.yandex.mobile.ads.impl.pa2
    @NotNull
    /* renamed from: a */
    public final Map<String, List<String>> mo26370a() {
        return this.f80299e;
    }

    @NotNull
    /* renamed from: b */
    public final C31958z8 m33388b() {
        return this.f80295a;
    }

    @Nullable
    /* renamed from: c */
    public final String m33387c() {
        return this.f80296b;
    }

    @NotNull
    /* renamed from: d */
    public final List<String> m33386d() {
        return this.f80298d;
    }

    @Nullable
    /* renamed from: e */
    public final AdBreakParameters m33385e() {
        return this.f80300f;
    }

    @NotNull
    /* renamed from: f */
    public final a02 m33384f() {
        return this.f80297c;
    }

    /* renamed from: a */
    public final void m33389a(@Nullable AdBreakParameters adBreakParameters) {
        this.f80300f = adBreakParameters;
    }
}
