package androidx.compose.foundation.layout;

import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WindowInsets.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
final class ExcludeInsets implements WindowInsets {
    @NotNull
    private final WindowInsets excluded;
    @NotNull
    private final WindowInsets included;

    public ExcludeInsets(@NotNull WindowInsets included, @NotNull WindowInsets excluded) {
        Intrinsics.checkNotNullParameter(included, "included");
        Intrinsics.checkNotNullParameter(excluded, "excluded");
        this.included = included;
        this.excluded = excluded;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExcludeInsets)) {
            return false;
        }
        ExcludeInsets excludeInsets = (ExcludeInsets) obj;
        if (Intrinsics.m17075f(excludeInsets.included, this.included) && Intrinsics.m17075f(excludeInsets.excluded, this.excluded)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@NotNull Density density) {
        int m16917e;
        Intrinsics.checkNotNullParameter(density, "density");
        m16917e = _Ranges.m16917e(this.included.getBottom(density) - this.excluded.getBottom(density), 0);
        return m16917e;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        int m16917e;
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        m16917e = _Ranges.m16917e(this.included.getLeft(density, layoutDirection) - this.excluded.getLeft(density, layoutDirection), 0);
        return m16917e;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        int m16917e;
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        m16917e = _Ranges.m16917e(this.included.getRight(density, layoutDirection) - this.excluded.getRight(density, layoutDirection), 0);
        return m16917e;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@NotNull Density density) {
        int m16917e;
        Intrinsics.checkNotNullParameter(density, "density");
        m16917e = _Ranges.m16917e(this.included.getTop(density) - this.excluded.getTop(density), 0);
        return m16917e;
    }

    public int hashCode() {
        return (this.included.hashCode() * 31) + this.excluded.hashCode();
    }

    @NotNull
    public String toString() {
        return '(' + this.included + " - " + this.excluded + ')';
    }
}
