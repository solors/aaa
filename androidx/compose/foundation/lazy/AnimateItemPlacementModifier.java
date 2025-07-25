package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p015ui.layout.ParentDataModifier;
import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.p015ui.platform.InspectorValueInfo;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyItemScopeImpl.kt */
@Metadata
/* loaded from: classes.dex */
final class AnimateItemPlacementModifier extends InspectorValueInfo implements ParentDataModifier {
    @NotNull
    private final FiniteAnimationSpec<IntOffset> animationSpec;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateItemPlacementModifier(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.animationSpec = animationSpec;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimateItemPlacementModifier)) {
            return false;
        }
        return !Intrinsics.m17075f(this.animationSpec, ((AnimateItemPlacementModifier) obj).animationSpec);
    }

    @NotNull
    public final FiniteAnimationSpec<IntOffset> getAnimationSpec() {
        return this.animationSpec;
    }

    public int hashCode() {
        return this.animationSpec.hashCode();
    }

    @Override // androidx.compose.p015ui.layout.ParentDataModifier
    @NotNull
    public Object modifyParentData(@NotNull Density density, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        return this.animationSpec;
    }
}
