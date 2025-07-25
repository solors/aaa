package kotlin.ranges;

import ae.KMarkers;
import de.C32869d;
import kotlin.Metadata;
import kotlin.collections.PrimitiveIterators;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1001ud.progressionUtil;

/* compiled from: Progressions.kt */
@Metadata
/* renamed from: kotlin.ranges.d */
/* loaded from: classes7.dex */
public class C37629d implements Iterable<Integer>, KMarkers {
    @NotNull

    /* renamed from: f */
    public static final C37630a f99357f = new C37630a(null);

    /* renamed from: b */
    private final int f99358b;

    /* renamed from: c */
    private final int f99359c;

    /* renamed from: d */
    private final int f99360d;

    /* compiled from: Progressions.kt */
    @Metadata
    /* renamed from: kotlin.ranges.d$a */
    /* loaded from: classes7.dex */
    public static final class C37630a {
        private C37630a() {
        }

        public /* synthetic */ C37630a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C37629d m16949a(int i, int i2, int i3) {
            return new C37629d(i, i2, i3);
        }
    }

    public C37629d(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.f99358b = i;
                this.f99359c = progressionUtil.m2862c(i, i2, i3);
                this.f99360d = i3;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    /* renamed from: c */
    public final int m16953c() {
        return this.f99358b;
    }

    /* renamed from: d */
    public final int m16952d() {
        return this.f99359c;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C37629d) {
            if (!isEmpty() || !((C37629d) obj).isEmpty()) {
                C37629d c37629d = (C37629d) obj;
                if (this.f99358b != c37629d.f99358b || this.f99359c != c37629d.f99359c || this.f99360d != c37629d.f99360d) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m16951f() {
        return this.f99360d;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* renamed from: g */
    public PrimitiveIterators iterator() {
        return new C32869d(this.f99358b, this.f99359c, this.f99360d);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f99358b * 31) + this.f99359c) * 31) + this.f99360d;
    }

    public boolean isEmpty() {
        if (this.f99360d > 0) {
            if (this.f99358b > this.f99359c) {
                return true;
            }
        } else if (this.f99358b < this.f99359c) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        int i;
        if (this.f99360d > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f99358b);
            sb2.append("..");
            sb2.append(this.f99359c);
            sb2.append(" step ");
            i = this.f99360d;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f99358b);
            sb2.append(" downTo ");
            sb2.append(this.f99359c);
            sb2.append(" step ");
            i = -this.f99360d;
        }
        sb2.append(i);
        return sb2.toString();
    }
}
