package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45269o;

/* compiled from: LruCache.kt */
@Metadata
/* loaded from: classes.dex */
public final class LruCacheKt {
    @NotNull
    public static final <K, V> LruCache<K, V> lruCache(int i, @NotNull Function2<? super K, ? super V, Integer> sizeOf, @NotNull Function1<? super K, ? extends V> create, @NotNull InterfaceC45269o<? super Boolean, ? super K, ? super V, ? super V, Unit> onEntryRemoved) {
        Intrinsics.m17072i(sizeOf, "sizeOf");
        Intrinsics.m17072i(create, "create");
        Intrinsics.m17072i(onEntryRemoved, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(sizeOf, create, onEntryRemoved, i, i);
    }

    @NotNull
    public static /* synthetic */ LruCache lruCache$default(int i, Function2 function2, Function1 function1, InterfaceC45269o interfaceC45269o, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function2 = LruCacheKt$lruCache$1.INSTANCE;
        }
        Function2 sizeOf = function2;
        if ((i2 & 4) != 0) {
            function1 = LruCacheKt$lruCache$2.INSTANCE;
        }
        Function1 create = function1;
        if ((i2 & 8) != 0) {
            interfaceC45269o = LruCacheKt$lruCache$3.INSTANCE;
        }
        InterfaceC45269o onEntryRemoved = interfaceC45269o;
        Intrinsics.m17072i(sizeOf, "sizeOf");
        Intrinsics.m17072i(create, "create");
        Intrinsics.m17072i(onEntryRemoved, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(sizeOf, create, onEntryRemoved, i, i);
    }
}
