package p804nd;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: nd.a0 */
/* loaded from: classes5.dex */
public final class ULong implements Comparable<ULong> {
    @NotNull

    /* renamed from: c */
    public static final C38489a f101846c = new C38489a(null);

    /* renamed from: b */
    private final long f101847b;

    /* compiled from: ULong.kt */
    @Metadata
    /* renamed from: nd.a0$a */
    /* loaded from: classes5.dex */
    public static final class C38489a {
        private C38489a() {
        }

        public /* synthetic */ C38489a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ ULong(long j) {
        this.f101847b = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ ULong m14618b(long j) {
        return new ULong(j);
    }

    /* renamed from: d */
    public static boolean m14616d(long j, Object obj) {
        if (!(obj instanceof ULong) || j != ((ULong) obj).m14613g()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static int m14615e(long j) {
        return Long.hashCode(j);
    }

    @NotNull
    /* renamed from: f */
    public static String m14614f(long j) {
        return UnsignedUtils.m14559f(j);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedUtils.m14561d(m14613g(), uLong.m14613g());
    }

    public boolean equals(Object obj) {
        return m14616d(this.f101847b, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ long m14613g() {
        return this.f101847b;
    }

    public int hashCode() {
        return m14615e(this.f101847b);
    }

    @NotNull
    public String toString() {
        return m14614f(this.f101847b);
    }

    /* renamed from: c */
    public static long m14617c(long j) {
        return j;
    }
}
