package androidx.compose.p015ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LayoutIntrinsics.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.android.LayoutIntrinsics$maxIntrinsicWidth$2 */
/* loaded from: classes.dex */
public final class LayoutIntrinsics$maxIntrinsicWidth$2 extends Lambda implements Functions<Float> {
    final /* synthetic */ CharSequence $charSequence;
    final /* synthetic */ TextPaint $textPaint;
    final /* synthetic */ LayoutIntrinsics this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutIntrinsics$maxIntrinsicWidth$2(LayoutIntrinsics layoutIntrinsics, CharSequence charSequence, TextPaint textPaint) {
        super(0);
        this.this$0 = layoutIntrinsics;
        this.$charSequence = charSequence;
        this.$textPaint = textPaint;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final Float invoke() {
        float desiredWidth;
        boolean shouldIncreaseMaxIntrinsic;
        BoringLayout.Metrics boringMetrics = this.this$0.getBoringMetrics();
        if (boringMetrics != null) {
            desiredWidth = boringMetrics.width;
        } else {
            CharSequence charSequence = this.$charSequence;
            desiredWidth = Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.$textPaint);
        }
        shouldIncreaseMaxIntrinsic = LayoutIntrinsicsKt.shouldIncreaseMaxIntrinsic(desiredWidth, this.$charSequence, this.$textPaint);
        if (shouldIncreaseMaxIntrinsic) {
            desiredWidth += 0.5f;
        }
        return Float.valueOf(desiredWidth);
    }
}
