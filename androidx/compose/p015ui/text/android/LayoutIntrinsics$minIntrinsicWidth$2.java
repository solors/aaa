package androidx.compose.p015ui.text.android;

import android.text.TextPaint;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: LayoutIntrinsics.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.android.LayoutIntrinsics$minIntrinsicWidth$2 */
/* loaded from: classes.dex */
final class LayoutIntrinsics$minIntrinsicWidth$2 extends Lambda implements Functions<Float> {
    final /* synthetic */ CharSequence $charSequence;
    final /* synthetic */ TextPaint $textPaint;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutIntrinsics$minIntrinsicWidth$2(CharSequence charSequence, TextPaint textPaint) {
        super(0);
        this.$charSequence = charSequence;
        this.$textPaint = textPaint;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final Float invoke() {
        return Float.valueOf(LayoutIntrinsicsKt.minIntrinsicWidth(this.$charSequence, this.$textPaint));
    }
}
