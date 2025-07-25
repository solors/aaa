package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: LongPressTextDragObserver.kt */
@Metadata
/* loaded from: classes.dex */
final class LongPressTextDragObserverKt$detectDragGesturesWithObserver$4 extends Lambda implements Functions<Unit> {
    final /* synthetic */ TextDragObserver $observer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDragGesturesWithObserver$4(TextDragObserver textDragObserver) {
        super(0);
        this.$observer = textDragObserver;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$observer.onCancel();
    }
}
