package androidx.compose.material;

import androidx.compose.p015ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* compiled from: Scaffold.kt */
@Metadata
/* loaded from: classes.dex */
final class ScaffoldKt$Scaffold$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ InterfaceC45268n<Modifier, Composer, Integer, Unit> $child;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$Scaffold$1(InterfaceC45268n<? super Modifier, ? super Composer, ? super Integer, Unit> interfaceC45268n) {
        super(2);
        this.$child = interfaceC45268n;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.f99208a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            this.$child.invoke(Modifier.Companion, composer, 54);
        }
    }
}
