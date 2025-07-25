package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PointerEvent.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerInputChange */
/* loaded from: classes.dex */
public final class PointerInputChange {
    @Nullable
    private List<HistoricalChange> _historical;
    @NotNull
    private ConsumedData consumed;

    /* renamed from: id */
    private final long f494id;
    private final long position;
    private final boolean pressed;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final long scrollDelta;
    private final int type;
    private final long uptimeMillis;

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, consumedData, i);
    }

    /* renamed from: copy-0GkPj7c$default  reason: not valid java name */
    public static /* synthetic */ PointerInputChange m108884copy0GkPj7c$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, long j6, int i2, Object obj) {
        long j7;
        long j8;
        long j9;
        boolean z3;
        long j10;
        long j11;
        boolean z4;
        int i3;
        long j12;
        if ((i2 & 1) != 0) {
            j7 = pointerInputChange.f494id;
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = pointerInputChange.uptimeMillis;
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = pointerInputChange.position;
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            z3 = pointerInputChange.pressed;
        } else {
            z3 = z;
        }
        if ((i2 & 16) != 0) {
            j10 = pointerInputChange.previousUptimeMillis;
        } else {
            j10 = j4;
        }
        if ((i2 & 32) != 0) {
            j11 = pointerInputChange.previousPosition;
        } else {
            j11 = j5;
        }
        if ((i2 & 64) != 0) {
            z4 = pointerInputChange.previousPressed;
        } else {
            z4 = z2;
        }
        if ((i2 & 256) != 0) {
            i3 = pointerInputChange.type;
        } else {
            i3 = i;
        }
        int i4 = i3;
        if ((i2 & 512) != 0) {
            j12 = pointerInputChange.scrollDelta;
        } else {
            j12 = j6;
        }
        return pointerInputChange.m108888copy0GkPj7c(j7, j8, j9, z3, j10, j11, z4, consumedData, i4, j12);
    }

    /* renamed from: copy-Ezr-O64$default  reason: not valid java name */
    public static /* synthetic */ PointerInputChange m108885copyEzrO64$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, int i2, Object obj) {
        long j6;
        long j7;
        long j8;
        boolean z3;
        long j9;
        long j10;
        boolean z4;
        ConsumedData consumedData2;
        int i3;
        if ((i2 & 1) != 0) {
            j6 = pointerInputChange.f494id;
        } else {
            j6 = j;
        }
        if ((i2 & 2) != 0) {
            j7 = pointerInputChange.uptimeMillis;
        } else {
            j7 = j2;
        }
        if ((i2 & 4) != 0) {
            j8 = pointerInputChange.position;
        } else {
            j8 = j3;
        }
        if ((i2 & 8) != 0) {
            z3 = pointerInputChange.pressed;
        } else {
            z3 = z;
        }
        if ((i2 & 16) != 0) {
            j9 = pointerInputChange.previousUptimeMillis;
        } else {
            j9 = j4;
        }
        if ((i2 & 32) != 0) {
            j10 = pointerInputChange.previousPosition;
        } else {
            j10 = j5;
        }
        if ((i2 & 64) != 0) {
            z4 = pointerInputChange.previousPressed;
        } else {
            z4 = z2;
        }
        if ((i2 & 128) != 0) {
            consumedData2 = pointerInputChange.consumed;
        } else {
            consumedData2 = consumedData;
        }
        if ((i2 & 256) != 0) {
            i3 = pointerInputChange.type;
        } else {
            i3 = i;
        }
        return pointerInputChange.m108889copyEzrO64(j6, j7, j8, z3, j9, j10, z4, consumedData2, i3);
    }

    /* renamed from: copy-JKmWfYY$default  reason: not valid java name */
    public static /* synthetic */ PointerInputChange m108886copyJKmWfYY$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, long j6, int i2, Object obj) {
        long j7;
        long j8;
        long j9;
        boolean z3;
        long j10;
        long j11;
        boolean z4;
        int i3;
        long j12;
        if ((i2 & 1) != 0) {
            j7 = pointerInputChange.f494id;
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = pointerInputChange.uptimeMillis;
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = pointerInputChange.position;
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            z3 = pointerInputChange.pressed;
        } else {
            z3 = z;
        }
        if ((i2 & 16) != 0) {
            j10 = pointerInputChange.previousUptimeMillis;
        } else {
            j10 = j4;
        }
        if ((i2 & 32) != 0) {
            j11 = pointerInputChange.previousPosition;
        } else {
            j11 = j5;
        }
        if ((i2 & 64) != 0) {
            z4 = pointerInputChange.previousPressed;
        } else {
            z4 = z2;
        }
        if ((i2 & 128) != 0) {
            i3 = pointerInputChange.type;
        } else {
            i3 = i;
        }
        int i4 = i3;
        if ((i2 & 256) != 0) {
            j12 = pointerInputChange.scrollDelta;
        } else {
            j12 = j6;
        }
        return pointerInputChange.m108890copyJKmWfYY(j7, j8, j9, z3, j10, j11, z4, i4, j12);
    }

    /* renamed from: copy-OHpmEuE$default  reason: not valid java name */
    public static /* synthetic */ PointerInputChange m108887copyOHpmEuE$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List list, long j6, int i2, Object obj) {
        long j7;
        long j8;
        long j9;
        boolean z3;
        long j10;
        long j11;
        boolean z4;
        int i3;
        long j12;
        if ((i2 & 1) != 0) {
            j7 = pointerInputChange.f494id;
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = pointerInputChange.uptimeMillis;
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = pointerInputChange.position;
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            z3 = pointerInputChange.pressed;
        } else {
            z3 = z;
        }
        if ((i2 & 16) != 0) {
            j10 = pointerInputChange.previousUptimeMillis;
        } else {
            j10 = j4;
        }
        if ((i2 & 32) != 0) {
            j11 = pointerInputChange.previousPosition;
        } else {
            j11 = j5;
        }
        if ((i2 & 64) != 0) {
            z4 = pointerInputChange.previousPressed;
        } else {
            z4 = z2;
        }
        if ((i2 & 128) != 0) {
            i3 = pointerInputChange.type;
        } else {
            i3 = i;
        }
        int i4 = i3;
        if ((i2 & 512) != 0) {
            j12 = pointerInputChange.scrollDelta;
        } else {
            j12 = j6;
        }
        return pointerInputChange.m108891copyOHpmEuE(j7, j8, j9, z3, j10, j11, z4, i4, list, j12);
    }

    public final void consume() {
        this.consumed.setDownChange(true);
        this.consumed.setPositionChange(true);
    }

    @NotNull
    /* renamed from: copy-0GkPj7c  reason: not valid java name */
    public final PointerInputChange m108888copy0GkPj7c(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, @NotNull ConsumedData consumed, int i, long j6) {
        boolean z3;
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (!consumed.getDownChange() && !consumed.getPositionChange()) {
            z3 = false;
        } else {
            z3 = true;
        }
        PointerInputChange pointerInputChange = new PointerInputChange(j, j2, j3, z, j4, j5, z2, z3, i, getHistorical(), j6, (DefaultConstructorMarker) null);
        this.consumed = consumed;
        return pointerInputChange;
    }

    /* renamed from: copy-Ezr-O64  reason: not valid java name */
    public final /* synthetic */ PointerInputChange m108889copyEzrO64(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumed, int i) {
        boolean z3;
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (!consumed.getDownChange() && !consumed.getPositionChange()) {
            z3 = false;
        } else {
            z3 = true;
        }
        PointerInputChange pointerInputChange = new PointerInputChange(j, j2, j3, z, j4, j5, z2, z3, i, getHistorical(), this.scrollDelta, (DefaultConstructorMarker) null);
        this.consumed = consumed;
        return pointerInputChange;
    }

    @NotNull
    /* renamed from: copy-JKmWfYY  reason: not valid java name */
    public final PointerInputChange m108890copyJKmWfYY(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, long j6) {
        PointerInputChange pointerInputChange = new PointerInputChange(j, j2, j3, z, j4, j5, z2, false, i, (List) getHistorical(), j6, (DefaultConstructorMarker) null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    @ExperimentalComposeUiApi
    @NotNull
    /* renamed from: copy-OHpmEuE  reason: not valid java name */
    public final PointerInputChange m108891copyOHpmEuE(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, @NotNull List<HistoricalChange> historical, long j6) {
        Intrinsics.checkNotNullParameter(historical, "historical");
        PointerInputChange pointerInputChange = new PointerInputChange(j, j2, j3, z, j4, j5, z2, false, i, (List) historical, j6, (DefaultConstructorMarker) null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    @NotNull
    public final ConsumedData getConsumed() {
        return this.consumed;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public final List<HistoricalChange> getHistorical() {
        List<HistoricalChange> m17166m;
        List<HistoricalChange> list = this._historical;
        if (list == null) {
            m17166m = C37563v.m17166m();
            return m17166m;
        }
        return list;
    }

    /* renamed from: getId-J3iCeTQ  reason: not valid java name */
    public final long m108892getIdJ3iCeTQ() {
        return this.f494id;
    }

    /* renamed from: getPosition-F1C5BW0  reason: not valid java name */
    public final long m108893getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    /* renamed from: getPreviousPosition-F1C5BW0  reason: not valid java name */
    public final long m108894getPreviousPositionF1C5BW0() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    /* renamed from: getScrollDelta-F1C5BW0  reason: not valid java name */
    public final long m108895getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA  reason: not valid java name */
    public final int m108896getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean isConsumed() {
        if (!this.consumed.getDownChange() && !this.consumed.getPositionChange()) {
            return false;
        }
        return true;
    }

    @NotNull
    public String toString() {
        return "PointerInputChange(id=" + ((Object) PointerId.m108882toStringimpl(this.f494id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m107299toStringimpl(this.position)) + ", pressed=" + this.pressed + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) Offset.m107299toStringimpl(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + isConsumed() + ", type=" + ((Object) PointerType.m108966toStringimpl(this.type)) + ", historical=" + getHistorical() + ",scrollDelta=" + ((Object) Offset.m107299toStringimpl(this.scrollDelta)) + ')';
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, list, j6);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.f494id = j;
        this.uptimeMillis = j2;
        this.position = j3;
        this.pressed = z;
        this.previousUptimeMillis = j4;
        this.previousPosition = j5;
        this.previousPressed = z2;
        this.type = i;
        this.scrollDelta = j6;
        this.consumed = new ConsumedData(z3, z3);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, z3, (i2 & 256) != 0 ? PointerType.Companion.m108971getTouchT8wyACA() : i, (i2 & 512) != 0 ? Offset.Companion.m107307getZeroF1C5BW0() : j6, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, consumedData, (i2 & 256) != 0 ? PointerType.Companion.m108971getTouchT8wyACA() : i, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void getConsumed$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getHistorical$annotations() {
    }

    public static /* synthetic */ void isConsumed$annotations() {
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i) {
        this(j, j2, j3, z, j4, j5, z2, consumedData.getDownChange() || consumedData.getPositionChange(), i, Offset.Companion.m107307getZeroF1C5BW0(), (DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, List<HistoricalChange> list, long j6) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6, (DefaultConstructorMarker) null);
        this._historical = list;
    }
}
