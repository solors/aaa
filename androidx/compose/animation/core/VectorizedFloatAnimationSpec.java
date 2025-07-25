package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVectors;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.PrimitiveIterators;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorizedAnimationSpec.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class VectorizedFloatAnimationSpec<V extends AnimationVectors> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    @NotNull
    private final Animations anims;
    private V endVelocityVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatAnimationSpec(@NotNull Animations anims) {
        Intrinsics.checkNotNullParameter(anims, "anims");
        this.anims = anims;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(@NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        PrimitiveRanges m16900v;
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        m16900v = _Ranges.m16900v(0, initialValue.getSize$animation_core_release());
        Iterator<Integer> it = m16900v.iterator();
        long j = 0;
        while (it.hasNext()) {
            int nextInt = ((PrimitiveIterators) it).nextInt();
            j = Math.max(j, this.anims.get(nextInt).getDurationNanos(initialValue.get$animation_core_release(nextInt), targetValue.get$animation_core_release(nextInt), initialVelocity.get$animation_core_release(nextInt)));
        }
        return j;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getEndVelocity(@NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.endVelocityVector == null) {
            this.endVelocityVector = (V) AnimationVectorsKt.newInstance(initialVelocity);
        }
        V v = this.endVelocityVector;
        if (v == null) {
            Intrinsics.m17056y("endVelocityVector");
            v = null;
        }
        int size$animation_core_release = v.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v2 = this.endVelocityVector;
            if (v2 == null) {
                Intrinsics.m17056y("endVelocityVector");
                v2 = null;
            }
            v2.set$animation_core_release(i, this.anims.get(i).getEndVelocity(initialValue.get$animation_core_release(i), targetValue.get$animation_core_release(i), initialVelocity.get$animation_core_release(i)));
        }
        V v3 = this.endVelocityVector;
        if (v3 == null) {
            Intrinsics.m17056y("endVelocityVector");
            return null;
        }
        return v3;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getValueFromNanos(long j, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v = this.valueVector;
        if (v == null) {
            Intrinsics.m17056y("valueVector");
            v = null;
        }
        int size$animation_core_release = v.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v2 = this.valueVector;
            if (v2 == null) {
                Intrinsics.m17056y("valueVector");
                v2 = null;
            }
            v2.set$animation_core_release(i, this.anims.get(i).getValueFromNanos(j, initialValue.get$animation_core_release(i), targetValue.get$animation_core_release(i), initialVelocity.get$animation_core_release(i)));
        }
        V v3 = this.valueVector;
        if (v3 == null) {
            Intrinsics.m17056y("valueVector");
            return null;
        }
        return v3;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getVelocityFromNanos(long j, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(initialVelocity);
        }
        V v = this.velocityVector;
        if (v == null) {
            Intrinsics.m17056y("velocityVector");
            v = null;
        }
        int size$animation_core_release = v.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v2 = this.velocityVector;
            if (v2 == null) {
                Intrinsics.m17056y("velocityVector");
                v2 = null;
            }
            v2.set$animation_core_release(i, this.anims.get(i).getVelocityFromNanos(j, initialValue.get$animation_core_release(i), targetValue.get$animation_core_release(i), initialVelocity.get$animation_core_release(i)));
        }
        V v3 = this.velocityVector;
        if (v3 == null) {
            Intrinsics.m17056y("velocityVector");
            return null;
        }
        return v3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VectorizedFloatAnimationSpec(@NotNull final FloatAnimationSpec anim) {
        this(new Animations() { // from class: androidx.compose.animation.core.VectorizedFloatAnimationSpec.1
            @Override // androidx.compose.animation.core.Animations
            @NotNull
            public FloatAnimationSpec get(int i) {
                return anim;
            }
        });
        Intrinsics.checkNotNullParameter(anim, "anim");
    }
}
