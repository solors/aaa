package androidx.media3.common.util;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;

@UnstableApi
/* loaded from: classes2.dex */
public final class ConstantRateTimestampIterator implements TimestampIterator {
    private double currentTimestampUs;
    private final long durationUs;
    private final float frameRate;
    private final double framesDurationUs;
    private int framesToAdd;

    public ConstantRateTimestampIterator(@IntRange(from = 1) long j, @FloatRange(from = 0.0d, fromInclusive = false) float f) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        Assertions.checkArgument(f > 0.0f);
        this.durationUs = j;
        this.frameRate = f;
        this.framesToAdd = Math.round((((float) j) / 1000000.0f) * f);
        this.framesDurationUs = 1000000.0f / f;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public boolean hasNext() {
        if (this.framesToAdd != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public long next() {
        Assertions.checkState(hasNext());
        this.framesToAdd--;
        long round = Math.round(this.currentTimestampUs);
        this.currentTimestampUs += this.framesDurationUs;
        return round;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public ConstantRateTimestampIterator copyOf() {
        return new ConstantRateTimestampIterator(this.durationUs, this.frameRate);
    }
}
