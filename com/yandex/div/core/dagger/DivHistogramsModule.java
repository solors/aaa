package com.yandex.div.core.dagger;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qa.HistogramReporter;
import qa.HistogramReporterDelegate;

@Metadata
/* renamed from: com.yandex.div.core.dagger.c */
/* loaded from: classes8.dex */
public final class DivHistogramsModule {
    @NotNull

    /* renamed from: a */
    public static final DivHistogramsModule f75244a = new DivHistogramsModule();

    private DivHistogramsModule() {
    }

    @NotNull
    /* renamed from: a */
    public final HistogramReporter m37311a(@NotNull HistogramReporterDelegate histogramReporterDelegate) {
        Intrinsics.checkNotNullParameter(histogramReporterDelegate, "histogramReporterDelegate");
        return C29590d.m37310a(histogramReporterDelegate);
    }
}
