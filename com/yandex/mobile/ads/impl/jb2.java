package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC31846xw;
import com.yandex.mobile.ads.impl.InterfaceC31400sw;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class jb2 extends Lambda implements Function1<AbstractC31846xw.C31854g, Unit> {

    /* renamed from: b */
    final /* synthetic */ nb2 f80861b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb2(nb2 nb2Var) {
        super(1);
        this.f80861b = nb2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC31846xw.C31854g c31854g) {
        Function1 function1;
        AbstractC31846xw.C31854g uiUnit = c31854g;
        Intrinsics.checkNotNullParameter(uiUnit, "uiUnit");
        function1 = this.f80861b.f82663a;
        function1.invoke(new InterfaceC31400sw.C31406f(uiUnit));
        return Unit.f99208a;
    }
}
