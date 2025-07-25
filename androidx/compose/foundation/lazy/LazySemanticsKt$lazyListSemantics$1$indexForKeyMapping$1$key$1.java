package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazySemantics.kt */
@Metadata
/* loaded from: classes.dex */
/* synthetic */ class LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1 extends FunctionReferenceImpl implements Function1<Integer, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1(Object obj) {
        super(1, obj, LazyListItemProvider.class, "getKey", "getKey(I)Ljava/lang/Object;", 0);
    }

    @NotNull
    public final Object invoke(int i) {
        return ((LazyListItemProvider) this.receiver).getKey(i);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}
