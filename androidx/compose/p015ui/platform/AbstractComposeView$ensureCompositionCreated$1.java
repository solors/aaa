package androidx.compose.p015ui.platform;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ComposeView.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1 */
/* loaded from: classes.dex */
public final class AbstractComposeView$ensureCompositionCreated$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ AbstractComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractComposeView$ensureCompositionCreated$1(AbstractComposeView abstractComposeView) {
        super(2);
        this.this$0 = abstractComposeView;
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
            this.this$0.Content(composer, 8);
        }
    }
}
