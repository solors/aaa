package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class pb1 implements InterfaceC30989nz {

    /* renamed from: a */
    private final int f83791a;

    public pb1(int i) {
        this.f83791a = i;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30989nz
    /* renamed from: a */
    public final boolean mo28715a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f83791a == context.getResources().getConfiguration().orientation) {
            return true;
        }
        return false;
    }
}
