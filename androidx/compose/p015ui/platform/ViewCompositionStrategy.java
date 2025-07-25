package androidx.compose.p015ui.platform;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.poolingcontainer.PoolingContainerListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.C37609n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewCompositionStrategy.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy */
/* loaded from: classes.dex */
public interface ViewCompositionStrategy {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: ViewCompositionStrategy.android.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final ViewCompositionStrategy getDefault() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE;
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow */
    /* loaded from: classes.dex */
    public static final class DisposeOnDetachedFromWindow implements ViewCompositionStrategy {
        public static final int $stable = 0;
        @NotNull
        public static final DisposeOnDetachedFromWindow INSTANCE = new DisposeOnDetachedFromWindow();

        private DisposeOnDetachedFromWindow() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1, android.view.View$OnAttachStateChangeListener] */
        @Override // androidx.compose.p015ui.platform.ViewCompositionStrategy
        @NotNull
        public Functions<Unit> installFor(@NotNull final AbstractComposeView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            ?? r0 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    AbstractComposeView.this.disposeComposition();
                }
            };
            view.addOnAttachStateChangeListener(r0);
            return new ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1(view, r0);
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool */
    /* loaded from: classes.dex */
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {
        public static final int $stable = 0;
        @NotNull
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool INSTANCE = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        private DisposeOnDetachedFromWindowOrReleasedFromPool() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1] */
        @Override // androidx.compose.p015ui.platform.ViewCompositionStrategy
        @NotNull
        public Functions<Unit> installFor(@NotNull final AbstractComposeView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            ?? r0 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    if (!PoolingContainer.isWithinPoolingContainer(AbstractComposeView.this)) {
                        AbstractComposeView.this.disposeComposition();
                    }
                }
            };
            view.addOnAttachStateChangeListener(r0);
            PoolingContainerListener poolingContainerListener = new PoolingContainerListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$poolingContainerListener$1
                @Override // androidx.customview.poolingcontainer.PoolingContainerListener
                public final void onRelease() {
                    view.disposeComposition();
                }
            };
            PoolingContainer.addPoolingContainerListener(view, poolingContainerListener);
            return new C0952x11b1833b(view, r0, poolingContainerListener);
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed */
    /* loaded from: classes.dex */
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 0;
        @NotNull
        public static final DisposeOnViewTreeLifecycleDestroyed INSTANCE = new DisposeOnViewTreeLifecycleDestroyed();

        private DisposeOnViewTreeLifecycleDestroyed() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1, android.view.View$OnAttachStateChangeListener] */
        /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1] */
        @Override // androidx.compose.p015ui.platform.ViewCompositionStrategy
        @NotNull
        public Functions<Unit> installFor(@NotNull final AbstractComposeView view) {
            Functions<Unit> installForLifecycle;
            Intrinsics.checkNotNullParameter(view, "view");
            if (view.isAttachedToWindow()) {
                LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
                if (lifecycleOwner != null) {
                    Intrinsics.checkNotNullExpressionValue(lifecycleOwner, "checkNotNull(ViewTreeLif…eOwner\"\n                }");
                    Lifecycle lifecycle = lifecycleOwner.getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(lifecycle, "lco.lifecycle");
                    installForLifecycle = ViewCompositionStrategy_androidKt.installForLifecycle(view, lifecycle);
                    return installForLifecycle;
                }
                throw new IllegalStateException(("View tree for " + view + " has no ViewTreeLifecycleOwner").toString());
            }
            final C37609n0 c37609n0 = new C37609n0();
            ?? r1 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1
                /* JADX WARN: Type inference failed for: r4v7, types: [T, kotlin.jvm.functions.Function0] */
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View v) {
                    ?? installForLifecycle2;
                    Intrinsics.checkNotNullParameter(v, "v");
                    LifecycleOwner lifecycleOwner2 = ViewTreeLifecycleOwner.get(AbstractComposeView.this);
                    AbstractComposeView abstractComposeView = AbstractComposeView.this;
                    if (lifecycleOwner2 != null) {
                        Intrinsics.checkNotNullExpressionValue(lifecycleOwner2, "checkNotNull(ViewTreeLif…                        }");
                        C37609n0<Functions<Unit>> c37609n02 = c37609n0;
                        AbstractComposeView abstractComposeView2 = AbstractComposeView.this;
                        Lifecycle lifecycle2 = lifecycleOwner2.getLifecycle();
                        Intrinsics.checkNotNullExpressionValue(lifecycle2, "lco.lifecycle");
                        installForLifecycle2 = ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView2, lifecycle2);
                        c37609n02.f99327b = installForLifecycle2;
                        AbstractComposeView.this.removeOnAttachStateChangeListener(this);
                        return;
                    }
                    throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                }
            };
            view.addOnAttachStateChangeListener(r1);
            c37609n0.f99327b = new C0955x565475b(view, r1);
            return new C0956x565475c(c37609n0);
        }
    }

    @NotNull
    Functions<Unit> installFor(@NotNull AbstractComposeView abstractComposeView);

    /* compiled from: ViewCompositionStrategy.android.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnLifecycleDestroyed */
    /* loaded from: classes.dex */
    public static final class DisposeOnLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 8;
        @NotNull
        private final Lifecycle lifecycle;

        public DisposeOnLifecycleDestroyed(@NotNull Lifecycle lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            this.lifecycle = lifecycle;
        }

        @Override // androidx.compose.p015ui.platform.ViewCompositionStrategy
        @NotNull
        public Functions<Unit> installFor(@NotNull AbstractComposeView view) {
            Functions<Unit> installForLifecycle;
            Intrinsics.checkNotNullParameter(view, "view");
            installForLifecycle = ViewCompositionStrategy_androidKt.installForLifecycle(view, this.lifecycle);
            return installForLifecycle;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public DisposeOnLifecycleDestroyed(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r2) {
            /*
                r1 = this;
                java.lang.String r0 = "lifecycleOwner"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
                java.lang.String r0 = "lifecycleOwner.lifecycle"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.ViewCompositionStrategy.DisposeOnLifecycleDestroyed.<init>(androidx.lifecycle.LifecycleOwner):void");
        }
    }
}
