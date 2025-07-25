package com.moloco.sdk.internal.android_context;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"StaticFieldLeak"})
/* renamed from: com.moloco.sdk.internal.android_context.a */
/* loaded from: classes7.dex */
public final class C23935a {
    @NotNull

    /* renamed from: a */
    public static final C23935a f61957a = new C23935a();

    /* renamed from: b */
    public static volatile Context f61958b;

    @NotNull
    /* renamed from: a */
    public final Context m47318a() {
        Context context = f61958b;
        if (context != null) {
            return context;
        }
        Intrinsics.m17056y("value");
        return null;
    }

    /* renamed from: b */
    public final void m47317b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        f61958b = applicationContext;
    }
}
