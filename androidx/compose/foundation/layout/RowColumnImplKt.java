package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.IntrinsicMeasurable;
import androidx.compose.p015ui.layout.IntrinsicMeasureScope;
import androidx.compose.p015ui.layout.Measurable;
import androidx.compose.p015ui.layout.MeasurePolicy;
import androidx.compose.p015ui.layout.MeasureResult;
import androidx.compose.p015ui.layout.MeasureScope;
import androidx.compose.p015ui.layout.Placeable;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import be.MathJVM;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C37607l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;
import p1076zd.InterfaceC45270p;

/* compiled from: RowColumnImpl.kt */
@Metadata
/* loaded from: classes.dex */
public final class RowColumnImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC45268n<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxHeight();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC45268n<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxWidth();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC45268n<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinHeight();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMinHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC45268n<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinWidth();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMinWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CrossAxisAlignment getCrossAxisAlignment(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RowColumnParentData getData(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFill(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getWeight(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getWeight();
        }
        return 0.0f;
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function22, int i, int i2) {
        int m103791d;
        int i3;
        boolean z;
        boolean z2 = true;
        int min = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i5);
            float weight = getWeight(getData(intrinsicMeasurable));
            if (weight == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int min2 = Math.min(function2.mo105910invoke(intrinsicMeasurable, Integer.MAX_VALUE).intValue(), i - min);
                min += min2;
                i4 = Math.max(i4, function22.mo105910invoke(intrinsicMeasurable, Integer.valueOf(min2)).intValue());
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        if (f != 0.0f) {
            z2 = false;
        }
        if (z2) {
            m103791d = 0;
        } else if (i != Integer.MAX_VALUE) {
            m103791d = MathJVM.m103791d(Math.max(i - min, 0) / f);
        } else {
            m103791d = Integer.MAX_VALUE;
        }
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i6);
            float weight2 = getWeight(getData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                if (m103791d != Integer.MAX_VALUE) {
                    i3 = MathJVM.m103791d(m103791d * weight2);
                } else {
                    i3 = Integer.MAX_VALUE;
                }
                i4 = Math.max(i4, function22.mo105910invoke(intrinsicMeasurable2, Integer.valueOf(i3)).intValue());
            }
        }
        return i4;
    }

    private static final int intrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2, int i, int i2) {
        int m103791d;
        int m103791d2;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        float f = 0.0f;
        while (true) {
            boolean z = true;
            if (i3 >= size) {
                m103791d = MathJVM.m103791d(i4 * f);
                return m103791d + i5 + ((list.size() - 1) * i2);
            }
            IntrinsicMeasurable intrinsicMeasurable = list.get(i3);
            float weight = getWeight(getData(intrinsicMeasurable));
            int intValue = function2.mo105910invoke(intrinsicMeasurable, Integer.valueOf(i)).intValue();
            if (weight != 0.0f) {
                z = false;
            }
            if (z) {
                i5 += intValue;
            } else if (weight > 0.0f) {
                f += weight;
                m103791d2 = MathJVM.m103791d(intValue / weight);
                i4 = Math.max(i4, m103791d2);
            }
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int intrinsicSize(List<? extends IntrinsicMeasurable> list, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function22, int i, int i2, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        if (layoutOrientation == layoutOrientation2) {
            return intrinsicMainAxisSize(list, function2, i, i2);
        }
        return intrinsicCrossAxisSize(list, function22, function2, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelative(RowColumnParentData rowColumnParentData) {
        CrossAxisAlignment crossAxisAlignment = getCrossAxisAlignment(rowColumnParentData);
        if (crossAxisAlignment != null) {
            return crossAxisAlignment.isRelative$foundation_layout_release();
        }
        return false;
    }

    @NotNull
    /* renamed from: rowColumnMeasurePolicy-TDGSqEk  reason: not valid java name */
    public static final MeasurePolicy m106340rowColumnMeasurePolicyTDGSqEk(@NotNull final LayoutOrientation orientation, @NotNull final InterfaceC45270p<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], Unit> arrangement, final float f, @NotNull final SizeMode crossAxisSize, @NotNull final CrossAxisAlignment crossAxisAlignment) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(arrangement, "arrangement");
        Intrinsics.checkNotNullParameter(crossAxisSize, "crossAxisSize");
        Intrinsics.checkNotNullParameter(crossAxisAlignment, "crossAxisAlignment");
        return new MeasurePolicy() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1
            @Override // androidx.compose.p015ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
                InterfaceC45268n MaxIntrinsicHeightMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MaxIntrinsicHeightMeasureBlock = RowColumnImplKt.MaxIntrinsicHeightMeasureBlock(LayoutOrientation.this);
                return ((Number) MaxIntrinsicHeightMeasureBlock.invoke(measurables, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo106208roundToPx0680j_4(f)))).intValue();
            }

            @Override // androidx.compose.p015ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
                InterfaceC45268n MaxIntrinsicWidthMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MaxIntrinsicWidthMeasureBlock = RowColumnImplKt.MaxIntrinsicWidthMeasureBlock(LayoutOrientation.this);
                return ((Number) MaxIntrinsicWidthMeasureBlock.invoke(measurables, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo106208roundToPx0680j_4(f)))).intValue();
            }

            @Override // androidx.compose.p015ui.layout.MeasurePolicy
            @NotNull
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo105914measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> list, long j) {
                int mainAxisMin;
                float f2;
                int i;
                int m16912j;
                float f3;
                int i2;
                float weight;
                boolean z;
                int m103794a;
                int m103791d;
                boolean fill;
                int i3;
                int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize;
                int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize;
                boolean z2;
                boolean isRelative;
                float weight2;
                int m103791d2;
                int i4;
                int max;
                int i5;
                int i6;
                CrossAxisAlignment crossAxisAlignment2;
                Integer num;
                int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize2;
                float weight3;
                int i7;
                int i8;
                RowColumnParentData[] rowColumnParentDataArr;
                int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize2;
                int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize3;
                int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize3;
                boolean z3;
                boolean isRelative2;
                RowColumnParentData data;
                List<? extends Measurable> measurables = list;
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                OrientationIndependentConstraints orientationIndependentConstraints = new OrientationIndependentConstraints(j, LayoutOrientation.this, null);
                int mo106208roundToPx0680j_4 = measure.mo106208roundToPx0680j_4(f);
                int size = list.size();
                Placeable[] placeableArr = new Placeable[size];
                int size2 = list.size();
                RowColumnParentData[] rowColumnParentDataArr2 = new RowColumnParentData[size2];
                for (int i9 = 0; i9 < size2; i9++) {
                    data = RowColumnImplKt.getData(measurables.get(i9));
                    rowColumnParentDataArr2[i9] = data;
                }
                int size3 = list.size();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                boolean z4 = false;
                float f4 = 0.0f;
                while (true) {
                    int i15 = Integer.MAX_VALUE;
                    if (i12 >= size3) {
                        break;
                    }
                    Measurable measurable = measurables.get(i12);
                    RowColumnParentData rowColumnParentData = rowColumnParentDataArr2[i12];
                    weight3 = RowColumnImplKt.getWeight(rowColumnParentData);
                    if (weight3 > 0.0f) {
                        f4 += weight3;
                        i13++;
                        i7 = i12;
                        i8 = size3;
                        rowColumnParentDataArr = rowColumnParentDataArr2;
                    } else {
                        int mainAxisMax = orientationIndependentConstraints.getMainAxisMax();
                        if (mainAxisMax != Integer.MAX_VALUE) {
                            i15 = mainAxisMax - i14;
                        }
                        int i16 = i11;
                        i7 = i12;
                        i8 = size3;
                        rowColumnParentDataArr = rowColumnParentDataArr2;
                        Placeable mo109020measureBRTryo0 = measurable.mo109020measureBRTryo0(OrientationIndependentConstraints.copy$default(orientationIndependentConstraints, 0, i15, 0, 0, 8, null).m106311toBoxConstraintsOenEA2s(LayoutOrientation.this));
                        rowColumnMeasurePolicy_TDGSqEk$mainAxisSize2 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(mo109020measureBRTryo0, LayoutOrientation.this);
                        int min = Math.min(mo106208roundToPx0680j_4, (mainAxisMax - i14) - rowColumnMeasurePolicy_TDGSqEk$mainAxisSize2);
                        rowColumnMeasurePolicy_TDGSqEk$mainAxisSize3 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(mo109020measureBRTryo0, LayoutOrientation.this);
                        i14 += rowColumnMeasurePolicy_TDGSqEk$mainAxisSize3 + min;
                        rowColumnMeasurePolicy_TDGSqEk$crossAxisSize3 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(mo109020measureBRTryo0, LayoutOrientation.this);
                        i11 = Math.max(i16, rowColumnMeasurePolicy_TDGSqEk$crossAxisSize3);
                        if (!z4) {
                            isRelative2 = RowColumnImplKt.isRelative(rowColumnParentData);
                            if (!isRelative2) {
                                z3 = false;
                                placeableArr[i7] = mo109020measureBRTryo0;
                                i10 = min;
                                z4 = z3;
                            }
                        }
                        z3 = true;
                        placeableArr[i7] = mo109020measureBRTryo0;
                        i10 = min;
                        z4 = z3;
                    }
                    i12 = i7 + 1;
                    size3 = i8;
                    rowColumnParentDataArr2 = rowColumnParentDataArr;
                }
                int i17 = i11;
                RowColumnParentData[] rowColumnParentDataArr3 = rowColumnParentDataArr2;
                if (i13 == 0) {
                    i14 -= i10;
                    i = i17;
                    m16912j = 0;
                } else {
                    int i18 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
                    if (i18 > 0 && orientationIndependentConstraints.getMainAxisMax() != Integer.MAX_VALUE) {
                        mainAxisMin = orientationIndependentConstraints.getMainAxisMax();
                    } else {
                        mainAxisMin = orientationIndependentConstraints.getMainAxisMin();
                    }
                    int i19 = mo106208roundToPx0680j_4 * (i13 - 1);
                    int i20 = (mainAxisMin - i14) - i19;
                    if (i18 > 0) {
                        f2 = i20 / f4;
                    } else {
                        f2 = 0.0f;
                    }
                    int i21 = 0;
                    for (int i22 = 0; i22 < size2; i22++) {
                        weight2 = RowColumnImplKt.getWeight(rowColumnParentDataArr3[i22]);
                        m103791d2 = MathJVM.m103791d(weight2 * f2);
                        i21 += m103791d2;
                    }
                    int size4 = list.size();
                    int i23 = i20 - i21;
                    i = i17;
                    int i24 = 0;
                    int i25 = 0;
                    while (i24 < size4) {
                        if (placeableArr[i24] == null) {
                            Measurable measurable2 = measurables.get(i24);
                            RowColumnParentData rowColumnParentData2 = rowColumnParentDataArr3[i24];
                            weight = RowColumnImplKt.getWeight(rowColumnParentData2);
                            if (weight > 0.0f) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                m103794a = MathJVM.m103794a(i23);
                                int i26 = i23 - m103794a;
                                m103791d = MathJVM.m103791d(weight * f2);
                                int max2 = Math.max(0, m103791d + m103794a);
                                fill = RowColumnImplKt.getFill(rowColumnParentData2);
                                f3 = f2;
                                if (fill && max2 != Integer.MAX_VALUE) {
                                    i3 = max2;
                                    i2 = size4;
                                } else {
                                    i2 = size4;
                                    i3 = 0;
                                }
                                Placeable mo109020measureBRTryo02 = measurable2.mo109020measureBRTryo0(new OrientationIndependentConstraints(i3, max2, 0, orientationIndependentConstraints.getCrossAxisMax()).m106311toBoxConstraintsOenEA2s(LayoutOrientation.this));
                                rowColumnMeasurePolicy_TDGSqEk$mainAxisSize = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(mo109020measureBRTryo02, LayoutOrientation.this);
                                i25 += rowColumnMeasurePolicy_TDGSqEk$mainAxisSize;
                                rowColumnMeasurePolicy_TDGSqEk$crossAxisSize = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(mo109020measureBRTryo02, LayoutOrientation.this);
                                i = Math.max(i, rowColumnMeasurePolicy_TDGSqEk$crossAxisSize);
                                if (!z4) {
                                    isRelative = RowColumnImplKt.isRelative(rowColumnParentData2);
                                    if (!isRelative) {
                                        z2 = false;
                                        placeableArr[i24] = mo109020measureBRTryo02;
                                        z4 = z2;
                                        i23 = i26;
                                    }
                                }
                                z2 = true;
                                placeableArr[i24] = mo109020measureBRTryo02;
                                z4 = z2;
                                i23 = i26;
                            } else {
                                throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                            }
                        } else {
                            f3 = f2;
                            i2 = size4;
                        }
                        i24++;
                        measurables = list;
                        f2 = f3;
                        size4 = i2;
                    }
                    m16912j = _Ranges.m16912j(i25 + i19, orientationIndependentConstraints.getMainAxisMax() - i14);
                }
                C37607l0 c37607l0 = new C37607l0();
                if (z4) {
                    i4 = 0;
                    for (int i27 = 0; i27 < size; i27++) {
                        Placeable placeable = placeableArr[i27];
                        Intrinsics.m17074g(placeable);
                        crossAxisAlignment2 = RowColumnImplKt.getCrossAxisAlignment(rowColumnParentDataArr3[i27]);
                        if (crossAxisAlignment2 != null) {
                            num = crossAxisAlignment2.calculateAlignmentLinePosition$foundation_layout_release(placeable);
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            int i28 = c37607l0.f99325b;
                            int intValue = num.intValue();
                            if (intValue == Integer.MIN_VALUE) {
                                intValue = 0;
                            }
                            c37607l0.f99325b = Math.max(i28, intValue);
                            rowColumnMeasurePolicy_TDGSqEk$crossAxisSize2 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable, LayoutOrientation.this);
                            LayoutOrientation layoutOrientation = LayoutOrientation.this;
                            int intValue2 = num.intValue();
                            if (intValue2 == Integer.MIN_VALUE) {
                                intValue2 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable, layoutOrientation);
                            }
                            i4 = Math.max(i4, rowColumnMeasurePolicy_TDGSqEk$crossAxisSize2 - intValue2);
                        }
                    }
                } else {
                    i4 = 0;
                }
                int max3 = Math.max(i14 + m16912j, orientationIndependentConstraints.getMainAxisMin());
                if (orientationIndependentConstraints.getCrossAxisMax() != Integer.MAX_VALUE && crossAxisSize == SizeMode.Expand) {
                    max = orientationIndependentConstraints.getCrossAxisMax();
                } else {
                    max = Math.max(i, Math.max(orientationIndependentConstraints.getCrossAxisMin(), c37607l0.f99325b + i4));
                }
                int i29 = max;
                LayoutOrientation layoutOrientation2 = LayoutOrientation.this;
                LayoutOrientation layoutOrientation3 = LayoutOrientation.Horizontal;
                if (layoutOrientation2 == layoutOrientation3) {
                    i5 = max3;
                } else {
                    i5 = i29;
                }
                if (layoutOrientation2 == layoutOrientation3) {
                    i6 = i29;
                } else {
                    i6 = max3;
                }
                int size5 = list.size();
                int[] iArr = new int[size5];
                for (int i30 = 0; i30 < size5; i30++) {
                    iArr[i30] = 0;
                }
                return MeasureScope.layout$default(measure, i5, i6, null, new RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4(list, placeableArr, arrangement, max3, measure, iArr, LayoutOrientation.this, rowColumnParentDataArr3, crossAxisAlignment, i29, c37607l0), 4, null);
            }

            @Override // androidx.compose.p015ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
                InterfaceC45268n MinIntrinsicHeightMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MinIntrinsicHeightMeasureBlock = RowColumnImplKt.MinIntrinsicHeightMeasureBlock(LayoutOrientation.this);
                return ((Number) MinIntrinsicHeightMeasureBlock.invoke(measurables, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo106208roundToPx0680j_4(f)))).intValue();
            }

            @Override // androidx.compose.p015ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
                InterfaceC45268n MinIntrinsicWidthMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MinIntrinsicWidthMeasureBlock = RowColumnImplKt.MinIntrinsicWidthMeasureBlock(LayoutOrientation.this);
                return ((Number) MinIntrinsicWidthMeasureBlock.invoke(measurables, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo106208roundToPx0680j_4(f)))).intValue();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return placeable.getHeight();
        }
        return placeable.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return placeable.getWidth();
        }
        return placeable.getHeight();
    }
}
