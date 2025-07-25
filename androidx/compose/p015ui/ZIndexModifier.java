package androidx.compose.p015ui;

import androidx.compose.p015ui.layout.LayoutModifier;
import androidx.compose.p015ui.layout.Measurable;
import androidx.compose.p015ui.layout.MeasureResult;
import androidx.compose.p015ui.layout.MeasureScope;
import androidx.compose.p015ui.layout.Placeable;
import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.p015ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ZIndexModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.ZIndexModifier */
/* loaded from: classes.dex */
final class ZIndexModifier extends InspectorValueInfo implements LayoutModifier {
    private final float zIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZIndexModifier(float f, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.zIndex = f;
    }

    public boolean equals(@Nullable Object obj) {
        ZIndexModifier zIndexModifier;
        if (obj instanceof ZIndexModifier) {
            zIndexModifier = (ZIndexModifier) obj;
        } else {
            zIndexModifier = null;
        }
        if (zIndexModifier == null || this.zIndex != zIndexModifier.zIndex) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Float.hashCode(this.zIndex);
    }

    @Override // androidx.compose.p015ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo105929measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo109020measureBRTryo0 = measurable.mo109020measureBRTryo0(j);
        return MeasureScope.layout$default(measure, mo109020measureBRTryo0.getWidth(), mo109020measureBRTryo0.getHeight(), null, new ZIndexModifier$measure$1(mo109020measureBRTryo0, this), 4, null);
    }

    @NotNull
    public String toString() {
        return "ZIndexModifier(zIndex=" + this.zIndex + ')';
    }
}
