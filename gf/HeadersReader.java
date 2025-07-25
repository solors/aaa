package gf;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import p1077ze.C45327u;

@Metadata
/* renamed from: gf.a */
/* loaded from: classes10.dex */
public final class HeadersReader {
    @NotNull

    /* renamed from: c */
    public static final C33422a f91204c = new C33422a(null);
    @NotNull

    /* renamed from: a */
    private final BufferedSource f91205a;

    /* renamed from: b */
    private long f91206b;

    /* compiled from: HeadersReader.kt */
    @Metadata
    /* renamed from: gf.a$a */
    /* loaded from: classes10.dex */
    public static final class C33422a {
        private C33422a() {
        }

        public /* synthetic */ C33422a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HeadersReader(@NotNull BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f91205a = source;
        this.f91206b = 262144L;
    }

    @NotNull
    /* renamed from: a */
    public final C45327u m23980a() {
        boolean z;
        C45327u.C45328a c45328a = new C45327u.C45328a();
        while (true) {
            String m23979b = m23979b();
            if (m23979b.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return c45328a.m190e();
            }
            c45328a.m193b(m23979b);
        }
    }

    @NotNull
    /* renamed from: b */
    public final String m23979b() {
        String readUtf8LineStrict = this.f91205a.readUtf8LineStrict(this.f91206b);
        this.f91206b -= readUtf8LineStrict.length();
        return readUtf8LineStrict;
    }
}
