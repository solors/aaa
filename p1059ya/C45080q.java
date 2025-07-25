package p1059ya;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.InterfaceC37618e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Utils.kt */
@Metadata
/* renamed from: ya.q */
/* loaded from: classes8.dex */
public final class C45080q {
    /* renamed from: a */
    public static final <K, V> V m973a(@NotNull Map<? extends K, ? extends V> map, K k, @Nullable String str) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        V v = map.get(k);
        if (v != null) {
            return v;
        }
        throw new NoSuchElementException(str);
    }

    /* renamed from: b */
    public static /* synthetic */ Object m972b(Map map, Object obj, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        return m973a(map, obj, str);
    }

    @NotNull
    /* renamed from: c */
    public static final <T> InterfaceC37618e<Object, T> m971c(@Nullable T t) {
        return new C45082t(t);
    }
}
