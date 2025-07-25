package androidx.compose.p015ui.text.android;

import android.text.BoringLayout;
import android.text.TextPaint;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: LayoutIntrinsics.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.android.LayoutIntrinsics$boringMetrics$2 */
/* loaded from: classes.dex */
final class LayoutIntrinsics$boringMetrics$2 extends Lambda implements Functions<BoringLayout.Metrics> {
    final /* synthetic */ CharSequence $charSequence;
    final /* synthetic */ int $textDirectionHeuristic;
    final /* synthetic */ TextPaint $textPaint;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutIntrinsics$boringMetrics$2(int i, CharSequence charSequence, TextPaint textPaint) {
        super(0);
        this.$textDirectionHeuristic = i;
        this.$charSequence = charSequence;
        this.$textPaint = textPaint;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @Nullable
    public final BoringLayout.Metrics invoke() {
        return BoringLayoutFactory.INSTANCE.measure(this.$charSequence, this.$textPaint, TextLayoutKt.getTextDirectionHeuristic(this.$textDirectionHeuristic));
    }
}
