package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridScopeImpl.kt */
@Metadata
/* loaded from: classes.dex */
final class LazyGridScopeImpl$item$2$1 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, LazyGridSpan> {
    final /* synthetic */ Function1<LazyGridItemSpanScope, LazyGridSpan> $span;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridScopeImpl$item$2$1(Function1<? super LazyGridItemSpanScope, LazyGridSpan> function1) {
        super(2);
        this.$span = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ LazyGridSpan mo105910invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        return LazyGridSpan.m106454boximpl(m106499invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
    }

    /* renamed from: invoke-_-orMbw  reason: not valid java name */
    public final long m106499invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
        return this.$span.invoke(lazyGridItemSpanScope).m106461unboximpl();
    }
}
