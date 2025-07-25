package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.nf */
/* loaded from: classes9.dex */
public final class C34752nf implements InterfaceC34018Kf {

    /* renamed from: a */
    public final /* synthetic */ C34937uf f95028a;

    public C34752nf(C34937uf c34937uf) {
        this.f95028a = c34937uf;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34018Kf
    @WorkerThread
    /* renamed from: a */
    public final void mo20974a(@Nullable C33896Ff c33896Ff) {
        C34937uf c34937uf = this.f95028a;
        C34937uf.m20911a(c34937uf, c33896Ff, (InterfaceC34725mf) c34937uf.f95469d.getValue());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34018Kf
    @WorkerThread
    /* renamed from: a */
    public final void mo20973a(@NotNull Throwable th) {
        C34937uf c34937uf = this.f95028a;
        C34937uf.m20911a(c34937uf, null, (InterfaceC34725mf) c34937uf.f95469d.getValue());
    }
}
