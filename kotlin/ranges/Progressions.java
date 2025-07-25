package kotlin.ranges;

import ae.KMarkers;
import de.ProgressionIterators;
import kotlin.Metadata;
import kotlin.collections.AbstractC37560s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p1001ud.progressionUtil;

@Metadata
/* renamed from: kotlin.ranges.a */
/* loaded from: classes7.dex */
public class Progressions implements Iterable<Character>, KMarkers {
    @NotNull

    /* renamed from: f */
    public static final C37625a f99349f = new C37625a(null);

    /* renamed from: b */
    private final char f99350b;

    /* renamed from: c */
    private final char f99351c;

    /* renamed from: d */
    private final int f99352d;

    /* compiled from: Progressions.kt */
    @Metadata
    /* renamed from: kotlin.ranges.a$a */
    /* loaded from: classes7.dex */
    public static final class C37625a {
        private C37625a() {
        }

        public /* synthetic */ C37625a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Progressions(char c, char c2, int i) {
        if (i != 0) {
            if (i != Integer.MIN_VALUE) {
                this.f99350b = c;
                this.f99351c = (char) progressionUtil.m2862c(c, c2, i);
                this.f99352d = i;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    /* renamed from: c */
    public final char m16964c() {
        return this.f99350b;
    }

    /* renamed from: d */
    public final char m16963d() {
        return this.f99351c;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* renamed from: f */
    public AbstractC37560s iterator() {
        return new ProgressionIterators(this.f99350b, this.f99351c, this.f99352d);
    }
}
