package p1060yb;

import ec.C33010n;
import ec.HttpClientPlugin;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import mc.Attributes;
import mc.C38260d;
import mc.C38274r;
import mc.InterfaceC38258b;
import org.jetbrains.annotations.NotNull;
import p033bc.HttpClientEngineConfig;

@Metadata
/* renamed from: yb.b */
/* loaded from: classes9.dex */
public final class HttpClientConfig<T extends HttpClientEngineConfig> {

    /* renamed from: g */
    private boolean f118601g;
    @NotNull

    /* renamed from: a */
    private final Map<Attributes<?>, Function1<HttpClient, Unit>> f118595a = new LinkedHashMap();
    @NotNull

    /* renamed from: b */
    private final Map<Attributes<?>, Function1<Object, Unit>> f118596b = new LinkedHashMap();
    @NotNull

    /* renamed from: c */
    private final Map<String, Function1<HttpClient, Unit>> f118597c = new LinkedHashMap();
    @NotNull

    /* renamed from: d */
    private Function1<? super T, Unit> f118598d = C45088a.f118603g;

    /* renamed from: e */
    private boolean f118599e = true;

    /* renamed from: f */
    private boolean f118600f = true;

    /* renamed from: h */
    private boolean f118602h = C38274r.f101158a.m15216b();

    /* compiled from: HttpClientConfig.kt */
    @Metadata
    /* renamed from: yb.b$a */
    /* loaded from: classes9.dex */
    static final class C45088a extends Lambda implements Function1<T, Unit> {

        /* renamed from: g */
        public static final C45088a f118603g = new C45088a();

        C45088a() {
            super(1);
        }

        /* renamed from: a */
        public final void m940a(@NotNull T t) {
            Intrinsics.checkNotNullParameter(t, "$this$null");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            m940a((HttpClientEngineConfig) obj);
            return Unit.f99208a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpClientConfig.kt */
    @Metadata
    /* renamed from: yb.b$b */
    /* loaded from: classes9.dex */
    public static final class C45089b extends Lambda implements Function1 {

        /* renamed from: g */
        public static final C45089b f118604g = new C45089b();

        C45089b() {
            super(1);
        }

        /* renamed from: invoke  reason: collision with other method in class */
        public final void m110487invoke(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m110487invoke(obj);
            return Unit.f99208a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unknown type variable: TBuilder in type: kotlin.jvm.functions.Function1<TBuilder, kotlin.Unit> */
    /* compiled from: HttpClientConfig.kt */
    @Metadata
    /* renamed from: yb.b$c */
    /* loaded from: classes9.dex */
    public static final class C45090c extends Lambda implements Function1<Object, Unit> {

        /* renamed from: g */
        final /* synthetic */ Function1<Object, Unit> f118605g;

        /* renamed from: h */
        final /* synthetic */ Function1<TBuilder, Unit> f118606h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: TBuilder in type: kotlin.jvm.functions.Function1<? super TBuilder, kotlin.Unit> */
        C45090c(Function1<Object, Unit> function1, Function1<? super TBuilder, Unit> function12) {
            super(1);
            this.f118605g = function1;
            this.f118606h = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.f99208a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "$this$null");
            Function1<Object, Unit> function1 = this.f118605g;
            if (function1 != null) {
                function1.invoke(obj);
            }
            this.f118606h.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unknown type variable: TBuilder in type: ec.m<TBuilder, TPlugin> */
    /* JADX WARN: Unknown type variable: TPlugin in type: ec.m<TBuilder, TPlugin> */
    /* compiled from: HttpClientConfig.kt */
    @Metadata
    /* renamed from: yb.b$d */
    /* loaded from: classes9.dex */
    public static final class C45091d extends Lambda implements Function1<HttpClient, Unit> {

        /* renamed from: g */
        final /* synthetic */ HttpClientPlugin<TBuilder, TPlugin> f118607g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HttpClientConfig.kt */
        @Metadata
        /* renamed from: yb.b$d$a */
        /* loaded from: classes9.dex */
        public static final class C45092a extends Lambda implements Functions<InterfaceC38258b> {

            /* renamed from: g */
            public static final C45092a f118608g = new C45092a();

            C45092a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Functions
            @NotNull
            /* renamed from: b */
            public final InterfaceC38258b invoke() {
                return C38260d.m15249a(true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: TBuilder in type: ec.m<? extends TBuilder, TPlugin> */
        /* JADX WARN: Unknown type variable: TPlugin in type: ec.m<? extends TBuilder, TPlugin> */
        C45091d(HttpClientPlugin<? extends TBuilder, TPlugin> httpClientPlugin) {
            super(1);
            this.f118607g = httpClientPlugin;
        }

        /* renamed from: a */
        public final void m939a(@NotNull HttpClient scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            Object obj = ((HttpClientConfig) scope.m961e()).f118596b.get(this.f118607g.getKey());
            Intrinsics.m17074g(obj);
            Object mo25168a = this.f118607g.mo25168a((Function1) obj);
            this.f118607g.mo25167b(mo25168a, scope);
            ((InterfaceC38258b) scope.getAttributes().mo15220c(C33010n.m25295a(), C45092a.f118608g)).mo15251f(this.f118607g.getKey(), mo25168a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HttpClient httpClient) {
            m939a(httpClient);
            return Unit.f99208a;
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m942j(HttpClientConfig httpClientConfig, HttpClientPlugin httpClientPlugin, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = C45089b.f118604g;
        }
        httpClientConfig.m945g(httpClientPlugin, function1);
    }

    /* renamed from: b */
    public final boolean m950b() {
        return this.f118602h;
    }

    @NotNull
    /* renamed from: c */
    public final Function1<T, Unit> m949c() {
        return (Function1<? super T, Unit>) this.f118598d;
    }

    /* renamed from: d */
    public final boolean m948d() {
        return this.f118601g;
    }

    /* renamed from: e */
    public final boolean m947e() {
        return this.f118599e;
    }

    /* renamed from: f */
    public final boolean m946f() {
        return this.f118600f;
    }

    /* renamed from: g */
    public final <TBuilder, TPlugin> void m945g(@NotNull HttpClientPlugin<? extends TBuilder, TPlugin> plugin, @NotNull Function1<? super TBuilder, Unit> configure) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Intrinsics.checkNotNullParameter(configure, "configure");
        this.f118596b.put(plugin.getKey(), new C45090c(this.f118596b.get(plugin.getKey()), configure));
        if (this.f118595a.containsKey(plugin.getKey())) {
            return;
        }
        this.f118595a.put(plugin.getKey(), new C45091d(plugin));
    }

    /* renamed from: h */
    public final void m944h(@NotNull String key, @NotNull Function1<? super HttpClient, Unit> block) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f118597c.put(key, block);
    }

    /* renamed from: i */
    public final void m943i(@NotNull HttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        Iterator<T> it = this.f118595a.values().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(client);
        }
        Iterator<T> it2 = this.f118597c.values().iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(client);
        }
    }

    /* renamed from: k */
    public final void m941k(@NotNull HttpClientConfig<? extends T> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f118599e = other.f118599e;
        this.f118600f = other.f118600f;
        this.f118601g = other.f118601g;
        this.f118595a.putAll(other.f118595a);
        this.f118596b.putAll(other.f118596b);
        this.f118597c.putAll(other.f118597c);
    }
}
