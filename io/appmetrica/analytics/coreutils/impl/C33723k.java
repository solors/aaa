package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.k */
/* loaded from: classes9.dex */
public final class C33723k extends Lambda implements Functions {

    /* renamed from: a */
    public final /* synthetic */ UtilityServiceProvider f92405a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33723k(UtilityServiceProvider utilityServiceProvider) {
        super(0);
        this.f92405a = utilityServiceProvider;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        return new FirstExecutionConditionServiceImpl(this.f92405a);
    }
}
