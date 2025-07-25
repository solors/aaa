package androidx.compose.foundation.text;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: LongPressTextDragObserver.kt */
@Metadata
/* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$5 */
/* loaded from: classes.dex */
final class C0609x131dfa76 extends Lambda implements Function2<PointerInputChange, Offset, Unit> {
    final /* synthetic */ TextDragObserver $observer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0609x131dfa76(TextDragObserver textDragObserver) {
        super(2);
        this.$observer = textDragObserver;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(PointerInputChange pointerInputChange, Offset offset) {
        m106604invokeUv8p0NA(pointerInputChange, offset.m107301unboximpl());
        return Unit.f99208a;
    }

    /* renamed from: invoke-Uv8p0NA  reason: not valid java name */
    public final void m106604invokeUv8p0NA(@NotNull PointerInputChange pointerInputChange, long j) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<anonymous parameter 0>");
        this.$observer.mo106633onDragk4lQ0M(j);
    }
}
