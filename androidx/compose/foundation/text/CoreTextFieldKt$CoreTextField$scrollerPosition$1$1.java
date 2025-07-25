package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoreTextField.kt */
@Metadata
/* loaded from: classes.dex */
final class CoreTextFieldKt$CoreTextField$scrollerPosition$1$1 extends Lambda implements Functions<TextFieldScrollerPosition> {
    final /* synthetic */ Orientation $orientation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$scrollerPosition$1$1(Orientation orientation) {
        super(0);
        this.$orientation = orientation;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final TextFieldScrollerPosition invoke() {
        return new TextFieldScrollerPosition(this.$orientation, 0.0f, 2, null);
    }
}
