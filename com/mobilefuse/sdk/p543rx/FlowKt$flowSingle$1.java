package com.mobilefuse.sdk.p543rx;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Flow.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.rx.FlowKt$flowSingle$1 */
/* loaded from: classes7.dex */
public final class FlowKt$flowSingle$1<T> extends Lambda implements Function1<FlowCollector<? super T>, Unit> {
    final /* synthetic */ Object $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt$flowSingle$1(Object obj) {
        super(1);
        this.$value = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((FlowCollector) ((FlowCollector) obj));
        return Unit.f99208a;
    }

    public final void invoke(@NotNull FlowCollector<? super T> receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        FlowKt.emit(receiver, this.$value);
    }
}
