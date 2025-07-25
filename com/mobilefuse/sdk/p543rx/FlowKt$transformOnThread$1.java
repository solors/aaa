package com.mobilefuse.sdk.p543rx;

import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.p543rx.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: Flow.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.rx.FlowKt$transformOnThread$1 */
/* loaded from: classes7.dex */
public final class FlowKt$transformOnThread$1<R> extends Lambda implements Function1<FlowCollector<? super R>, Unit> {
    final /* synthetic */ Schedulers $scheduler;
    final /* synthetic */ Flow $this_transformOnThread;
    final /* synthetic */ Function2 $transform;

    /* compiled from: Flow.kt */
    @Metadata
    /* renamed from: com.mobilefuse.sdk.rx.FlowKt$transformOnThread$1$1 */
    /* loaded from: classes7.dex */
    public static final class C236811 extends Lambda implements Functions<Unit> {
        final /* synthetic */ FlowCollector $this_flow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C236811(FlowCollector flowCollector) {
            super(0);
            this.$this_flow = flowCollector;
        }

        @Override // kotlin.jvm.functions.Functions
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f99208a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FlowKt$transformOnThread$1.this.$this_transformOnThread.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt.transformOnThread.1.1.1
                @Override // com.mobilefuse.sdk.p543rx.FlowCollector
                public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    C236811 c236811 = C236811.this;
                    FlowKt$transformOnThread$1.this.$transform.mo105910invoke(c236811.$this_flow, value);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt$transformOnThread$1(Flow flow, Schedulers schedulers, Function2 function2) {
        super(1);
        this.$this_transformOnThread = flow;
        this.$scheduler = schedulers;
        this.$transform = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((FlowCollector) ((FlowCollector) obj));
        return Unit.f99208a;
    }

    public final void invoke(@NotNull FlowCollector<? super R> flow) {
        Intrinsics.checkNotNullParameter(flow, "$this$flow");
        SchedulersKt.runOnScheduler(this.$scheduler, new C236811(flow));
    }
}
