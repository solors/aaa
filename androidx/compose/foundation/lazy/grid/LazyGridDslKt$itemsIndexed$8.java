package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;

/* compiled from: LazyGridDsl.kt */
@Metadata
/* loaded from: classes.dex */
public final class LazyGridDslKt$itemsIndexed$8 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, LazyGridSpan> {
    final /* synthetic */ T[] $items;
    final /* synthetic */ InterfaceC45268n<LazyGridItemSpanScope, Integer, T, LazyGridSpan> $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$8(InterfaceC45268n<? super LazyGridItemSpanScope, ? super Integer, ? super T, LazyGridSpan> interfaceC45268n, T[] tArr) {
        super(2);
        this.$span = interfaceC45268n;
        this.$items = tArr;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ LazyGridSpan mo105910invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        return LazyGridSpan.m106454boximpl(m106480invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
    }

    /* renamed from: invoke-_-orMbw  reason: not valid java name */
    public final long m106480invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
        return this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i), this.$items[i]).m106461unboximpl();
    }
}
