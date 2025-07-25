package androidx.compose.animation.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37566w;
import kotlin.collections.PrimitiveIterators;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorizedAnimationSpec.kt */
@Metadata
/* loaded from: classes.dex */
public final class VectorizedAnimationSpecKt {
    private static final int InfiniteIterations = Integer.MAX_VALUE;

    public static final /* synthetic */ Animations access$createSpringAnimations(AnimationVectors animationVectors, float f, float f2) {
        return createSpringAnimations(animationVectors, f, f2);
    }

    public static final long clampPlayTime(VectorizedDurationBasedAnimationSpec<?> vectorizedDurationBasedAnimationSpec, long j) {
        long m16906p;
        m16906p = _Ranges.m16906p(j - vectorizedDurationBasedAnimationSpec.getDelayMillis(), 0L, vectorizedDurationBasedAnimationSpec.getDurationMillis());
        return m16906p;
    }

    public static final <V extends AnimationVectors> Animations createSpringAnimations(V v, float f, float f2) {
        if (v != null) {
            return new Animations(v, f, f2) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$1
                @NotNull
                private final List<FloatSpringSpec> anims;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
                {
                    PrimitiveRanges m16900v;
                    int m17154x;
                    m16900v = _Ranges.m16900v(0, v.getSize$animation_core_release());
                    m17154x = C37566w.m17154x(m16900v, 10);
                    ArrayList arrayList = new ArrayList(m17154x);
                    Iterator<Integer> it = m16900v.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new FloatSpringSpec(f, f2, v.get$animation_core_release(((PrimitiveIterators) it).nextInt())));
                    }
                    this.anims = arrayList;
                }

                @Override // androidx.compose.animation.core.Animations
                @NotNull
                public FloatSpringSpec get(int i) {
                    return this.anims.get(i);
                }
            };
        }
        return new Animations(f, f2) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$2
            @NotNull
            private final FloatSpringSpec anim;

            {
                this.anim = new FloatSpringSpec(f, f2, 0.0f, 4, null);
            }

            @Override // androidx.compose.animation.core.Animations
            @NotNull
            public FloatSpringSpec get(int i) {
                return this.anim;
            }
        };
    }

    public static final <V extends AnimationVectors> long getDurationMillis(@NotNull VectorizedAnimationSpec<V> vectorizedAnimationSpec, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(vectorizedAnimationSpec, "<this>");
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return vectorizedAnimationSpec.getDurationNanos(initialValue, targetValue, initialVelocity) / 1000000;
    }

    @NotNull
    public static final <V extends AnimationVectors> V getValueFromMillis(@NotNull VectorizedAnimationSpec<V> vectorizedAnimationSpec, long j, @NotNull V start, @NotNull V end, @NotNull V startVelocity) {
        Intrinsics.checkNotNullParameter(vectorizedAnimationSpec, "<this>");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(startVelocity, "startVelocity");
        return vectorizedAnimationSpec.getValueFromNanos(j * 1000000, start, end, startVelocity);
    }
}
