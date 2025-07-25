package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyDsl.kt */
@Metadata
/* loaded from: classes.dex */
final class LazyListScope$items$2 extends Lambda implements Function1<Integer, Object> {
    public static final LazyListScope$items$2 INSTANCE = new LazyListScope$items$2();

    LazyListScope$items$2() {
        super(1);
    }

    @Nullable
    public final Object invoke(int i) {
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}
