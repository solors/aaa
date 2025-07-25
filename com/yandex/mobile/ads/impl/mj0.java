package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class mj0 implements zj0 {
    @NotNull

    /* renamed from: a */
    private final nj0 f82228a;
    @NotNull

    /* renamed from: b */
    private final ky1 f82229b;
    @NotNull

    /* renamed from: c */
    private final C31952z4 f82230c;
    @NotNull

    /* renamed from: d */
    private final ak0 f82231d;
    @NotNull

    /* renamed from: e */
    private final s62 f82232e;
    @NotNull

    /* renamed from: f */
    private final yj0 f82233f;

    public mj0(@NotNull Context context, @NotNull pq1 sdkEnvironmentModule, @NotNull nj0 itemFinishedListener, @NotNull ky1 strongReferenceKeepingManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(itemFinishedListener, "itemFinishedListener");
        Intrinsics.checkNotNullParameter(strongReferenceKeepingManager, "strongReferenceKeepingManager");
        this.f82228a = itemFinishedListener;
        this.f82229b = strongReferenceKeepingManager;
        C31952z4 c31952z4 = new C31952z4();
        this.f82230c = c31952z4;
        ak0 ak0Var = new ak0(context, new C30359g3(EnumC30803lr.f81899i, sdkEnvironmentModule), c31952z4, this);
        this.f82231d = ak0Var;
        s62 s62Var = new s62(context, sdkEnvironmentModule, c31952z4);
        this.f82232e = s62Var;
        this.f82233f = new yj0(context, sdkEnvironmentModule, s62Var, ak0Var);
    }

    /* renamed from: a */
    public final void m31978a(@NotNull uc2 requestConfig) {
        Intrinsics.checkNotNullParameter(requestConfig, "requestConfig");
        this.f82229b.m32393b(zn0.f89005b, this);
        this.f82231d.m35845a(requestConfig);
        C31952z4 c31952z4 = this.f82230c;
        EnumC31868y4 enumC31868y4 = EnumC31868y4.f88027e;
        C30030bj.m35463a(c31952z4, enumC31868y4, "adLoadingPhaseType", enumC31868y4, null);
        this.f82232e.m29847a(requestConfig, this.f82233f);
    }

    @Override // com.yandex.mobile.ads.impl.zj0
    /* renamed from: a */
    public final void mo26148a() {
        this.f82228a.mo31493a(this);
        this.f82229b.m32395a(zn0.f89005b, this);
    }

    /* renamed from: a */
    public final void m31979a(@Nullable InterfaceC29961as interfaceC29961as) {
        this.f82231d.m35846a(interfaceC29961as);
    }
}
