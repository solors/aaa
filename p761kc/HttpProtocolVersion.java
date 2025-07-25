package p761kc;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kc.u */
/* loaded from: classes9.dex */
public final class HttpProtocolVersion {
    @NotNull

    /* renamed from: d */
    public static final C37492a f99040d = new C37492a(null);
    @NotNull

    /* renamed from: e */
    private static final HttpProtocolVersion f99041e = new HttpProtocolVersion("HTTP", 2, 0);
    @NotNull

    /* renamed from: f */
    private static final HttpProtocolVersion f99042f = new HttpProtocolVersion("HTTP", 1, 1);
    @NotNull

    /* renamed from: g */
    private static final HttpProtocolVersion f99043g = new HttpProtocolVersion("HTTP", 1, 0);
    @NotNull

    /* renamed from: h */
    private static final HttpProtocolVersion f99044h = new HttpProtocolVersion("SPDY", 3, 0);
    @NotNull

    /* renamed from: i */
    private static final HttpProtocolVersion f99045i = new HttpProtocolVersion("QUIC", 1, 0);
    @NotNull

    /* renamed from: a */
    private final String f99046a;

    /* renamed from: b */
    private final int f99047b;

    /* renamed from: c */
    private final int f99048c;

    /* compiled from: HttpProtocolVersion.kt */
    @Metadata
    /* renamed from: kc.u$a */
    /* loaded from: classes9.dex */
    public static final class C37492a {
        private C37492a() {
        }

        public /* synthetic */ C37492a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final HttpProtocolVersion m17850a() {
            return HttpProtocolVersion.f99042f;
        }
    }

    public HttpProtocolVersion(@NotNull String name, int i, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f99046a = name;
        this.f99047b = i;
        this.f99048c = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpProtocolVersion)) {
            return false;
        }
        HttpProtocolVersion httpProtocolVersion = (HttpProtocolVersion) obj;
        if (Intrinsics.m17075f(this.f99046a, httpProtocolVersion.f99046a) && this.f99047b == httpProtocolVersion.f99047b && this.f99048c == httpProtocolVersion.f99048c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f99046a.hashCode() * 31) + Integer.hashCode(this.f99047b)) * 31) + Integer.hashCode(this.f99048c);
    }

    @NotNull
    public String toString() {
        return this.f99046a + '/' + this.f99047b + '.' + this.f99048c;
    }
}
