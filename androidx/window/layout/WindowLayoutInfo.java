package androidx.window.layout;

import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WindowLayoutInfo.kt */
@Metadata
/* loaded from: classes2.dex */
public final class WindowLayoutInfo {
    @NotNull
    private final List<DisplayFeature> displayFeatures;

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.TESTS})
    public WindowLayoutInfo(@NotNull List<? extends DisplayFeature> displayFeatures) {
        Intrinsics.checkNotNullParameter(displayFeatures, "displayFeatures");
        this.displayFeatures = displayFeatures;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.m17075f(WindowLayoutInfo.class, obj.getClass())) {
            return Intrinsics.m17075f(this.displayFeatures, ((WindowLayoutInfo) obj).displayFeatures);
        }
        return false;
    }

    @NotNull
    public final List<DisplayFeature> getDisplayFeatures() {
        return this.displayFeatures;
    }

    public int hashCode() {
        return this.displayFeatures.hashCode();
    }

    @NotNull
    public String toString() {
        String m17521z0;
        m17521z0 = _Collections.m17521z0(this.displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
        return m17521z0;
    }
}
