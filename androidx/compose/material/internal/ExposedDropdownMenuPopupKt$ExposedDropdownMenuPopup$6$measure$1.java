package androidx.compose.material.internal;

import androidx.compose.p015ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExposedDropdownMenuPopup.kt */
@Metadata
/* loaded from: classes.dex */
final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public static final ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6$measure$1 INSTANCE = new ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6$measure$1();

    ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6$measure$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.f99208a;
    }
}
