package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class pd0 {
    @NotNull

    /* renamed from: a */
    private final Context f83834a;

    public pd0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f83834a = context;
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC31607ur m30758a(@NotNull EnumC31944z1 requestPolicy) {
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        int ordinal = requestPolicy.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return new gf0(this.f83834a, so1.m29572a());
            }
            throw new NoWhenBranchMatchedException();
        }
        return new oz1();
    }
}
