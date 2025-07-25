package androidx.compose.p015ui.window;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidDialog.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.window.DialogLayout$Content$4 */
/* loaded from: classes.dex */
public final class DialogLayout$Content$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DialogLayout $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogLayout$Content$4(DialogLayout dialogLayout, int i) {
        super(2);
        this.$tmp0_rcvr = dialogLayout;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.f99208a;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        this.$tmp0_rcvr.Content(composer, this.$$changed | 1);
    }
}
