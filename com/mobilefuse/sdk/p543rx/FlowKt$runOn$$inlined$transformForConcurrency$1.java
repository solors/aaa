package com.mobilefuse.sdk.p543rx;

import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.p543rx.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Flow.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.rx.FlowKt$runOn$$inlined$transformForConcurrency$1 */
/* loaded from: classes7.dex */
public final class FlowKt$runOn$$inlined$transformForConcurrency$1<T> extends Lambda implements Function1<FlowCollector<? super T>, Unit> {
    final /* synthetic */ Schedulers $scheduler$inlined;
    final /* synthetic */ Flow $this_transformForConcurrency;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt$runOn$$inlined$transformForConcurrency$1(Flow flow, Schedulers schedulers) {
        super(1);
        this.$this_transformForConcurrency = flow;
        this.$scheduler$inlined = schedulers;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((FlowCollector) ((FlowCollector) obj));
        return Unit.f99208a;
    }

    public final void invoke(@NotNull final FlowCollector<? super T> flow) {
        Intrinsics.checkNotNullParameter(flow, "$this$flow");
        this.$this_transformForConcurrency.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt$runOn$$inlined$transformForConcurrency$1.1
            @Override // com.mobilefuse.sdk.p543rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                SchedulersKt.runOnScheduler(FlowKt$runOn$$inlined$transformForConcurrency$1.this.$scheduler$inlined, new FlowKt$runOn$$inlined$transformForConcurrency$1$1$lambda$1(flow, value));
            }

            @Override // com.mobilefuse.sdk.p543rx.FlowCollector
            public void emitError(@NotNull Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                FlowCollector.DefaultImpls.emitError(this, error);
            }

            @Override // com.mobilefuse.sdk.p543rx.FlowCollector
            public void emitSuccess(T t) {
                FlowCollector.DefaultImpls.emitSuccess(this, t);
            }
        });
    }
}
