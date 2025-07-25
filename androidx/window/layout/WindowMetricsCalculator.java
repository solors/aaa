package androidx.window.layout;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowMetricsCalculator.kt */
@Metadata
/* loaded from: classes2.dex */
public interface WindowMetricsCalculator {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WindowMetricsCalculator.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @NotNull
        private static Function1<? super WindowMetricsCalculator, ? extends WindowMetricsCalculator> decorator = WindowMetricsCalculator$Companion$decorator$1.INSTANCE;

        private Companion() {
        }

        @NotNull
        public final WindowMetricsCalculator getOrCreate() {
            return decorator.invoke(WindowMetricsCalculatorCompat.INSTANCE);
        }

        @ExperimentalWindowApi
        @RestrictTo({RestrictTo.Scope.TESTS})
        public final void overrideDecorator(@NotNull WindowMetricsCalculatorDecorator overridingDecorator) {
            Intrinsics.checkNotNullParameter(overridingDecorator, "overridingDecorator");
            decorator = new WindowMetricsCalculator$Companion$overrideDecorator$1(overridingDecorator);
        }

        @ExperimentalWindowApi
        @RestrictTo({RestrictTo.Scope.TESTS})
        public final void reset() {
            decorator = WindowMetricsCalculator$Companion$reset$1.INSTANCE;
        }
    }

    @NotNull
    static WindowMetricsCalculator getOrCreate() {
        return Companion.getOrCreate();
    }

    @ExperimentalWindowApi
    @RestrictTo({RestrictTo.Scope.TESTS})
    static void overrideDecorator(@NotNull WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
        Companion.overrideDecorator(windowMetricsCalculatorDecorator);
    }

    @ExperimentalWindowApi
    @RestrictTo({RestrictTo.Scope.TESTS})
    static void reset() {
        Companion.reset();
    }

    @NotNull
    WindowMetrics computeCurrentWindowMetrics(@NotNull Activity activity);

    @NotNull
    WindowMetrics computeMaximumWindowMetrics(@NotNull Activity activity);
}
