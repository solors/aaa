package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Mm */
/* loaded from: classes9.dex */
public final class C34073Mm extends AbstractCallableC34210Sg {

    /* renamed from: e */
    public final int f93246e;

    /* renamed from: f */
    public final Bundle f93247f;

    public C34073Mm(@NotNull C34629j0 c34629j0, @Nullable InterfaceC34514ek interfaceC34514ek, int i, @NotNull Bundle bundle) {
        super(c34629j0, interfaceC34514ek);
        this.f93246e = i;
        this.f93247f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC34210Sg
    /* renamed from: a */
    public final void mo21573a(@NotNull IAppMetricaService iAppMetricaService) {
        iAppMetricaService.reportData(this.f93246e, this.f93247f);
    }
}
