package p804nd;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: nd.w */
/* loaded from: classes5.dex */
public final class UByte implements Comparable<UByte> {
    @NotNull

    /* renamed from: c */
    public static final C38514a f101884c = new C38514a(null);

    /* renamed from: b */
    private final byte f101885b;

    /* compiled from: UByte.kt */
    @Metadata
    /* renamed from: nd.w$a */
    /* loaded from: classes5.dex */
    public static final class C38514a {
        private C38514a() {
        }

        public /* synthetic */ C38514a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ UByte(byte b) {
        this.f101885b = b;
    }

    /* renamed from: b */
    public static final /* synthetic */ UByte m14531b(byte b) {
        return new UByte(b);
    }

    /* renamed from: d */
    public static boolean m14529d(byte b, Object obj) {
        if (!(obj instanceof UByte) || b != ((UByte) obj).m14526g()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static int m14528e(byte b) {
        return Byte.hashCode(b);
    }

    @NotNull
    /* renamed from: f */
    public static String m14527f(byte b) {
        return String.valueOf(b & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.m17071j(m14526g() & 255, uByte.m14526g() & 255);
    }

    public boolean equals(Object obj) {
        return m14529d(this.f101885b, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ byte m14526g() {
        return this.f101885b;
    }

    public int hashCode() {
        return m14528e(this.f101885b);
    }

    @NotNull
    public String toString() {
        return m14527f(this.f101885b);
    }

    /* renamed from: c */
    public static byte m14530c(byte b) {
        return b;
    }
}
