package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC31400sw;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class mb2 extends Lambda implements Function1<String, Unit> {

    /* renamed from: b */
    final /* synthetic */ nb2 f82115b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb2(nb2 nb2Var) {
        super(1);
        this.f82115b = nb2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        Function1 function1;
        String id2 = str;
        Intrinsics.checkNotNullParameter(id2, "id");
        function1 = this.f82115b.f82663a;
        function1.invoke(new InterfaceC31400sw.C31402b(id2));
        return Unit.f99208a;
    }
}
