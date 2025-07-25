package kotlin.time;

import ee.DurationUnitJvm;
import kotlin.Metadata;
import kotlin.time.C37702h;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlin.time.g */
/* loaded from: classes7.dex */
public final class MonoTimeSource {
    @NotNull

    /* renamed from: a */
    public static final MonoTimeSource f99499a = new MonoTimeSource();

    /* renamed from: b */
    private static final long f99500b = System.nanoTime();

    private MonoTimeSource() {
    }

    /* renamed from: d */
    private final long m16438d() {
        return System.nanoTime() - f99500b;
    }

    /* renamed from: a */
    public final long m16441a(long j, long j2) {
        return longSaturatedMath.m16442d(j, j2, DurationUnitJvm.f90127c);
    }

    /* renamed from: b */
    public final long m16440b(long j) {
        return longSaturatedMath.m16444b(m16438d(), j, DurationUnitJvm.f90127c);
    }

    /* renamed from: c */
    public long m16439c() {
        return C37702h.C37703a.m16432e(m16438d());
    }

    @NotNull
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
