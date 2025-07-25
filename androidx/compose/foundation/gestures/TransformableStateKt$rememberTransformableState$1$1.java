package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;
import p1076zd.InterfaceC45268n;

/* compiled from: TransformableState.kt */
@Metadata
/* loaded from: classes.dex */
final class TransformableStateKt$rememberTransformableState$1$1 extends Lambda implements InterfaceC45268n<Float, Offset, Float, Unit> {
    final /* synthetic */ State<InterfaceC45268n<Float, Offset, Float, Unit>> $lambdaState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransformableStateKt$rememberTransformableState$1$1(State<? extends InterfaceC45268n<? super Float, ? super Offset, ? super Float, Unit>> state) {
        super(3);
        this.$lambdaState = state;
    }

    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ Unit invoke(Float f, Offset offset, Float f2) {
        m106238invoked4ec7I(f.floatValue(), offset.m107301unboximpl(), f2.floatValue());
        return Unit.f99208a;
    }

    /* renamed from: invoke-d-4ec7I  reason: not valid java name */
    public final void m106238invoked4ec7I(float f, long j, float f2) {
        this.$lambdaState.getValue().invoke(Float.valueOf(f), Offset.m107280boximpl(j), Float.valueOf(f2));
    }
}
