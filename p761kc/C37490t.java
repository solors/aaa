package p761kc;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpMethod.kt */
@Metadata
/* renamed from: kc.t */
/* loaded from: classes9.dex */
public final class C37490t {
    @NotNull

    /* renamed from: b */
    public static final C37491a f99030b = new C37491a(null);
    @NotNull

    /* renamed from: c */
    private static final C37490t f99031c;
    @NotNull

    /* renamed from: d */
    private static final C37490t f99032d;
    @NotNull

    /* renamed from: e */
    private static final C37490t f99033e;
    @NotNull

    /* renamed from: f */
    private static final C37490t f99034f;
    @NotNull

    /* renamed from: g */
    private static final C37490t f99035g;
    @NotNull

    /* renamed from: h */
    private static final C37490t f99036h;
    @NotNull

    /* renamed from: i */
    private static final C37490t f99037i;
    @NotNull

    /* renamed from: j */
    private static final List<C37490t> f99038j;
    @NotNull

    /* renamed from: a */
    private final String f99039a;

    /* compiled from: HttpMethod.kt */
    @Metadata
    /* renamed from: kc.t$a */
    /* loaded from: classes9.dex */
    public static final class C37491a {
        private C37491a() {
        }

        public /* synthetic */ C37491a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C37490t m17854a() {
            return C37490t.f99031c;
        }

        @NotNull
        /* renamed from: b */
        public final C37490t m17853b() {
            return C37490t.f99036h;
        }

        @NotNull
        /* renamed from: c */
        public final C37490t m17852c() {
            return C37490t.f99032d;
        }
    }

    static {
        List<C37490t> m17163p;
        C37490t c37490t = new C37490t("GET");
        f99031c = c37490t;
        C37490t c37490t2 = new C37490t("POST");
        f99032d = c37490t2;
        C37490t c37490t3 = new C37490t("PUT");
        f99033e = c37490t3;
        C37490t c37490t4 = new C37490t("PATCH");
        f99034f = c37490t4;
        C37490t c37490t5 = new C37490t("DELETE");
        f99035g = c37490t5;
        C37490t c37490t6 = new C37490t("HEAD");
        f99036h = c37490t6;
        C37490t c37490t7 = new C37490t("OPTIONS");
        f99037i = c37490t7;
        m17163p = C37563v.m17163p(c37490t, c37490t2, c37490t3, c37490t4, c37490t5, c37490t6, c37490t7);
        f99038j = m17163p;
    }

    public C37490t(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f99039a = value;
    }

    @NotNull
    /* renamed from: d */
    public final String m17855d() {
        return this.f99039a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C37490t) && Intrinsics.m17075f(this.f99039a, ((C37490t) obj).f99039a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f99039a.hashCode();
    }

    @NotNull
    public String toString() {
        return "HttpMethod(value=" + this.f99039a + ')';
    }
}
