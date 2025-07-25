package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: io.appmetrica.analytics.impl.md */
/* loaded from: classes9.dex */
public final /* synthetic */ class C34723md extends FunctionReferenceImpl implements Function1 {
    public C34723md(C34750nd c34750nd) {
        super(1, c34750nd, C34750nd.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C34750nd c34750nd = (C34750nd) this.receiver;
        c34750nd.f95005a.markCrashCompleted((String) obj);
        c34750nd.f95005a.deleteCompletedCrashes();
        return Unit.f99208a;
    }
}
