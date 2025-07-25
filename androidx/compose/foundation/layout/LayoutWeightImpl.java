package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.ParentDataModifier;
import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.p015ui.platform.InspectorValueInfo;
import androidx.compose.p015ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RowColumnImpl.kt */
@Metadata
/* loaded from: classes.dex */
public final class LayoutWeightImpl extends InspectorValueInfo implements ParentDataModifier {
    private final boolean fill;
    private final float weight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutWeightImpl(float f, boolean z, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.weight = f;
        this.fill = z;
    }

    public boolean equals(@Nullable Object obj) {
        LayoutWeightImpl layoutWeightImpl;
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutWeightImpl) {
            layoutWeightImpl = (LayoutWeightImpl) obj;
        } else {
            layoutWeightImpl = null;
        }
        if (layoutWeightImpl == null) {
            return false;
        }
        if (this.weight == layoutWeightImpl.weight) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.fill == layoutWeightImpl.fill) {
            return true;
        }
        return false;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (Float.hashCode(this.weight) * 31) + Boolean.hashCode(this.fill);
    }

    @NotNull
    public String toString() {
        return "LayoutWeightImpl(weight=" + this.weight + ", fill=" + this.fill + ')';
    }

    @Override // androidx.compose.p015ui.layout.ParentDataModifier
    @NotNull
    public RowColumnParentData modifyParentData(@NotNull Density density, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, 7, null);
        }
        rowColumnParentData.setWeight(this.weight);
        rowColumnParentData.setFill(this.fill);
        return rowColumnParentData;
    }
}
