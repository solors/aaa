package androidx.compose.foundation.shape;

import androidx.compose.p015ui.platform.InspectableValue;
import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.p015ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CornerSize.kt */
@Metadata
/* loaded from: classes.dex */
public final class DpCornerSize implements CornerSize, InspectableValue {
    private final float size;

    public /* synthetic */ DpCornerSize(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* renamed from: component1-D9Ej5fM  reason: not valid java name */
    private final float m106565component1D9Ej5fM() {
        return this.size;
    }

    /* renamed from: copy-0680j_4$default  reason: not valid java name */
    public static /* synthetic */ DpCornerSize m106566copy0680j_4$default(DpCornerSize dpCornerSize, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = dpCornerSize.size;
        }
        return dpCornerSize.m106567copy0680j_4(f);
    }

    @NotNull
    /* renamed from: copy-0680j_4  reason: not valid java name */
    public final DpCornerSize m106567copy0680j_4(float f) {
        return new DpCornerSize(f, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DpCornerSize) && C1059Dp.m109739equalsimpl0(this.size, ((DpCornerSize) obj).size)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p015ui.platform.InspectableValue
    public /* bridge */ /* synthetic */ Object getValueOverride() {
        return C1059Dp.m109732boximpl(m106568getValueOverrideD9Ej5fM());
    }

    /* renamed from: getValueOverride-D9Ej5fM  reason: not valid java name */
    public float m106568getValueOverrideD9Ej5fM() {
        return this.size;
    }

    public int hashCode() {
        return C1059Dp.m109740hashCodeimpl(this.size);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo106560toPxTmRCtEA(long j, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo106214toPx0680j_4(this.size);
    }

    @NotNull
    public String toString() {
        return "CornerSize(size = " + this.size + ".dp)";
    }

    private DpCornerSize(float f) {
        this.size = f;
    }
}
