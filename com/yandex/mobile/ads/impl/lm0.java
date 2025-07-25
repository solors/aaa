package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cy0;
import java.util.List;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class lm0 {
    @NotNull

    /* renamed from: a */
    private final String f81868a = "Yandex Mobile Adsintegrated incorrectly";

    /* renamed from: com.yandex.mobile.ads.impl.lm0$a */
    /* loaded from: classes8.dex */
    static final class C30797a extends Lambda implements Function1<em0, CharSequence> {

        /* renamed from: b */
        public static final C30797a f81869b = new C30797a();

        C30797a() {
            super(1);
        }

        @NotNull
        /* renamed from: a */
        public static String m32225a(@NotNull em0 cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            String message = cause.getMessage();
            return "\t·\t" + message;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ CharSequence invoke(em0 em0Var) {
            return m32225a(em0Var);
        }
    }

    @NotNull
    /* renamed from: a */
    public final String m32226a(@NotNull cy0.InterfaceC30131a.C30133b result) {
        String m17521z0;
        Intrinsics.checkNotNullParameter(result, "result");
        List<em0> m35133a = result.m35133a();
        String str = this.f81868a;
        m17521z0 = _Collections.m17521z0(m35133a, "\n", str + "\n", null, 0, null, C30797a.f81869b, 28, null);
        return m17521z0;
    }
}
