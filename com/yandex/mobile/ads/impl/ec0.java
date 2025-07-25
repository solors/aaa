package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ec0 implements InterfaceC30228ec {
    @NotNull

    /* renamed from: a */
    private final hc0 f78503a;
    @NotNull

    /* renamed from: b */
    private final jc0 f78504b;

    public /* synthetic */ ec0(Context context) {
        this(context, new hc0(context), new jc0(context));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30228ec
    @Nullable
    /* renamed from: a */
    public final C31967zb mo34639a() {
        C31967zb m33578a = this.f78503a.m33578a();
        if (m33578a == null) {
            return this.f78504b.m32945a();
        }
        return m33578a;
    }

    public ec0(@NotNull Context context, @NotNull hc0 gmsClientAdvertisingInfoProvider, @NotNull jc0 gmsServiceAdvertisingInfoProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gmsClientAdvertisingInfoProvider, "gmsClientAdvertisingInfoProvider");
        Intrinsics.checkNotNullParameter(gmsServiceAdvertisingInfoProvider, "gmsServiceAdvertisingInfoProvider");
        this.f78503a = gmsClientAdvertisingInfoProvider;
        this.f78504b = gmsServiceAdvertisingInfoProvider;
    }
}
