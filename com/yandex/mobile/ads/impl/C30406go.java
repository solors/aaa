package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.fl1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.go */
/* loaded from: classes8.dex */
public final class C30406go implements InterfaceC31941z<InterfaceC31780x> {
    @NotNull

    /* renamed from: a */
    private final kl1 f79714a;
    @NotNull

    /* renamed from: b */
    private final e21 f79715b;

    public C30406go(@NotNull kl1 reporter, @NotNull e21 nativeAdEventController) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        this.f79714a = reporter;
        this.f79715b = nativeAdEventController;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31941z
    /* renamed from: a */
    public final void mo26510a(@NotNull View view, @NotNull InterfaceC31780x action) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f79715b.mo31677a();
        this.f79714a.mo26084a(fl1.EnumC30324b.f79116D);
    }
}
