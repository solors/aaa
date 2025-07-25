package p817oa;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* renamed from: oa.i */
/* loaded from: classes8.dex */
public interface HistogramBridge {
    @Deprecated
    /* renamed from: a */
    void mo13854a(@NonNull String str, long j, long j2, long j3, @NonNull TimeUnit timeUnit, long j4);

    /* renamed from: b */
    default void m13880b(@NonNull String str, long j, long j2, long j3, @NonNull TimeUnit timeUnit, int i) {
        mo13854a(str, j, j2, j3, timeUnit, i);
    }
}
