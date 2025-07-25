package com.mobilefuse.sdk.assetsmanager;

import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.network.client.HttpResponse;
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
/* renamed from: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$getAssetManifestJson$$inlined$mapEitherSuccessResult$1 */
/* loaded from: classes7.dex */
public final class C23476x3c9f765 extends Lambda implements Function1<FlowCollector<? super Either<? extends BaseError, ? extends MobileFuseAssetManifestResponse>>, Unit> {
    final /* synthetic */ Flow $this_transform;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23476x3c9f765(Flow flow) {
        super(1);
        this.$this_transform = flow;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends BaseError, ? extends MobileFuseAssetManifestResponse>> flowCollector) {
        invoke2(flowCollector);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends MobileFuseAssetManifestResponse>> flow) {
        Intrinsics.checkNotNullParameter(flow, "$this$flow");
        this.$this_transform.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManagerService$getAssetManifestJson$$inlined$mapEitherSuccessResult$1.1
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
                            flowCollector.emit(new SuccessResult(MobileFuseAssetManifestResponse.Companion.mapperFromJson(((HttpResponse) ((SuccessResult) either).getValue()).getBody())));
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
