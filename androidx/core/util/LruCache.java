package androidx.core.util;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45269o;

@Metadata
/* renamed from: androidx.core.util.LruCacheKt */
/* loaded from: classes.dex */
public final class LruCache {
    @NotNull
    public static final <K, V> android.util.LruCache<K, V> lruCache(int i, @NotNull Function2<? super K, ? super V, Integer> sizeOf, @NotNull Function1<? super K, ? extends V> create, @NotNull InterfaceC45269o<? super Boolean, ? super K, ? super V, ? super V, Unit> onEntryRemoved) {
        Intrinsics.checkNotNullParameter(sizeOf, "sizeOf");
        Intrinsics.checkNotNullParameter(create, "create");
        Intrinsics.checkNotNullParameter(onEntryRemoved, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i, sizeOf, create, onEntryRemoved);
    }

    public static /* synthetic */ android.util.LruCache lruCache$default(int i, Function2 sizeOf, Function1 create, InterfaceC45269o onEntryRemoved, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            sizeOf = LruCacheKt$lruCache$1.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            create = LruCacheKt$lruCache$2.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            onEntryRemoved = LruCacheKt$lruCache$3.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(sizeOf, "sizeOf");
        Intrinsics.checkNotNullParameter(create, "create");
        Intrinsics.checkNotNullParameter(onEntryRemoved, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i, sizeOf, create, onEntryRemoved);
    }
}
