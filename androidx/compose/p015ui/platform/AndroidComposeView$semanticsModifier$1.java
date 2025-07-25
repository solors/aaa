package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidComposeView.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidComposeView$semanticsModifier$1 */
/* loaded from: classes.dex */
public final class AndroidComposeView$semanticsModifier$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    public static final AndroidComposeView$semanticsModifier$1 INSTANCE = new AndroidComposeView$semanticsModifier$1();

    AndroidComposeView$semanticsModifier$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SemanticsPropertyReceiver $receiver) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.f99208a;
    }
}
