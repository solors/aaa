package androidx.compose.p015ui.input.pointer;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PointerInputEventProcessor.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerInputChangeEventProducer */
/* loaded from: classes.dex */
public final class PointerInputChangeEventProducer {
    @NotNull
    private final Map<PointerId, PointerInputData> previousPointerInputData = new LinkedHashMap();

    /* compiled from: PointerInputEventProcessor.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.input.pointer.PointerInputChangeEventProducer$PointerInputData */
    /* loaded from: classes.dex */
    private static final class PointerInputData {
        private final boolean down;
        private final long positionOnScreen;
        private final int type;
        private final long uptime;

        public /* synthetic */ PointerInputData(long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z, i);
        }

        public final boolean getDown() {
            return this.down;
        }

        /* renamed from: getPositionOnScreen-F1C5BW0  reason: not valid java name */
        public final long m108897getPositionOnScreenF1C5BW0() {
            return this.positionOnScreen;
        }

        /* renamed from: getType-T8wyACA  reason: not valid java name */
        public final int m108898getTypeT8wyACA() {
            return this.type;
        }

        public final long getUptime() {
            return this.uptime;
        }

        private PointerInputData(long j, long j2, boolean z, int i) {
            this.uptime = j;
            this.positionOnScreen = j2;
            this.down = z;
            this.type = i;
        }
    }

    public final void clear() {
        this.previousPointerInputData.clear();
    }

    @NotNull
    public final InternalPointerEvent produce(@NotNull PointerInputEvent pointerInputEvent, @NotNull PositionCalculator positionCalculator) {
        long j;
        boolean down;
        long mo108974screenToLocalMKHz9U;
        Intrinsics.checkNotNullParameter(pointerInputEvent, "pointerInputEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(pointerInputEvent.getPointers().size());
        List<InternalPointerInput> pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i = 0; i < size; i++) {
            InternalPointerInput internalPointerInput = pointers.get(i);
            PointerInputData pointerInputData = this.previousPointerInputData.get(PointerId.m108877boximpl(internalPointerInput.m108906getIdJ3iCeTQ()));
            if (pointerInputData == null) {
                j = internalPointerInput.getUptime();
                mo108974screenToLocalMKHz9U = internalPointerInput.m108907getPositionF1C5BW0();
                down = false;
            } else {
                long uptime = pointerInputData.getUptime();
                j = uptime;
                down = pointerInputData.getDown();
                mo108974screenToLocalMKHz9U = positionCalculator.mo108974screenToLocalMKHz9U(pointerInputData.m108897getPositionOnScreenF1C5BW0());
            }
            linkedHashMap.put(PointerId.m108877boximpl(internalPointerInput.m108906getIdJ3iCeTQ()), new PointerInputChange(internalPointerInput.m108906getIdJ3iCeTQ(), internalPointerInput.getUptime(), internalPointerInput.m108907getPositionF1C5BW0(), internalPointerInput.getDown(), j, mo108974screenToLocalMKHz9U, down, false, internalPointerInput.m108910getTypeT8wyACA(), (List) internalPointerInput.getHistorical(), internalPointerInput.m108909getScrollDeltaF1C5BW0(), (DefaultConstructorMarker) null));
            if (internalPointerInput.getDown()) {
                this.previousPointerInputData.put(PointerId.m108877boximpl(internalPointerInput.m108906getIdJ3iCeTQ()), new PointerInputData(internalPointerInput.getUptime(), internalPointerInput.m108908getPositionOnScreenF1C5BW0(), internalPointerInput.getDown(), internalPointerInput.m108910getTypeT8wyACA(), null));
            } else {
                this.previousPointerInputData.remove(PointerId.m108877boximpl(internalPointerInput.m108906getIdJ3iCeTQ()));
            }
        }
        return new InternalPointerEvent(linkedHashMap, pointerInputEvent);
    }
}
