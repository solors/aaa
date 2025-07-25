package androidx.compose.material;

import androidx.compose.p015ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45269o;

/* compiled from: BackdropScaffold.kt */
@Metadata
/* loaded from: classes.dex */
final class BackdropScaffoldKt$BackdropStack$1$1$placeables$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ float $backLayerHeight;
    final /* synthetic */ long $constraints;
    final /* synthetic */ InterfaceC45269o<Constraints, Float, Composer, Integer, Unit> $frontLayer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackdropScaffoldKt$BackdropStack$1$1$placeables$1(InterfaceC45269o<? super Constraints, ? super Float, ? super Composer, ? super Integer, Unit> interfaceC45269o, long j, float f, int i) {
        super(2);
        this.$frontLayer = interfaceC45269o;
        this.$constraints = j;
        this.$backLayerHeight = f;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.f99208a;
    }

    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            this.$frontLayer.invoke(Constraints.m109678boximpl(this.$constraints), Float.valueOf(this.$backLayerHeight), composer, Integer.valueOf((this.$$dirty >> 3) & 896));
        }
    }
}
