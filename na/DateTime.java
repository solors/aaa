package na;

import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.EnumC38505n;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

@Metadata
/* renamed from: na.b */
/* loaded from: classes8.dex */
public final class DateTime implements Comparable<DateTime> {
    @NotNull

    /* renamed from: h */
    public static final C38482a f101825h = new C38482a(null);
    @NotNull

    /* renamed from: i */
    private static final SimpleTimeZone f101826i = new SimpleTimeZone(0, "UTC");

    /* renamed from: b */
    private final long f101827b;
    @NotNull

    /* renamed from: c */
    private final TimeZone f101828c;
    @NotNull

    /* renamed from: d */
    private final InterfaceC38501j f101829d;

    /* renamed from: f */
    private final int f101830f;

    /* renamed from: g */
    private final long f101831g;

    /* compiled from: DateTime.kt */
    @Metadata
    /* renamed from: na.b$a */
    /* loaded from: classes8.dex */
    public static final class C38482a {
        private C38482a() {
        }

        public /* synthetic */ C38482a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final String m14635a(@NotNull Calendar c) {
            String m16553p0;
            String m16553p02;
            String m16553p03;
            String m16553p04;
            String m16553p05;
            Intrinsics.checkNotNullParameter(c, "c");
            String valueOf = String.valueOf(c.get(1));
            m16553p0 = C37690r.m16553p0(String.valueOf(c.get(2) + 1), 2, '0');
            m16553p02 = C37690r.m16553p0(String.valueOf(c.get(5)), 2, '0');
            m16553p03 = C37690r.m16553p0(String.valueOf(c.get(11)), 2, '0');
            m16553p04 = C37690r.m16553p0(String.valueOf(c.get(12)), 2, '0');
            m16553p05 = C37690r.m16553p0(String.valueOf(c.get(13)), 2, '0');
            return valueOf + '-' + m16553p0 + '-' + m16553p02 + ' ' + m16553p03 + ':' + m16553p04 + ':' + m16553p05;
        }
    }

    /* compiled from: DateTime.kt */
    @Metadata
    /* renamed from: na.b$b */
    /* loaded from: classes8.dex */
    static final class C38483b extends Lambda implements Functions<Calendar> {
        C38483b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        /* renamed from: b */
        public final Calendar invoke() {
            Calendar calendar = Calendar.getInstance(DateTime.f101826i);
            calendar.setTimeInMillis(DateTime.this.m14637e());
            return calendar;
        }
    }

    public DateTime(long j, @NotNull TimeZone timezone) {
        InterfaceC38501j m14553b;
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        this.f101827b = j;
        this.f101828c = timezone;
        m14553b = LazyJVM.m14553b(EnumC38505n.f101867d, new C38483b());
        this.f101829d = m14553b;
        int rawOffset = timezone.getRawOffset() / 60;
        this.f101830f = rawOffset;
        this.f101831g = j - (rawOffset * 60000);
    }

    /* renamed from: d */
    private final Calendar m14638d() {
        return (Calendar) this.f101829d.getValue();
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(@NotNull DateTime other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.m17070k(this.f101831g, other.f101831g);
    }

    /* renamed from: e */
    public final long m14637e() {
        return this.f101827b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DateTime) && this.f101831g == ((DateTime) obj).f101831g) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final TimeZone m14636f() {
        return this.f101828c;
    }

    public int hashCode() {
        return Long.hashCode(this.f101831g);
    }

    @NotNull
    public String toString() {
        C38482a c38482a = f101825h;
        Calendar calendar = m14638d();
        Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
        return c38482a.m14635a(calendar);
    }
}
