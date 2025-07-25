package p817oa;

import androidx.annotation.AnyThread;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p817oa.CpuUsageHistogramReporter;
import p864ra.Cancelable;

@Metadata
/* renamed from: oa.b */
/* loaded from: classes8.dex */
public interface CpuUsageHistogramReporter {
    @AnyThread
    @NotNull
    /* renamed from: a */
    Cancelable mo13910a(@NotNull String str, int i);

    /* compiled from: CpuUsageHistogramReporter.kt */
    @Metadata
    /* renamed from: oa.b$a */
    /* loaded from: classes8.dex */
    public static final class C39119a implements CpuUsageHistogramReporter {
        /* renamed from: b */
        public static /* synthetic */ void m13909b() {
            m13908c();
        }

        @Override // p817oa.CpuUsageHistogramReporter
        @NotNull
        /* renamed from: a */
        public Cancelable mo13910a(@NotNull String histogramName, int i) {
            Intrinsics.checkNotNullParameter(histogramName, "histogramName");
            return new Cancelable() { // from class: oa.a
                @Override // p864ra.Cancelable
                public final void cancel() {
                    CpuUsageHistogramReporter.C39119a.m13909b();
                }
            };
        }

        /* renamed from: c */
        public static final void m13908c() {
        }
    }
}
