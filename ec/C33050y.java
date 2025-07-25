package ec;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C37726f2;
import kotlinx.coroutines.C37756k;
import kotlinx.coroutines.C37819y0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.InterfaceC37708b2;
import mc.Attributes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p033bc.HttpClientEngineCapability;
import p1060yb.HttpClient;
import p1074zb.C45245b;
import p1076zd.InterfaceC45268n;
import p688gc.C33298c;
import p761kc.C37472m0;
import p804nd.C38508r;
import p852qf.InterfaceC39416a;
import sd.C42688d;

/* compiled from: HttpTimeout.kt */
@Metadata
/* renamed from: ec.y */
/* loaded from: classes9.dex */
public final class C33050y {
    @NotNull

    /* renamed from: d */
    public static final C33053b f90092d = new C33053b(null);
    @NotNull

    /* renamed from: e */
    private static final Attributes<C33050y> f90093e = new Attributes<>("TimeoutPlugin");
    @Nullable

    /* renamed from: a */
    private final Long f90094a;
    @Nullable

    /* renamed from: b */
    private final Long f90095b;
    @Nullable

    /* renamed from: c */
    private final Long f90096c;

    /* compiled from: HttpTimeout.kt */
    @Metadata
    /* renamed from: ec.y$a */
    /* loaded from: classes9.dex */
    public static final class C33051a {
        @NotNull

        /* renamed from: d */
        public static final C33052a f90097d = new C33052a(null);
        @NotNull

        /* renamed from: e */
        private static final Attributes<C33051a> f90098e = new Attributes<>("TimeoutConfiguration");
        @Nullable

        /* renamed from: a */
        private Long f90099a;
        @Nullable

        /* renamed from: b */
        private Long f90100b;
        @Nullable

        /* renamed from: c */
        private Long f90101c;

        /* compiled from: HttpTimeout.kt */
        @Metadata
        /* renamed from: ec.y$a$a */
        /* loaded from: classes9.dex */
        public static final class C33052a {
            private C33052a() {
            }

            public /* synthetic */ C33052a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ C33051a(Long l, Long l2, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : l3);
        }

        /* renamed from: b */
        private final Long m25175b(Long l) {
            boolean z;
            if (l != null && l.longValue() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return l;
            }
            throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS".toString());
        }

        @NotNull
        /* renamed from: a */
        public final C33050y m25176a() {
            return new C33050y(m25173d(), m25174c(), m25172e(), null);
        }

        @Nullable
        /* renamed from: c */
        public final Long m25174c() {
            return this.f90100b;
        }

        @Nullable
        /* renamed from: d */
        public final Long m25173d() {
            return this.f90099a;
        }

        @Nullable
        /* renamed from: e */
        public final Long m25172e() {
            return this.f90101c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C33051a.class != obj.getClass()) {
                return false;
            }
            C33051a c33051a = (C33051a) obj;
            if (Intrinsics.m17075f(this.f90099a, c33051a.f90099a) && Intrinsics.m17075f(this.f90100b, c33051a.f90100b) && Intrinsics.m17075f(this.f90101c, c33051a.f90101c)) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public final void m25171f(@Nullable Long l) {
            this.f90100b = m25175b(l);
        }

        /* renamed from: g */
        public final void m25170g(@Nullable Long l) {
            this.f90099a = m25175b(l);
        }

        /* renamed from: h */
        public final void m25169h(@Nullable Long l) {
            this.f90101c = m25175b(l);
        }

        public int hashCode() {
            int i;
            int i2;
            Long l = this.f90099a;
            int i3 = 0;
            if (l != null) {
                i = l.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            Long l2 = this.f90100b;
            if (l2 != null) {
                i2 = l2.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (i4 + i2) * 31;
            Long l3 = this.f90101c;
            if (l3 != null) {
                i3 = l3.hashCode();
            }
            return i5 + i3;
        }

        public C33051a(@Nullable Long l, @Nullable Long l2, @Nullable Long l3) {
            this.f90099a = 0L;
            this.f90100b = 0L;
            this.f90101c = 0L;
            m25170g(l);
            m25171f(l2);
            m25169h(l3);
        }
    }

    /* compiled from: HttpTimeout.kt */
    @Metadata
    /* renamed from: ec.y$b */
    /* loaded from: classes9.dex */
    public static final class C33053b implements HttpClientPlugin<C33051a, C33050y>, HttpClientEngineCapability<C33051a> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HttpTimeout.kt */
        @DebugMetadata(m17095c = "io.ktor.client.plugins.HttpTimeout$Plugin$install$1", m17094f = "HttpTimeout.kt", m17093l = {146, 174}, m17092m = "invokeSuspend")
        @Metadata
        /* renamed from: ec.y$b$a */
        /* loaded from: classes9.dex */
        public static final class C33054a extends AbstractC37596l implements InterfaceC45268n<InterfaceC32979e0, C33298c, Continuation<? super C45245b>, Object> {

            /* renamed from: l */
            int f90102l;

            /* renamed from: m */
            private /* synthetic */ Object f90103m;

            /* renamed from: n */
            /* synthetic */ Object f90104n;

            /* renamed from: o */
            final /* synthetic */ C33050y f90105o;

            /* renamed from: p */
            final /* synthetic */ HttpClient f90106p;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: HttpTimeout.kt */
            @Metadata
            /* renamed from: ec.y$b$a$a */
            /* loaded from: classes9.dex */
            public static final class C33055a extends Lambda implements Function1<Throwable, Unit> {

                /* renamed from: g */
                final /* synthetic */ InterfaceC37708b2 f90107g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C33055a(InterfaceC37708b2 interfaceC37708b2) {
                    super(1);
                    this.f90107g = interfaceC37708b2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.f99208a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Throwable th) {
                    InterfaceC37708b2.C37709a.m16410a(this.f90107g, null, 1, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: HttpTimeout.kt */
            @DebugMetadata(m17095c = "io.ktor.client.plugins.HttpTimeout$Plugin$install$1$1$killer$1", m17094f = "HttpTimeout.kt", m17093l = {164}, m17092m = "invokeSuspend")
            @Metadata
            /* renamed from: ec.y$b$a$b */
            /* loaded from: classes9.dex */
            public static final class C33056b extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* renamed from: l */
                int f90108l;

                /* renamed from: m */
                final /* synthetic */ Long f90109m;

                /* renamed from: n */
                final /* synthetic */ C33298c f90110n;

                /* renamed from: o */
                final /* synthetic */ InterfaceC37708b2 f90111o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C33056b(Long l, C33298c c33298c, InterfaceC37708b2 interfaceC37708b2, Continuation<? super C33056b> continuation) {
                    super(2, continuation);
                    this.f90109m = l;
                    this.f90110n = c33298c;
                    this.f90111o = interfaceC37708b2;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C33056b(this.f90109m, this.f90110n, this.f90111o, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object m6959e;
                    m6959e = C42688d.m6959e();
                    int i = this.f90108l;
                    if (i != 0) {
                        if (i == 1) {
                            C38508r.m14539b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        C38508r.m14539b(obj);
                        long longValue = this.f90109m.longValue();
                        this.f90108l = 1;
                        if (C37819y0.m16068a(longValue, this) == m6959e) {
                            return m6959e;
                        }
                    }
                    HttpTimeout httpTimeout = new HttpTimeout(this.f90110n);
                    InterfaceC39416a m25161c = C33057z.m25161c();
                    m25161c.mo12256a("Request timeout: " + this.f90110n.m24207h());
                    InterfaceC37708b2 interfaceC37708b2 = this.f90111o;
                    String message = httpTimeout.getMessage();
                    Intrinsics.m17074g(message);
                    C37726f2.m16366d(interfaceC37708b2, message, httpTimeout);
                    return Unit.f99208a;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object mo105910invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C33056b) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C33054a(C33050y c33050y, HttpClient httpClient, Continuation<? super C33054a> continuation) {
                super(3, continuation);
                this.f90105o = c33050y;
                this.f90106p = httpClient;
            }

            @Override // p1076zd.InterfaceC45268n
            @Nullable
            /* renamed from: b */
            public final Object invoke(@NotNull InterfaceC32979e0 interfaceC32979e0, @NotNull C33298c c33298c, @Nullable Continuation<? super C45245b> continuation) {
                C33054a c33054a = new C33054a(this.f90105o, this.f90106p, continuation);
                c33054a.f90103m = interfaceC32979e0;
                c33054a.f90104n = c33298c;
                return c33054a.invokeSuspend(Unit.f99208a);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object m6959e;
                InterfaceC37708b2 m16221d;
                m6959e = C42688d.m6959e();
                int i = this.f90102l;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            C38508r.m14539b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C38508r.m14539b(obj);
                    return obj;
                }
                C38508r.m14539b(obj);
                InterfaceC32979e0 interfaceC32979e0 = (InterfaceC32979e0) this.f90103m;
                C33298c c33298c = (C33298c) this.f90104n;
                if (!C37472m0.m17931b(c33298c.m24207h().m17989o())) {
                    c33298c.m24212c();
                    C33053b c33053b = C33050y.f90092d;
                    C33051a c33051a = (C33051a) c33298c.m24210e(c33053b);
                    if (c33051a == null && this.f90105o.m25177f()) {
                        c33051a = new C33051a(null, null, null, 7, null);
                        c33298c.m24204k(c33053b, c33051a);
                    }
                    if (c33051a != null) {
                        C33050y c33050y = this.f90105o;
                        HttpClient httpClient = this.f90106p;
                        Long m25174c = c33051a.m25174c();
                        if (m25174c == null) {
                            m25174c = c33050y.f90095b;
                        }
                        c33051a.m25171f(m25174c);
                        Long m25172e = c33051a.m25172e();
                        if (m25172e == null) {
                            m25172e = c33050y.f90096c;
                        }
                        c33051a.m25169h(m25172e);
                        Long m25173d = c33051a.m25173d();
                        if (m25173d == null) {
                            m25173d = c33050y.f90094a;
                        }
                        c33051a.m25170g(m25173d);
                        Long m25173d2 = c33051a.m25173d();
                        if (m25173d2 == null) {
                            m25173d2 = c33050y.f90094a;
                        }
                        if (m25173d2 != null && m25173d2.longValue() != Long.MAX_VALUE) {
                            m16221d = C37756k.m16221d(httpClient, null, null, new C33056b(m25173d2, c33298c, c33298c.m24209f(), null), 3, null);
                            c33298c.m24209f().mo16119k(new C33055a(m16221d));
                        }
                    }
                    this.f90103m = null;
                    this.f90102l = 2;
                    obj = interfaceC32979e0.mo25186a(c33298c, this);
                    if (obj == m6959e) {
                        return m6959e;
                    }
                    return obj;
                }
                this.f90103m = null;
                this.f90102l = 1;
                obj = interfaceC32979e0.mo25186a(c33298c, this);
                if (obj == m6959e) {
                    return m6959e;
                }
                return obj;
            }
        }

        private C33053b() {
        }

        public /* synthetic */ C33053b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // ec.HttpClientPlugin
        /* renamed from: c */
        public void mo25167b(@NotNull C33050y plugin, @NotNull HttpClient scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            ((C33043x) C33010n.m25294b(scope, C33043x.f90072c)).m25188d(new C33054a(plugin, scope, null));
        }

        @Override // ec.HttpClientPlugin
        @NotNull
        /* renamed from: d */
        public C33050y mo25168a(@NotNull Function1<? super C33051a, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            C33051a c33051a = new C33051a(null, null, null, 7, null);
            block.invoke(c33051a);
            return c33051a.m25176a();
        }

        @Override // ec.HttpClientPlugin
        @NotNull
        public Attributes<C33050y> getKey() {
            return C33050y.f90093e;
        }
    }

    public /* synthetic */ C33050y(Long l, Long l2, Long l3, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, l3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final boolean m25177f() {
        if (this.f90094a == null && this.f90095b == null && this.f90096c == null) {
            return false;
        }
        return true;
    }

    private C33050y(Long l, Long l2, Long l3) {
        this.f90094a = l;
        this.f90095b = l2;
        this.f90096c = l3;
    }
}
