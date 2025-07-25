package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.InitializationListener;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class bg2 implements InterfaceC31678vr {
    @NotNull

    /* renamed from: a */
    private final InitializationListener f77288a;

    /* renamed from: com.yandex.mobile.ads.impl.bg2$a */
    /* loaded from: classes8.dex */
    static final class C30018a extends Lambda implements Functions<Unit> {
        C30018a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            bg2.this.f77288a.onInitializationCompleted();
            return Unit.f99208a;
        }
    }

    public bg2(@NotNull InitializationListener initializationListener) {
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        this.f77288a = initializationListener;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof bg2) && Intrinsics.m17075f(((bg2) obj).f77288a, this.f77288a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f77288a.hashCode();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31678vr
    public final void onInitializationCompleted() {
        new CallbackStackTraceMarker(new C30018a());
    }
}
