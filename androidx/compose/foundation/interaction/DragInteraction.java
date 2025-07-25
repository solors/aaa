package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DragInteraction.kt */
@Metadata
/* loaded from: classes.dex */
public interface DragInteraction extends Interaction {

    /* compiled from: DragInteraction.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* loaded from: classes.dex */
    public static final class Cancel implements DragInteraction {
        public static final int $stable = 0;
        @NotNull
        private final Start start;

        public Cancel(@NotNull Start start) {
            Intrinsics.checkNotNullParameter(start, "start");
            this.start = start;
        }

        @NotNull
        public final Start getStart() {
            return this.start;
        }
    }

    /* compiled from: DragInteraction.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* loaded from: classes.dex */
    public static final class Start implements DragInteraction {
        public static final int $stable = 0;
    }

    /* compiled from: DragInteraction.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* loaded from: classes.dex */
    public static final class Stop implements DragInteraction {
        public static final int $stable = 0;
        @NotNull
        private final Start start;

        public Stop(@NotNull Start start) {
            Intrinsics.checkNotNullParameter(start, "start");
            this.start = start;
        }

        @NotNull
        public final Start getStart() {
            return this.start;
        }
    }
}
