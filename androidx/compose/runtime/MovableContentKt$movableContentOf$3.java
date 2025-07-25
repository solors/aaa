package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45269o;
import p804nd.C38513v;

/* JADX INFO: Add missing generic type declarations: [P1, P2] */
/* compiled from: MovableContent.kt */
@Metadata
/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$3<P1, P2> extends Lambda implements InterfaceC45269o<P1, P2, Composer, Integer, Unit> {
    final /* synthetic */ MovableContent<Tuples<P1, P2>> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$3(MovableContent<Tuples<P1, P2>> movableContent) {
        super(4);
        this.$movableContent = movableContent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p1076zd.InterfaceC45269o
    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Composer composer, Integer num) {
        invoke((MovableContentKt$movableContentOf$3<P1, P2>) obj, obj2, composer, num.intValue());
        return Unit.f99208a;
    }

    @Composable
    public final void invoke(P1 p1, P2 p2, @Nullable Composer composer, int i) {
        int i2;
        if ((i & 14) == 0) {
            i2 = (composer.changed(p1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composer.changed(p2) ? 32 : 16;
        }
        if ((i2 & 731) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            composer.insertMovableContent(this.$movableContent, C38513v.m14532a(p1, p2));
        }
    }
}
