package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public interface ct1 {
    @NotNull

    /* renamed from: a */
    public static final C30119a f77763a = C30119a.f77764a;

    /* renamed from: com.yandex.mobile.ads.impl.ct1$a */
    /* loaded from: classes8.dex */
    public static final class C30119a {
        @Nullable

        /* renamed from: b */
        private static volatile dt1 f77765b;

        /* renamed from: a */
        static final /* synthetic */ C30119a f77764a = new C30119a();
        @NotNull

        /* renamed from: c */
        private static final Object f77766c = new Object();

        private C30119a() {
        }

        @NotNull
        /* renamed from: a */
        public static ct1 m35159a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (f77765b == null) {
                synchronized (f77766c) {
                    if (f77765b == null) {
                        int i = up0.f86348b;
                        Intrinsics.checkNotNullParameter(context, "context");
                        f77765b = new dt1(up0.m28713a(context, "YadPreferenceFile"));
                    }
                    Unit unit = Unit.f99208a;
                }
            }
            dt1 dt1Var = f77765b;
            if (dt1Var != null) {
                return dt1Var;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Nullable
    /* renamed from: a */
    String mo34849a();

    /* renamed from: a */
    void mo34848a(@Nullable String str);
}
