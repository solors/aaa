package androidx.compose.foundation.shape;

import androidx.compose.p015ui.platform.InspectableValue;
import androidx.compose.p015ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CornerSize.kt */
@Metadata
/* loaded from: classes.dex */
public final class PxCornerSize implements CornerSize, InspectableValue {
    private final float size;

    public PxCornerSize(float f) {
        this.size = f;
    }

    private final float component1() {
        return this.size;
    }

    public static /* synthetic */ PxCornerSize copy$default(PxCornerSize pxCornerSize, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = pxCornerSize.size;
        }
        return pxCornerSize.copy(f);
    }

    @NotNull
    public final PxCornerSize copy(float f) {
        return new PxCornerSize(f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PxCornerSize) && Intrinsics.m17075f(Float.valueOf(this.size), Float.valueOf(((PxCornerSize) obj).size))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.hashCode(this.size);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo106560toPxTmRCtEA(long j, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.size;
    }

    @NotNull
    public String toString() {
        return "CornerSize(size = " + this.size + ".px)";
    }

    @Override // androidx.compose.p015ui.platform.InspectableValue
    @NotNull
    public String getValueOverride() {
        return this.size + "px";
    }
}
