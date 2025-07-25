package androidx.compose.p015ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import de.Ranges;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C37636h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SemanticsProperties.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.semantics.ProgressBarRangeInfo */
/* loaded from: classes.dex */
public final class ProgressBarRangeInfo {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final ProgressBarRangeInfo Indeterminate;
    private final float current;
    @NotNull
    private final Ranges<Float> range;
    private final int steps;

    /* compiled from: SemanticsProperties.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.semantics.ProgressBarRangeInfo$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ProgressBarRangeInfo getIndeterminate() {
            return ProgressBarRangeInfo.Indeterminate;
        }
    }

    static {
        Ranges m16920b;
        m16920b = C37636h.m16920b(0.0f, 0.0f);
        Indeterminate = new ProgressBarRangeInfo(0.0f, m16920b, 0, 4, null);
    }

    public ProgressBarRangeInfo(float f, @NotNull Ranges<Float> range, int i) {
        Intrinsics.checkNotNullParameter(range, "range");
        this.current = f;
        this.range = range;
        this.steps = i;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBarRangeInfo)) {
            return false;
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) obj;
        if (this.current == progressBarRangeInfo.current) {
            z = true;
        } else {
            z = false;
        }
        if (z && Intrinsics.m17075f(this.range, progressBarRangeInfo.range) && this.steps == progressBarRangeInfo.steps) {
            return true;
        }
        return false;
    }

    public final float getCurrent() {
        return this.current;
    }

    @NotNull
    public final Ranges<Float> getRange() {
        return this.range;
    }

    public final int getSteps() {
        return this.steps;
    }

    public int hashCode() {
        return (((Float.hashCode(this.current) * 31) + this.range.hashCode()) * 31) + this.steps;
    }

    @NotNull
    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.current + ", range=" + this.range + ", steps=" + this.steps + ')';
    }

    public /* synthetic */ ProgressBarRangeInfo(float f, Ranges ranges, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, ranges, (i2 & 4) != 0 ? 0 : i);
    }
}
