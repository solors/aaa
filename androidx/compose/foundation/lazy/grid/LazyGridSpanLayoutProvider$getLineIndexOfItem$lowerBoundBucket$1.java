package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridSpanLayoutProvider.kt */
@Metadata
/* loaded from: classes.dex */
final class LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1 extends Lambda implements Function1<LazyGridSpanLayoutProvider.Bucket, Integer> {
    final /* synthetic */ int $itemIndex;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1(int i) {
        super(1);
        this.$itemIndex = i;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Integer invoke(@NotNull LazyGridSpanLayoutProvider.Bucket it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getFirstItemIndex() - this.$itemIndex);
    }
}
