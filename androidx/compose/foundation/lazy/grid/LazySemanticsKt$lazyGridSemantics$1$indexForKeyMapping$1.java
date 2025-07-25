package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazySemantics.kt */
@Metadata
/* loaded from: classes.dex */
final class LazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1 extends Lambda implements Function1<Object, Integer> {
    final /* synthetic */ LazyGridItemProvider $itemProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1(LazyGridItemProvider lazyGridItemProvider) {
        super(1);
        this.$itemProvider = lazyGridItemProvider;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Integer invoke(@NotNull Object needle) {
        Intrinsics.checkNotNullParameter(needle, "needle");
        LazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1$key$1 lazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1$key$1 = new LazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1$key$1(this.$itemProvider);
        int itemCount = this.$itemProvider.getItemCount();
        int i = 0;
        while (true) {
            if (i >= itemCount) {
                i = -1;
                break;
            } else if (Intrinsics.m17075f(lazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1$key$1.invoke((LazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1$key$1) Integer.valueOf(i)), needle)) {
                break;
            } else {
                i++;
            }
        }
        return Integer.valueOf(i);
    }
}
