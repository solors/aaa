package androidx.window.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowMetricsCalculator.kt */
@Metadata
/* loaded from: classes2.dex */
final class WindowMetricsCalculator$Companion$decorator$1 extends Lambda implements Function1<WindowMetricsCalculator, WindowMetricsCalculator> {
    public static final WindowMetricsCalculator$Companion$decorator$1 INSTANCE = new WindowMetricsCalculator$Companion$decorator$1();

    WindowMetricsCalculator$Companion$decorator$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final WindowMetricsCalculator invoke(@NotNull WindowMetricsCalculator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }
}
