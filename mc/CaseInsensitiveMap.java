package mc;

import ae.InterfaceC0039e;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: mc.g */
/* loaded from: classes9.dex */
public final class CaseInsensitiveMap<Value> implements Map<String, Value>, InterfaceC0039e {
    @NotNull

    /* renamed from: b */
    private final Map<C38267h, Value> f101136b = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CaseInsensitiveMap.kt */
    @Metadata
    /* renamed from: mc.g$a */
    /* loaded from: classes9.dex */
    public static final class C38263a extends Lambda implements Function1<Map.Entry<C38267h, Value>, Map.Entry<String, Value>> {

        /* renamed from: g */
        public static final C38263a f101137g = new C38263a();

        C38263a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: b */
        public final Map.Entry<String, Value> invoke(@NotNull Map.Entry<C38267h, Value> $receiver) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            return new C38272o($receiver.getKey().m15234a(), $receiver.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CaseInsensitiveMap.kt */
    @Metadata
    /* renamed from: mc.g$b */
    /* loaded from: classes9.dex */
    public static final class C38264b extends Lambda implements Function1<Map.Entry<String, Value>, Map.Entry<C38267h, Value>> {

        /* renamed from: g */
        public static final C38264b f101138g = new C38264b();

        C38264b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: b */
        public final Map.Entry<C38267h, Value> invoke(@NotNull Map.Entry<String, Value> $receiver) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            return new C38272o(C38281y.m15187a($receiver.getKey()), $receiver.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CaseInsensitiveMap.kt */
    @Metadata
    /* renamed from: mc.g$c */
    /* loaded from: classes9.dex */
    public static final class C38265c extends Lambda implements Function1<C38267h, String> {

        /* renamed from: g */
        public static final C38265c f101139g = new C38265c();

        C38265c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a */
        public final String invoke(@NotNull C38267h $receiver) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            return $receiver.m15234a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CaseInsensitiveMap.kt */
    @Metadata
    /* renamed from: mc.g$d */
    /* loaded from: classes9.dex */
    public static final class C38266d extends Lambda implements Function1<String, C38267h> {

        /* renamed from: g */
        public static final C38266d f101140g = new C38266d();

        C38266d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: b */
        public final C38267h invoke(@NotNull String $receiver) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            return C38281y.m15187a($receiver);
        }
    }

    /* renamed from: a */
    public boolean m15246a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f101136b.containsKey(new C38267h(key));
    }

    @Nullable
    /* renamed from: b */
    public Value m15245b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f101136b.get(C38281y.m15187a(key));
    }

    @NotNull
    /* renamed from: c */
    public Set<Map.Entry<String, Value>> m15244c() {
        return new DelegatingMutableSet(this.f101136b.entrySet(), C38263a.f101137g, C38264b.f101138g);
    }

    @Override // java.util.Map
    public void clear() {
        this.f101136b.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return m15246a((String) obj);
    }

    @Override // java.util.Map
    public boolean containsValue(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f101136b.containsValue(obj);
    }

    @NotNull
    /* renamed from: d */
    public Set<String> m15243d() {
        return new DelegatingMutableSet(this.f101136b.keySet(), C38265c.f101139g, C38266d.f101140g);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Value>> entrySet() {
        return m15244c();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof CaseInsensitiveMap)) {
            return Intrinsics.m17075f(((CaseInsensitiveMap) obj).f101136b, this.f101136b);
        }
        return false;
    }

    /* renamed from: f */
    public int m15242f() {
        return this.f101136b.size();
    }

    @NotNull
    /* renamed from: g */
    public Collection<Value> m15241g() {
        return this.f101136b.values();
    }

    @Override // java.util.Map
    public final /* bridge */ Value get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return m15245b((String) obj);
    }

    @Override // java.util.Map
    @Nullable
    /* renamed from: h */
    public Value put(@NotNull String key, @NotNull Value value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f101136b.put(C38281y.m15187a(key), value);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f101136b.hashCode();
    }

    @Nullable
    /* renamed from: i */
    public Value m15239i(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f101136b.remove(C38281y.m15187a(key));
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f101136b.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return m15243d();
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends String, ? extends Value> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry<? extends String, ? extends Value> entry : from.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Value remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return m15239i((String) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m15242f();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Value> values() {
        return m15241g();
    }
}
