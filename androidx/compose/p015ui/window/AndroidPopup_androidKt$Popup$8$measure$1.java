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
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$measure$1 */
/* loaded from: classes.dex */
final class AndroidPopup_androidKt$Popup$8$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public static final AndroidPopup_androidKt$Popup$8$measure$1 INSTANCE = new AndroidPopup_androidKt$Popup$8$measure$1();

    AndroidPopup_androidKt$Popup$8$measure$1() {
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
