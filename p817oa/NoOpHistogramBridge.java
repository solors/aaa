package p817oa;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: oa.s */
/* loaded from: classes8.dex */
public final class NoOpHistogramBridge implements HistogramBridge {
    @Override // p817oa.HistogramBridge
    /* renamed from: a */
    public void mo13854a(@NotNull String name, long j, long j2, long j3, @NotNull TimeUnit unit, long j4) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unit, "unit");
    }
}
