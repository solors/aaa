package com.mobilefuse.sdk.device;

import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.p543rx.Flow;
import com.mobilefuse.sdk.p543rx.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Flow.kt */
@Metadata
/* loaded from: classes7.dex */
public final class UserAgentInfo$catchElse$$inlined$transformForConcurrency$1<T> extends Lambda implements Function1<FlowCollector<? super T>, Unit> {
    final /* synthetic */ Flow $this_transformForConcurrency;
    final /* synthetic */ Function2 $transform$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgentInfo$catchElse$$inlined$transformForConcurrency$1(Flow flow, Function2 function2) {
        super(1);
        this.$this_transformForConcurrency = flow;
        this.$transform$inlined = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((FlowCollector) ((FlowCollector) obj));
        return Unit.f99208a;
    }

    public final void invoke(@NotNull final FlowCollector<? super T> flow) {
        Intrinsics.checkNotNullParameter(flow, "$this$flow");
        this.$this_transformForConcurrency.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.device.UserAgentInfo$catchElse$$inlined$transformForConcurrency$1.1
            @Override // com.mobilefuse.sdk.p543rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FlowCollector flowCollector = flow;
                if (value instanceof ErrorResult) {
                    flowCollector.emit(new SuccessResult(UserAgentInfo$catchElse$$inlined$transformForConcurrency$1.this.$transform$inlined.mo105910invoke(flowCollector, ((ErrorResult) value).getValue())));
                } else if (value instanceof SuccessResult) {
                    flowCollector.emit(value);
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
