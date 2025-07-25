package p804nd;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: nd.d0 */
/* loaded from: classes5.dex */
public final class UShort implements Comparable<UShort> {
    @NotNull

    /* renamed from: c */
    public static final C38494a f101857c = new C38494a(null);

    /* renamed from: b */
    private final short f101858b;

    /* compiled from: UShort.kt */
    @Metadata
    /* renamed from: nd.d0$a */
    /* loaded from: classes5.dex */
    public static final class C38494a {
        private C38494a() {
        }

        public /* synthetic */ C38494a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ UShort(short s) {
        this.f101858b = s;
    }

    /* renamed from: b */
    public static final /* synthetic */ UShort m14591b(short s) {
        return new UShort(s);
    }

    /* renamed from: d */
    public static boolean m14589d(short s, Object obj) {
        if (!(obj instanceof UShort) || s != ((UShort) obj).m14586g()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static int m14588e(short s) {
        return Short.hashCode(s);
    }

    @NotNull
    /* renamed from: f */
    public static String m14587f(short s) {
        return String.valueOf(s & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.m17071j(m14586g() & 65535, uShort.m14586g() & 65535);
    }

    public boolean equals(Object obj) {
        return m14589d(this.f101858b, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ short m14586g() {
        return this.f101858b;
    }

    public int hashCode() {
        return m14588e(this.f101858b);
    }

    @NotNull
    public String toString() {
        return m14587f(this.f101858b);
    }

    /* renamed from: c */
    public static short m14590c(short s) {
        return s;
    }
}
