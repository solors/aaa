package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
final class cd1 extends Lambda implements Function1<C31792x4, Boolean> {

    /* renamed from: b */
    final /* synthetic */ Set<EnumC31868y4> f77605b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cd1(Set<? extends EnumC31868y4> set) {
        super(1);
        this.f77605b = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C31792x4 c31792x4) {
        C31792x4 it = c31792x4;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(this.f77605b.contains(it.m27670a()));
    }
}
