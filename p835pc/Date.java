package p835pc;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: pc.b */
/* loaded from: classes9.dex */
public final class Date implements Comparable<Date> {
    @NotNull

    /* renamed from: l */
    public static final C39295a f103184l = new C39295a(null);
    @NotNull

    /* renamed from: m */
    private static final Date f103185m = DateJvm.m13199a(0L);

    /* renamed from: b */
    private final int f103186b;

    /* renamed from: c */
    private final int f103187c;

    /* renamed from: d */
    private final int f103188d;
    @NotNull

    /* renamed from: f */
    private final EnumC39298d f103189f;

    /* renamed from: g */
    private final int f103190g;

    /* renamed from: h */
    private final int f103191h;
    @NotNull

    /* renamed from: i */
    private final EnumC39296c f103192i;

    /* renamed from: j */
    private final int f103193j;

    /* renamed from: k */
    private final long f103194k;

    /* compiled from: Date.kt */
    @Metadata
    /* renamed from: pc.b$a */
    /* loaded from: classes9.dex */
    public static final class C39295a {
        private C39295a() {
        }

        public /* synthetic */ C39295a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Date(int i, int i2, int i3, @NotNull EnumC39298d dayOfWeek, int i4, int i5, @NotNull EnumC39296c month, int i6, long j) {
        Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
        Intrinsics.checkNotNullParameter(month, "month");
        this.f103186b = i;
        this.f103187c = i2;
        this.f103188d = i3;
        this.f103189f = dayOfWeek;
        this.f103190g = i4;
        this.f103191h = i5;
        this.f103192i = month;
        this.f103193j = i6;
        this.f103194k = j;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(@NotNull Date other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.m17070k(this.f103194k, other.f103194k);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Date)) {
            return false;
        }
        Date date = (Date) obj;
        if (this.f103186b == date.f103186b && this.f103187c == date.f103187c && this.f103188d == date.f103188d && this.f103189f == date.f103189f && this.f103190g == date.f103190g && this.f103191h == date.f103191h && this.f103192i == date.f103192i && this.f103193j == date.f103193j && this.f103194k == date.f103194k) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f103186b) * 31) + Integer.hashCode(this.f103187c)) * 31) + Integer.hashCode(this.f103188d)) * 31) + this.f103189f.hashCode()) * 31) + Integer.hashCode(this.f103190g)) * 31) + Integer.hashCode(this.f103191h)) * 31) + this.f103192i.hashCode()) * 31) + Integer.hashCode(this.f103193j)) * 31) + Long.hashCode(this.f103194k);
    }

    @NotNull
    public String toString() {
        return "GMTDate(seconds=" + this.f103186b + ", minutes=" + this.f103187c + ", hours=" + this.f103188d + ", dayOfWeek=" + this.f103189f + ", dayOfMonth=" + this.f103190g + ", dayOfYear=" + this.f103191h + ", month=" + this.f103192i + ", year=" + this.f103193j + ", timestamp=" + this.f103194k + ')';
    }
}
