package androidx.compose.p015ui.input.pointer.util;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VelocityTracker.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.util.ImpulseCalculator */
/* loaded from: classes.dex */
public final class ImpulseCalculator {
    private float work;
    private long previousT = Long.MAX_VALUE;
    private float previousX = Float.NaN;
    private boolean initialCondition = true;

    public final void addPosition(long j, float f) {
        float kineticEnergyToVelocity;
        if (this.previousT != Long.MAX_VALUE && !Float.isNaN(this.previousX)) {
            if (j != this.previousT) {
                kineticEnergyToVelocity = VelocityTrackerKt.kineticEnergyToVelocity(this.work);
                float f2 = (f - this.previousX) / (((float) (j - this.previousT)) * 0.001f);
                float abs = this.work + ((f2 - kineticEnergyToVelocity) * Math.abs(f2));
                this.work = abs;
                if (this.initialCondition) {
                    this.work = abs * 0.5f;
                    this.initialCondition = false;
                }
                this.previousT = j;
                this.previousX = f;
                return;
            }
            this.previousX = f;
            return;
        }
        this.previousT = j;
        this.previousX = f;
    }

    public final float getVelocity() {
        float kineticEnergyToVelocity;
        kineticEnergyToVelocity = VelocityTrackerKt.kineticEnergyToVelocity(this.work);
        return kineticEnergyToVelocity;
    }

    public final void reset() {
        this.work = 0.0f;
        this.previousT = Long.MAX_VALUE;
        this.previousX = Float.NaN;
        this.initialCondition = true;
    }
}
