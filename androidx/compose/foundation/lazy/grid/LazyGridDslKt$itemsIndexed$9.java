package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyGridDsl.kt */
@Metadata
/* loaded from: classes.dex */
public final class LazyGridDslKt$itemsIndexed$9 extends Lambda implements Function1<Integer, Object> {
    final /* synthetic */ Function2<Integer, T, Object> $contentType;
    final /* synthetic */ T[] $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$9(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
        super(1);
        this.$contentType = function2;
        this.$items = tArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    @Nullable
    public final Object invoke(int i) {
        return this.$contentType.mo105910invoke(Integer.valueOf(i), this.$items[i]);
    }
}
