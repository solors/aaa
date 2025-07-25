package androidx.compose.p015ui.text.android;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextLayout.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.android.TextLayout$layoutHelper$2 */
/* loaded from: classes.dex */
final class TextLayout$layoutHelper$2 extends Lambda implements Functions<LayoutHelper> {
    final /* synthetic */ TextLayout this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLayout$layoutHelper$2(TextLayout textLayout) {
        super(0);
        this.this$0 = textLayout;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final LayoutHelper invoke() {
        return new LayoutHelper(this.this$0.getLayout());
    }
}
