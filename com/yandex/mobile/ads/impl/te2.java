package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class te2 implements vl1<List<? extends z52>> {
    @NotNull

    /* renamed from: a */
    private final vl1<List<z52>> f85633a;
    @NotNull

    /* renamed from: b */
    private final ue2 f85634b;

    public te2(@NotNull Context context, @NotNull z52 wrapperAd, @NotNull vl1<List<z52>> requestListener, @NotNull ue2 wrapperAdResponseConfigurator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wrapperAd, "wrapperAd");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        Intrinsics.checkNotNullParameter(wrapperAdResponseConfigurator, "wrapperAdResponseConfigurator");
        this.f85633a = requestListener;
        this.f85634b = wrapperAdResponseConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.vl1
    /* renamed from: a */
    public final void mo26878a(@NotNull f62 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f85633a.mo26878a(error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.vl1
    /* renamed from: a */
    public final void mo26877a(List<? extends z52> list) {
        List<? extends z52> response = list;
        Intrinsics.checkNotNullParameter(response, "response");
        this.f85633a.mo26877a((vl1<List<z52>>) this.f85634b.m28799a(response));
    }
}
