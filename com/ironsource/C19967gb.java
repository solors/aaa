package com.ironsource;

import com.ironsource.C19869f3;
import com.ironsource.InterfaceC19668c3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.gb */
/* loaded from: classes6.dex */
public final class C19967gb implements InterfaceC21019tk {
    @NotNull

    /* renamed from: a */
    private final IronSourceError f50198a;
    @NotNull

    /* renamed from: b */
    private final C21255y6 f50199b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC20128j3 f50200c;

    public C19967gb(@NotNull IronSourceError error, @NotNull C21255y6 adLoadTaskListener, @NotNull InterfaceC20128j3 analytics) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f50198a = error;
        this.f50199b = adLoadTaskListener;
        this.f50200c = analytics;
    }

    @NotNull
    /* renamed from: a */
    public final IronSourceError m58439a() {
        return this.f50198a;
    }

    @Override // com.ironsource.InterfaceC21019tk
    public void start() {
        InterfaceC19668c3.C19673c.C19674a c19674a = InterfaceC19668c3.C19673c.f49384a;
        c19674a.m59230a().mo59236a(this.f50200c);
        c19674a.m59229a(new C19869f3.C19879j(this.f50198a.getErrorCode()), new C19869f3.C19880k(this.f50198a.getErrorMessage()), new C19869f3.C19875f(0L)).mo59236a(this.f50200c);
        this.f50199b.onAdLoadFailed(this.f50198a);
    }
}
