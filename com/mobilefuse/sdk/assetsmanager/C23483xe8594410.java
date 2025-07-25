package com.mobilefuse.sdk.assetsmanager;

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

/* compiled from: Flow.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$resolveAssetPath$$inlined$catchElse$1 */
/* loaded from: classes7.dex */
public final class C23483xe8594410 extends Lambda implements Function1<FlowCollector<? super Boolean>, Unit> {
    final /* synthetic */ Flow $this_transformForConcurrency;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23483xe8594410(Flow flow) {
        super(1);
        this.$this_transformForConcurrency = flow;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Boolean> flowCollector) {
        invoke2(flowCollector);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull final FlowCollector<? super Boolean> flow) {
        Intrinsics.checkNotNullParameter(flow, "$this$flow");
        this.$this_transformForConcurrency.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$resolveAssetPath$$inlined$catchElse$1.1
            @Override // com.mobilefuse.sdk.p543rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FlowCollector flowCollector = flow;
                if (value instanceof ErrorResult) {
                    Throwable th = (Throwable) ((ErrorResult) value).getValue();
                    flowCollector.emit(new SuccessResult(Boolean.FALSE));
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
