package com.mobilefuse.sdk.mfx;

import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.mobilefuse.sdk.p543rx.Flow;
import com.mobilefuse.sdk.p543rx.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Flow.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MfxService$getHttpBidRequestFlow$$inlined$catchElse$1 extends Lambda implements Function1<FlowCollector<? super Either<? extends BaseError, ? extends MfxBidResponse>>, Unit> {
    final /* synthetic */ Flow $this_transformForConcurrency;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MfxService$getHttpBidRequestFlow$$inlined$catchElse$1(Flow flow) {
        super(1);
        this.$this_transformForConcurrency = flow;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends BaseError, ? extends MfxBidResponse>> flowCollector) {
        invoke2(flowCollector);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends MfxBidResponse>> flow) {
        Intrinsics.checkNotNullParameter(flow, "$this$flow");
        this.$this_transformForConcurrency.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.mfx.MfxService$getHttpBidRequestFlow$$inlined$catchElse$1.1
            @Override // com.mobilefuse.sdk.p543rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FlowCollector flowCollector = flow;
                if (value instanceof ErrorResult) {
                    flowCollector.emit(new SuccessResult(new ErrorResult(new ProcessingError(((Throwable) ((ErrorResult) value).getValue()).getMessage()))));
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
