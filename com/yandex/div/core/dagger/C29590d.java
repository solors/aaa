package com.yandex.div.core.dagger;

import com.amazon.p047a.p048a.p071o.KiwiConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import md.Provider;
import org.jetbrains.annotations.NotNull;
import p817oa.C39136r;
import p817oa.HistogramCallTypeProvider;
import p817oa.HistogramColdTypeChecker;
import p817oa.HistogramConfiguration;
import qa.HistogramReporter;
import qa.HistogramReporterDelegate;
import qa.HistogramReporterDelegateImpl;

/* compiled from: DivHistogramsModule.kt */
@Metadata
/* renamed from: com.yandex.div.core.dagger.d */
/* loaded from: classes8.dex */
public final class C29590d {

    /* compiled from: DivHistogramsModule.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.dagger.d$a */
    /* loaded from: classes8.dex */
    /* synthetic */ class C29591a extends FunctionReferenceImpl implements Functions<HistogramColdTypeChecker> {
        C29591a(Object obj) {
            super(0, obj, Provider.class, KiwiConstants.f2714as, "get()Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Functions
        /* renamed from: c */
        public final HistogramColdTypeChecker invoke() {
            return (HistogramColdTypeChecker) ((Provider) this.receiver).get();
        }
    }

    @NotNull
    /* renamed from: a */
    public static final HistogramReporter m37310a(@NotNull HistogramReporterDelegate histogramReporterDelegate) {
        Intrinsics.checkNotNullParameter(histogramReporterDelegate, "histogramReporterDelegate");
        return new HistogramReporter(histogramReporterDelegate);
    }

    @NotNull
    /* renamed from: b */
    public static final HistogramReporterDelegate m37309b(@NotNull HistogramConfiguration histogramConfiguration, @NotNull Provider<C39136r> histogramRecorderProvider, @NotNull Provider<HistogramColdTypeChecker> histogramColdTypeChecker) {
        Intrinsics.checkNotNullParameter(histogramConfiguration, "histogramConfiguration");
        Intrinsics.checkNotNullParameter(histogramRecorderProvider, "histogramRecorderProvider");
        Intrinsics.checkNotNullParameter(histogramColdTypeChecker, "histogramColdTypeChecker");
        if (!histogramConfiguration.mo13875a()) {
            return HistogramReporterDelegate.C39376a.f103561a;
        }
        return new HistogramReporterDelegateImpl(histogramRecorderProvider, new HistogramCallTypeProvider(new C29591a(histogramColdTypeChecker)), histogramConfiguration, histogramConfiguration.mo13872h());
    }
}
