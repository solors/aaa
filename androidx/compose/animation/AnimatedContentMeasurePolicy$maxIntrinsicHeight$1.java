package androidx.compose.animation;

import androidx.compose.p015ui.layout.IntrinsicMeasurable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnimatedContent.kt */
@Metadata
/* loaded from: classes.dex */
final class AnimatedContentMeasurePolicy$maxIntrinsicHeight$1 extends Lambda implements Function1<IntrinsicMeasurable, Integer> {
    final /* synthetic */ int $width;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentMeasurePolicy$maxIntrinsicHeight$1(int i) {
        super(1);
        this.$width = i;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Integer invoke(@NotNull IntrinsicMeasurable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.maxIntrinsicHeight(this.$width));
    }
}
