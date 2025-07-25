package androidx.compose.foundation.layout;

import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WindowInsets.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
public final class ValueInsets implements WindowInsets {
    @NotNull
    private final String name;
    @NotNull
    private final SnapshotState value$delegate;

    public ValueInsets(@NotNull InsetsValues insets, @NotNull String name) {
        SnapshotState mutableStateOf$default;
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(insets, null, 2, null);
        this.value$delegate = mutableStateOf$default;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValueInsets)) {
            return false;
        }
        return Intrinsics.m17075f(getValue$foundation_layout_release(), ((ValueInsets) obj).getValue$foundation_layout_release());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return getValue$foundation_layout_release().getBottom();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return getValue$foundation_layout_release().getLeft();
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return getValue$foundation_layout_release().getRight();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return getValue$foundation_layout_release().getTop();
    }

    @NotNull
    public final InsetsValues getValue$foundation_layout_release() {
        return (InsetsValues) this.value$delegate.getValue();
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public final void setValue$foundation_layout_release(@NotNull InsetsValues insetsValues) {
        Intrinsics.checkNotNullParameter(insetsValues, "<set-?>");
        this.value$delegate.setValue(insetsValues);
    }

    @NotNull
    public String toString() {
        return this.name + "(left=" + getValue$foundation_layout_release().getLeft() + ", top=" + getValue$foundation_layout_release().getTop() + ", right=" + getValue$foundation_layout_release().getRight() + ", bottom=" + getValue$foundation_layout_release().getBottom() + ')';
    }
}
