package androidx.compose.p015ui.platform;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ComposeView.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.ComposeView$Content$1 */
/* loaded from: classes.dex */
public final class ComposeView$Content$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ComposeView $tmp1_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeView$Content$1(ComposeView composeView, int i) {
        super(2);
        this.$tmp1_rcvr = composeView;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.f99208a;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        this.$tmp1_rcvr.Content(composer, this.$$changed | 1);
    }
}
