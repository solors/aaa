package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.x */
/* loaded from: classes9.dex */
public final class C34999x extends Lambda implements Function1 {

    /* renamed from: a */
    public final /* synthetic */ C34895t f95578a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34999x(C34895t c34895t) {
        super(1);
        this.f95578a = c34895t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f95578a.f95358f = (byte[]) obj;
        return Unit.f99208a;
    }
}
