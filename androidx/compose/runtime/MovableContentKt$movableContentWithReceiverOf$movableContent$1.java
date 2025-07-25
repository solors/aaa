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
final class MovableContentKt$movableContentWithReceiverOf$movableContent$1<R> extends Lambda implements InterfaceC45268n<R, Composer, Integer, Unit> {
    final /* synthetic */ InterfaceC45268n<R, Composer, Integer, Unit> $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MovableContentKt$movableContentWithReceiverOf$movableContent$1(InterfaceC45268n<? super R, ? super Composer, ? super Integer, Unit> interfaceC45268n) {
        super(3);
        this.$content = interfaceC45268n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
        invoke((MovableContentKt$movableContentWithReceiverOf$movableContent$1<R>) obj, composer, num.intValue());
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
            this.$content.invoke(r, composer, Integer.valueOf(i & 14));
        }
    }
}
