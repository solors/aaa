package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.InspectableValueKt */
/* loaded from: classes.dex */
public final class InspectableValueKt {
    @NotNull
    private static final Function1<InspectorInfo, Unit> NoInspectorInfo = InspectableValueKt$NoInspectorInfo$1.INSTANCE;
    private static boolean isDebugInspectorInfoEnabled;

    @NotNull
    public static final Function1<InspectorInfo, Unit> debugInspectorInfo(@NotNull Function1<? super InspectorInfo, Unit> definitions) {
        Intrinsics.checkNotNullParameter(definitions, "definitions");
        if (isDebugInspectorInfoEnabled()) {
            return new InspectableValueKt$debugInspectorInfo$1(definitions);
        }
        return getNoInspectorInfo();
    }

    @NotNull
    public static final Function1<InspectorInfo, Unit> getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    @NotNull
    public static final Modifier inspectable(@NotNull Modifier modifier, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo, @NotNull Function1<? super Modifier, ? extends Modifier> factory) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return inspectableWrapper(modifier, inspectorInfo, factory.invoke(Modifier.Companion));
    }

    @NotNull
    public static final Modifier inspectableWrapper(@NotNull Modifier modifier, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo, @NotNull Modifier wrapped) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        InspectableModifier inspectableModifier = new InspectableModifier(inspectorInfo);
        return modifier.then(inspectableModifier).then(wrapped).then(inspectableModifier.getEnd());
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z) {
        isDebugInspectorInfoEnabled = z;
    }
}
