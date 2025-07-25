package androidx.compose.foundation.layout;

import androidx.compose.p015ui.Alignment;
import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.p015ui.unit.Constraints;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BoxWithConstraints.kt */
@Metadata
/* loaded from: classes.dex */
final class BoxWithConstraintsScopeImpl implements BoxWithConstraintsScope, BoxScope {
    private final /* synthetic */ BoxScopeInstance $$delegate_0;
    private final long constraints;
    @NotNull
    private final Density density;

    public /* synthetic */ BoxWithConstraintsScopeImpl(Density density, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(density, j);
    }

    private final Density component1() {
        return this.density;
    }

    /* renamed from: copy-0kLqBqw$default  reason: not valid java name */
    public static /* synthetic */ BoxWithConstraintsScopeImpl m106296copy0kLqBqw$default(BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, Density density, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            density = boxWithConstraintsScopeImpl.density;
        }
        if ((i & 2) != 0) {
            j = boxWithConstraintsScopeImpl.mo106291getConstraintsmsEJaDk();
        }
        return boxWithConstraintsScopeImpl.m106298copy0kLqBqw(density, j);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    @NotNull
    public Modifier align(@NotNull Modifier modifier, @NotNull Alignment alignment) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return this.$$delegate_0.align(modifier, alignment);
    }

    /* renamed from: component2-msEJaDk  reason: not valid java name */
    public final long m106297component2msEJaDk() {
        return mo106291getConstraintsmsEJaDk();
    }

    @NotNull
    /* renamed from: copy-0kLqBqw  reason: not valid java name */
    public final BoxWithConstraintsScopeImpl m106298copy0kLqBqw(@NotNull Density density, long j) {
        Intrinsics.checkNotNullParameter(density, "density");
        return new BoxWithConstraintsScopeImpl(density, j, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
        if (Intrinsics.m17075f(this.density, boxWithConstraintsScopeImpl.density) && Constraints.m109683equalsimpl0(mo106291getConstraintsmsEJaDk(), boxWithConstraintsScopeImpl.mo106291getConstraintsmsEJaDk())) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getConstraints-msEJaDk */
    public long mo106291getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxHeight-D9Ej5fM */
    public float mo106292getMaxHeightD9Ej5fM() {
        Density density = this.density;
        if (Constraints.m109685getHasBoundedHeightimpl(mo106291getConstraintsmsEJaDk())) {
            return density.mo106211toDpu2uoSUM(Constraints.m109689getMaxHeightimpl(mo106291getConstraintsmsEJaDk()));
        }
        return C1059Dp.Companion.m109753getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxWidth-D9Ej5fM */
    public float mo106293getMaxWidthD9Ej5fM() {
        Density density = this.density;
        if (Constraints.m109686getHasBoundedWidthimpl(mo106291getConstraintsmsEJaDk())) {
            return density.mo106211toDpu2uoSUM(Constraints.m109690getMaxWidthimpl(mo106291getConstraintsmsEJaDk()));
        }
        return C1059Dp.Companion.m109753getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinHeight-D9Ej5fM */
    public float mo106294getMinHeightD9Ej5fM() {
        return this.density.mo106211toDpu2uoSUM(Constraints.m109691getMinHeightimpl(mo106291getConstraintsmsEJaDk()));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinWidth-D9Ej5fM */
    public float mo106295getMinWidthD9Ej5fM() {
        return this.density.mo106211toDpu2uoSUM(Constraints.m109692getMinWidthimpl(mo106291getConstraintsmsEJaDk()));
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + Constraints.m109693hashCodeimpl(mo106291getConstraintsmsEJaDk());
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    @NotNull
    public Modifier matchParentSize(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return this.$$delegate_0.matchParentSize(modifier);
    }

    @NotNull
    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) Constraints.m109695toStringimpl(mo106291getConstraintsmsEJaDk())) + ')';
    }

    private BoxWithConstraintsScopeImpl(Density density, long j) {
        this.density = density;
        this.constraints = j;
        this.$$delegate_0 = BoxScopeInstance.INSTANCE;
    }
}
