package com.ironsource;

import android.content.Context;
import be.MathJVM;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.na */
/* loaded from: classes6.dex */
public final class C20516na {
    @NotNull

    /* renamed from: a */
    public static final C20516na f52153a = new C20516na();

    private C20516na() {
    }

    /* renamed from: a */
    public final int m56170a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m56169a(context, context.getResources().getDisplayMetrics().heightPixels);
    }

    /* renamed from: b */
    public final int m56168b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m56169a(context, context.getResources().getDisplayMetrics().widthPixels);
    }

    /* renamed from: a */
    private final int m56169a(Context context, int i) {
        int m103791d;
        m103791d = MathJVM.m103791d(i / context.getResources().getDisplayMetrics().density);
        return m103791d;
    }
}
