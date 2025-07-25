package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.sf */
/* loaded from: classes8.dex */
public final class C31349sf {
    @NotNull

    /* renamed from: a */
    private final m62<kl0> f85215a;
    @NotNull

    /* renamed from: b */
    private final ib1 f85216b;
    @NotNull

    /* renamed from: c */
    private final sa2 f85217c;
    @NotNull

    /* renamed from: d */
    private final rl0 f85218d;

    public C31349sf(@NotNull m62<kl0> videoAdInfo, @NotNull ib1 adClickHandler, @NotNull sa2 videoTracker) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(adClickHandler, "adClickHandler");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        this.f85215a = videoAdInfo;
        this.f85216b = adClickHandler;
        this.f85217c = videoTracker;
        this.f85218d = new rl0(new C30808lt());
    }

    /* renamed from: a */
    public final void m29633a(@NotNull View view, @Nullable C31034of<?> c31034of) {
        String m31647a;
        Intrinsics.checkNotNullParameter(view, "view");
        if (c31034of != null && c31034of.m31040e() && (m31647a = this.f85218d.m29984a(this.f85215a.m32087b(), c31034of.m31043b()).m31647a()) != null) {
            view.setOnClickListener(new View$OnClickListenerC30165dg(this.f85216b, m31647a, c31034of.m31043b(), this.f85217c));
        }
    }
}
