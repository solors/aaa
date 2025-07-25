package androidx.compose.p015ui.input.pointer;

import android.view.PointerIcon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PointerIcon.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.AndroidPointerIcon */
/* loaded from: classes.dex */
public final class AndroidPointerIcon implements PointerIcon {
    @NotNull
    private final PointerIcon pointerIcon;

    public AndroidPointerIcon(@NotNull PointerIcon pointerIcon) {
        Intrinsics.checkNotNullParameter(pointerIcon, "pointerIcon");
        this.pointerIcon = pointerIcon;
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.m17075f(AndroidPointerIcon.class, cls)) {
            return false;
        }
        if (obj != null) {
            return Intrinsics.m17075f(this.pointerIcon, ((AndroidPointerIcon) obj).pointerIcon);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
    }

    @NotNull
    public final PointerIcon getPointerIcon() {
        return this.pointerIcon;
    }

    public int hashCode() {
        return this.pointerIcon.hashCode();
    }

    @NotNull
    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.pointerIcon + ')';
    }
}
