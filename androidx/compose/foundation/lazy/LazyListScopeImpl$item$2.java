package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyListScopeImpl.kt */
@Metadata
/* loaded from: classes.dex */
final class LazyListScopeImpl$item$2 extends Lambda implements Function1<Integer, Object> {
    final /* synthetic */ Object $contentType;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListScopeImpl$item$2(Object obj) {
        super(1);
        this.$contentType = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    @Nullable
    public final Object invoke(int i) {
        return this.$contentType;
    }
}
