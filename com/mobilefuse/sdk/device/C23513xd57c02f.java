package com.mobilefuse.sdk.device;

import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.p543rx.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: Flow.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.device.UserAgentInfo$runOn$$inlined$transformForConcurrency$1$1$lambda$1 */
/* loaded from: classes7.dex */
public final class C23513xd57c02f extends Lambda implements Functions<Unit> {
    final /* synthetic */ FlowCollector $this_transformForConcurrency;
    final /* synthetic */ Either $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23513xd57c02f(FlowCollector flowCollector, Either either) {
        super(0);
        this.$this_transformForConcurrency = flowCollector;
        this.$value = either;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$this_transformForConcurrency.emit(this.$value);
    }
}
