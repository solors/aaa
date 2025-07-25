package p790mb;

import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qa.HistogramReporter;
import qa.HistogramReporterDelegate;

@Metadata
/* renamed from: mb.b */
/* loaded from: classes8.dex */
public class HistogramRecorder {
    @NotNull

    /* renamed from: a */
    private final HistogramReporter f101131a;
    @NotNull

    /* renamed from: b */
    private final CopyOnWriteArraySet<String> f101132b;

    public HistogramRecorder(@NotNull HistogramReporterDelegate histogramReporterDelegate, @Nullable HistogramNameProvider histogramNameProvider) {
        Intrinsics.checkNotNullParameter(histogramReporterDelegate, "histogramReporterDelegate");
        this.f101131a = new HistogramReporter(histogramReporterDelegate);
        this.f101132b = new CopyOnWriteArraySet<>();
    }
}
