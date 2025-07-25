package com.mobilefuse.sdk.p543rx;

import com.mobilefuse.sdk.exception.ErrorResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Flow.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.rx.BaseFlow */
/* loaded from: classes7.dex */
final class BaseFlow<T> implements Flow<T> {
    private final Function1<FlowCollector<? super T>, Unit> block;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseFlow(@NotNull Function1<? super FlowCollector<? super T>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.block = block;
    }

    @Override // com.mobilefuse.sdk.p543rx.Flow
    public void collect(@NotNull FlowCollector<? super T> collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        try {
            this.block.invoke(collector);
        } catch (Throwable th) {
            collector.emit(new ErrorResult(th));
        }
    }
}
