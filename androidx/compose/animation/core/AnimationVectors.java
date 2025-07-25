package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.animation.core.AnimationVector */
/* loaded from: classes.dex */
public abstract class AnimationVectors {
    public static final int $stable = 0;

    private AnimationVectors() {
    }

    public /* synthetic */ AnimationVectors(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract float get$animation_core_release(int i);

    public abstract int getSize$animation_core_release();

    @NotNull
    public abstract AnimationVectors newVector$animation_core_release();

    public abstract void reset$animation_core_release();

    public abstract void set$animation_core_release(int i, float f);
}
