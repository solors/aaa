package androidx.compose.p015ui.window;

import androidx.compose.p015ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidPopup.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$3 */
/* loaded from: classes.dex */
public final class AndroidPopup_androidKt$SimpleStack$1$measure$3 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ List<Placeable> $placeables;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidPopup_androidKt$SimpleStack$1$measure$3(List<? extends Placeable> list) {
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
        int m17164o;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        m17164o = C37563v.m17164o(this.$placeables);
        if (m17164o < 0) {
            return;
        }
        int i = 0;
        while (true) {
            Placeable.PlacementScope.placeRelative$default(layout, this.$placeables.get(i), 0, 0, 0.0f, 4, null);
            if (i == m17164o) {
                return;
            }
            i++;
        }
    }
}
