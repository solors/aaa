package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextFieldScroll.kt */
@Metadata
/* loaded from: classes.dex */
final class TextFieldScrollKt$textFieldScrollable$2$controller$1 extends Lambda implements Function1<Float, Float> {
    final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2$controller$1(TextFieldScrollerPosition textFieldScrollerPosition) {
        super(1);
        this.$scrollerPosition = textFieldScrollerPosition;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Float f) {
        return invoke(f.floatValue());
    }

    @NotNull
    public final Float invoke(float f) {
        float offset = this.$scrollerPosition.getOffset() + f;
        if (offset > this.$scrollerPosition.getMaximum()) {
            f = this.$scrollerPosition.getMaximum() - this.$scrollerPosition.getOffset();
        } else if (offset < 0.0f) {
            f = -this.$scrollerPosition.getOffset();
        }
        TextFieldScrollerPosition textFieldScrollerPosition = this.$scrollerPosition;
        textFieldScrollerPosition.setOffset(textFieldScrollerPosition.getOffset() + f);
        return Float.valueOf(f);
    }
}
