package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ib */
/* loaded from: classes8.dex */
public final class C30541ib {
    @NotNull

    /* renamed from: a */
    private final Context f80398a;

    public C30541ib(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f80398a = context;
    }

    /* renamed from: a */
    public final void m33322a(@Nullable String str) {
        if (str != null) {
            C30616jb c30616jb = new C30616jb(this.f80398a);
            Context context = this.f80398a;
            new C30373gb(new C30453hb(c30616jb, context, new C30303fb(context, c30616jb), new C30080cb()).m33586a(), c30616jb).m33893a(str);
        }
    }
}
