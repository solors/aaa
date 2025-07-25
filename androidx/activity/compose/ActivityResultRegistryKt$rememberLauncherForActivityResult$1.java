package androidx.activity.compose;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: ActivityResultRegistry.kt */
@Metadata
/* loaded from: classes.dex */
final class ActivityResultRegistryKt$rememberLauncherForActivityResult$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ ActivityResultRegistry $activityResultRegistry;
    final /* synthetic */ ActivityResultContract<I, O> $contract;
    final /* synthetic */ State<Function1<O, Unit>> $currentOnResult;
    final /* synthetic */ String $key;
    final /* synthetic */ ActivityResultRegistry<I> $realLauncher;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityResultRegistryKt$rememberLauncherForActivityResult$1(ActivityResultRegistry<I> activityResultRegistry, ActivityResultRegistry activityResultRegistry2, String str, ActivityResultContract<I, O> activityResultContract, State<? extends Function1<? super O, Unit>> state) {
        super(1);
        this.$realLauncher = activityResultRegistry;
        this.$activityResultRegistry = activityResultRegistry2;
        this.$key = str;
        this.$contract = activityResultContract;
        this.$currentOnResult = state;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        ActivityResultRegistry<I> activityResultRegistry = this.$realLauncher;
        ActivityResultRegistry activityResultRegistry2 = this.$activityResultRegistry;
        String str = this.$key;
        Object obj = this.$contract;
        final State<Function1<O, Unit>> state = this.$currentOnResult;
        activityResultRegistry.setLauncher(activityResultRegistry2.register(str, obj, new ActivityResultCallback<O>() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1.1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(O o) {
                state.getValue().invoke(o);
            }
        }));
        final ActivityResultRegistry<I> activityResultRegistry3 = this.$realLauncher;
        return new DisposableEffectResult() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                activityResultRegistry3.unregister();
            }
        };
    }
}
