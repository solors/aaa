package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FocusInteraction.kt */
@Metadata
/* loaded from: classes.dex */
public interface FocusInteraction extends Interaction {

    /* compiled from: FocusInteraction.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* loaded from: classes.dex */
    public static final class Focus implements FocusInteraction {
        public static final int $stable = 0;
    }

    /* compiled from: FocusInteraction.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* loaded from: classes.dex */
    public static final class Unfocus implements FocusInteraction {
        public static final int $stable = 0;
        @NotNull
        private final Focus focus;

        public Unfocus(@NotNull Focus focus) {
            Intrinsics.checkNotNullParameter(focus, "focus");
            this.focus = focus;
        }

        @NotNull
        public final Focus getFocus() {
            return this.focus;
        }
    }
}
