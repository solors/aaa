package com.mobilefuse.sdk.p543rx;

import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
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
/* renamed from: com.mobilefuse.sdk.rx.FlowKt$mapIf$$inlined$transform$1 */
/* loaded from: classes7.dex */
public final class FlowKt$mapIf$$inlined$transform$1<T> extends Lambda implements Function1<FlowCollector<? super T>, Unit> {
    final /* synthetic */ Function1 $condition$inlined;
    final /* synthetic */ Flow $this_transform;
    final /* synthetic */ Function1 $transform$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt$mapIf$$inlined$transform$1(Flow flow, Function1 function1, Function1 function12) {
        super(1);
        this.$this_transform = flow;
        this.$condition$inlined = function1;
        this.$transform$inlined = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((FlowCollector) ((FlowCollector) obj));
        return Unit.f99208a;
    }

    public final void invoke(@NotNull final FlowCollector<? super T> flow) {
        Intrinsics.checkNotNullParameter(flow, "$this$flow");
        this.$this_transform.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt$mapIf$$inlined$transform$1.1
            @Override // com.mobilefuse.sdk.p543rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (value instanceof SuccessResult) {
                    FlowCollector flowCollector = flow;
                    Object value2 = ((SuccessResult) value).getValue();
                    try {
                        if (((Boolean) FlowKt$mapIf$$inlined$transform$1.this.$condition$inlined.invoke(value2)).booleanValue()) {
                            flowCollector.emit(new SuccessResult(FlowKt$mapIf$$inlined$transform$1.this.$transform$inlined.invoke(value2)));
                        } else {
                            flowCollector.emit(new SuccessResult(value2));
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
