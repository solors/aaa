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
final class LifecycleEffectKt$LifecycleStartEffectImpl$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> $effects;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ LifecycleStartStopEffectScope $scope;

    /* compiled from: LifecycleEffect.kt */
    @Metadata
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleEffectKt$LifecycleStartEffectImpl$1(LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope lifecycleStartStopEffectScope, Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1) {
        super(1);
        this.$lifecycleOwner = lifecycleOwner;
        this.$scope = lifecycleStartStopEffectScope;
        this.$effects = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static final void invoke$lambda$1(LifecycleStartStopEffectScope lifecycleStartStopEffectScope, C37609n0 c37609n0, Function1 function1, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult;
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i != 1) {
            if (i == 2 && (lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) c37609n0.f99327b) != null) {
                lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
                return;
            }
            return;
        }
        c37609n0.f99327b = function1.invoke(lifecycleStartStopEffectScope);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
        final C37609n0 c37609n0 = new C37609n0();
        final LifecycleStartStopEffectScope lifecycleStartStopEffectScope = this.$scope;
        final Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> function1 = this.$effects;
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.compose.c
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LifecycleEffectKt$LifecycleStartEffectImpl$1.invoke$lambda$1(LifecycleStartStopEffectScope.this, c37609n0, function1, lifecycleOwner, event);
            }
        };
        this.$lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        final LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
        return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
                LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) c37609n0.f99327b;
                if (lifecycleStopOrDisposeEffectResult != null) {
                    lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
                }
            }
        };
    }
}
