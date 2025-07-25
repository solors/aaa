package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45271q;
import p804nd.C38513v;

/* JADX INFO: Add missing generic type declarations: [P1, P2, P3, P4] */
/* compiled from: MovableContent.kt */
@Metadata
/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$5<P1, P2, P3, P4> extends Lambda implements InterfaceC45271q<P1, P2, P3, P4, Composer, Integer, Unit> {
    final /* synthetic */ MovableContent<Tuples<Tuples<P1, P2>, Tuples<P3, P4>>> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$5(MovableContent<Tuples<Tuples<P1, P2>, Tuples<P3, P4>>> movableContent) {
        super(6);
        this.$movableContent = movableContent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p1076zd.InterfaceC45271q
    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, Integer num) {
        invoke((MovableContentKt$movableContentOf$5<P1, P2, P3, P4>) obj, obj2, obj3, obj4, composer, num.intValue());
        return Unit.f99208a;
    }

    @Composable
    public final void invoke(P1 p1, P2 p2, P3 p3, P4 p4, @Nullable Composer composer, int i) {
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
        if ((i & 7168) == 0) {
            i2 |= composer.changed(p4) ? 2048 : 1024;
        }
        if ((46811 & i2) == 9362 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            composer.insertMovableContent(this.$movableContent, C38513v.m14532a(C38513v.m14532a(p1, p2), C38513v.m14532a(p3, p4)));
        }
    }
}
