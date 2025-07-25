package kotlin.ranges;

import ae.KMarkers;
import de.C32870e;
import kotlin.Metadata;
import kotlin.collections.AbstractC37552l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p1001ud.progressionUtil;

/* compiled from: Progressions.kt */
@Metadata
/* renamed from: kotlin.ranges.e */
/* loaded from: classes7.dex */
public class C37631e implements Iterable<Long>, KMarkers {
    @NotNull

    /* renamed from: f */
    public static final C37632a f99361f = new C37632a(null);

    /* renamed from: b */
    private final long f99362b;

    /* renamed from: c */
    private final long f99363c;

    /* renamed from: d */
    private final long f99364d;

    /* compiled from: Progressions.kt */
    @Metadata
    /* renamed from: kotlin.ranges.e$a */
    /* loaded from: classes7.dex */
    public static final class C37632a {
        private C37632a() {
        }

        public /* synthetic */ C37632a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C37631e(long j, long j2, long j3) {
        if (j3 != 0) {
            if (j3 != Long.MIN_VALUE) {
                this.f99362b = j;
                this.f99363c = progressionUtil.m2861d(j, j2, j3);
                this.f99364d = j3;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    /* renamed from: c */
    public final long m16948c() {
        return this.f99362b;
    }

    /* renamed from: d */
    public final long m16947d() {
        return this.f99363c;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* renamed from: f */
    public AbstractC37552l0 iterator() {
        return new C32870e(this.f99362b, this.f99363c, this.f99364d);
    }
}
