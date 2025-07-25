package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyLayout.kt */
@Metadata
/* loaded from: classes.dex */
final class LazyLayoutKt$LazyLayout$itemContentFactory$1$1 extends Lambda implements Functions<LazyLayoutItemProvider> {
    final /* synthetic */ State<LazyLayoutItemProvider> $currentItemProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutKt$LazyLayout$itemContentFactory$1$1(State<? extends LazyLayoutItemProvider> state) {
        super(0);
        this.$currentItemProvider = state;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final LazyLayoutItemProvider invoke() {
        return this.$currentItemProvider.getValue();
    }
}
