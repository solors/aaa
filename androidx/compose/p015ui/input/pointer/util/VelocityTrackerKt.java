package androidx.compose.p015ui.input.pointer.util;

import androidx.compose.p015ui.input.pointer.HistoricalChange;
import androidx.compose.p015ui.input.pointer.PointerInputChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: VelocityTracker.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.util.VelocityTrackerKt */
/* loaded from: classes.dex */
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;
    private static final int MinSampleSize = 3;

    public static final void addPointerInputChange(@NotNull VelocityTracker velocityTracker, @NotNull PointerInputChange event) {
        Intrinsics.checkNotNullParameter(velocityTracker, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        List<HistoricalChange> historical = event.getHistorical();
        int size = historical.size();
        for (int i = 0; i < size; i++) {
            HistoricalChange historicalChange = historical.get(i);
            velocityTracker.m108995addPositionUv8p0NA(historicalChange.getUptimeMillis(), historicalChange.m108825getPositionF1C5BW0());
        }
        velocityTracker.m108995addPositionUv8p0NA(event.getUptimeMillis(), event.m108893getPositionF1C5BW0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float kineticEnergyToVelocity(float f) {
        return Math.signum(f) * ((float) Math.sqrt(2 * Math.abs(f)));
    }

    @NotNull
    public static final PolynomialFit polyFitLeastSquares(@NotNull List<Float> x, @NotNull List<Float> y, int i) {
        int i2;
        float f;
        float f2;
        float times;
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(y, "y");
        if (i >= 1) {
            if (x.size() == y.size()) {
                if (!x.isEmpty()) {
                    if (i >= x.size()) {
                        i2 = x.size() - 1;
                    } else {
                        i2 = i;
                    }
                    int i3 = i + 1;
                    ArrayList arrayList = new ArrayList(i3);
                    int i4 = 0;
                    while (true) {
                        f = 0.0f;
                        if (i4 >= i3) {
                            break;
                        }
                        arrayList.add(Float.valueOf(0.0f));
                        i4++;
                    }
                    int size = x.size();
                    int i5 = i2 + 1;
                    Matrix matrix = new Matrix(i5, size);
                    int i6 = 0;
                    while (true) {
                        f2 = 1.0f;
                        if (i6 >= size) {
                            break;
                        }
                        matrix.set(0, i6, 1.0f);
                        for (int i7 = 1; i7 < i5; i7++) {
                            matrix.set(i7, i6, matrix.get(i7 - 1, i6) * x.get(i6).floatValue());
                        }
                        i6++;
                    }
                    Matrix matrix2 = new Matrix(i5, size);
                    Matrix matrix3 = new Matrix(i5, i5);
                    for (int i8 = 0; i8 < i5; i8++) {
                        for (int i9 = 0; i9 < size; i9++) {
                            matrix2.set(i8, i9, matrix.get(i8, i9));
                        }
                        for (int i10 = 0; i10 < i8; i10++) {
                            float times2 = matrix2.getRow(i8).times(matrix2.getRow(i10));
                            for (int i11 = 0; i11 < size; i11++) {
                                matrix2.set(i8, i11, matrix2.get(i8, i11) - (matrix2.get(i10, i11) * times2));
                            }
                        }
                        float norm = matrix2.getRow(i8).norm();
                        if (norm >= 1.0E-6d) {
                            float f3 = 1.0f / norm;
                            for (int i12 = 0; i12 < size; i12++) {
                                matrix2.set(i8, i12, matrix2.get(i8, i12) * f3);
                            }
                            for (int i13 = 0; i13 < i5; i13++) {
                                if (i13 < i8) {
                                    times = 0.0f;
                                } else {
                                    times = matrix2.getRow(i8).times(matrix.getRow(i13));
                                }
                                matrix3.set(i8, i13, times);
                            }
                        } else {
                            throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                        }
                    }
                    Vector vector = new Vector(size);
                    for (int i14 = 0; i14 < size; i14++) {
                        vector.set(i14, y.get(i14).floatValue() * 1.0f);
                    }
                    int i15 = i5 - 1;
                    for (int i16 = i15; -1 < i16; i16--) {
                        arrayList.set(i16, Float.valueOf(matrix2.getRow(i16).times(vector)));
                        int i17 = i16 + 1;
                        if (i17 <= i15) {
                            int i18 = i15;
                            while (true) {
                                arrayList.set(i16, Float.valueOf(((Number) arrayList.get(i16)).floatValue() - (matrix3.get(i16, i18) * ((Number) arrayList.get(i18)).floatValue())));
                                if (i18 != i17) {
                                    i18--;
                                }
                            }
                        }
                        arrayList.set(i16, Float.valueOf(((Number) arrayList.get(i16)).floatValue() / matrix3.get(i16, i16)));
                    }
                    float f4 = 0.0f;
                    for (int i19 = 0; i19 < size; i19++) {
                        f4 += y.get(i19).floatValue();
                    }
                    float f5 = f4 / size;
                    float f6 = 0.0f;
                    for (int i20 = 0; i20 < size; i20++) {
                        float floatValue = y.get(i20).floatValue() - ((Number) arrayList.get(0)).floatValue();
                        float f7 = 1.0f;
                        for (int i21 = 1; i21 < i5; i21++) {
                            f7 *= x.get(i20).floatValue();
                            floatValue -= ((Number) arrayList.get(i21)).floatValue() * f7;
                        }
                        f6 += floatValue * 1.0f * floatValue;
                        float floatValue2 = y.get(i20).floatValue() - f5;
                        f += floatValue2 * 1.0f * floatValue2;
                    }
                    if (f > 1.0E-6f) {
                        f2 = 1.0f - (f6 / f);
                    }
                    return new PolynomialFit(arrayList, f2);
                }
                throw new IllegalArgumentException("At least one point must be provided");
            }
            throw new IllegalArgumentException("x and y must be the same length");
        }
        throw new IllegalArgumentException("The degree must be at positive integer");
    }
}
