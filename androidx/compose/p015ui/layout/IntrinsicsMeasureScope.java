package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.DpRect;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Layout.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.IntrinsicsMeasureScope */
/* loaded from: classes.dex */
public final class IntrinsicsMeasureScope implements MeasureScope, Density {
    private final /* synthetic */ Density $$delegate_0;
    @NotNull
    private final LayoutDirection layoutDirection;

    public IntrinsicsMeasureScope(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.layoutDirection = layoutDirection;
        this.$$delegate_0 = density;
    }

    @Override // androidx.compose.p015ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.p015ui.unit.Density
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.p015ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo106207roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo106207roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo106208roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo106208roundToPx0680j_4(f);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo106209toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo106209toDpGaN1DYA(j);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo106210toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo106210toDpu2uoSUM(f);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo106212toDpSizekrfVVM(long j) {
        return this.$$delegate_0.mo106212toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo106213toPxR2X_6o(long j) {
        return this.$$delegate_0.mo106213toPxR2X_6o(j);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo106214toPx0680j_4(float f) {
        return this.$$delegate_0.mo106214toPx0680j_4(f);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo106215toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.mo106215toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo106216toSp0xMU5do(float f) {
        return this.$$delegate_0.mo106216toSp0xMU5do(f);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo106217toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo106217toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo106211toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo106211toDpu2uoSUM(i);
    }

    @Override // androidx.compose.p015ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo106218toSpkPz2Gy4(int i) {
        return this.$$delegate_0.mo106218toSpkPz2Gy4(i);
    }
}
