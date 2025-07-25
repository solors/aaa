package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextSelectionColors.kt */
@Metadata
/* loaded from: classes.dex */
final class TextSelectionColorsKt$LocalTextSelectionColors$1 extends Lambda implements Functions<TextSelectionColors> {
    public static final TextSelectionColorsKt$LocalTextSelectionColors$1 INSTANCE = new TextSelectionColorsKt$LocalTextSelectionColors$1();

    TextSelectionColorsKt$LocalTextSelectionColors$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final TextSelectionColors invoke() {
        TextSelectionColors textSelectionColors;
        textSelectionColors = TextSelectionColorsKt.DefaultTextSelectionColors;
        return textSelectionColors;
    }
}
