package com.mobilefuse.sdk.network.client;

import com.mobilefuse.sdk.Debugging;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.p543rx.Flow;
import com.mobilefuse.sdk.p543rx.FlowCollector;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: Flow.kt */
@Metadata
/* loaded from: classes7.dex */
public final class HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1 extends Lambda implements Function1<FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>>, Unit> {
    final /* synthetic */ Map $extras$inlined;
    final /* synthetic */ String $prefix$inlined;
    final /* synthetic */ Flow $this_logHttpResponse$inlined;
    final /* synthetic */ Flow $this_run;

    /* compiled from: Flow.kt */
    @Metadata
    /* renamed from: com.mobilefuse.sdk.network.client.HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1$1 */
    /* loaded from: classes7.dex */
    public static final class C236381<T> implements FlowCollector {
        final /* synthetic */ FlowCollector $this_flow;

        public C236381(FlowCollector flowCollector) {
            this.$this_flow = flowCollector;
        }

        @Override // com.mobilefuse.sdk.p543rx.FlowCollector
        public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (value instanceof SuccessResult) {
                Either either = (Either) ((SuccessResult) value).getValue();
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    C23639x8420010c c23639x8420010c = new C23639x8420010c(sb2, either, this);
                    sb2.append("***** " + HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1.this.$prefix$inlined + " *****");
                    Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                    sb2.append('\n');
                    Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                    if (either instanceof SuccessResult) {
                        sb2.append("Status: SUCCESS");
                        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                        sb2.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                        c23639x8420010c.invoke();
                        sb2.append("Status Code: " + ((HttpResponse) ((SuccessResult) either).getValue()).getStatusCode());
                        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                        sb2.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                        sb2.append("Request Time: " + (((float) (((HttpResponse) ((SuccessResult) either).getValue()).getResponseTimestamp() - ((HttpResponse) ((SuccessResult) either).getValue()).getRequestTimestamp())) / 1000) + " seconds");
                        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                        sb2.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                        sb2.append("Body: " + ((HttpResponse) ((SuccessResult) either).getValue()).getBody());
                        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                        sb2.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                    } else if (either instanceof ErrorResult) {
                        sb2.append("Status: FAILED");
                        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                        sb2.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                        c23639x8420010c.invoke();
                        HttpError httpError = (HttpError) ((ErrorResult) either).getValue();
                        if (httpError instanceof HttpError.ConnectionError) {
                            sb2.append("Status Code: " + ((HttpError.ConnectionError) httpError).getStatusCode());
                            Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                            sb2.append('\n');
                            Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                            String formattedMessage = HttpResponsePrintLogFlow.getFormattedMessage((HttpError.ConnectionError) httpError);
                            if (formattedMessage != null) {
                                sb2.append(formattedMessage);
                                Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                                sb2.append('\n');
                                Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                            }
                        } else {
                            String message = httpError.getMessage();
                            if (message != null) {
                                sb2.append("Reason: " + message);
                                Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                                sb2.append('\n');
                                Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                                C37690r.m16567d1(sb2);
                            }
                        }
                    }
                    sb2.append("**********");
                    Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                    sb2.append('\n');
                    Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                    Flow flow = HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1.this.$this_logHttpResponse$inlined;
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
                    Debugging.logDebug$default(flow, sb3, null, 2, null);
                } catch (Throwable th) {
                    int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        StabilityHelper.logException("[Automatically caught]", th);
                    }
                }
            }
            this.$this_flow.emit(value);
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1(Flow flow, Flow flow2, Map map, String str) {
        super(1);
        this.$this_run = flow;
        this.$this_logHttpResponse$inlined = flow2;
        this.$extras$inlined = map;
        this.$prefix$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>> flowCollector) {
        invoke2(flowCollector);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>> receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        this.$this_run.collect(new C236381(receiver));
    }
}
