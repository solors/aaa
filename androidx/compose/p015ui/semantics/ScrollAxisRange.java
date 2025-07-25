package androidx.compose.p015ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SemanticsProperties.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.semantics.ScrollAxisRange */
/* loaded from: classes.dex */
public final class ScrollAxisRange {
    public static final int $stable = 0;
    @NotNull
    private final Functions<Float> maxValue;
    private final boolean reverseScrolling;
    @NotNull
    private final Functions<Float> value;

    public ScrollAxisRange(@NotNull Functions<Float> value, @NotNull Functions<Float> maxValue, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(maxValue, "maxValue");
        this.value = value;
        this.maxValue = maxValue;
        this.reverseScrolling = z;
    }

    @NotNull
    public final Functions<Float> getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    @NotNull
    public final Functions<Float> getValue() {
        return this.value;
    }

    @NotNull
    public String toString() {
        return "ScrollAxisRange(value=" + this.value.invoke().floatValue() + ", maxValue=" + this.maxValue.invoke().floatValue() + ", reverseScrolling=" + this.reverseScrolling + ')';
    }

    public /* synthetic */ ScrollAxisRange(Functions functions, Functions functions2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(functions, functions2, (i & 4) != 0 ? false : z);
    }
}
