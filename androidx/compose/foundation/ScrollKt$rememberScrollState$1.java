package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Scroll.kt */
@Metadata
/* loaded from: classes.dex */
final class ScrollKt$rememberScrollState$1 extends Lambda implements Functions<ScrollState> {
    final /* synthetic */ int $initial;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollKt$rememberScrollState$1(int i) {
        super(0);
        this.$initial = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final ScrollState invoke() {
        return new ScrollState(this.$initial);
    }
}
