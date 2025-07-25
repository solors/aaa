package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EnterExitTransition.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
public final class TransitionData {
    @Nullable
    private final EnterExitTransition changeSize;
    @Nullable
    private final Fade fade;
    @Nullable
    private final Scale scale;
    @Nullable
    private final Slide slide;

    public TransitionData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TransitionData copy$default(TransitionData transitionData, Fade fade, Slide slide, EnterExitTransition enterExitTransition, Scale scale, int i, Object obj) {
        if ((i & 1) != 0) {
            fade = transitionData.fade;
        }
        if ((i & 2) != 0) {
            slide = transitionData.slide;
        }
        if ((i & 4) != 0) {
            enterExitTransition = transitionData.changeSize;
        }
        if ((i & 8) != 0) {
            scale = transitionData.scale;
        }
        return transitionData.copy(fade, slide, enterExitTransition, scale);
    }

    @Nullable
    public final Fade component1() {
        return this.fade;
    }

    @Nullable
    public final Slide component2() {
        return this.slide;
    }

    @Nullable
    public final EnterExitTransition component3() {
        return this.changeSize;
    }

    @Nullable
    public final Scale component4() {
        return this.scale;
    }

    @NotNull
    public final TransitionData copy(@Nullable Fade fade, @Nullable Slide slide, @Nullable EnterExitTransition enterExitTransition, @Nullable Scale scale) {
        return new TransitionData(fade, slide, enterExitTransition, scale);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) obj;
        if (Intrinsics.m17075f(this.fade, transitionData.fade) && Intrinsics.m17075f(this.slide, transitionData.slide) && Intrinsics.m17075f(this.changeSize, transitionData.changeSize) && Intrinsics.m17075f(this.scale, transitionData.scale)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final EnterExitTransition getChangeSize() {
        return this.changeSize;
    }

    @Nullable
    public final Fade getFade() {
        return this.fade;
    }

    @Nullable
    public final Scale getScale() {
        return this.scale;
    }

    @Nullable
    public final Slide getSlide() {
        return this.slide;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Fade fade = this.fade;
        int i = 0;
        if (fade == null) {
            hashCode = 0;
        } else {
            hashCode = fade.hashCode();
        }
        int i2 = hashCode * 31;
        Slide slide = this.slide;
        if (slide == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = slide.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        EnterExitTransition enterExitTransition = this.changeSize;
        if (enterExitTransition == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = enterExitTransition.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Scale scale = this.scale;
        if (scale != null) {
            i = scale.hashCode();
        }
        return i4 + i;
    }

    @NotNull
    public String toString() {
        return "TransitionData(fade=" + this.fade + ", slide=" + this.slide + ", changeSize=" + this.changeSize + ", scale=" + this.scale + ')';
    }

    public TransitionData(@Nullable Fade fade, @Nullable Slide slide, @Nullable EnterExitTransition enterExitTransition, @Nullable Scale scale) {
        this.fade = fade;
        this.slide = slide;
        this.changeSize = enterExitTransition;
        this.scale = scale;
    }

    public /* synthetic */ TransitionData(Fade fade, Slide slide, EnterExitTransition enterExitTransition, Scale scale, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fade, (i & 2) != 0 ? null : slide, (i & 4) != 0 ? null : enterExitTransition, (i & 8) != 0 ? null : scale);
    }
}
