package androidx.compose.p015ui.window;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.p015ui.platform.AbstractComposeView;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import be.MathJVM;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidDialog.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.window.DialogLayout */
/* loaded from: classes.dex */
public final class DialogLayout extends AbstractComposeView implements DialogWindowProvider {
    @NotNull
    private final SnapshotState content$delegate;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private boolean usePlatformDefaultWidth;
    @NotNull
    private final Window window;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogLayout(@NotNull Context context, @NotNull Window window) {
        super(context, null, 0, 6, null);
        SnapshotState mutableStateOf$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(window, "window");
        this.window = window;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidDialog_androidKt.INSTANCE.m109980getLambda1$ui_release(), null, 2, null);
        this.content$delegate = mutableStateOf$default;
    }

    private final Function2<Composer, Integer, Unit> getContent() {
        return (Function2) this.content$delegate.getValue();
    }

    private final int getDisplayHeight() {
        int m103791d;
        m103791d = MathJVM.m103791d(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
        return m103791d;
    }

    private final int getDisplayWidth() {
        int m103791d;
        m103791d = MathJVM.m103791d(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
        return m103791d;
    }

    private final void setContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.content$delegate.setValue(function2);
    }

    @Override // androidx.compose.p015ui.platform.AbstractComposeView
    @Composable
    public void Content(@Nullable Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1735448596);
        getContent().mo105910invoke(startRestartGroup, 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DialogLayout$Content$4(this, i));
        }
    }

    @Override // androidx.compose.p015ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    @Override // androidx.compose.p015ui.window.DialogWindowProvider
    @NotNull
    public Window getWindow() {
        return this.window;
    }

    @Override // androidx.compose.p015ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean z, int i, int i2, int i3, int i4) {
        super.internalOnLayout$ui_release(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        getWindow().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.p015ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int i, int i2) {
        if (this.usePlatformDefaultWidth) {
            super.internalOnMeasure$ui_release(i, i2);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final void setUsePlatformDefaultWidth(boolean z) {
        this.usePlatformDefaultWidth = z;
    }

    public final void setContent(@NotNull CompositionContext parent, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(content, "content");
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }
}
