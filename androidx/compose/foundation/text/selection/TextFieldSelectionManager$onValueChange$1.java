package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextFieldSelectionManager.kt */
@Metadata
/* loaded from: classes.dex */
final class TextFieldSelectionManager$onValueChange$1 extends Lambda implements Function1<TextFieldValue, Unit> {
    public static final TextFieldSelectionManager$onValueChange$1 INSTANCE = new TextFieldSelectionManager$onValueChange$1();

    TextFieldSelectionManager$onValueChange$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull TextFieldValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
        invoke2(textFieldValue);
        return Unit.f99208a;
    }
}
