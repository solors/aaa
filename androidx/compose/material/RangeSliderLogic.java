package androidx.compose.material;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37756k;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Slider.kt */
@Metadata
/* loaded from: classes.dex */
public final class RangeSliderLogic {
    @NotNull
    private final MutableInteractionSource endInteractionSource;
    @NotNull
    private final State<Function2<Boolean, Float, Unit>> onDrag;
    @NotNull
    private final State<Float> rawOffsetEnd;
    @NotNull
    private final State<Float> rawOffsetStart;
    @NotNull
    private final MutableInteractionSource startInteractionSource;

    /* JADX WARN: Multi-variable type inference failed */
    public RangeSliderLogic(@NotNull MutableInteractionSource startInteractionSource, @NotNull MutableInteractionSource endInteractionSource, @NotNull State<Float> rawOffsetStart, @NotNull State<Float> rawOffsetEnd, @NotNull State<? extends Function2<? super Boolean, ? super Float, Unit>> onDrag) {
        Intrinsics.checkNotNullParameter(startInteractionSource, "startInteractionSource");
        Intrinsics.checkNotNullParameter(endInteractionSource, "endInteractionSource");
        Intrinsics.checkNotNullParameter(rawOffsetStart, "rawOffsetStart");
        Intrinsics.checkNotNullParameter(rawOffsetEnd, "rawOffsetEnd");
        Intrinsics.checkNotNullParameter(onDrag, "onDrag");
        this.startInteractionSource = startInteractionSource;
        this.endInteractionSource = endInteractionSource;
        this.rawOffsetStart = rawOffsetStart;
        this.rawOffsetEnd = rawOffsetEnd;
        this.onDrag = onDrag;
    }

    @NotNull
    public final MutableInteractionSource activeInteraction(boolean z) {
        if (z) {
            return this.startInteractionSource;
        }
        return this.endInteractionSource;
    }

    public final void captureThumb(boolean z, float f, @NotNull Interaction interaction, @NotNull CoroutineScope scope) {
        State<Float> state;
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Function2<Boolean, Float, Unit> value = this.onDrag.getValue();
        Boolean valueOf = Boolean.valueOf(z);
        if (z) {
            state = this.rawOffsetStart;
        } else {
            state = this.rawOffsetEnd;
        }
        value.mo105910invoke(valueOf, Float.valueOf(f - state.getValue().floatValue()));
        C37756k.m16221d(scope, null, null, new RangeSliderLogic$captureThumb$1(this, z, interaction, null), 3, null);
    }

    public final int compareOffsets(float f) {
        return Float.compare(Math.abs(this.rawOffsetStart.getValue().floatValue() - f), Math.abs(this.rawOffsetEnd.getValue().floatValue() - f));
    }

    @NotNull
    public final MutableInteractionSource getEndInteractionSource() {
        return this.endInteractionSource;
    }

    @NotNull
    public final State<Function2<Boolean, Float, Unit>> getOnDrag() {
        return this.onDrag;
    }

    @NotNull
    public final State<Float> getRawOffsetEnd() {
        return this.rawOffsetEnd;
    }

    @NotNull
    public final State<Float> getRawOffsetStart() {
        return this.rawOffsetStart;
    }

    @NotNull
    public final MutableInteractionSource getStartInteractionSource() {
        return this.startInteractionSource;
    }
}
