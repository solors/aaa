package cc;

import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p033bc.HttpClientEngineConfig;

@Metadata
/* renamed from: cc.d */
/* loaded from: classes9.dex */
public final class AndroidEngineConfig extends HttpClientEngineConfig {

    /* renamed from: c */
    private int f1972c = 100000;

    /* renamed from: d */
    private int f1973d = 100000;
    @NotNull

    /* renamed from: e */
    private Function1<? super HttpsURLConnection, Unit> f1974e = C3461b.f1977g;
    @NotNull

    /* renamed from: f */
    private Function1<? super HttpURLConnection, Unit> f1975f = C3460a.f1976g;

    /* compiled from: AndroidEngineConfig.kt */
    @Metadata
    /* renamed from: cc.d$a */
    /* loaded from: classes9.dex */
    static final class C3460a extends Lambda implements Function1<HttpURLConnection, Unit> {

        /* renamed from: g */
        public static final C3460a f1976g = new C3460a();

        C3460a() {
            super(1);
        }

        /* renamed from: a */
        public final void m103511a(@NotNull HttpURLConnection httpURLConnection) {
            Intrinsics.checkNotNullParameter(httpURLConnection, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HttpURLConnection httpURLConnection) {
            m103511a(httpURLConnection);
            return Unit.f99208a;
        }
    }

    /* compiled from: AndroidEngineConfig.kt */
    @Metadata
    /* renamed from: cc.d$b */
    /* loaded from: classes9.dex */
    static final class C3461b extends Lambda implements Function1<HttpsURLConnection, Unit> {

        /* renamed from: g */
        public static final C3461b f1977g = new C3461b();

        C3461b() {
            super(1);
        }

        /* renamed from: a */
        public final void m103510a(@NotNull HttpsURLConnection it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HttpsURLConnection httpsURLConnection) {
            m103510a(httpsURLConnection);
            return Unit.f99208a;
        }
    }

    /* renamed from: b */
    public final int m103515b() {
        return this.f1972c;
    }

    @NotNull
    /* renamed from: c */
    public final Function1<HttpURLConnection, Unit> m103514c() {
        return this.f1975f;
    }

    /* renamed from: d */
    public final int m103513d() {
        return this.f1973d;
    }

    @NotNull
    /* renamed from: e */
    public final Function1<HttpsURLConnection, Unit> m103512e() {
        return this.f1974e;
    }
}
