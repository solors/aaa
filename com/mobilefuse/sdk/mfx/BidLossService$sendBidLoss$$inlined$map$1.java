package com.mobilefuse.sdk.mfx;

import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.p543rx.Flow;
import com.mobilefuse.sdk.p543rx.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* compiled from: Flow.kt */
@Metadata
/* loaded from: classes7.dex */
public final class BidLossService$sendBidLoss$$inlined$map$1 extends Lambda implements Function1<FlowCollector<? super String>, Unit> {
    final /* synthetic */ float $price$inlined;
    final /* synthetic */ Flow $this_transform;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidLossService$sendBidLoss$$inlined$map$1(Flow flow, float f) {
        super(1);
        this.$this_transform = flow;
        this.$price$inlined = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super String> flowCollector) {
        invoke2(flowCollector);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull final FlowCollector<? super String> flow) {
        Intrinsics.checkNotNullParameter(flow, "$this$flow");
        this.$this_transform.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.mfx.BidLossService$sendBidLoss$$inlined$map$1.1
            @Override // com.mobilefuse.sdk.p543rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                String m16628I;
                Intrinsics.checkNotNullParameter(value, "value");
                if (value instanceof SuccessResult) {
                    FlowCollector flowCollector = flow;
                    try {
                        m16628I = StringsJVM.m16628I((String) ((SuccessResult) value).getValue(), "${AUCTION_PRICE}", String.valueOf(BidLossService$sendBidLoss$$inlined$map$1.this.$price$inlined), false, 4, null);
                        flowCollector.emit(new SuccessResult(m16628I));
                    } catch (Throwable th) {
                        flowCollector.emit(new ErrorResult(th));
                    }
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
