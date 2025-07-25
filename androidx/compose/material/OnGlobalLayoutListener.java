package androidx.compose.material;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExposedDropdownMenu.kt */
@Metadata
/* loaded from: classes.dex */
final class OnGlobalLayoutListener implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    private boolean isListeningToGlobalLayout;
    @NotNull
    private final Functions<Unit> onGlobalLayoutCallback;
    @NotNull
    private final View view;

    public OnGlobalLayoutListener(@NotNull View view, @NotNull Functions<Unit> onGlobalLayoutCallback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onGlobalLayoutCallback, "onGlobalLayoutCallback");
        this.view = view;
        this.onGlobalLayoutCallback = onGlobalLayoutCallback;
        view.addOnAttachStateChangeListener(this);
        registerOnGlobalLayoutListener();
    }

    private final void registerOnGlobalLayoutListener() {
        if (!this.isListeningToGlobalLayout && this.view.isAttachedToWindow()) {
            this.view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.isListeningToGlobalLayout = true;
        }
    }

    private final void unregisterOnGlobalLayoutListener() {
        if (!this.isListeningToGlobalLayout) {
            return;
        }
        this.view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.isListeningToGlobalLayout = false;
    }

    public final void dispose() {
        unregisterOnGlobalLayoutListener();
        this.view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.onGlobalLayoutCallback.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        registerOnGlobalLayoutListener();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        unregisterOnGlobalLayoutListener();
    }
}
