package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Swipeable.kt */
@Immutable
@Metadata
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class SwipeProgress<T> {
    private final float fraction;
    private final T from;

    /* renamed from: to */
    private final T f389to;

    public SwipeProgress(T t, T t2, float f) {
        this.from = t;
        this.f389to = t2;
        this.fraction = f;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwipeProgress)) {
            return false;
        }
        SwipeProgress swipeProgress = (SwipeProgress) obj;
        if (!Intrinsics.m17075f(this.from, swipeProgress.from) || !Intrinsics.m17075f(this.f389to, swipeProgress.f389to)) {
            return false;
        }
        if (this.fraction == swipeProgress.fraction) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final T getFrom() {
        return this.from;
    }

    public final T getTo() {
        return this.f389to;
    }

    public int hashCode() {
        int i;
        T t = this.from;
        int i2 = 0;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        T t2 = this.f389to;
        if (t2 != null) {
            i2 = t2.hashCode();
        }
        return ((i3 + i2) * 31) + Float.hashCode(this.fraction);
    }

    @NotNull
    public String toString() {
        return "SwipeProgress(from=" + this.from + ", to=" + this.f389to + ", fraction=" + this.fraction + ')';
    }
}
