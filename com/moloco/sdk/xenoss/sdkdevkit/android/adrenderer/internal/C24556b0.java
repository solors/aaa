package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b0 */
/* loaded from: classes7.dex */
public final class C24556b0 implements InterfaceC24544a0 {
    @NotNull

    /* renamed from: a */
    public final Context f63357a;

    public C24556b0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f63357a = context;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC24544a0
    /* renamed from: a */
    public boolean mo46151a(@NotNull String uri) {
        boolean m46133b;
        Intrinsics.checkNotNullParameter(uri, "uri");
        m46133b = C24566c0.m46133b(this.f63357a, uri);
        return m46133b;
    }
}
