package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p1076zd.InterfaceC45271q;

/* JADX INFO: Add missing generic type declarations: [P1, R, P2, P3] */
/* compiled from: MovableContent.kt */
@Metadata
/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$movableContent$4<P1, P2, P3, R> extends Lambda implements InterfaceC45268n<Tuples<? extends Tuples<? extends R, ? extends P1>, ? extends Tuples<? extends P2, ? extends P3>>, Composer, Integer, Unit> {
    final /* synthetic */ InterfaceC45271q<R, P1, P2, P3, Composer, Integer, Unit> $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MovableContentKt$movableContentWithReceiverOf$movableContent$4(InterfaceC45271q<? super R, ? super P1, ? super P2, ? super P3, ? super Composer, ? super Integer, Unit> interfaceC45271q) {
        super(3);
        this.$content = interfaceC45271q;
    }

    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
        invoke((Tuples) obj, composer, num.intValue());
        return Unit.f99208a;
    }

    @Composable
    public final void invoke(@NotNull Tuples<? extends Tuples<? extends R, ? extends P1>, ? extends Tuples<? extends P2, ? extends P3>> it, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$content.invoke(it.m17630c().m17630c(), it.m17630c().m17629d(), it.m17629d().m17630c(), it.m17629d().m17629d(), composer, 0);
    }
}
