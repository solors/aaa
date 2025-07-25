package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.Vc */
/* loaded from: classes9.dex */
public final class C34278Vc extends Lambda implements Function1 {

    /* renamed from: a */
    public final /* synthetic */ C34424bb f93600a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34278Vc(C34424bb c34424bb) {
        super(1);
        this.f93600a = c34424bb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C33991Jc) ((Map.Entry) obj).getValue()).f93063b.parse(this.f93600a);
    }
}
