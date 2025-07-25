package p817oa;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: oa.k */
/* loaded from: classes8.dex */
public final class HistogramCallTypeProvider extends HistogramCallTypeChecker {
    @NotNull

    /* renamed from: b */
    private final Functions<HistogramColdTypeChecker> f102772b;

    public HistogramCallTypeProvider(@NotNull Functions<HistogramColdTypeChecker> histogramColdTypeChecker) {
        Intrinsics.checkNotNullParameter(histogramColdTypeChecker, "histogramColdTypeChecker");
        this.f102772b = histogramColdTypeChecker;
    }

    @NotNull
    /* renamed from: c */
    public final String m13876c(@NotNull String histogramName) {
        Intrinsics.checkNotNullParameter(histogramName, "histogramName");
        if (this.f102772b.invoke().m13879a(histogramName)) {
            m13879a(histogramName);
            return "Cold";
        } else if (m13879a(histogramName)) {
            return "Cool";
        } else {
            return "Warm";
        }
    }
}
