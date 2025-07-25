package androidx.compose.p015ui.input.pointer.util;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.OffsetKt;
import androidx.compose.p015ui.unit.VelocityKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections._ArraysJvm;
import org.jetbrains.annotations.NotNull;

/* compiled from: VelocityTracker.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.util.VelocityTracker */
/* loaded from: classes.dex */
public final class VelocityTracker {
    public static final int $stable = 8;
    private int index;
    @NotNull
    private final PointAtTime[] samples;
    private final boolean useImpulse;

    public VelocityTracker() {
        PointAtTime[] pointAtTimeArr = new PointAtTime[20];
        for (int i = 0; i < 20; i++) {
            pointAtTimeArr[i] = null;
        }
        this.samples = pointAtTimeArr;
        this.useImpulse = true;
    }

    /* renamed from: getImpulseVelocity-9UxMQ8M */
    private final long m108994getImpulseVelocity9UxMQ8M() {
        PointAtTime pointAtTime = this.samples[this.index];
        if (pointAtTime == null) {
            return VelocityKt.Velocity(0.0f, 0.0f);
        }
        ImpulseCalculator impulseCalculator = new ImpulseCalculator();
        ImpulseCalculator impulseCalculator2 = new ImpulseCalculator();
        int i = this.index;
        int i2 = 0;
        PointAtTime pointAtTime2 = pointAtTime;
        do {
            i = (i + 1) % 20;
            PointAtTime pointAtTime3 = this.samples[i];
            if (pointAtTime3 != null) {
                long time = pointAtTime.getTime() - pointAtTime3.getTime();
                long abs = Math.abs(pointAtTime3.getTime() - pointAtTime2.getTime());
                if (time <= 100) {
                    if (abs > 40) {
                        impulseCalculator.reset();
                        impulseCalculator2.reset();
                    }
                    long j = -time;
                    impulseCalculator.addPosition(j, Offset.m107291getXimpl(pointAtTime3.m108987getPointF1C5BW0()));
                    impulseCalculator2.addPosition(j, Offset.m107292getYimpl(pointAtTime3.m108987getPointF1C5BW0()));
                    i2++;
                }
                pointAtTime2 = pointAtTime;
            }
            if (i == this.index) {
                break;
            }
        } while (i2 < 20);
        if (i2 < 3) {
            return VelocityKt.Velocity(0.0f, 0.0f);
        }
        return VelocityKt.Velocity(impulseCalculator.getVelocity(), impulseCalculator2.getVelocity());
    }

    private final VelocityEstimate getLsq2VelocityEstimate() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = this.index;
        PointAtTime pointAtTime = this.samples[i];
        if (pointAtTime == null) {
            return VelocityEstimate.Companion.getNone();
        }
        int i2 = 0;
        PointAtTime pointAtTime2 = pointAtTime;
        while (true) {
            PointAtTime pointAtTime3 = this.samples[i];
            if (pointAtTime3 != null) {
                float time = (float) (pointAtTime.getTime() - pointAtTime3.getTime());
                float abs = (float) Math.abs(pointAtTime3.getTime() - pointAtTime2.getTime());
                if (time > 100.0f || abs > 40.0f) {
                    break;
                }
                long m108987getPointF1C5BW0 = pointAtTime3.m108987getPointF1C5BW0();
                arrayList.add(Float.valueOf(Offset.m107291getXimpl(m108987getPointF1C5BW0)));
                arrayList2.add(Float.valueOf(Offset.m107292getYimpl(m108987getPointF1C5BW0)));
                arrayList3.add(Float.valueOf(-time));
                if (i == 0) {
                    i = 20;
                }
                i--;
                i2++;
                if (i2 >= 20) {
                    pointAtTime2 = pointAtTime3;
                    break;
                }
                pointAtTime2 = pointAtTime3;
            } else {
                break;
            }
        }
        if (i2 >= 3) {
            try {
                PolynomialFit polyFitLeastSquares = VelocityTrackerKt.polyFitLeastSquares(arrayList3, arrayList, 2);
                PolynomialFit polyFitLeastSquares2 = VelocityTrackerKt.polyFitLeastSquares(arrayList3, arrayList2, 2);
                float f = 1000;
                return new VelocityEstimate(OffsetKt.Offset(polyFitLeastSquares.getCoefficients().get(1).floatValue() * f, polyFitLeastSquares2.getCoefficients().get(1).floatValue() * f), polyFitLeastSquares.getConfidence() * polyFitLeastSquares2.getConfidence(), pointAtTime.getTime() - pointAtTime2.getTime(), Offset.m107295minusMKHz9U(pointAtTime.m108987getPointF1C5BW0(), pointAtTime2.m108987getPointF1C5BW0()), null);
            } catch (IllegalArgumentException unused) {
                return VelocityEstimate.Companion.getNone();
            }
        }
        return new VelocityEstimate(Offset.Companion.m107307getZeroF1C5BW0(), 1.0f, pointAtTime.getTime() - pointAtTime2.getTime(), Offset.m107295minusMKHz9U(pointAtTime.m108987getPointF1C5BW0(), pointAtTime2.m108987getPointF1C5BW0()), null);
    }

    /* renamed from: addPosition-Uv8p0NA */
    public final void m108995addPositionUv8p0NA(long j, long j2) {
        int i = (this.index + 1) % 20;
        this.index = i;
        this.samples[i] = new PointAtTime(j2, j, null);
    }

    /* renamed from: calculateVelocity-9UxMQ8M */
    public final long m108996calculateVelocity9UxMQ8M() {
        if (this.useImpulse) {
            return m108994getImpulseVelocity9UxMQ8M();
        }
        long m108993getPixelsPerSecondF1C5BW0 = getLsq2VelocityEstimate().m108993getPixelsPerSecondF1C5BW0();
        return VelocityKt.Velocity(Offset.m107291getXimpl(m108993getPixelsPerSecondF1C5BW0), Offset.m107292getYimpl(m108993getPixelsPerSecondF1C5BW0));
    }

    public final void resetTracking() {
        _ArraysJvm.m17380y(this.samples, null, 0, 0, 6, null);
    }
}
