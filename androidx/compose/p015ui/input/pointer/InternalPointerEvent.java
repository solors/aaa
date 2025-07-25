package androidx.compose.p015ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: InternalPointerEvent.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.InternalPointerEvent */
/* loaded from: classes.dex */
public final class InternalPointerEvent {
    @NotNull
    private final Map<PointerId, PointerInputChange> changes;
    @NotNull
    private final PointerInputEvent pointerInputEvent;
    private boolean suppressMovementConsumption;

    public InternalPointerEvent(@NotNull Map<PointerId, PointerInputChange> changes, @NotNull PointerInputEvent pointerInputEvent) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(pointerInputEvent, "pointerInputEvent");
        this.changes = changes;
        this.pointerInputEvent = pointerInputEvent;
    }

    @NotNull
    public final Map<PointerId, PointerInputChange> getChanges() {
        return this.changes;
    }

    @NotNull
    public final MotionEvent getMotionEvent() {
        return this.pointerInputEvent.getMotionEvent();
    }

    @NotNull
    public final PointerInputEvent getPointerInputEvent() {
        return this.pointerInputEvent;
    }

    public final boolean getSuppressMovementConsumption() {
        return this.suppressMovementConsumption;
    }

    /* renamed from: issuesEnterExitEvent-0FcD4WY  reason: not valid java name */
    public final boolean m108827issuesEnterExitEvent0FcD4WY(long j) {
        InternalPointerInput internalPointerInput;
        List<InternalPointerInput> pointers = this.pointerInputEvent.getPointers();
        int size = pointers.size();
        int i = 0;
        while (true) {
            if (i < size) {
                internalPointerInput = pointers.get(i);
                if (PointerId.m108880equalsimpl0(internalPointerInput.m108906getIdJ3iCeTQ(), j)) {
                    break;
                }
                i++;
            } else {
                internalPointerInput = null;
                break;
            }
        }
        InternalPointerInput internalPointerInput2 = internalPointerInput;
        if (internalPointerInput2 == null) {
            return false;
        }
        return internalPointerInput2.getIssuesEnterExit();
    }

    public final void setSuppressMovementConsumption(boolean z) {
        this.suppressMovementConsumption = z;
    }
}
