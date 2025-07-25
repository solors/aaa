package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class b71 {
    @Nullable

    /* renamed from: a */
    private final o52 f77169a;
    @NotNull

    /* renamed from: b */
    private final a71 f77170b;

    public /* synthetic */ b71(Context context, q52 q52Var) {
        this(context, q52Var, q52Var.mo30464a(context), new a71());
    }

    /* renamed from: a */
    public final void m35580a() {
        o52 o52Var = this.f77169a;
        if (o52Var != null) {
            o52Var.mo31158a();
        }
    }

    /* renamed from: a */
    public final void m35579a(@NotNull l11 nativeAdBlock, @NotNull p52 listener) {
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f77169a != null && this.f77170b.m35941a(nativeAdBlock)) {
            this.f77169a.mo31157a(listener);
        } else {
            ((i61) listener).mo28830b();
        }
    }

    public b71(@NotNull Context context, @NotNull q52 verificationResourcesLoaderProvider, @Nullable o52 o52Var, @NotNull a71 verificationPresenceValidator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(verificationResourcesLoaderProvider, "verificationResourcesLoaderProvider");
        Intrinsics.checkNotNullParameter(verificationPresenceValidator, "verificationPresenceValidator");
        this.f77169a = o52Var;
        this.f77170b = verificationPresenceValidator;
    }
}
