package p804nd;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: nd.y */
/* loaded from: classes5.dex */
public final class UInt implements Comparable<UInt> {
    @NotNull

    /* renamed from: c */
    public static final C38516a f101889c = new C38516a(null);

    /* renamed from: b */
    private final int f101890b;

    /* compiled from: UInt.kt */
    @Metadata
    /* renamed from: nd.y$a */
    /* loaded from: classes5.dex */
    public static final class C38516a {
        private C38516a() {
        }

        public /* synthetic */ C38516a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ UInt(int i) {
        this.f101890b = i;
    }

    /* renamed from: b */
    public static final /* synthetic */ UInt m14508b(int i) {
        return new UInt(i);
    }

    /* renamed from: d */
    public static boolean m14506d(int i, Object obj) {
        if (!(obj instanceof UInt) || i != ((UInt) obj).m14503g()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static int m14505e(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: f */
    public static String m14504f(int i) {
        return String.valueOf(i & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UInt uInt) {
        return UnsignedUtils.m14563b(m14503g(), uInt.m14503g());
    }

    public boolean equals(Object obj) {
        return m14506d(this.f101890b, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ int m14503g() {
        return this.f101890b;
    }

    public int hashCode() {
        return m14505e(this.f101890b);
    }

    @NotNull
    public String toString() {
        return m14504f(this.f101890b);
    }

    /* renamed from: c */
    public static int m14507c(int i) {
        return i;
    }
}
