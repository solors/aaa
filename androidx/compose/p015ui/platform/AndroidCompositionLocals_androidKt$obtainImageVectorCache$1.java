package androidx.compose.p015ui.platform;

import android.content.Context;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidCompositionLocals.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1 */
/* loaded from: classes.dex */
final class AndroidCompositionLocals_androidKt$obtainImageVectorCache$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ ComponentCallbacks2C0946x477bcb35 $callbacks;
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$obtainImageVectorCache$1(Context context, ComponentCallbacks2C0946x477bcb35 componentCallbacks2C0946x477bcb35) {
        super(1);
        this.$context = context;
        this.$callbacks = componentCallbacks2C0946x477bcb35;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        this.$context.getApplicationContext().registerComponentCallbacks(this.$callbacks);
        final Context context = this.$context;
        final ComponentCallbacks2C0946x477bcb35 componentCallbacks2C0946x477bcb35 = this.$callbacks;
        return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                context.getApplicationContext().unregisterComponentCallbacks(componentCallbacks2C0946x477bcb35);
            }
        };
    }
}
