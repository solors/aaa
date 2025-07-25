package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

@Metadata
/* renamed from: com.ironsource.rq */
/* loaded from: classes6.dex */
public final class C20773rq {
    @Nullable

    /* renamed from: b */
    private static Boolean f52802b;
    @NotNull

    /* renamed from: a */
    public static final C20773rq f52801a = new C20773rq();
    @NotNull

    /* renamed from: c */
    private static EnumC20720qq f52803c = EnumC20720qq.NOT_INIT;

    private C20773rq() {
    }

    @NotNull
    /* renamed from: a */
    public final synchronized EnumC20720qq m55442a() {
        return f52803c;
    }

    @NotNull
    /* renamed from: b */
    public final EnumC20720qq m55439b() {
        boolean m17075f;
        Boolean bool = f52802b;
        if (bool == null) {
            m17075f = true;
        } else {
            m17075f = Intrinsics.m17075f(bool, Boolean.FALSE);
        }
        if (m17075f) {
            return EnumC20720qq.NOT_INIT;
        }
        if (Intrinsics.m17075f(bool, Boolean.TRUE)) {
            return f52803c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public final synchronized void m55441a(@NotNull EnumC20720qq enumC20720qq) {
        Intrinsics.checkNotNullParameter(enumC20720qq, "<set-?>");
        f52803c = enumC20720qq;
    }

    /* renamed from: a */
    public final void m55440a(boolean z) {
        f52802b = Boolean.valueOf(z);
    }
}
