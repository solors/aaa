package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HoverInteraction.kt */
@Metadata
/* loaded from: classes.dex */
public interface HoverInteraction extends Interaction {

    /* compiled from: HoverInteraction.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* loaded from: classes.dex */
    public static final class Enter implements HoverInteraction {
        public static final int $stable = 0;
    }

    /* compiled from: HoverInteraction.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* loaded from: classes.dex */
    public static final class Exit implements HoverInteraction {
        public static final int $stable = 0;
        @NotNull
        private final Enter enter;

        public Exit(@NotNull Enter enter) {
            Intrinsics.checkNotNullParameter(enter, "enter");
            this.enter = enter;
        }

        @NotNull
        public final Enter getEnter() {
            return this.enter;
        }
    }
}
