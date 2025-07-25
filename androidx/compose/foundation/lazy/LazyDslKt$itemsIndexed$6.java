package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyDsl.kt */
@Metadata
/* loaded from: classes.dex */
public final class LazyDslKt$itemsIndexed$6 extends Lambda implements Function1<Integer, Object> {
    final /* synthetic */ T[] $items;
    final /* synthetic */ Function2<Integer, T, Object> $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyDslKt$itemsIndexed$6(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
        super(1);
        this.$key = function2;
        this.$items = tArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    @NotNull
    public final Object invoke(int i) {
        return this.$key.mo105910invoke(Integer.valueOf(i), this.$items[i]);
    }
}
