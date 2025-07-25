package androidx.compose.p015ui.platform;

import android.content.res.Configuration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidComposeView.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidComposeView$configurationChangeObserver$1 */
/* loaded from: classes.dex */
public final class AndroidComposeView$configurationChangeObserver$1 extends Lambda implements Function1<Configuration, Unit> {
    public static final AndroidComposeView$configurationChangeObserver$1 INSTANCE = new AndroidComposeView$configurationChangeObserver$1();

    AndroidComposeView$configurationChangeObserver$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Configuration it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
        invoke2(configuration);
        return Unit.f99208a;
    }
}
