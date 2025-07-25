package p817oa;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: oa.t */
/* loaded from: classes8.dex */
public final class RenderConfiguration {
    @NotNull

    /* renamed from: a */
    private final HistogramFilter f102794a;
    @NotNull

    /* renamed from: b */
    private final HistogramFilter f102795b;
    @NotNull

    /* renamed from: c */
    private final HistogramFilter f102796c;
    @NotNull

    /* renamed from: d */
    private final HistogramFilter f102797d;

    public RenderConfiguration() {
        this(null, null, null, null, 15, null);
    }

    @NotNull
    /* renamed from: a */
    public final HistogramFilter m13853a() {
        return this.f102796c;
    }

    @NotNull
    /* renamed from: b */
    public final HistogramFilter m13852b() {
        return this.f102795b;
    }

    @NotNull
    /* renamed from: c */
    public final HistogramFilter m13851c() {
        return this.f102794a;
    }

    @NotNull
    /* renamed from: d */
    public final HistogramFilter m13850d() {
        return this.f102797d;
    }

    public RenderConfiguration(@NotNull HistogramFilter measureFilter, @NotNull HistogramFilter layoutFilter, @NotNull HistogramFilter drawFilter, @NotNull HistogramFilter totalFilter) {
        Intrinsics.checkNotNullParameter(measureFilter, "measureFilter");
        Intrinsics.checkNotNullParameter(layoutFilter, "layoutFilter");
        Intrinsics.checkNotNullParameter(drawFilter, "drawFilter");
        Intrinsics.checkNotNullParameter(totalFilter, "totalFilter");
        this.f102794a = measureFilter;
        this.f102795b = layoutFilter;
        this.f102796c = drawFilter;
        this.f102797d = totalFilter;
    }

    public /* synthetic */ RenderConfiguration(HistogramFilter histogramFilter, HistogramFilter histogramFilter2, HistogramFilter histogramFilter3, HistogramFilter histogramFilter4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HistogramFilter.f102789a.m13862e() : histogramFilter, (i & 2) != 0 ? HistogramFilter.f102789a.m13862e() : histogramFilter2, (i & 4) != 0 ? HistogramFilter.f102789a.m13862e() : histogramFilter3, (i & 8) != 0 ? HistogramFilter.f102789a.m13861f() : histogramFilter4);
    }
}
