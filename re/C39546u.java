package re;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1062yd.JvmClassMapping;

/* compiled from: Caching.kt */
@Metadata
/* renamed from: re.u */
/* loaded from: classes8.dex */
final class C39546u<T> implements InterfaceC39564z1<T> {
    @NotNull

    /* renamed from: a */
    private final Function1<KClass<?>, KSerializer<T>> f103911a;
    @NotNull

    /* renamed from: b */
    private final ConcurrentHashMap<Class<?>, C39512k<T>> f103912b;

    /* JADX WARN: Multi-variable type inference failed */
    public C39546u(@NotNull Function1<? super KClass<?>, ? extends KSerializer<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f103911a = compute;
        this.f103912b = new ConcurrentHashMap<>();
    }

    @Override // re.InterfaceC39564z1
    @Nullable
    /* renamed from: a */
    public KSerializer<T> mo12257a(@NotNull KClass<Object> key) {
        C39512k<T> putIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap<Class<?>, C39512k<T>> concurrentHashMap = this.f103912b;
        Class<?> m913a = JvmClassMapping.m913a(key);
        C39512k<T> c39512k = concurrentHashMap.get(m913a);
        if (c39512k == null && (putIfAbsent = concurrentHashMap.putIfAbsent(m913a, (c39512k = new C39512k<>(this.f103911a.invoke(key))))) != null) {
            c39512k = putIfAbsent;
        }
        return c39512k.f103871a;
    }
}
