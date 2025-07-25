package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public interface zs1 {
    @NotNull

    /* renamed from: a */
    public static final C32014a f89088a = C32014a.f89089a;

    /* renamed from: com.yandex.mobile.ads.impl.zs1$a */
    /* loaded from: classes8.dex */
    public static final class C32014a {

        /* renamed from: a */
        static final /* synthetic */ C32014a f89089a = new C32014a();
        @NotNull

        /* renamed from: b */
        private static final Object f89090b = new Object();
        @Nullable

        /* renamed from: c */
        private static volatile zs1 f89091c;

        private C32014a() {
        }

        @NotNull
        /* renamed from: a */
        public static zs1 m26005a(@NotNull Context context) {
            zs1 zs1Var;
            Intrinsics.checkNotNullParameter(context, "context");
            zs1 zs1Var2 = f89091c;
            if (zs1Var2 == null) {
                synchronized (f89090b) {
                    zs1Var = f89091c;
                    if (zs1Var == null) {
                        int i = up0.f86348b;
                        Intrinsics.checkNotNullParameter(context, "context");
                        zs1Var = new at1(up0.m28713a(context, "YadPreferenceFile"));
                        f89091c = zs1Var;
                    }
                }
                return zs1Var;
            }
            return zs1Var2;
        }
    }

    @Nullable
    /* renamed from: a */
    String mo26007a();

    /* renamed from: a */
    void mo26006a(@Nullable String str);
}
