package androidx.compose.p015ui.window;

import androidx.compose.p015ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidDialog.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$measure$1 */
/* loaded from: classes.dex */
final class AndroidDialog_androidKt$DialogLayout$1$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ List<Placeable> $placeables;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidDialog_androidKt$DialogLayout$1$measure$1(List<? extends Placeable> list) {
        super(1);
        this.$placeables = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        List<Placeable> list = this.$placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Placeable.PlacementScope.placeRelative$default(layout, list.get(i), 0, 0, 0.0f, 4, null);
        }
    }
}
