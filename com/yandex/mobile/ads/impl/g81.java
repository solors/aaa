package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class g81 extends Lambda implements Function1<z01, Set<? extends eu0>> {

    /* renamed from: b */
    final /* synthetic */ d81 f79571b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g81(d81 d81Var) {
        super(1);
        this.f79571b = d81Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Set<? extends eu0> invoke(z01 z01Var) {
        gu0 gu0Var;
        z01 it = z01Var;
        Intrinsics.checkNotNullParameter(it, "it");
        gu0Var = this.f79571b.f77999a;
        gu0Var.getClass();
        return gu0.m33773a(it);
    }
}
