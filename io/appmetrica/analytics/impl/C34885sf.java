package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.sf */
/* loaded from: classes9.dex */
public final class C34885sf implements InterfaceC34018Kf {

    /* renamed from: a */
    public final /* synthetic */ C34937uf f95331a;

    public C34885sf(C34937uf c34937uf) {
        this.f95331a = c34937uf;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34018Kf
    @WorkerThread
    /* renamed from: a */
    public final void mo20974a(@Nullable C33896Ff c33896Ff) {
        C34937uf c34937uf = this.f95331a;
        C34937uf.m20911a(c34937uf, c33896Ff, (InterfaceC34725mf) c34937uf.f95470e.getValue());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34018Kf
    @WorkerThread
    /* renamed from: a */
    public final void mo20973a(@NotNull Throwable th) {
        C34937uf c34937uf = this.f95331a;
        C34937uf.m20911a(c34937uf, null, (InterfaceC34725mf) c34937uf.f95470e.getValue());
    }
}
