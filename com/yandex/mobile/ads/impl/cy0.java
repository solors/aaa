package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.by0;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class cy0 {

    /* renamed from: com.yandex.mobile.ads.impl.cy0$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC30131a {

        /* renamed from: com.yandex.mobile.ads.impl.cy0$a$a */
        /* loaded from: classes8.dex */
        public static final class C30132a implements InterfaceC30131a {
            @NotNull

            /* renamed from: a */
            public static final C30132a f77802a = new C30132a();

            private C30132a() {
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.cy0$a$b */
        /* loaded from: classes8.dex */
        public static final class C30133b implements InterfaceC30131a {
            @NotNull

            /* renamed from: a */
            private final List<em0> f77803a;

            public C30133b(@NotNull List<em0> causes) {
                Intrinsics.checkNotNullParameter(causes, "causes");
                this.f77803a = causes;
            }

            @NotNull
            /* renamed from: a */
            public final List<em0> m35133a() {
                return this.f77803a;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C30133b) && Intrinsics.m17075f(this.f77803a, ((C30133b) obj).f77803a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f77803a.hashCode();
            }

            @NotNull
            public final String toString() {
                List<em0> list = this.f77803a;
                return "IncorrectIntegration(causes=" + list + ")";
            }
        }
    }

    @NotNull
    /* renamed from: a */
    public static InterfaceC30131a m35134a(@NotNull Context context) {
        List m17161r;
        Intrinsics.checkNotNullParameter(context, "context");
        ux0 ux0Var = new ux0();
        C30283f1 c30283f1 = new C30283f1();
        C31110pe c31110pe = new C31110pe();
        em0[] em0VarArr = new em0[4];
        em0 e = null;
        try {
            ux0Var.mo28604a(by0.C30058a.f77439b);
            e = null;
        } catch (em0 e2) {
            e = e2;
        }
        em0VarArr[0] = e;
        try {
            c30283f1.m34394a(context);
            e = null;
        } catch (em0 e3) {
            e = e3;
        }
        em0VarArr[1] = e;
        try {
            wc1.m27979a(context);
            e = null;
        } catch (em0 e4) {
            e = e4;
        }
        em0VarArr[2] = e;
        try {
            c31110pe.m30750a();
        } catch (em0 e5) {
            e = e5;
        }
        em0VarArr[3] = e;
        m17161r = C37563v.m17161r(em0VarArr);
        if (!m17161r.isEmpty()) {
            return new InterfaceC30131a.C30133b(m17161r);
        }
        return InterfaceC30131a.C30132a.f77802a;
    }
}
