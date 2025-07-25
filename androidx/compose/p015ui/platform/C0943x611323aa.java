package androidx.compose.p015ui.platform;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidCompositionLocals.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2 */
/* loaded from: classes.dex */
final class C0943x611323aa extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ DisposableSaveableStateRegistry $saveableStateRegistry;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0943x611323aa(DisposableSaveableStateRegistry disposableSaveableStateRegistry) {
        super(1);
        this.$saveableStateRegistry = disposableSaveableStateRegistry;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final DisposableSaveableStateRegistry disposableSaveableStateRegistry = this.$saveableStateRegistry;
        return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                DisposableSaveableStateRegistry.this.dispose();
            }
        };
    }
}
