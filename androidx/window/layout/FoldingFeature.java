package androidx.window.layout;

import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: FoldingFeature.kt */
@Metadata
/* loaded from: classes2.dex */
public interface FoldingFeature extends DisplayFeature {

    /* compiled from: FoldingFeature.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class OcclusionType {
        @NotNull
        private final String description;
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        public static final OcclusionType NONE = new OcclusionType(InterfaceC32663coo2iico.cco22);
        @NotNull
        public static final OcclusionType FULL = new OcclusionType("FULL");

        /* compiled from: FoldingFeature.kt */
        @Metadata
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private OcclusionType(String str) {
            this.description = str;
        }

        @NotNull
        public String toString() {
            return this.description;
        }
    }

    /* compiled from: FoldingFeature.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Orientation {
        @NotNull
        private final String description;
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        public static final Orientation VERTICAL = new Orientation("VERTICAL");
        @NotNull
        public static final Orientation HORIZONTAL = new Orientation("HORIZONTAL");

        /* compiled from: FoldingFeature.kt */
        @Metadata
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private Orientation(String str) {
            this.description = str;
        }

        @NotNull
        public String toString() {
            return this.description;
        }
    }

    /* compiled from: FoldingFeature.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class State {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        public static final State FLAT = new State("FLAT");
        @NotNull
        public static final State HALF_OPENED = new State("HALF_OPENED");
        @NotNull
        private final String description;

        /* compiled from: FoldingFeature.kt */
        @Metadata
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private State(String str) {
            this.description = str;
        }

        @NotNull
        public String toString() {
            return this.description;
        }
    }

    @NotNull
    OcclusionType getOcclusionType();

    @NotNull
    Orientation getOrientation();

    @NotNull
    State getState();

    boolean isSeparating();
}
