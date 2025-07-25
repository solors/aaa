package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class f92 {
    @NotNull

    /* renamed from: c */
    public static final C30301a f79017c = new C30301a(0);
    @Nullable

    /* renamed from: d */
    private static volatile f92 f79018d;

    /* renamed from: a */
    private final Context f79019a;
    @NotNull

    /* renamed from: b */
    private final am1 f79020b;

    /* renamed from: com.yandex.mobile.ads.impl.f92$a */
    /* loaded from: classes8.dex */
    public static final class C30301a {
        private C30301a() {
        }

        @NotNull
        /* renamed from: a */
        public final f92 m34188a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            f92 f92Var = f92.f79018d;
            if (f92Var == null) {
                synchronized (this) {
                    f92Var = f92.f79018d;
                    if (f92Var == null) {
                        f92Var = new f92(context, 0);
                        f92.f79018d = f92Var;
                    }
                }
            }
            return f92Var;
        }

        public /* synthetic */ C30301a(int i) {
            this();
        }
    }

    private f92(Context context) {
        Context appContext = context.getApplicationContext();
        this.f79019a = appContext;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        this.f79020b = jf2.m32933a(appContext, 4);
    }

    /* renamed from: a */
    public final void m34189a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Context context = this.f79019a;
        Intrinsics.checkNotNullExpressionValue(context, "appContext");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f79020b.m35826a(new ld1(context, url, new ed2()));
    }

    public /* synthetic */ f92(Context context, int i) {
        this(context);
    }
}
