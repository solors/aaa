package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Scroll.kt */
@Metadata
/* loaded from: classes.dex */
final class ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2 extends Lambda implements Functions<Float> {
    final /* synthetic */ ScrollState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2(ScrollState scrollState) {
        super(0);
        this.$state = scrollState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final Float invoke() {
        return Float.valueOf(this.$state.getMaxValue());
    }
}
