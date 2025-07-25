package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: OnPlacedModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.OnPlacedModifierKt */
/* loaded from: classes.dex */
public final class OnPlacedModifierKt {
    @Stable
    @NotNull
    public static final Modifier onPlaced(@NotNull Modifier modifier, @NotNull Function1<? super LayoutCoordinates, Unit> onPlaced) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onPlaced, "onPlaced");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new OnPlacedModifierKt$onPlaced$$inlined$debugInspectorInfo$1(onPlaced);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new OnPlacedModifierImpl(onPlaced, noInspectorInfo));
    }
}
