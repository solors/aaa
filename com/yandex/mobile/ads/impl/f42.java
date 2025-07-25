package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class f42 {
    @NotNull

    /* renamed from: c */
    private static final String f78970c = "The Yandex Mobile Ads SDK needs to be updated to the latest version. Details in the logs";
    @NotNull

    /* renamed from: a */
    private final Handler f78971a;
    @NotNull

    /* renamed from: b */
    private final Context f78972b;

    public /* synthetic */ f42(Context context) {
        this(context, new Handler(Looper.getMainLooper()));
    }

    /* renamed from: b */
    public static /* synthetic */ void m34220b(f42 f42Var) {
        m34221a(f42Var);
    }

    /* renamed from: a */
    public final void m34222a() {
        this.f78971a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.lo2
            @Override // java.lang.Runnable
            public final void run() {
                f42.m34220b(f42.this);
            }
        });
    }

    /* renamed from: a */
    public static final void m34221a(f42 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Toast.makeText(this$0.f78972b, f78970c, 1).show();
    }

    public f42(@NotNull Context context, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f78971a = handler;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f78972b = applicationContext;
    }
}
