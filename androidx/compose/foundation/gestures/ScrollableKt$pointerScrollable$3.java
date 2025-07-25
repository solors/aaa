package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Scrollable.kt */
@Metadata
/* loaded from: classes.dex */
final class ScrollableKt$pointerScrollable$3 extends Lambda implements Functions<Boolean> {
    final /* synthetic */ State<ScrollingLogic> $scrollLogic;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$pointerScrollable$3(State<ScrollingLogic> state) {
        super(0);
        this.$scrollLogic = state;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final Boolean invoke() {
        return Boolean.valueOf(this.$scrollLogic.getValue().shouldScrollImmediately());
    }
}
