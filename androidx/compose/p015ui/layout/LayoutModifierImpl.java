package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.p015ui.platform.InspectorValueInfo;
import androidx.compose.p015ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* compiled from: LayoutModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.LayoutModifierImpl */
/* loaded from: classes.dex */
final class LayoutModifierImpl extends InspectorValueInfo implements LayoutModifier {
    @NotNull
    private final InterfaceC45268n<MeasureScope, Measurable, Constraints, MeasureResult> measureBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LayoutModifierImpl(@NotNull InterfaceC45268n<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measureBlock, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.measureBlock = measureBlock;
    }

    public boolean equals(@Nullable Object obj) {
        LayoutModifierImpl layoutModifierImpl;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutModifierImpl) {
            layoutModifierImpl = (LayoutModifierImpl) obj;
        } else {
            layoutModifierImpl = null;
        }
        if (layoutModifierImpl == null) {
            return false;
        }
        return Intrinsics.m17075f(this.measureBlock, layoutModifierImpl.measureBlock);
    }

    @NotNull
    public final InterfaceC45268n<MeasureScope, Measurable, Constraints, MeasureResult> getMeasureBlock() {
        return this.measureBlock;
    }

    public int hashCode() {
        return this.measureBlock.hashCode();
    }

    @Override // androidx.compose.p015ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo105929measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return this.measureBlock.invoke(measure, measurable, Constraints.m109678boximpl(j));
    }

    @NotNull
    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + ')';
    }
}
