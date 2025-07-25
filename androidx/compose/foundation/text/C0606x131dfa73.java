package androidx.compose.foundation.text;

import androidx.compose.p015ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: LongPressTextDragObserver.kt */
@Metadata
/* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$2 */
/* loaded from: classes.dex */
final class C0606x131dfa73 extends Lambda implements Function1<Offset, Unit> {
    final /* synthetic */ TextDragObserver $observer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0606x131dfa73(TextDragObserver textDragObserver) {
        super(1);
        this.$observer = textDragObserver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
        m106603invokek4lQ0M(offset.m107301unboximpl());
        return Unit.f99208a;
    }

    /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
    public final void m106603invokek4lQ0M(long j) {
        this.$observer.mo106634onStartk4lQ0M(j);
    }
}
