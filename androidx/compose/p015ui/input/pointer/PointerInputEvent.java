package androidx.compose.p015ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PointerInputEvent.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerInputEvent */
/* loaded from: classes.dex */
public final class PointerInputEvent {
    @NotNull
    private final MotionEvent motionEvent;
    @NotNull
    private final List<InternalPointerInput> pointers;
    private final long uptime;

    public PointerInputEvent(long j, @NotNull List<InternalPointerInput> pointers, @NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(pointers, "pointers");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        this.uptime = j;
        this.pointers = pointers;
        this.motionEvent = motionEvent;
    }

    @NotNull
    public final MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    @NotNull
    public final List<InternalPointerInput> getPointers() {
        return this.pointers;
    }

    public final long getUptime() {
        return this.uptime;
    }
}
