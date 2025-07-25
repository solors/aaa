package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
@Metadata
/* loaded from: classes.dex */
public final class ContentInViewModifier$modifier$1 extends Lambda implements Function1<LayoutCoordinates, Unit> {
    final /* synthetic */ Scrollable this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewModifier$modifier$1(Scrollable scrollable) {
        super(1);
        this.this$0 = scrollable;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable LayoutCoordinates layoutCoordinates) {
        this.this$0.focusedChild = layoutCoordinates;
    }
}
