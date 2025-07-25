package androidx.compose.p015ui.window;

import androidx.compose.p015ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidPopup.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$2 */
/* loaded from: classes.dex */
public final class AndroidPopup_androidKt$SimpleStack$1$measure$2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: $p */
    final /* synthetic */ Placeable f515$p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$SimpleStack$1$measure$2(Placeable placeable) {
        super(1);
        this.f515$p = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, this.f515$p, 0, 0, 0.0f, 4, null);
    }
}
