package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridScopeImpl.kt */
@Metadata
/* loaded from: classes.dex */
final class LazyGridScopeImpl$item$1$1 extends Lambda implements Function1<Integer, Object> {
    final /* synthetic */ Object $key;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridScopeImpl$item$1$1(Object obj) {
        super(1);
        this.$key = obj;
    }

    @NotNull
    public final Object invoke(int i) {
        return this.$key;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}
