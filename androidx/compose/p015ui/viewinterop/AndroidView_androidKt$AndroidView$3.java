package androidx.compose.p015ui.viewinterop;

import androidx.compose.p015ui.node.Ref;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidView.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3 */
/* loaded from: classes.dex */
public final class AndroidView_androidKt$AndroidView$3 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ String $stateKey;
    final /* synthetic */ SaveableStateRegistry $stateRegistry;
    final /* synthetic */ Ref<ViewFactoryHolder<T>> $viewFactoryHolderRef;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$3(SaveableStateRegistry saveableStateRegistry, String str, Ref<ViewFactoryHolder<T>> ref) {
        super(1);
        this.$stateRegistry = saveableStateRegistry;
        this.$stateKey = str;
        this.$viewFactoryHolderRef = ref;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final SaveableStateRegistry.Entry registerProvider = this.$stateRegistry.registerProvider(this.$stateKey, new AndroidView_androidKt$AndroidView$3$valueProvider$1(this.$viewFactoryHolderRef));
        return new DisposableEffectResult() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                registerProvider.unregister();
            }
        };
    }
}
