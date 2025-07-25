package androidx.compose.p015ui.window;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Outline;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.p015ui.C0825R;
import androidx.compose.p015ui.platform.AbstractComposeView;
import androidx.compose.p015ui.platform.ViewRootForInspector;
import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: AndroidDialog.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.window.DialogWrapper */
/* loaded from: classes.dex */
final class DialogWrapper extends Dialog implements ViewRootForInspector {
    @NotNull
    private final View composeView;
    @NotNull
    private final DialogLayout dialogLayout;
    private final float maxSupportedElevation;
    @NotNull
    private Functions<Unit> onDismissRequest;
    @NotNull
    private DialogProperties properties;

    /* compiled from: AndroidDialog.android.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.window.DialogWrapper$WhenMappings */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogWrapper(@NotNull Functions<Unit> onDismissRequest, @NotNull DialogProperties properties, @NotNull View composeView, @NotNull LayoutDirection layoutDirection, @NotNull Density density, @NotNull UUID dialogId) {
        super(new ContextThemeWrapper(composeView.getContext(), C0825R.C0829style.DialogWindowTheme));
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        this.composeView = composeView;
        float m109734constructorimpl = C1059Dp.m109734constructorimpl(30);
        this.maxSupportedElevation = m109734constructorimpl;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(17170445);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            DialogLayout dialogLayout = new DialogLayout(context, window);
            int i = C0825R.C0827id.compose_view_saveable_id_tag;
            dialogLayout.setTag(i, "Dialog:" + dialogId);
            dialogLayout.setClipChildren(false);
            dialogLayout.setElevation(density.mo106214toPx0680j_4(m109734constructorimpl));
            dialogLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.DialogWrapper$1$2
                @Override // android.view.ViewOutlineProvider
                public void getOutline(@NotNull View view, @NotNull Outline result) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(result, "result");
                    result.setRect(0, 0, view.getWidth(), view.getHeight());
                    result.setAlpha(0.0f);
                }
            });
            this.dialogLayout = dialogLayout;
            View decorView = window.getDecorView();
            if (decorView instanceof ViewGroup) {
                viewGroup = (ViewGroup) decorView;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                _init_$disableClipping(viewGroup);
            }
            setContentView(dialogLayout);
            ViewTreeLifecycleOwner.set(dialogLayout, ViewTreeLifecycleOwner.get(composeView));
            ViewTreeViewModelStoreOwner.set(dialogLayout, ViewTreeViewModelStoreOwner.get(composeView));
            ViewTreeSavedStateRegistryOwner.set(dialogLayout, ViewTreeSavedStateRegistryOwner.get(composeView));
            updateParameters(this.onDismissRequest, this.properties, layoutDirection);
            return;
        }
        throw new IllegalStateException("Dialog has no window".toString());
    }

    private static final void _init_$disableClipping(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) childAt;
            } else {
                viewGroup2 = null;
            }
            if (viewGroup2 != null) {
                _init_$disableClipping(viewGroup2);
            }
        }
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection) {
        DialogLayout dialogLayout = this.dialogLayout;
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i2 = 0;
        }
        dialogLayout.setLayoutDirection(i2);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        int i;
        boolean shouldApplySecureFlag = SecureFlagPolicy_androidKt.shouldApplySecureFlag(secureFlagPolicy, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        Window window = getWindow();
        Intrinsics.m17074g(window);
        if (shouldApplySecureFlag) {
            i = 8192;
        } else {
            i = -8193;
        }
        window.setFlags(i, 8192);
    }

    public final void disposeComposition() {
        this.dialogLayout.disposeComposition();
    }

    @Override // androidx.compose.p015ui.platform.ViewRootForInspector
    @NotNull
    public AbstractComposeView getSubCompositionView() {
        return this.dialogLayout;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (this.properties.getDismissOnBackPress()) {
            this.onDismissRequest.invoke();
        }
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean onTouchEvent = super.onTouchEvent(event);
        if (onTouchEvent && this.properties.getDismissOnClickOutside()) {
            this.onDismissRequest.invoke();
        }
        return onTouchEvent;
    }

    public final void setContent(@NotNull CompositionContext parentComposition, @NotNull Function2<? super Composer, ? super Integer, Unit> children) {
        Intrinsics.checkNotNullParameter(parentComposition, "parentComposition");
        Intrinsics.checkNotNullParameter(children, "children");
        this.dialogLayout.setContent(parentComposition, children);
    }

    public final void updateParameters(@NotNull Functions<Unit> onDismissRequest, @NotNull DialogProperties properties, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        setSecurePolicy(properties.getSecurePolicy());
        setLayoutDirection(layoutDirection);
        this.dialogLayout.setUsePlatformDefaultWidth(properties.getUsePlatformDefaultWidth());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }
}
