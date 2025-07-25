package p817oa;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qa.HistogramReporter;

/* compiled from: DivParsingHistogramReporter.kt */
@Metadata
/* renamed from: oa.h */
/* loaded from: classes8.dex */
public final class C39125h implements InterfaceC39122g {
    @NotNull

    /* renamed from: b */
    private final Functions<HistogramReporter> f102768b;
    @NotNull

    /* renamed from: c */
    private final Functions<Executor> f102769c;

    /* JADX WARN: Multi-variable type inference failed */
    public C39125h(@NotNull Functions<? extends HistogramReporter> histogramReporter, @NotNull Functions<? extends Executor> calculateSizeExecutor) {
        Intrinsics.checkNotNullParameter(histogramReporter, "histogramReporter");
        Intrinsics.checkNotNullParameter(calculateSizeExecutor, "calculateSizeExecutor");
        this.f102768b = histogramReporter;
        this.f102769c = calculateSizeExecutor;
    }
}
