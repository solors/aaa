package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridDsl.kt */
@Metadata
/* loaded from: classes.dex */
public final class LazyGridDslKt$items$3 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, LazyGridSpan> {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ Function2<LazyGridItemSpanScope, T, LazyGridSpan> $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$items$3(Function2<? super LazyGridItemSpanScope, ? super T, LazyGridSpan> function2, List<? extends T> list) {
        super(2);
        this.$span = function2;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ LazyGridSpan mo105910invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        return LazyGridSpan.m106454boximpl(m106477invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
    }

    /* renamed from: invoke-_-orMbw  reason: not valid java name */
    public final long m106477invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
        return this.$span.mo105910invoke(lazyGridItemSpanScope, this.$items.get(i)).m106461unboximpl();
    }
}
