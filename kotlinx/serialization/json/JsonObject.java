package kotlinx.serialization.json;

import ae.KMarkers;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p821oe.InterfaceC39163h;
import se.StringOps;

/* compiled from: JsonElement.kt */
@Metadata
@InterfaceC39163h(with = C37874u.class)
/* loaded from: classes8.dex */
public final class JsonObject extends JsonElement implements Map<String, JsonElement>, KMarkers {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull

    /* renamed from: b */
    private final Map<String, JsonElement> f99706b;

    /* compiled from: JsonElement.kt */
    @Metadata
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<JsonObject> serializer() {
            return C37874u.f99761a;
        }
    }

    /* compiled from: JsonElement.kt */
    @Metadata
    /* renamed from: kotlinx.serialization.json.JsonObject$a */
    /* loaded from: classes8.dex */
    static final class C37852a extends Lambda implements Function1<Map.Entry<? extends String, ? extends JsonElement>, CharSequence> {

        /* renamed from: g */
        public static final C37852a f99707g = new C37852a();

        C37852a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends JsonElement> entry) {
            return invoke2((Map.Entry<String, ? extends JsonElement>) entry);
        }

        @NotNull
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final CharSequence invoke2(@NotNull Map.Entry<String, ? extends JsonElement> entry) {
            Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
            StringBuilder sb2 = new StringBuilder();
            StringOps.m6767c(sb2, entry.getKey());
            sb2.append(':');
            sb2.append(entry.getValue());
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JsonObject(@NotNull Map<String, ? extends JsonElement> content) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        this.f99706b = content;
    }

    /* renamed from: a */
    public boolean m15957a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f99706b.containsKey(key);
    }

    /* renamed from: b */
    public boolean m15956b(@NotNull JsonElement value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f99706b.containsValue(value);
    }

    @Nullable
    /* renamed from: c */
    public JsonElement m15955c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f99706b.get(key);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement compute(String str, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement computeIfAbsent(String str, Function<? super String, ? extends JsonElement> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement computeIfPresent(String str, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return m15957a((String) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        return m15956b((JsonElement) obj);
    }

    @NotNull
    /* renamed from: d */
    public Set<Map.Entry<String, JsonElement>> m15954d() {
        return this.f99706b.entrySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, JsonElement>> entrySet() {
        return m15954d();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return Intrinsics.m17075f(this.f99706b, obj);
    }

    @NotNull
    /* renamed from: f */
    public Set<String> m15953f() {
        return this.f99706b.keySet();
    }

    /* renamed from: g */
    public int m15952g() {
        return this.f99706b.size();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return m15955c((String) obj);
    }

    @NotNull
    /* renamed from: h */
    public Collection<JsonElement> m15951h() {
        return this.f99706b.values();
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f99706b.hashCode();
    }

    @Override // java.util.Map
    /* renamed from: i */
    public JsonElement remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f99706b.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return m15953f();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement merge(String str, JsonElement jsonElement, BiFunction<? super JsonElement, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement put(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends JsonElement> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement putIfAbsent(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement replace(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m15952g();
    }

    @NotNull
    public String toString() {
        String m17521z0;
        m17521z0 = _Collections.m17521z0(this.f99706b.entrySet(), ",", "{", "}", 0, null, C37852a.f99707g, 24, null);
        return m17521z0;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<JsonElement> values() {
        return m15951h();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, JsonElement jsonElement, JsonElement jsonElement2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
