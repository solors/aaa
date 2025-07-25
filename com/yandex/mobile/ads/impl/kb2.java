package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC31400sw;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class kb2 extends Lambda implements Function1<String, Unit> {

    /* renamed from: b */
    final /* synthetic */ nb2 f81373b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb2(nb2 nb2Var) {
        super(1);
        this.f81373b = nb2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        Function1 function1;
        String message = str;
        Intrinsics.checkNotNullParameter(message, "message");
        function1 = this.f81373b.f82663a;
        function1.invoke(new InterfaceC31400sw.C31408h(message));
        return Unit.f99208a;
    }
}
