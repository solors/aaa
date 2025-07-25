package androidx.window.layout;

import androidx.annotation.RestrictTo;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowMetricsCalculator.kt */
@ExperimentalWindowApi
@Metadata
@RestrictTo({RestrictTo.Scope.TESTS})
/* loaded from: classes2.dex */
public interface WindowMetricsCalculatorDecorator {
    @ExperimentalWindowApi
    @RestrictTo({RestrictTo.Scope.TESTS})
    @NotNull
    WindowMetricsCalculator decorate(@NotNull WindowMetricsCalculator windowMetricsCalculator);
}
