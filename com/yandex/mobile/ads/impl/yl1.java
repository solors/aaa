package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.am1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class yl1 {
    @NotNull

    /* renamed from: a */
    private static final Object f88256a = new Object();
    @Nullable

    /* renamed from: b */
    private static volatile yl1 f88257b;

    /* renamed from: c */
    public static final /* synthetic */ int f88258c = 0;

    /* renamed from: com.yandex.mobile.ads.impl.yl1$a */
    /* loaded from: classes8.dex */
    public static final class C31906a {
        @NotNull
        /* renamed from: a */
        public static yl1 m26857a() {
            yl1 yl1Var;
            yl1 yl1Var2 = yl1.f88257b;
            if (yl1Var2 == null) {
                synchronized (yl1.f88256a) {
                    yl1Var = yl1.f88257b;
                    if (yl1Var == null) {
                        yl1Var = new yl1();
                        yl1.f88257b = yl1Var;
                    }
                }
                return yl1Var;
            }
            return yl1Var2;
        }
    }

    /* renamed from: a */
    public static void m26862a(@NotNull Context context, @NotNull final Object tag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        m91.m32067a(context).m35827a(new am1.InterfaceC29949b() { // from class: com.yandex.mobile.ads.impl.f13
            @Override // com.yandex.mobile.ads.impl.am1.InterfaceC29949b
            /* renamed from: a */
            public final boolean mo34387a(ml1 ml1Var) {
                boolean m26860a;
                m26860a = yl1.m26860a(tag, ml1Var);
                return m26860a;
            }
        });
    }

    /* renamed from: a */
    public static final boolean m26860a(Object tag, ml1 ml1Var) {
        Intrinsics.checkNotNullParameter(tag, "$tag");
        return Intrinsics.m17075f(tag, ml1Var.m31946i());
    }
}
