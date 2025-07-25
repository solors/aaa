package androidx.compose.p015ui.input.pointer;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p015ui.geometry.OffsetKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MotionEventAdapter.android.kt */
@RequiresApi(29)
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.MotionEventHelper */
/* loaded from: classes.dex */
final class MotionEventHelper {
    @NotNull
    public static final MotionEventHelper INSTANCE = new MotionEventHelper();

    private MotionEventHelper() {
    }

    @DoNotInline
    /* renamed from: toRawOffset-dBAh8RU  reason: not valid java name */
    public final long m108829toRawOffsetdBAh8RU(@NotNull MotionEvent motionEvent, int i) {
        float rawX;
        float rawY;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        rawX = motionEvent.getRawX(i);
        rawY = motionEvent.getRawY(i);
        return OffsetKt.Offset(rawX, rawY);
    }
}
