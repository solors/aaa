package com.moloco.sdk.internal.android_context;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.android_context.b */
/* loaded from: classes7.dex */
public final class C23936b {
    @NotNull
    /* renamed from: a */
    public static final Context m47316a(@Nullable Context context) {
        if (context != null) {
            C23935a.f61957a.m47317b(context);
        }
        return C23935a.f61957a.m47318a();
    }

    /* renamed from: b */
    public static /* synthetic */ Context m47315b(Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        return m47316a(context);
    }
}
