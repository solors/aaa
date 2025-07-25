package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: LruCache.kt */
@Metadata
/* loaded from: classes.dex */
public final class LruCacheKt$lruCache$1 extends Lambda implements Function2 {
    public static final LruCacheKt$lruCache$1 INSTANCE = new LruCacheKt$lruCache$1();

    public LruCacheKt$lruCache$1() {
        super(2);
    }

    public final int invoke(@NotNull Object obj, @NotNull Object obj2) {
        Intrinsics.m17072i(obj, "<anonymous parameter 0>");
        Intrinsics.m17072i(obj2, "<anonymous parameter 1>");
        return 1;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object mo105910invoke(Object obj, Object obj2) {
        return Integer.valueOf(invoke(obj, obj2));
    }
}
