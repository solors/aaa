package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.A */
/* loaded from: classes9.dex */
public final class C33755A extends Lambda implements Function1 {

    /* renamed from: a */
    public final /* synthetic */ C34895t f92541a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33755A(C34895t c34895t) {
        super(1);
        this.f92541a = c34895t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f92541a.f95355c = (byte[]) obj;
        return Unit.f99208a;
    }
}
