package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Swipeable.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class SwipeableDefaults {
    public static final int $stable = 0;
    public static final float StandardResistanceFactor = 10.0f;
    public static final float StiffResistanceFactor = 20.0f;
    @NotNull
    public static final SwipeableDefaults INSTANCE = new SwipeableDefaults();
    @NotNull
    private static final SpringSpec<Float> AnimationSpec = new SpringSpec<>(0.0f, 0.0f, null, 7, null);
    private static final float VelocityThreshold = C1059Dp.m109734constructorimpl(125);

    private SwipeableDefaults() {
    }

    public static /* synthetic */ ResistanceConfig resistanceConfig$default(SwipeableDefaults swipeableDefaults, Set set, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 10.0f;
        }
        if ((i & 4) != 0) {
            f2 = 10.0f;
        }
        return swipeableDefaults.resistanceConfig(set, f, f2);
    }

    @NotNull
    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    /* renamed from: getVelocityThreshold-D9Ej5fM */
    public final float m107080getVelocityThresholdD9Ej5fM() {
        return VelocityThreshold;
    }

    @Nullable
    public final ResistanceConfig resistanceConfig(@NotNull Set<Float> anchors, float f, float f2) {
        Float m17575D0;
        Float m17573F0;
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        if (anchors.size() <= 1) {
            return null;
        }
        Set<Float> set = anchors;
        m17575D0 = _Collections.m17575D0(set);
        Intrinsics.m17074g(m17575D0);
        float floatValue = m17575D0.floatValue();
        m17573F0 = _Collections.m17573F0(set);
        Intrinsics.m17074g(m17573F0);
        return new ResistanceConfig(floatValue - m17573F0.floatValue(), f, f2);
    }
}
