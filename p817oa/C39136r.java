package p817oa;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* compiled from: HistogramRecorder.java */
/* renamed from: oa.r */
/* loaded from: classes8.dex */
public class C39136r {
    @NonNull

    /* renamed from: a */
    private final HistogramBridge f102793a;

    public C39136r(@NonNull HistogramBridge histogramBridge) {
        this.f102793a = histogramBridge;
    }

    /* renamed from: a */
    public void m13855a(@NonNull String str, long j, @NonNull TimeUnit timeUnit) {
        this.f102793a.m13880b(str, timeUnit.toMillis(j), 1L, 10000L, TimeUnit.MILLISECONDS, 50);
    }
}
