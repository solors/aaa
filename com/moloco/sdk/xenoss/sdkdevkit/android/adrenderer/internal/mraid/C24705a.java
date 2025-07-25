package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a */
/* loaded from: classes7.dex */
public final class C24705a {
    @NotNull

    /* renamed from: a */
    public static final C24705a f63784a = new C24705a();

    /* renamed from: a */
    public final float m45891a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: b */
    public final float m45890b(float f, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f / m45891a(context);
    }

    /* renamed from: c */
    public final int m45889c(float f, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (m45890b(f, context) + 0.5f);
    }
}
