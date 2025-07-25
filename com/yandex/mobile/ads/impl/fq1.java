package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class fq1 extends Lambda implements Function1<zi1, CharSequence> {

    /* renamed from: b */
    public static final fq1 f79282b = new fq1();

    fq1() {
        super(1);
    }

    @NotNull
    /* renamed from: a */
    public static String m34098a(@NotNull zi1 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String key = it.getKey();
        String value = it.getValue();
        return key + "=" + value;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ CharSequence invoke(zi1 zi1Var) {
        return m34098a(zi1Var);
    }
}
