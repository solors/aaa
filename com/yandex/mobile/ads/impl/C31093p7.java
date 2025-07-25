package com.yandex.mobile.ads.impl;

import com.monetization.ads.video.parser.vmap.configurator.AdBreakParameters;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.p7 */
/* loaded from: classes8.dex */
public final class C31093p7 {
    @NotNull

    /* renamed from: a */
    private final C30530i2 f83730a;

    public C31093p7(@NotNull C30530i2 adBreak) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        this.f83730a = adBreak;
    }

    @NotNull
    /* renamed from: a */
    public final C30538i9 m30831a() {
        return this.f83730a.m33388b().m26319a();
    }

    @Nullable
    /* renamed from: b */
    public final String m30830b() {
        AdBreakParameters m33385e = this.f83730a.m33385e();
        if (m33385e != null) {
            return m33385e.m44260c();
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public final String m30829c() {
        return this.f83730a.m33388b().m26318b();
    }

    @Nullable
    /* renamed from: d */
    public final String m30828d() {
        AdBreakParameters m33385e = this.f83730a.m33385e();
        if (m33385e != null) {
            return m33385e.m44259d();
        }
        return null;
    }

    @Nullable
    /* renamed from: e */
    public final String m30827e() {
        AdBreakParameters m33385e = this.f83730a.m33385e();
        if (m33385e != null) {
            return m33385e.m44258e();
        }
        return null;
    }
}
