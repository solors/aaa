package androidx.core.util;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45269o;

/* compiled from: LruCache.kt */
@Metadata
/* loaded from: classes.dex */
public final class LruCacheKt$lruCache$3 extends Lambda implements InterfaceC45269o {
    public static final LruCacheKt$lruCache$3 INSTANCE = new LruCacheKt$lruCache$3();

    public LruCacheKt$lruCache$3() {
        super(4);
    }

    public final void invoke(boolean z, @NotNull Object obj, @NotNull Object obj2, @Nullable Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 1>");
        Intrinsics.checkNotNullParameter(obj2, "<anonymous parameter 2>");
    }

    @Override // p1076zd.InterfaceC45269o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke(((Boolean) obj).booleanValue(), obj2, obj3, obj4);
        return Unit.f99208a;
    }
}
