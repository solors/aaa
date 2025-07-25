package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.cp */
/* loaded from: classes8.dex */
public interface InterfaceC30107cp {
    @NotNull

    /* renamed from: a */
    public static final C30108a f77696a = C30108a.f77697a;

    /* renamed from: com.yandex.mobile.ads.impl.cp$a */
    /* loaded from: classes8.dex */
    public static final class C30108a {
        @Nullable

        /* renamed from: b */
        private static volatile C30262ep f77698b;

        /* renamed from: a */
        static final /* synthetic */ C30108a f77697a = new C30108a();
        @NotNull

        /* renamed from: c */
        private static final Object f77699c = new Object();

        private C30108a() {
        }

        @NotNull
        /* renamed from: a */
        public static InterfaceC30107cp m35208a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (f77698b == null) {
                synchronized (f77699c) {
                    if (f77698b == null) {
                        f77698b = C30183dp.m34876a(context);
                    }
                    Unit unit = Unit.f99208a;
                }
            }
            C30262ep c30262ep = f77698b;
            if (c30262ep != null) {
                return c30262ep;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Nullable
    /* renamed from: a */
    String mo34480a();

    @Nullable
    /* renamed from: b */
    String mo34477b();

    @Nullable
    /* renamed from: c */
    String mo34476c();
}
