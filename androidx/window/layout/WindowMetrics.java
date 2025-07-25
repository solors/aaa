package androidx.window.layout;

import android.graphics.Rect;
import androidx.annotation.RestrictTo;
import androidx.window.core.Bounds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WindowMetrics.kt */
@Metadata
/* loaded from: classes2.dex */
public final class WindowMetrics {
    @NotNull
    private final Bounds _bounds;

    public WindowMetrics(@NotNull Bounds _bounds) {
        Intrinsics.checkNotNullParameter(_bounds, "_bounds");
        this._bounds = _bounds;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.m17075f(WindowMetrics.class, obj.getClass())) {
            return Intrinsics.m17075f(this._bounds, ((WindowMetrics) obj)._bounds);
        }
        return false;
    }

    @NotNull
    public final Rect getBounds() {
        return this._bounds.toRect();
    }

    public int hashCode() {
        return this._bounds.hashCode();
    }

    @NotNull
    public String toString() {
        return "WindowMetrics { bounds: " + getBounds() + " }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.TESTS})
    public WindowMetrics(@NotNull Rect bounds) {
        this(new Bounds(bounds));
        Intrinsics.checkNotNullParameter(bounds, "bounds");
    }
}
