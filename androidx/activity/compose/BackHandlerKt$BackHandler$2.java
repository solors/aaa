package androidx.activity.compose;

import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BackHandler.kt */
@Metadata
/* loaded from: classes.dex */
public final class BackHandlerKt$BackHandler$2 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ BackHandlerKt$BackHandler$backCallback$1$1 $backCallback;
    final /* synthetic */ OnBackPressedDispatcher $backDispatcher;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$2(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1) {
        super(1);
        this.$backDispatcher = onBackPressedDispatcher;
        this.$lifecycleOwner = lifecycleOwner;
        this.$backCallback = backHandlerKt$BackHandler$backCallback$1$1;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        this.$backDispatcher.addCallback(this.$lifecycleOwner, this.$backCallback);
        final BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1 = this.$backCallback;
        return new DisposableEffectResult() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$2$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                remove();
            }
        };
    }
}
