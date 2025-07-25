package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HardwareFoldingFeature.kt */
@Metadata
/* loaded from: classes2.dex */
public final class HardwareFoldingFeature implements FoldingFeature {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final Bounds featureBounds;
    @NotNull
    private final FoldingFeature.State state;
    @NotNull
    private final Type type;

    /* compiled from: HardwareFoldingFeature.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void validateFeatureBounds$window_release(@NotNull Bounds bounds) {
            boolean z;
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            boolean z2 = false;
            if (bounds.getWidth() == 0 && bounds.getHeight() == 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (bounds.getLeft() == 0 || bounds.getTop() == 0) {
                    z2 = true;
                }
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
            throw new IllegalArgumentException("Bounds must be non zero".toString());
        }
    }

    /* compiled from: HardwareFoldingFeature.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Type {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private static final Type FOLD = new Type("FOLD");
        @NotNull
        private static final Type HINGE = new Type("HINGE");
        @NotNull
        private final String description;

        /* compiled from: HardwareFoldingFeature.kt */
        @Metadata
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Type getFOLD() {
                return Type.FOLD;
            }

            @NotNull
            public final Type getHINGE() {
                return Type.HINGE;
            }
        }

        private Type(String str) {
            this.description = str;
        }

        @NotNull
        public String toString() {
            return this.description;
        }
    }

    public HardwareFoldingFeature(@NotNull Bounds featureBounds, @NotNull Type type, @NotNull FoldingFeature.State state) {
        Intrinsics.checkNotNullParameter(featureBounds, "featureBounds");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.featureBounds = featureBounds;
        this.type = type;
        this.state = state;
        Companion.validateFeatureBounds$window_release(featureBounds);
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!Intrinsics.m17075f(HardwareFoldingFeature.class, cls)) {
            return false;
        }
        if (obj != null) {
            HardwareFoldingFeature hardwareFoldingFeature = (HardwareFoldingFeature) obj;
            if (Intrinsics.m17075f(this.featureBounds, hardwareFoldingFeature.featureBounds) && Intrinsics.m17075f(this.type, hardwareFoldingFeature.type) && Intrinsics.m17075f(getState(), hardwareFoldingFeature.getState())) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
    }

    @Override // androidx.window.layout.DisplayFeature
    @NotNull
    public Rect getBounds() {
        return this.featureBounds.toRect();
    }

    @Override // androidx.window.layout.FoldingFeature
    @NotNull
    public FoldingFeature.OcclusionType getOcclusionType() {
        if (this.featureBounds.getWidth() != 0 && this.featureBounds.getHeight() != 0) {
            return FoldingFeature.OcclusionType.FULL;
        }
        return FoldingFeature.OcclusionType.NONE;
    }

    @Override // androidx.window.layout.FoldingFeature
    @NotNull
    public FoldingFeature.Orientation getOrientation() {
        if (this.featureBounds.getWidth() > this.featureBounds.getHeight()) {
            return FoldingFeature.Orientation.HORIZONTAL;
        }
        return FoldingFeature.Orientation.VERTICAL;
    }

    @Override // androidx.window.layout.FoldingFeature
    @NotNull
    public FoldingFeature.State getState() {
        return this.state;
    }

    @NotNull
    public final Type getType$window_release() {
        return this.type;
    }

    public int hashCode() {
        return (((this.featureBounds.hashCode() * 31) + this.type.hashCode()) * 31) + getState().hashCode();
    }

    @Override // androidx.window.layout.FoldingFeature
    public boolean isSeparating() {
        Type type = this.type;
        Type.Companion companion = Type.Companion;
        if (Intrinsics.m17075f(type, companion.getHINGE())) {
            return true;
        }
        if (Intrinsics.m17075f(this.type, companion.getFOLD()) && Intrinsics.m17075f(getState(), FoldingFeature.State.HALF_OPENED)) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        return ((Object) HardwareFoldingFeature.class.getSimpleName()) + " { " + this.featureBounds + ", type=" + this.type + ", state=" + getState() + " }";
    }
}
