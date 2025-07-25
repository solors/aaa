package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45270p;
import p804nd.C38513v;

/* JADX INFO: Add missing generic type declarations: [P1, P2, P3] */
/* compiled from: MovableContent.kt */
@Metadata
/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$4<P1, P2, P3> extends Lambda implements InterfaceC45270p<P1, P2, P3, Composer, Integer, Unit> {
    final /* synthetic */ MovableContent<Tuples<Tuples<P1, P2>, P3>> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$4(MovableContent<Tuples<Tuples<P1, P2>, P3>> movableContent) {
        super(5);
        this.$movableContent = movableContent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p1076zd.InterfaceC45270p
    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
        invoke((MovableContentKt$movableContentOf$4<P1, P2, P3>) obj, obj2, obj3, composer, num.intValue());
        return Unit.f99208a;
    }

    @Composable
    public final void invoke(P1 p1, P2 p2, P3 p3, @Nullable Composer composer, int i) {
        int i2;
        if ((i & 14) == 0) {
            i2 = (composer.changed(p1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composer.changed(p2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composer.changed(p3) ? 256 : 128;
        }
        if ((i2 & 5851) == 1170 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            composer.insertMovableContent(this.$movableContent, C38513v.m14532a(C38513v.m14532a(p1, p2), p3));
        }
    }
}
