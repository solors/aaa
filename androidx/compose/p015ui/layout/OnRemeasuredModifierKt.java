package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: OnRemeasuredModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.OnRemeasuredModifierKt */
/* loaded from: classes.dex */
public final class OnRemeasuredModifierKt {
    @Stable
    @NotNull
    public static final Modifier onSizeChanged(@NotNull Modifier modifier, @NotNull Function1<? super IntSize, Unit> onSizeChanged) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onSizeChanged, "onSizeChanged");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new C0922x4cc3abe0(onSizeChanged);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new OnSizeChangedModifier(onSizeChanged, noInspectorInfo));
    }
}
