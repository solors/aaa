package com.mobilefuse.sdk.service;

import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.p543rx.Flow;
import com.mobilefuse.sdk.p543rx.FlowCollector;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Flow.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MobileFuseServices$initServices$1$$special$$inlined$runOn$1 extends Lambda implements Function1<FlowCollector<? super Set<? extends MobileFuseService>>, Unit> {
    final /* synthetic */ Schedulers $scheduler$inlined;
    final /* synthetic */ Flow $this_transformForConcurrency;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFuseServices$initServices$1$$special$$inlined$runOn$1(Flow flow, Schedulers schedulers) {
        super(1);
        this.$this_transformForConcurrency = flow;
        this.$scheduler$inlined = schedulers;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Set<? extends MobileFuseService>> flowCollector) {
        invoke2(flowCollector);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull final FlowCollector<? super Set<? extends MobileFuseService>> flow) {
        Intrinsics.checkNotNullParameter(flow, "$this$flow");
        this.$this_transformForConcurrency.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$$inlined$runOn$1.1

            /* compiled from: Flow.kt */
            @Metadata
            /* renamed from: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$$inlined$runOn$1$1$1 */
            /* loaded from: classes7.dex */
            public static final class C236881 extends Lambda implements Functions<Unit> {
                final /* synthetic */ FlowCollector $this_transformForConcurrency;
                final /* synthetic */ Either $value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C236881(FlowCollector flowCollector, Either either) {
                    super(0);
                    this.$this_transformForConcurrency = flowCollector;
                    this.$value = either;
                }

                @Override // kotlin.jvm.functions.Functions
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f99208a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$this_transformForConcurrency.emit(this.$value);
                }
            }

            @Override // com.mobilefuse.sdk.p543rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                SchedulersKt.runOnScheduler(MobileFuseServices$initServices$1$$special$$inlined$runOn$1.this.$scheduler$inlined, new C236881(flow, value));
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
