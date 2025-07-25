package androidx.compose.p015ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.p015ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PointerInteropFilter.android.kt */
@ExperimentalComposeUiApi
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter */
/* loaded from: classes.dex */
public final class PointerInteropFilter implements PointerInputModifier {
    private boolean disallowIntercept;
    public Function1<? super MotionEvent, Boolean> onTouchEvent;
    @NotNull
    private final PointerInputFilter pointerInputFilter = new PointerInteropFilter$pointerInputFilter$1(this);
    @Nullable
    private RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PointerInteropFilter.android.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState */
    /* loaded from: classes.dex */
    public enum DispatchToViewState {
        Unknown,
        Dispatching,
        NotDispatching
    }

    public final boolean getDisallowIntercept$ui_release() {
        return this.disallowIntercept;
    }

    @NotNull
    public final Function1<MotionEvent, Boolean> getOnTouchEvent() {
        Function1 function1 = this.onTouchEvent;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.m17056y("onTouchEvent");
        return null;
    }

    @Override // androidx.compose.p015ui.input.pointer.PointerInputModifier
    @NotNull
    public PointerInputFilter getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    @Nullable
    public final RequestDisallowInterceptTouchEvent getRequestDisallowInterceptTouchEvent() {
        return this.requestDisallowInterceptTouchEvent;
    }

    public final void setDisallowIntercept$ui_release(boolean z) {
        this.disallowIntercept = z;
    }

    public final void setOnTouchEvent(@NotNull Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onTouchEvent = function1;
    }

    public final void setRequestDisallowInterceptTouchEvent(@Nullable RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent) {
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent2 = this.requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent2 != null) {
            requestDisallowInterceptTouchEvent2.setPointerInteropFilter$ui_release(null);
        }
        this.requestDisallowInterceptTouchEvent = requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent != null) {
            requestDisallowInterceptTouchEvent.setPointerInteropFilter$ui_release(this);
        }
    }
}
