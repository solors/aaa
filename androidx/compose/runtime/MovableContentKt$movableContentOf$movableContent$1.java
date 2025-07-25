package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* compiled from: MovableContent.kt */
@Metadata
/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$movableContent$1 extends Lambda implements InterfaceC45268n<Unit, Composer, Integer, Unit> {
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MovableContentKt$movableContentOf$movableContent$1(Function2<? super Composer, ? super Integer, Unit> function2) {
        super(3);
        this.$content = function2;
    }

    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ Unit invoke(Unit unit, Composer composer, Integer num) {
        invoke(unit, composer, num.intValue());
        return Unit.f99208a;
    }

    @Composable
    public final void invoke(@NotNull Unit it, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            this.$content.mo105910invoke(composer, 0);
        }
    }
}
