package com.mobilefuse.sdk.identity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EidRefreshMonitor.kt */
@Metadata
/* loaded from: classes7.dex */
public final /* synthetic */ class EidRefreshMonitor$start$1 extends FunctionReferenceImpl implements Functions<Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public EidRefreshMonitor$start$1(EidRefreshMonitor eidRefreshMonitor) {
        super(0, eidRefreshMonitor, EidRefreshMonitor.class, "onTaskRunnerComplete", "onTaskRunnerComplete()V", 0);
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EidRefreshMonitor) this.receiver).onTaskRunnerComplete();
    }
}
