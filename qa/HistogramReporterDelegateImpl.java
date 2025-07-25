package qa;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges._Ranges;
import md.Provider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p817oa.C39136r;
import p817oa.HistogramCallTypeProvider;
import p817oa.HistogramRecordConfiguration;
import p817oa.InterfaceC39137u;
import p864ra.HistogramUtils;

@Metadata
/* renamed from: qa.c */
/* loaded from: classes8.dex */
public final class HistogramReporterDelegateImpl implements HistogramReporterDelegate {
    @NotNull

    /* renamed from: a */
    private final Provider<C39136r> f103562a;
    @NotNull

    /* renamed from: b */
    private final HistogramCallTypeProvider f103563b;
    @NotNull

    /* renamed from: c */
    private final HistogramRecordConfiguration f103564c;
    @NotNull

    /* renamed from: d */
    private final Provider<InterfaceC39137u> f103565d;

    /* compiled from: HistogramReporterDelegateImpl.kt */
    @Metadata
    /* renamed from: qa.c$a */
    /* loaded from: classes8.dex */
    static final class C39377a extends Lambda implements Functions<Unit> {

        /* renamed from: h */
        final /* synthetic */ String f103567h;

        /* renamed from: i */
        final /* synthetic */ String f103568i;

        /* renamed from: j */
        final /* synthetic */ long f103569j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39377a(String str, String str2, long j) {
            super(0);
            this.f103567h = str;
            this.f103568i = str2;
            this.f103569j = j;
        }

        @Override // kotlin.jvm.functions.Functions
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f99208a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            long m16916f;
            m16916f = _Ranges.m16916f(this.f103569j, 1L);
            ((C39136r) HistogramReporterDelegateImpl.this.f103562a.get()).m13855a(this.f103567h + '.' + this.f103568i, m16916f, TimeUnit.MILLISECONDS);
        }
    }

    public HistogramReporterDelegateImpl(@NotNull Provider<C39136r> histogramRecorder, @NotNull HistogramCallTypeProvider histogramCallTypeProvider, @NotNull HistogramRecordConfiguration histogramRecordConfig, @NotNull Provider<InterfaceC39137u> taskExecutor) {
        Intrinsics.checkNotNullParameter(histogramRecorder, "histogramRecorder");
        Intrinsics.checkNotNullParameter(histogramCallTypeProvider, "histogramCallTypeProvider");
        Intrinsics.checkNotNullParameter(histogramRecordConfig, "histogramRecordConfig");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f103562a = histogramRecorder;
        this.f103563b = histogramCallTypeProvider;
        this.f103564c = histogramRecordConfig;
        this.f103565d = taskExecutor;
    }

    @Override // qa.HistogramReporterDelegate
    /* renamed from: a */
    public void mo12805a(@NotNull String histogramName, long j, @Nullable String str) {
        String str2;
        Intrinsics.checkNotNullParameter(histogramName, "histogramName");
        String m13876c = this.f103563b.m13876c(histogramName);
        if (str == null) {
            str2 = m13876c;
        } else {
            str2 = str;
        }
        if (!HistogramUtils.f103760a.m12580a(str2, this.f103564c)) {
            return;
        }
        this.f103565d.get().mo13849a(new C39377a(histogramName, str2, j));
    }
}
