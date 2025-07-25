package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* compiled from: SnackbarHost.kt */
@Metadata
/* loaded from: classes.dex */
final class SnackbarHostKt$FadeInFadeOutWithScale$2$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC45268n<SnackbarData, Composer, Integer, Unit> $content;
    final /* synthetic */ SnackbarData $item;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnackbarHostKt$FadeInFadeOutWithScale$2$1$1(InterfaceC45268n<? super SnackbarData, ? super Composer, ? super Integer, Unit> interfaceC45268n, SnackbarData snackbarData, int i) {
        super(2);
        this.$content = interfaceC45268n;
        this.$item = snackbarData;
        this.$$dirty = i;
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
            return;
        }
        InterfaceC45268n<SnackbarData, Composer, Integer, Unit> interfaceC45268n = this.$content;
        SnackbarData snackbarData = this.$item;
        Intrinsics.m17074g(snackbarData);
        interfaceC45268n.invoke(snackbarData, composer, Integer.valueOf((this.$$dirty >> 3) & 112));
    }
}
