package androidx.compose.p015ui.semantics;

import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SemanticsModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.semantics.SemanticsModifierKt */
/* loaded from: classes.dex */
public final class SemanticsModifierKt {
    @NotNull
    public static final Modifier clearAndSetSemantics(@NotNull Modifier modifier, @NotNull Function1<? super SemanticsPropertyReceiver, Unit> properties) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(properties, "properties");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new C1046x10017f64(properties);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new SemanticsModifierKt$clearAndSetSemantics$2(properties));
    }

    @NotNull
    public static final Modifier semantics(@NotNull Modifier modifier, boolean z, @NotNull Function1<? super SemanticsPropertyReceiver, Unit> properties) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(properties, "properties");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SemanticsModifierKt$semantics$$inlined$debugInspectorInfo$1(z, properties);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new SemanticsModifierKt$semantics$2(z, properties));
    }

    public static /* synthetic */ Modifier semantics$default(Modifier modifier, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return semantics(modifier, z, function1);
    }
}
