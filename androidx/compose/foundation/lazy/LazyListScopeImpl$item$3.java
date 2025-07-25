package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p1076zd.InterfaceC45269o;

/* compiled from: LazyListScopeImpl.kt */
@Metadata
/* loaded from: classes.dex */
final class LazyListScopeImpl$item$3 extends Lambda implements InterfaceC45269o<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ InterfaceC45268n<LazyItemScope, Composer, Integer, Unit> $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyListScopeImpl$item$3(InterfaceC45268n<? super LazyItemScope, ? super Composer, ? super Integer, Unit> interfaceC45268n) {
        super(4);
        this.$content = interfaceC45268n;
    }

    @Override // p1076zd.InterfaceC45269o
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.f99208a;
    }

    @Composable
    public final void invoke(@NotNull LazyItemScope $receiver, int i, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        if ((i2 & 14) == 0) {
            i2 |= composer.changed($receiver) ? 4 : 2;
        }
        if ((i2 & 651) == 130 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            this.$content.invoke($receiver, composer, Integer.valueOf(i2 & 14));
        }
    }
}
