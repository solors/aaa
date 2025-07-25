package androidx.lifecycle.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C37609n0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: LifecycleEffect.kt */
@Metadata
/* loaded from: classes.dex */
final class LifecycleEffectKt$LifecycleResumeEffectImpl$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> $effects;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ LifecycleResumePauseEffectScope $scope;

    /* compiled from: LifecycleEffect.kt */
    @Metadata
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleEffectKt$LifecycleResumeEffectImpl$1(LifecycleOwner lifecycleOwner, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1) {
        super(1);
        this.$lifecycleOwner = lifecycleOwner;
        this.$scope = lifecycleResumePauseEffectScope;
        this.$effects = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static final void invoke$lambda$1(LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, C37609n0 c37609n0, Function1 function1, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult;
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i != 1) {
            if (i == 2 && (lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) c37609n0.f99327b) != null) {
                lifecyclePauseOrDisposeEffectResult.runPauseOrOnDisposeEffect();
                return;
            }
            return;
        }
        c37609n0.f99327b = function1.invoke(lifecycleResumePauseEffectScope);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
        final C37609n0 c37609n0 = new C37609n0();
        final LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope = this.$scope;
        final Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> function1 = this.$effects;
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.compose.b
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LifecycleEffectKt$LifecycleResumeEffectImpl$1.invoke$lambda$1(LifecycleResumePauseEffectScope.this, c37609n0, function1, lifecycleOwner, event);
            }
        };
        this.$lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        final LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
        return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffectImpl$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
                LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) c37609n0.f99327b;
                if (lifecyclePauseOrDisposeEffectResult != null) {
                    lifecyclePauseOrDisposeEffectResult.runPauseOrOnDisposeEffect();
                }
            }
        };
    }
}
