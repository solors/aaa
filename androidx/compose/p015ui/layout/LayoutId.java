package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.p015ui.platform.InspectorValueInfo;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LayoutId.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.layout.LayoutId */
/* loaded from: classes.dex */
final class LayoutId extends InspectorValueInfo implements ParentDataModifier, LayoutIdParentData {
    @NotNull
    private final Object layoutId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutId(@NotNull Object layoutId, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(layoutId, "layoutId");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.layoutId = layoutId;
    }

    public boolean equals(@Nullable Object obj) {
        LayoutId layoutId;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutId) {
            layoutId = (LayoutId) obj;
        } else {
            layoutId = null;
        }
        if (layoutId == null) {
            return false;
        }
        return Intrinsics.m17075f(getLayoutId(), layoutId.getLayoutId());
    }

    @Override // androidx.compose.p015ui.layout.LayoutIdParentData
    @NotNull
    public Object getLayoutId() {
        return this.layoutId;
    }

    public int hashCode() {
        return getLayoutId().hashCode();
    }

    @Override // androidx.compose.p015ui.layout.ParentDataModifier
    @Nullable
    public Object modifyParentData(@NotNull Density density, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        return this;
    }

    @NotNull
    public String toString() {
        return "LayoutId(id=" + getLayoutId() + ')';
    }
}
