package androidx.compose.p015ui.platform;

import ge.FlowCollector;
import ge.StateFlow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.ExceptionsH;
import sd.C42688d;

/* compiled from: WindowRecomposer.android.kt */
@DebugMetadata(m17095c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", m17094f = "WindowRecomposer.android.kt", m17093l = {386}, m17092m = "invokeSuspend")
@Metadata
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 */
/* loaded from: classes.dex */
final class C0964x93d788e4 extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StateFlow<Float> $durationScaleStateFlow;
    final /* synthetic */ MotionDurationScaleImpl $it;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0964x93d788e4(StateFlow<Float> stateFlow, MotionDurationScaleImpl motionDurationScaleImpl, Continuation<? super C0964x93d788e4> continuation) {
        super(2, continuation);
        this.$durationScaleStateFlow = stateFlow;
        this.$it = motionDurationScaleImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C0964x93d788e4(this.$durationScaleStateFlow, this.$it, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        m6959e = C42688d.m6959e();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C38508r.m14539b(obj);
        } else {
            C38508r.m14539b(obj);
            StateFlow<Float> stateFlow = this.$durationScaleStateFlow;
            final MotionDurationScaleImpl motionDurationScaleImpl = this.$it;
            FlowCollector<Float> flowCollector = new FlowCollector<Float>() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1.1
                @Override // ge.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Float f, Continuation continuation) {
                    return emit(f.floatValue(), continuation);
                }

                @Nullable
                public final Object emit(float f, @NotNull Continuation<? super Unit> continuation) {
                    MotionDurationScaleImpl.this.setScaleFactor(f);
                    return Unit.f99208a;
                }
            };
            this.label = 1;
            if (stateFlow.collect(flowCollector, this) == m6959e) {
                return m6959e;
            }
        }
        throw new ExceptionsH();
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((C0964x93d788e4) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
    }
}
