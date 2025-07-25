package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p804nd.C38508r;
import sd.C42688d;

/* compiled from: TapGestureDetector.kt */
@DebugMetadata(m17095c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", m17094f = "TapGestureDetector.kt", m17093l = {}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes.dex */
final class TapGestureDetectorKt$NoPressGesture$1 extends AbstractC37596l implements InterfaceC45268n<TapGestureDetector, Offset, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TapGestureDetectorKt$NoPressGesture$1(Continuation<? super TapGestureDetectorKt$NoPressGesture$1> continuation) {
        super(3, continuation);
    }

    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ Object invoke(TapGestureDetector tapGestureDetector, Offset offset, Continuation<? super Unit> continuation) {
        return m106231invoked4ec7I(tapGestureDetector, offset.m107301unboximpl(), continuation);
    }

    @Nullable
    /* renamed from: invoke-d-4ec7I  reason: not valid java name */
    public final Object m106231invoked4ec7I(@NotNull TapGestureDetector tapGestureDetector, long j, @Nullable Continuation<? super Unit> continuation) {
        return new TapGestureDetectorKt$NoPressGesture$1(continuation).invokeSuspend(Unit.f99208a);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C42688d.m6959e();
        if (this.label == 0) {
            C38508r.m14539b(obj);
            return Unit.f99208a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
