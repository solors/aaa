package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ao1 implements InterfaceC31308rq {
    @NotNull

    /* renamed from: a */
    private final Context f76860a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC31832xo f76861b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC31308rq f76862c;

    /* renamed from: d */
    private boolean f76863d;

    public ao1(@NotNull Context context, @NotNull g10 closeVerificationDialogController, @NotNull InterfaceC31308rq contentCloseListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(closeVerificationDialogController, "closeVerificationDialogController");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        this.f76860a = context;
        this.f76861b = closeVerificationDialogController;
        this.f76862c = contentCloseListener;
    }

    /* renamed from: a */
    public final void m35815a() {
        this.f76863d = true;
        this.f76861b.mo27445a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31308rq
    /* renamed from: f */
    public final void mo27153f() {
        if (this.f76863d) {
            this.f76862c.mo27153f();
        } else {
            this.f76861b.mo27444a(this.f76860a);
        }
    }
}
