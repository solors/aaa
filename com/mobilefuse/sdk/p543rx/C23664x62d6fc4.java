package com.mobilefuse.sdk.p543rx;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: AdvertisingIdFlow.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.rx.AdvertisingIdFlowKt$waitForAdvertisingId$$inlined$transform$1$1$lambda$1 */
/* loaded from: classes7.dex */
final class C23664x62d6fc4 extends Lambda implements Functions<Unit> {
    final /* synthetic */ FlowCollector $this_transform;
    final /* synthetic */ Object $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23664x62d6fc4(FlowCollector flowCollector, Object obj) {
        super(0);
        this.$this_transform = flowCollector;
        this.$value = obj;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FlowKt.emit(this.$this_transform, this.$value);
    }
}
