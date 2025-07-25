package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.C37856h;
import kotlinx.serialization.json.C37873t;

/* renamed from: com.yandex.mobile.ads.impl.o6 */
/* loaded from: classes8.dex */
final class C31019o6 extends Lambda implements Function1<C37873t, Unit> {

    /* renamed from: b */
    final /* synthetic */ Map.Entry<String, C31553u6> f83341b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31019o6(Map.Entry<String, C31553u6> entry) {
        super(1);
        this.f83341b = entry;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C37873t c37873t) {
        C37873t putJsonObject = c37873t;
        Intrinsics.checkNotNullParameter(putJsonObject, "$this$putJsonObject");
        C37856h.m15920c(putJsonObject, "usagePercent", Integer.valueOf(this.f83341b.getValue().m28875b()));
        C37856h.m15921b(putJsonObject, "disabled", Boolean.valueOf(this.f83341b.getValue().m28876a()));
        return Unit.f99208a;
    }
}
