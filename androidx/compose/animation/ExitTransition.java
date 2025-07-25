package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EnterExitTransition.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
public abstract class ExitTransition {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final ExitTransition None = new ExitTransitionImpl(new TransitionData(null, null, null, null, 15, null));

    /* compiled from: EnterExitTransition.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ExitTransition getNone() {
            return ExitTransition.None;
        }
    }

    public /* synthetic */ ExitTransition(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof ExitTransition) && Intrinsics.m17075f(((ExitTransition) obj).getData$animation_release(), getData$animation_release())) {
            return true;
        }
        return false;
    }

    @NotNull
    public abstract TransitionData getData$animation_release();

    public int hashCode() {
        return getData$animation_release().hashCode();
    }

    @Stable
    @NotNull
    public final ExitTransition plus(@NotNull ExitTransition exit) {
        Intrinsics.checkNotNullParameter(exit, "exit");
        Fade fade = getData$animation_release().getFade();
        if (fade == null) {
            fade = exit.getData$animation_release().getFade();
        }
        Slide slide = getData$animation_release().getSlide();
        if (slide == null) {
            slide = exit.getData$animation_release().getSlide();
        }
        EnterExitTransition changeSize = getData$animation_release().getChangeSize();
        if (changeSize == null) {
            changeSize = exit.getData$animation_release().getChangeSize();
        }
        Scale scale = getData$animation_release().getScale();
        if (scale == null) {
            scale = exit.getData$animation_release().getScale();
        }
        return new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale));
    }

    private ExitTransition() {
    }
}
