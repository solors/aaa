package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.u */
/* loaded from: classes9.dex */
public final class C34921u extends Lambda implements Function1 {

    /* renamed from: a */
    public final /* synthetic */ C34895t f95428a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34921u(C34895t c34895t) {
        super(1);
        this.f95428a = c34895t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f95428a.f95357e = (byte[]) obj;
        return Unit.f99208a;
    }
}
