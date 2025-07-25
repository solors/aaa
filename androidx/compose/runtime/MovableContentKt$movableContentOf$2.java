package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* JADX INFO: Add missing generic type declarations: [P] */
/* compiled from: MovableContent.kt */
@Metadata
/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$2<P> extends Lambda implements InterfaceC45268n<P, Composer, Integer, Unit> {
    final /* synthetic */ MovableContent<P> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$2(MovableContent<P> movableContent) {
        super(3);
        this.$movableContent = movableContent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
        invoke((MovableContentKt$movableContentOf$2<P>) obj, composer, num.intValue());
        return Unit.f99208a;
    }

    @Composable
    public final void invoke(P p, @Nullable Composer composer, int i) {
        if ((i & 14) == 0) {
            i |= composer.changed(p) ? 4 : 2;
        }
        if ((i & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            composer.insertMovableContent(this.$movableContent, p);
        }
    }
}
