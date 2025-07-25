package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p1076zd.InterfaceC45269o;

/* JADX INFO: Add missing generic type declarations: [P, R] */
/* compiled from: MovableContent.kt */
@Metadata
/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$movableContent$2<P, R> extends Lambda implements InterfaceC45268n<Tuples<? extends R, ? extends P>, Composer, Integer, Unit> {
    final /* synthetic */ InterfaceC45269o<R, P, Composer, Integer, Unit> $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MovableContentKt$movableContentWithReceiverOf$movableContent$2(InterfaceC45269o<? super R, ? super P, ? super Composer, ? super Integer, Unit> interfaceC45269o) {
        super(3);
        this.$content = interfaceC45269o;
    }

    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
        invoke((Tuples) obj, composer, num.intValue());
        return Unit.f99208a;
    }

    @Composable
    public final void invoke(@NotNull Tuples<? extends R, ? extends P> it, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 14) == 0) {
            i |= composer.changed(it) ? 4 : 2;
        }
        if ((i & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            this.$content.invoke(it.m17630c(), it.m17629d(), composer, 0);
        }
    }
}
