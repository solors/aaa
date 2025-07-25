package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVectors;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Animation.kt */
@Metadata
/* loaded from: classes.dex */
public interface Animation<T, V extends AnimationVectors> {

    /* compiled from: Animation.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <T, V extends AnimationVectors> boolean isFinishedFromNanos(@NotNull Animation<T, V> animation, long j) {
            return Animation.super.isFinishedFromNanos(j);
        }
    }

    long getDurationNanos();

    T getTargetValue();

    @NotNull
    VectorConverters<T, V> getTypeConverter();

    T getValueFromNanos(long j);

    @NotNull
    V getVelocityVectorFromNanos(long j);

    default boolean isFinishedFromNanos(long j) {
        if (j >= getDurationNanos()) {
            return true;
        }
        return false;
    }

    boolean isInfinite();
}
