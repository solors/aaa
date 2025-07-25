package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: MovableContent.kt */
@Metadata
/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$1<R> extends Lambda implements InterfaceC45268n<R, Composer, Integer, Unit> {
    final /* synthetic */ MovableContent<R> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$1(MovableContent<R> movableContent) {
        super(3);
        this.$movableContent = movableContent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
        invoke((MovableContentKt$movableContentWithReceiverOf$1<R>) obj, composer, num.intValue());
        return Unit.f99208a;
    }

    @Composable
    public final void invoke(R r, @Nullable Composer composer, int i) {
        if ((i & 14) == 0) {
            i |= composer.changed(r) ? 4 : 2;
        }
        if ((i & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            composer.insertMovableContent(this.$movableContent, r);
        }
    }
}
