package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.InterfaceC37697a;
import org.jetbrains.annotations.NotNull;

/* compiled from: TimeSource.kt */
@Metadata
/* renamed from: kotlin.time.h */
/* loaded from: classes7.dex */
public final class C37702h {
    @NotNull

    /* renamed from: a */
    public static final C37702h f99501a = new C37702h();

    private C37702h() {
    }

    /* renamed from: a */
    public long m16437a() {
        return MonoTimeSource.f99499a.m16439c();
    }

    @NotNull
    public String toString() {
        return MonoTimeSource.f99499a.toString();
    }

    /* compiled from: TimeSource.kt */
    @Metadata
    /* renamed from: kotlin.time.h$a */
    /* loaded from: classes7.dex */
    public static final class C37703a implements InterfaceC37697a {

        /* renamed from: b */
        private final long f99502b;

        private /* synthetic */ C37703a(long j) {
            this.f99502b = j;
        }

        /* renamed from: c */
        public static final /* synthetic */ C37703a m16434c(long j) {
            return new C37703a(j);
        }

        /* renamed from: f */
        public static long m16431f(long j) {
            return MonoTimeSource.f99499a.m16440b(j);
        }

        /* renamed from: g */
        public static boolean m16430g(long j, Object obj) {
            if (!(obj instanceof C37703a) || j != ((C37703a) obj).m16425l()) {
                return false;
            }
            return true;
        }

        /* renamed from: h */
        public static int m16429h(long j) {
            return Long.hashCode(j);
        }

        /* renamed from: i */
        public static final long m16428i(long j, long j2) {
            return MonoTimeSource.f99499a.m16441a(j, j2);
        }

        /* renamed from: j */
        public static long m16427j(long j, @NotNull InterfaceC37697a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof C37703a) {
                return m16428i(j, ((C37703a) other).m16425l());
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m16426k(j)) + " and " + other);
        }

        /* renamed from: k */
        public static String m16426k(long j) {
            return "ValueTimeMark(reading=" + j + ')';
        }

        @Override // kotlin.time.InterfaceC37697a
        /* renamed from: a */
        public long mo16436a(@NotNull InterfaceC37697a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return m16427j(this.f99502b, other);
        }

        @Override // kotlin.time.TimeSource
        /* renamed from: b */
        public long mo16435b() {
            return m16431f(this.f99502b);
        }

        @Override // java.lang.Comparable
        /* renamed from: d */
        public int compareTo(@NotNull InterfaceC37697a interfaceC37697a) {
            return InterfaceC37697a.C37698a.m16513a(this, interfaceC37697a);
        }

        public boolean equals(Object obj) {
            return m16430g(this.f99502b, obj);
        }

        public int hashCode() {
            return m16429h(this.f99502b);
        }

        /* renamed from: l */
        public final /* synthetic */ long m16425l() {
            return this.f99502b;
        }

        public String toString() {
            return m16426k(this.f99502b);
        }

        /* renamed from: e */
        public static long m16432e(long j) {
            return j;
        }
    }
}
