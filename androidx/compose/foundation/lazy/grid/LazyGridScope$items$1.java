package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyGridDsl.kt */
@Metadata
/* loaded from: classes.dex */
final class LazyGridScope$items$1 extends Lambda implements Function1 {
    public static final LazyGridScope$items$1 INSTANCE = new LazyGridScope$items$1();

    LazyGridScope$items$1() {
        super(1);
    }

    @Nullable
    public final Void invoke(int i) {
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
