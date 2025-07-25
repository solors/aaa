package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45269o;
import p1076zd.InterfaceC45270p;

/* compiled from: LazyGridDsl.kt */
@Metadata
/* loaded from: classes.dex */
public final class LazyGridDslKt$itemsIndexed$10 extends Lambda implements InterfaceC45269o<LazyGridItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ InterfaceC45270p<LazyGridItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
    final /* synthetic */ T[] $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$10(InterfaceC45270p<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> interfaceC45270p, T[] tArr) {
        super(4);
        this.$itemContent = interfaceC45270p;
        this.$items = tArr;
    }

    @Override // p1076zd.InterfaceC45269o
    public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
        return Unit.f99208a;
    }

    @Composable
    public final void invoke(@NotNull LazyGridItemScope items, int i, @Nullable Composer composer, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i2 & 14) == 0) {
            i3 = (composer.changed(items) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composer.changed(i) ? 32 : 16;
        }
        if ((i3 & 731) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            this.$itemContent.invoke(items, Integer.valueOf(i), this.$items[i], composer, Integer.valueOf((i3 & 14) | (i3 & 112)));
        }
    }
}
