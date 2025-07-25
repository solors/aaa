package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LayoutId.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.LayoutIdKt */
/* loaded from: classes.dex */
public final class LayoutIdKt {
    @Nullable
    public static final Object getLayoutId(@NotNull Measurable measurable) {
        LayoutIdParentData layoutIdParentData;
        Intrinsics.checkNotNullParameter(measurable, "<this>");
        Object parentData = measurable.getParentData();
        if (parentData instanceof LayoutIdParentData) {
            layoutIdParentData = (LayoutIdParentData) parentData;
        } else {
            layoutIdParentData = null;
        }
        if (layoutIdParentData == null) {
            return null;
        }
        return layoutIdParentData.getLayoutId();
    }

    @Stable
    @NotNull
    public static final Modifier layoutId(@NotNull Modifier modifier, @NotNull Object layoutId) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(layoutId, "layoutId");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new LayoutIdKt$layoutId$$inlined$debugInspectorInfo$1(layoutId);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new LayoutId(layoutId, noInspectorInfo));
    }
}
