package ee;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* renamed from: ee.b */
/* loaded from: classes7.dex */
public final class DurationUnitJvm {

    /* renamed from: c */
    public static final DurationUnitJvm f90127c = new DurationUnitJvm("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* renamed from: d */
    public static final DurationUnitJvm f90128d = new DurationUnitJvm("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* renamed from: f */
    public static final DurationUnitJvm f90129f = new DurationUnitJvm("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* renamed from: g */
    public static final DurationUnitJvm f90130g = new DurationUnitJvm("SECONDS", 3, TimeUnit.SECONDS);

    /* renamed from: h */
    public static final DurationUnitJvm f90131h = new DurationUnitJvm("MINUTES", 4, TimeUnit.MINUTES);

    /* renamed from: i */
    public static final DurationUnitJvm f90132i = new DurationUnitJvm("HOURS", 5, TimeUnit.HOURS);

    /* renamed from: j */
    public static final DurationUnitJvm f90133j = new DurationUnitJvm("DAYS", 6, TimeUnit.DAYS);

    /* renamed from: k */
    private static final /* synthetic */ DurationUnitJvm[] f90134k;

    /* renamed from: l */
    private static final /* synthetic */ EnumEntries f90135l;
    @NotNull

    /* renamed from: b */
    private final TimeUnit f90136b;

    static {
        DurationUnitJvm[] m25157b = m25157b();
        f90134k = m25157b;
        f90135l = C44401b.m3113a(m25157b);
    }

    private DurationUnitJvm(String str, int i, TimeUnit timeUnit) {
        this.f90136b = timeUnit;
    }

    /* renamed from: b */
    private static final /* synthetic */ DurationUnitJvm[] m25157b() {
        return new DurationUnitJvm[]{f90127c, f90128d, f90129f, f90130g, f90131h, f90132i, f90133j};
    }

    public static DurationUnitJvm valueOf(String str) {
        return (DurationUnitJvm) Enum.valueOf(DurationUnitJvm.class, str);
    }

    public static DurationUnitJvm[] values() {
        return (DurationUnitJvm[]) f90134k.clone();
    }

    @NotNull
    /* renamed from: c */
    public final TimeUnit m25156c() {
        return this.f90136b;
    }
}
