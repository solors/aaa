package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyDsl.kt */
@Metadata
/* loaded from: classes.dex */
public final class LazyDslKt$itemsIndexed$5 extends Lambda implements Function2 {
    public static final LazyDslKt$itemsIndexed$5 INSTANCE = new LazyDslKt$itemsIndexed$5();

    public LazyDslKt$itemsIndexed$5() {
        super(2);
    }

    @Nullable
    public final Void invoke(int i, Object obj) {
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo105910invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), obj2);
    }
}
