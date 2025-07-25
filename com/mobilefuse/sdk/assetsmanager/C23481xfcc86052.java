package com.mobilefuse.sdk.assetsmanager;

import com.mobilefuse.sdk.exception.BaseError;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: Flow.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$mapEitherSuccessResult$$inlined$transform$1 */
/* loaded from: classes7.dex */
public final class C23481xfcc86052<R> extends Lambda implements Function1<FlowCollector<? super Either<? extends BaseError, ? extends R>>, Unit> {
    final /* synthetic */ Flow $this_transform;
    final /* synthetic */ Function1 $transform$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23481xfcc86052(Flow flow, Function1 function1) {
        super(1);
        this.$this_transform = flow;
        this.$transform$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((FlowCollector) ((FlowCollector) obj));
        return Unit.f99208a;
    }

    public final void invoke(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends R>> flow) {
        Intrinsics.checkNotNullParameter(flow, "$this$flow");
        this.$this_transform.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$mapEitherSuccessResult$$inlined$transform$1.1
            @Override // com.mobilefuse.sdk.p543rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (value instanceof SuccessResult) {
                    FlowCollector flowCollector = flow;
                    Either either = (Either) ((SuccessResult) value).getValue();
                    try {
                        if (either instanceof ErrorResult) {
                            flowCollector.emit(new SuccessResult(either));
                        } else if (either instanceof SuccessResult) {
                            flowCollector.emit(new SuccessResult(C23481xfcc86052.this.$transform$inlined.invoke(((SuccessResult) either).getValue())));
                        }
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
