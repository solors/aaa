package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.fl1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.mx */
/* loaded from: classes8.dex */
public final class C30887mx {
    @NotNull

    /* renamed from: a */
    private final kl1 f82466a;
    @NotNull

    /* renamed from: b */
    private final ib1 f82467b;
    @NotNull

    /* renamed from: c */
    private final e21 f82468c;
    @NotNull

    /* renamed from: d */
    private final cg1 f82469d;

    public C30887mx(@NotNull kl1 reporter, @NotNull e61 openUrlHandler, @NotNull e21 nativeAdEventController, @NotNull cg1 preferredPackagesViewer) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(openUrlHandler, "openUrlHandler");
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        Intrinsics.checkNotNullParameter(preferredPackagesViewer, "preferredPackagesViewer");
        this.f82466a = reporter;
        this.f82467b = openUrlHandler;
        this.f82468c = nativeAdEventController;
        this.f82469d = preferredPackagesViewer;
    }

    /* renamed from: a */
    public final void m31754a(@NotNull Context context, @NotNull C30678jx action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.f82469d.m35235a(context, action.m32714d())) {
            this.f82466a.mo26084a(fl1.EnumC30324b.f79118F);
            this.f82468c.m34696d();
            return;
        }
        this.f82467b.mo28740a(action.m32715c());
    }
}
