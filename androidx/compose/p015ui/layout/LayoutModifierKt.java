package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;

/* compiled from: LayoutModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.LayoutModifierKt */
/* loaded from: classes.dex */
public final class LayoutModifierKt {
    @NotNull
    public static final Modifier layout(@NotNull Modifier modifier, @NotNull InterfaceC45268n<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measure) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(measure, "measure");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new LayoutModifierKt$layout$$inlined$debugInspectorInfo$1(measure);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new LayoutModifierImpl(measure, noInspectorInfo));
    }
}
