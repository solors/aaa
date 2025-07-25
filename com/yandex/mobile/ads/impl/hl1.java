package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class hl1 {
    @NotNull
    /* renamed from: a */
    public static final gl1 m33525a(@NotNull gl1 gl1Var, @Nullable gl1 gl1Var2) {
        Map m17276r;
        Intrinsics.checkNotNullParameter(gl1Var, "<this>");
        if (gl1Var2 == null) {
            return new gl1(gl1Var.m33815b(), gl1Var.m33820a());
        }
        C30280f m33820a = gl1Var.m33820a();
        if (m33820a == null) {
            m33820a = gl1Var2.m33820a();
        }
        m17276r = C37559r0.m17276r(gl1Var.m33815b(), gl1Var2.m33815b());
        return new gl1(m17276r, m33820a);
    }
}
