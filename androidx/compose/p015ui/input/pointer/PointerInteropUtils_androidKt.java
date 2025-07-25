package androidx.compose.p015ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.p015ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PointerInteropUtils.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerInteropUtils_androidKt */
/* loaded from: classes.dex */
public final class PointerInteropUtils_androidKt {
    public static final void emptyCancelMotionEventScope(long j, @NotNull Function1<? super MotionEvent, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MotionEvent motionEvent = MotionEvent.obtain(j, j, 3, 0.0f, 0.0f, 0);
        motionEvent.setSource(0);
        Intrinsics.checkNotNullExpressionValue(motionEvent, "motionEvent");
        block.invoke(motionEvent);
        motionEvent.recycle();
    }

    public static /* synthetic */ void emptyCancelMotionEventScope$default(long j, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            j = SystemClock.uptimeMillis();
        }
        emptyCancelMotionEventScope(j, function1);
    }

    /* renamed from: toCancelMotionEventScope-d-4ec7I  reason: not valid java name */
    public static final void m108951toCancelMotionEventScoped4ec7I(@NotNull PointerEvent toCancelMotionEventScope, long j, @NotNull Function1<? super MotionEvent, Unit> block) {
        Intrinsics.checkNotNullParameter(toCancelMotionEventScope, "$this$toCancelMotionEventScope");
        Intrinsics.checkNotNullParameter(block, "block");
        m108953toMotionEventScopeubNVwUQ(toCancelMotionEventScope, j, block, true);
    }

    /* renamed from: toMotionEventScope-d-4ec7I  reason: not valid java name */
    public static final void m108952toMotionEventScoped4ec7I(@NotNull PointerEvent toMotionEventScope, long j, @NotNull Function1<? super MotionEvent, Unit> block) {
        Intrinsics.checkNotNullParameter(toMotionEventScope, "$this$toMotionEventScope");
        Intrinsics.checkNotNullParameter(block, "block");
        m108953toMotionEventScopeubNVwUQ(toMotionEventScope, j, block, false);
    }

    /* renamed from: toMotionEventScope-ubNVwUQ  reason: not valid java name */
    private static final void m108953toMotionEventScopeubNVwUQ(PointerEvent pointerEvent, long j, Function1<? super MotionEvent, Unit> function1, boolean z) {
        MotionEvent motionEvent$ui_release = pointerEvent.getMotionEvent$ui_release();
        if (motionEvent$ui_release != null) {
            int action = motionEvent$ui_release.getAction();
            if (z) {
                motionEvent$ui_release.setAction(3);
            }
            motionEvent$ui_release.offsetLocation(-Offset.m107291getXimpl(j), -Offset.m107292getYimpl(j));
            function1.invoke(motionEvent$ui_release);
            motionEvent$ui_release.offsetLocation(Offset.m107291getXimpl(j), Offset.m107292getYimpl(j));
            motionEvent$ui_release.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
    }
}
