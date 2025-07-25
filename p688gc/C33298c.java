package p688gc;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C37821y2;
import kotlinx.coroutines.InterfaceC37708b2;
import lc.AbstractC38150b;
import mc.C38260d;
import mc.C38261e;
import mc.C38280x;
import mc.InterfaceC38258b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p033bc.C3386f;
import p033bc.HttpClientEngineCapability;
import p719ic.Content;
import p761kc.C37469l;
import p761kc.C37490t;
import p761kc.InterfaceC37464k;
import p761kc.InterfaceC37487r;
import p761kc.URLBuilder;
import p761kc.URLUtils;
import p761kc.Url;
import sc.Type;

/* compiled from: HttpRequest.kt */
@Metadata
/* renamed from: gc.c */
/* loaded from: classes9.dex */
public final class C33298c implements InterfaceC37487r {
    @NotNull

    /* renamed from: g */
    public static final C33299a f90850g = new C33299a(null);
    @NotNull

    /* renamed from: a */
    private final URLBuilder f90851a = new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null);
    @NotNull

    /* renamed from: b */
    private C37490t f90852b = C37490t.f99030b.m17854a();
    @NotNull

    /* renamed from: c */
    private final C37469l f90853c = new C37469l(0, 1, null);
    @NotNull

    /* renamed from: d */
    private Object f90854d = Content.f92032a;
    @NotNull

    /* renamed from: e */
    private InterfaceC37708b2 f90855e = C37821y2.m16064b(null, 1, null);
    @NotNull

    /* renamed from: f */
    private final InterfaceC38258b f90856f = C38260d.m15249a(true);

    /* compiled from: HttpRequest.kt */
    @Metadata
    /* renamed from: gc.c$a */
    /* loaded from: classes9.dex */
    public static final class C33299a {
        private C33299a() {
        }

        public /* synthetic */ C33299a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: HttpRequest.kt */
    @Metadata
    /* renamed from: gc.c$b */
    /* loaded from: classes9.dex */
    static final class C33300b extends Lambda implements Functions<Map<HttpClientEngineCapability<?>, Object>> {

        /* renamed from: g */
        public static final C33300b f90857g = new C33300b();

        C33300b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        public final Map<HttpClientEngineCapability<?>, Object> invoke() {
            return new LinkedHashMap();
        }
    }

    @NotNull
    /* renamed from: a */
    public final C33301d m24214a() {
        AbstractC38150b abstractC38150b;
        Url m18002b = this.f90851a.m18002b();
        C37490t c37490t = this.f90852b;
        InterfaceC37464k m17940m = getHeaders().m17940m();
        Object obj = this.f90854d;
        if (obj instanceof AbstractC38150b) {
            abstractC38150b = (AbstractC38150b) obj;
        } else {
            abstractC38150b = null;
        }
        AbstractC38150b abstractC38150b2 = abstractC38150b;
        if (abstractC38150b2 != null) {
            return new C33301d(m18002b, c37490t, m17940m, abstractC38150b2, this.f90855e, this.f90856f);
        }
        throw new IllegalStateException(("No request transformation found: " + this.f90854d).toString());
    }

    @NotNull
    /* renamed from: b */
    public final InterfaceC38258b m24213b() {
        return this.f90856f;
    }

    @NotNull
    /* renamed from: c */
    public final Object m24212c() {
        return this.f90854d;
    }

    @Nullable
    /* renamed from: d */
    public final Type m24211d() {
        return (Type) this.f90856f.mo15254b(RequestBody.m24170a());
    }

    @Nullable
    /* renamed from: e */
    public final <T> T m24210e(@NotNull HttpClientEngineCapability<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) this.f90856f.mo15254b(C3386f.m103819a());
        if (map != null) {
            return (T) map.get(key);
        }
        return null;
    }

    @NotNull
    /* renamed from: f */
    public final InterfaceC37708b2 m24209f() {
        return this.f90855e;
    }

    @NotNull
    /* renamed from: g */
    public final C37490t m24208g() {
        return this.f90852b;
    }

    @Override // p761kc.InterfaceC37487r
    @NotNull
    public C37469l getHeaders() {
        return this.f90853c;
    }

    @NotNull
    /* renamed from: h */
    public final URLBuilder m24207h() {
        return this.f90851a;
    }

    /* renamed from: i */
    public final void m24206i(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.f90854d = obj;
    }

    /* renamed from: j */
    public final void m24205j(@Nullable Type type) {
        if (type != null) {
            this.f90856f.mo15251f(RequestBody.m24170a(), type);
        } else {
            this.f90856f.mo15253d(RequestBody.m24170a());
        }
    }

    /* renamed from: k */
    public final <T> void m24204k(@NotNull HttpClientEngineCapability<T> key, @NotNull T capability) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(capability, "capability");
        ((Map) this.f90856f.mo15220c(C3386f.m103819a(), C33300b.f90857g)).put(key, capability);
    }

    /* renamed from: l */
    public final void m24203l(@NotNull InterfaceC37708b2 interfaceC37708b2) {
        Intrinsics.checkNotNullParameter(interfaceC37708b2, "<set-?>");
        this.f90855e = interfaceC37708b2;
    }

    /* renamed from: m */
    public final void m24202m(@NotNull C37490t c37490t) {
        Intrinsics.checkNotNullParameter(c37490t, "<set-?>");
        this.f90852b = c37490t;
    }

    @NotNull
    /* renamed from: n */
    public final C33298c m24201n(@NotNull C33298c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f90852b = builder.f90852b;
        this.f90854d = builder.f90854d;
        m24205j(builder.m24211d());
        URLUtils.m17912g(this.f90851a, builder.f90851a);
        URLBuilder uRLBuilder = this.f90851a;
        uRLBuilder.m17983u(uRLBuilder.m17997g());
        C38280x.m15190c(getHeaders(), builder.getHeaders());
        C38261e.m15248a(this.f90856f, builder.f90856f);
        return this;
    }

    @NotNull
    /* renamed from: o */
    public final C33298c m24200o(@NotNull C33298c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f90855e = builder.f90855e;
        return m24201n(builder);
    }
}
