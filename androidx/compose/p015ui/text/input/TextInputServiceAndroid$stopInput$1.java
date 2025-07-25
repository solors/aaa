package androidx.compose.p015ui.text.input;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextInputServiceAndroid.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$1 */
/* loaded from: classes.dex */
final class TextInputServiceAndroid$stopInput$1 extends Lambda implements Function1<List<? extends EditCommand>, Unit> {
    public static final TextInputServiceAndroid$stopInput$1 INSTANCE = new TextInputServiceAndroid$stopInput$1();

    TextInputServiceAndroid$stopInput$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull List<? extends EditCommand> it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends EditCommand> list) {
        invoke2(list);
        return Unit.f99208a;
    }
}
