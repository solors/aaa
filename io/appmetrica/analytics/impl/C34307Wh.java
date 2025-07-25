package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Wh */
/* loaded from: classes9.dex */
public final class C34307Wh extends AbstractCallableC34210Sg {

    /* renamed from: e */
    public final C34208Se f93656e;

    public C34307Wh(@NotNull C34629j0 c34629j0, @Nullable InterfaceC34514ek interfaceC34514ek, @NotNull C34208Se c34208Se) {
        super(c34629j0, interfaceC34514ek);
        this.f93656e = c34208Se;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC34210Sg
    /* renamed from: a */
    public final void mo21573a(@NotNull IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        C34208Se c34208Se = this.f93656e;
        synchronized (c34208Se) {
            bundle.putParcelable("PROCESS_CFG_OBJ", c34208Se);
        }
        iAppMetricaService.resumeUserSession(bundle);
    }
}
