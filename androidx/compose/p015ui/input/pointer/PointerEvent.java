package androidx.compose.p015ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PointerEvent.android.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerEvent */
/* loaded from: classes.dex */
public final class PointerEvent {
    public static final int $stable = 8;
    private final int buttons;
    @NotNull
    private final List<PointerInputChange> changes;
    @Nullable
    private final InternalPointerEvent internalPointerEvent;
    private final int keyboardModifiers;
    private int type;

    public PointerEvent(@NotNull List<PointerInputChange> changes, @Nullable InternalPointerEvent internalPointerEvent) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        this.changes = changes;
        this.internalPointerEvent = internalPointerEvent;
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        this.buttons = PointerButtons.m108831constructorimpl(motionEvent$ui_release != null ? motionEvent$ui_release.getButtonState() : 0);
        MotionEvent motionEvent$ui_release2 = getMotionEvent$ui_release();
        this.keyboardModifiers = PointerKeyboardModifiers.m108955constructorimpl(motionEvent$ui_release2 != null ? motionEvent$ui_release2.getMetaState() : 0);
        this.type = m108837calculatePointerEventType7fucELk();
    }

    /* renamed from: calculatePointerEventType-7fucELk */
    private final int m108837calculatePointerEventType7fucELk() {
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        if (motionEvent$ui_release != null) {
            int actionMasked = motionEvent$ui_release.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return PointerEventType.Companion.m108856getScroll7fucELk();
                            case 9:
                                return PointerEventType.Companion.m108851getEnter7fucELk();
                            case 10:
                                return PointerEventType.Companion.m108852getExit7fucELk();
                            default:
                                return PointerEventType.Companion.m108857getUnknown7fucELk();
                        }
                    }
                    return PointerEventType.Companion.m108853getMove7fucELk();
                }
                return PointerEventType.Companion.m108855getRelease7fucELk();
            }
            return PointerEventType.Companion.m108854getPress7fucELk();
        }
        List<PointerInputChange> list = this.changes;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = list.get(i);
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                return PointerEventType.Companion.m108855getRelease7fucELk();
            }
            if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                return PointerEventType.Companion.m108854getPress7fucELk();
            }
        }
        return PointerEventType.Companion.m108853getMove7fucELk();
    }

    @NotNull
    public final List<PointerInputChange> component1() {
        return this.changes;
    }

    @NotNull
    public final PointerEvent copy(@NotNull List<PointerInputChange> changes, @Nullable MotionEvent motionEvent) {
        boolean z;
        Intrinsics.checkNotNullParameter(changes, "changes");
        if (motionEvent == null) {
            return new PointerEvent(changes, null);
        }
        if (Intrinsics.m17075f(motionEvent, getMotionEvent$ui_release())) {
            return new PointerEvent(changes, this.internalPointerEvent);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = changes.get(i);
            linkedHashMap.put(PointerId.m108877boximpl(pointerInputChange.m108892getIdJ3iCeTQ()), pointerInputChange);
        }
        ArrayList arrayList = new ArrayList(changes.size());
        int size2 = changes.size();
        int i2 = 0;
        while (i2 < size2) {
            PointerInputChange pointerInputChange2 = changes.get(i2);
            long m108892getIdJ3iCeTQ = pointerInputChange2.m108892getIdJ3iCeTQ();
            long uptimeMillis = pointerInputChange2.getUptimeMillis();
            long m108893getPositionF1C5BW0 = pointerInputChange2.m108893getPositionF1C5BW0();
            long m108893getPositionF1C5BW02 = pointerInputChange2.m108893getPositionF1C5BW0();
            boolean pressed = pointerInputChange2.getPressed();
            int m108896getTypeT8wyACA = pointerInputChange2.m108896getTypeT8wyACA();
            InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
            int i3 = size2;
            if (internalPointerEvent != null) {
                z = true;
                if (internalPointerEvent.m108827issuesEnterExitEvent0FcD4WY(pointerInputChange2.m108892getIdJ3iCeTQ())) {
                    arrayList.add(new InternalPointerInput(m108892getIdJ3iCeTQ, uptimeMillis, m108893getPositionF1C5BW0, m108893getPositionF1C5BW02, pressed, m108896getTypeT8wyACA, z, null, 0L, 384, null));
                    i2++;
                    size2 = i3;
                }
            }
            z = false;
            arrayList.add(new InternalPointerInput(m108892getIdJ3iCeTQ, uptimeMillis, m108893getPositionF1C5BW0, m108893getPositionF1C5BW02, pressed, m108896getTypeT8wyACA, z, null, 0L, 384, null));
            i2++;
            size2 = i3;
        }
        return new PointerEvent(changes, new InternalPointerEvent(linkedHashMap, new PointerInputEvent(motionEvent.getEventTime(), arrayList, motionEvent)));
    }

    /* renamed from: getButtons-ry648PA */
    public final int m108838getButtonsry648PA() {
        return this.buttons;
    }

    @NotNull
    public final List<PointerInputChange> getChanges() {
        return this.changes;
    }

    @Nullable
    public final InternalPointerEvent getInternalPointerEvent$ui_release() {
        return this.internalPointerEvent;
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A */
    public final int m108839getKeyboardModifiersk7X9c1A() {
        return this.keyboardModifiers;
    }

    @Nullable
    public final MotionEvent getMotionEvent$ui_release() {
        InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        if (internalPointerEvent != null) {
            return internalPointerEvent.getMotionEvent();
        }
        return null;
    }

    /* renamed from: getType-7fucELk */
    public final int m108840getType7fucELk() {
        return this.type;
    }

    /* renamed from: setType-EhbLWgg$ui_release */
    public final void m108841setTypeEhbLWgg$ui_release(int i) {
        this.type = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PointerEvent(@NotNull List<PointerInputChange> changes) {
        this(changes, null);
        Intrinsics.checkNotNullParameter(changes, "changes");
    }
}
