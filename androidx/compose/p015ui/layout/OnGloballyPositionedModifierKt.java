package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: OnGloballyPositionedModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.OnGloballyPositionedModifierKt */
/* loaded from: classes.dex */
public final class OnGloballyPositionedModifierKt {
    @Stable
    @NotNull
    public static final Modifier onGloballyPositioned(@NotNull Modifier modifier, @NotNull Function1<? super LayoutCoordinates, Unit> onGloballyPositioned) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onGloballyPositioned, "onGloballyPositioned");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new C0921x5a2de8bc(onGloballyPositioned);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new OnGloballyPositionedModifierImpl(onGloballyPositioned, noInspectorInfo));
    }
}
