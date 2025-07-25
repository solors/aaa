package androidx.compose.p015ui;

import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ZIndexModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.ZIndexModifierKt */
/* loaded from: classes.dex */
public final class ZIndexModifierKt {
    @Stable
    @NotNull
    public static final Modifier zIndex(@NotNull Modifier modifier, float f) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ZIndexModifierKt$zIndex$$inlined$debugInspectorInfo$1(f);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new ZIndexModifier(f, noInspectorInfo));
    }
}
