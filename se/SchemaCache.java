package se;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: se.d0 */
/* loaded from: classes8.dex */
public final class SchemaCache {
    @NotNull

    /* renamed from: a */
    private final Map<SerialDescriptor, Map<C42694a<Object>, Object>> f111816a = createMapForCache.m6889a(16);

    /* compiled from: SchemaCache.kt */
    @Metadata
    /* renamed from: se.d0$a */
    /* loaded from: classes8.dex */
    public static final class C42694a<T> {
    }

    @Nullable
    /* renamed from: a */
    public final <T> T m6849a(@NotNull SerialDescriptor descriptor, @NotNull C42694a<T> key) {
        Object obj;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map<C42694a<Object>, Object> map = this.f111816a.get(descriptor);
        if (map != null) {
            obj = map.get(key);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }

    @NotNull
    /* renamed from: b */
    public final <T> T m6848b(@NotNull SerialDescriptor descriptor, @NotNull C42694a<T> key, @NotNull Functions<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t = (T) m6849a(descriptor, key);
        if (t != null) {
            return t;
        }
        T invoke = defaultValue.invoke();
        m6847c(descriptor, key, invoke);
        return invoke;
    }

    /* renamed from: c */
    public final <T> void m6847c(@NotNull SerialDescriptor descriptor, @NotNull C42694a<T> key, @NotNull T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map<SerialDescriptor, Map<C42694a<Object>, Object>> map = this.f111816a;
        Map<C42694a<Object>, Object> map2 = map.get(descriptor);
        if (map2 == null) {
            map2 = createMapForCache.m6889a(2);
            map.put(descriptor, map2);
        }
        map2.put(key, value);
    }
}
