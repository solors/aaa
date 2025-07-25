package com.mobilefuse.sdk.network.client;

import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.p543rx.FlowCollector;
import com.mobilefuse.sdk.p543rx.FlowKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpFlow.kt */
@Metadata
/* loaded from: classes7.dex */
final class HttpFlowKt$requestHttpGet$$inlined$transform$1$1$lambda$1 extends Lambda implements Function1<Either<? extends HttpError, ? extends HttpResponse>, Unit> {
    final /* synthetic */ FlowCollector $this_transform;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpFlowKt$requestHttpGet$$inlined$transform$1$1$lambda$1(FlowCollector flowCollector) {
        super(1);
        this.$this_transform = flowCollector;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Either<? extends HttpError, ? extends HttpResponse> either) {
        invoke2((Either<? extends HttpError, HttpResponse>) either);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Either<? extends HttpError, HttpResponse> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FlowKt.emit(this.$this_transform, it);
    }
}
