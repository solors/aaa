package androidx.compose.p015ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextDrawStyle.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.style.TextDrawStyle$merge$1 */
/* loaded from: classes.dex */
public final class TextDrawStyle$merge$1 extends Lambda implements Functions<TextDrawStyle> {
    final /* synthetic */ TextDrawStyle this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextDrawStyle$merge$1(TextDrawStyle textDrawStyle) {
        super(0);
        this.this$0 = textDrawStyle;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final TextDrawStyle invoke() {
        return this.this$0;
    }
}
