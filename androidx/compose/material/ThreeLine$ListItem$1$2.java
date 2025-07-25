package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: ListItem.kt */
@Metadata
/* loaded from: classes.dex */
final class ThreeLine$ListItem$1$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $overlineText;
    final /* synthetic */ Function2<Composer, Integer, Unit> $secondaryText;
    final /* synthetic */ Function2<Composer, Integer, Unit> $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ThreeLine$ListItem$1$2(Function2<? super Composer, ? super Integer, Unit> function2, int i, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23) {
        super(2);
        this.$overlineText = function2;
        this.$$dirty = i;
        this.$text = function22;
        this.$secondaryText = function23;
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
        composer.startReplaceableGroup(-755940677);
        Function2<Composer, Integer, Unit> function2 = this.$overlineText;
        if (function2 != null) {
            function2.mo105910invoke(composer, Integer.valueOf((this.$$dirty >> 12) & 14));
        }
        composer.endReplaceableGroup();
        this.$text.mo105910invoke(composer, Integer.valueOf((this.$$dirty >> 6) & 14));
        this.$secondaryText.mo105910invoke(composer, Integer.valueOf((this.$$dirty >> 9) & 14));
    }
}
