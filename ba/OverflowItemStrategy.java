package ba;

import android.util.DisplayMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1042x9.BaseDivViewExtensions;
import sa.C39638b;
import sa.KAssert;

@Metadata
/* renamed from: ba.f */
/* loaded from: classes8.dex */
public abstract class OverflowItemStrategy {
    @NotNull

    /* renamed from: b */
    public static final C3374b f1637b = new C3374b(null);

    /* renamed from: a */
    private final int f1638a;

    /* compiled from: OverflowItemStrategy.kt */
    @Metadata
    /* renamed from: ba.f$a */
    /* loaded from: classes8.dex */
    public static final class C3373a extends OverflowItemStrategy {

        /* renamed from: c */
        private final int f1639c;

        /* renamed from: d */
        private final int f1640d;

        /* renamed from: e */
        private final int f1641e;

        /* renamed from: f */
        private final int f1642f;
        @NotNull

        /* renamed from: g */
        private final DisplayMetrics f1643g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3373a(int i, int i2, int i3, int i4, @NotNull DisplayMetrics metrics) {
            super(i2, null);
            Intrinsics.checkNotNullParameter(metrics, "metrics");
            this.f1639c = i;
            this.f1640d = i2;
            this.f1641e = i3;
            this.f1642f = i4;
            this.f1643g = metrics;
        }

        @Override // ba.OverflowItemStrategy
        /* renamed from: b */
        public int mo103849b(int i) {
            if (((OverflowItemStrategy) this).f1638a <= 0) {
                return -1;
            }
            return Math.min(this.f1639c + i, this.f1640d - 1);
        }

        @Override // ba.OverflowItemStrategy
        /* renamed from: c */
        public int mo103848c(int i) {
            return Math.min(Math.max(0, this.f1642f + BaseDivViewExtensions.m1858I(Integer.valueOf(i), this.f1643g)), this.f1641e);
        }

        @Override // ba.OverflowItemStrategy
        /* renamed from: d */
        public int mo103847d(int i) {
            if (((OverflowItemStrategy) this).f1638a <= 0) {
                return -1;
            }
            return Math.max(0, this.f1639c - i);
        }
    }

    /* compiled from: OverflowItemStrategy.kt */
    @Metadata
    /* renamed from: ba.f$b */
    /* loaded from: classes8.dex */
    public static final class C3374b {
        private C3374b() {
        }

        public /* synthetic */ C3374b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final OverflowItemStrategy m103850a(@Nullable String str, int i, int i2, int i3, int i4, @NotNull DisplayMetrics metrics) {
            boolean m17075f;
            Intrinsics.checkNotNullParameter(metrics, "metrics");
            if (str == null) {
                m17075f = true;
            } else {
                m17075f = Intrinsics.m17075f(str, "clamp");
            }
            if (m17075f) {
                return new C3373a(i, i2, i3, i4, metrics);
            }
            if (Intrinsics.m17075f(str, "ring")) {
                return new C3375c(i, i2, i3, i4, metrics);
            }
            KAssert kAssert = KAssert.f104132a;
            if (C39638b.m11995q()) {
                C39638b.m12001k("Unsupported overflow " + str);
            }
            return new C3373a(i, i2, i3, i4, metrics);
        }
    }

    /* compiled from: OverflowItemStrategy.kt */
    @Metadata
    /* renamed from: ba.f$c */
    /* loaded from: classes8.dex */
    public static final class C3375c extends OverflowItemStrategy {

        /* renamed from: c */
        private final int f1644c;

        /* renamed from: d */
        private final int f1645d;

        /* renamed from: e */
        private final int f1646e;

        /* renamed from: f */
        private final int f1647f;
        @NotNull

        /* renamed from: g */
        private final DisplayMetrics f1648g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3375c(int i, int i2, int i3, int i4, @NotNull DisplayMetrics metrics) {
            super(i2, null);
            Intrinsics.checkNotNullParameter(metrics, "metrics");
            this.f1644c = i;
            this.f1645d = i2;
            this.f1646e = i3;
            this.f1647f = i4;
            this.f1648g = metrics;
        }

        @Override // ba.OverflowItemStrategy
        /* renamed from: b */
        public int mo103849b(int i) {
            if (((OverflowItemStrategy) this).f1638a <= 0) {
                return -1;
            }
            return (this.f1644c + i) % this.f1645d;
        }

        @Override // ba.OverflowItemStrategy
        /* renamed from: c */
        public int mo103848c(int i) {
            int m1858I = this.f1647f + BaseDivViewExtensions.m1858I(Integer.valueOf(i), this.f1648g);
            int i2 = this.f1646e;
            int i3 = m1858I % i2;
            if (i3 < 0) {
                return i3 + i2;
            }
            return i3;
        }

        @Override // ba.OverflowItemStrategy
        /* renamed from: d */
        public int mo103847d(int i) {
            if (((OverflowItemStrategy) this).f1638a <= 0) {
                return -1;
            }
            int i2 = this.f1644c - i;
            int i3 = this.f1645d;
            int i4 = i2 % i3;
            return (i3 & (((i4 ^ i3) & ((-i4) | i4)) >> 31)) + i4;
        }
    }

    public /* synthetic */ OverflowItemStrategy(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* renamed from: b */
    public abstract int mo103849b(int i);

    /* renamed from: c */
    public abstract int mo103848c(int i);

    /* renamed from: d */
    public abstract int mo103847d(int i);

    private OverflowItemStrategy(int i) {
        this.f1638a = i;
    }
}
