package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.fu */
/* loaded from: classes8.dex */
public final class C30339fu {
    @NotNull

    /* renamed from: a */
    private final Context f79314a;

    public C30339fu(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f79314a = applicationContext;
    }

    /* renamed from: a */
    public final boolean m34080a() {
        if ((this.f79314a.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }
}
