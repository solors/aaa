package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
@Metadata
/* loaded from: classes.dex */
public final class ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1 extends Lambda implements Function1<Offset, Offset> {
    final /* synthetic */ ScrollScope $$this$scroll;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1(ScrollingLogic scrollingLogic, ScrollScope scrollScope) {
        super(1);
        this.this$0 = scrollingLogic;
        this.$$this$scroll = scrollScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Offset invoke(Offset offset) {
        return Offset.m107280boximpl(m106230invokeMKHz9U(offset.m107301unboximpl()));
    }

    /* renamed from: invoke-MK-Hz9U  reason: not valid java name */
    public final long m106230invokeMKHz9U(long j) {
        ScrollingLogic scrollingLogic = this.this$0;
        return Offset.m107295minusMKHz9U(j, this.this$0.m106224reverseIfNeededMKHz9U(scrollingLogic.m106221dispatchScrollf0eR0lY(this.$$this$scroll, scrollingLogic.m106224reverseIfNeededMKHz9U(j), null, NestedScrollSource.Companion.m108795getFlingWNlRxjI())));
    }
}
