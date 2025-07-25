package com.mobilefuse.sdk.p543rx;

import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.p543rx.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: Flow.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.rx.FlowKt$transform$1 */
/* loaded from: classes7.dex */
public final class FlowKt$transform$1<R> extends Lambda implements Function1<FlowCollector<? super R>, Unit> {
    final /* synthetic */ Flow $this_transform;
    final /* synthetic */ Function2 $transform;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt$transform$1(Flow flow, Function2 function2) {
        super(1);
        this.$this_transform = flow;
        this.$transform = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((FlowCollector) ((FlowCollector) obj));
        return Unit.f99208a;
    }

    public final void invoke(@NotNull final FlowCollector<? super R> flow) {
        Intrinsics.checkNotNullParameter(flow, "$this$flow");
        this.$this_transform.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt$transform$1.1
            @Override // com.mobilefuse.sdk.p543rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (value instanceof SuccessResult) {
                    FlowKt$transform$1.this.$transform.mo105910invoke(flow, ((SuccessResult) value).getValue());
                } else if (value instanceof ErrorResult) {
                    flow.emit(value);
                }
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
