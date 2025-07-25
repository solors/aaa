package qa;

import androidx.annotation.AnyThread;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p817oa.HistogramFilter;

@AnyThread
@Metadata
/* renamed from: qa.a */
/* loaded from: classes8.dex */
public class HistogramReporter {
    @NotNull

    /* renamed from: a */
    private final HistogramReporterDelegate f103560a;

    public HistogramReporter(@NotNull HistogramReporterDelegate histogramReporterDelegate) {
        Intrinsics.checkNotNullParameter(histogramReporterDelegate, "histogramReporterDelegate");
        this.f103560a = histogramReporterDelegate;
    }

    /* renamed from: b */
    public static /* synthetic */ void m12806b(HistogramReporter histogramReporter, String str, long j, String str2, String str3, HistogramFilter histogramFilter, int i, Object obj) {
        String str4;
        String str5;
        HistogramFilter histogramFilter2;
        if (obj == null) {
            if ((i & 4) != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if ((i & 8) != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            if ((i & 16) != 0) {
                histogramFilter2 = HistogramFilter.f102789a.m13861f();
            } else {
                histogramFilter2 = histogramFilter;
            }
            histogramReporter.m12807a(str, j, str4, str5, histogramFilter2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportDuration");
    }

    /* renamed from: a */
    public void m12807a(@NotNull String histogramName, long j, @Nullable String str, @Nullable String str2, @NotNull HistogramFilter filter) {
        Intrinsics.checkNotNullParameter(histogramName, "histogramName");
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (filter.mo13867a(null)) {
            this.f103560a.mo12805a(histogramName, j, str2);
        }
        if (str != null) {
            String str3 = str + '.' + histogramName;
            if (filter.mo13867a(str)) {
                this.f103560a.mo12805a(str3, j, str2);
            }
        }
    }
}
