package qa;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: qa.b */
/* loaded from: classes8.dex */
public interface HistogramReporterDelegate {

    /* compiled from: HistogramReporterDelegate.kt */
    @Metadata
    /* renamed from: qa.b$a */
    /* loaded from: classes8.dex */
    public static final class C39376a implements HistogramReporterDelegate {
        @NotNull

        /* renamed from: a */
        public static final C39376a f103561a = new C39376a();

        private C39376a() {
        }

        @Override // qa.HistogramReporterDelegate
        /* renamed from: a */
        public void mo12805a(@NotNull String histogramName, long j, @Nullable String str) {
            Intrinsics.checkNotNullParameter(histogramName, "histogramName");
        }
    }

    /* renamed from: a */
    void mo12805a(@NotNull String str, long j, @Nullable String str2);
}
