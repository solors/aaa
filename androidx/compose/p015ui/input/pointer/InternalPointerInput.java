package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerInputEventData */
/* loaded from: classes.dex */
public final class InternalPointerInput {
    private final boolean down;
    @NotNull
    private final List<HistoricalChange> historical;

    /* renamed from: id */
    private final long f495id;
    private final boolean issuesEnterExit;
    private final long position;
    private final long positionOnScreen;
    private final long scrollDelta;
    private final int type;
    private final long uptime;

    public /* synthetic */ InternalPointerInput(long j, long j2, long j3, long j4, boolean z, int i, boolean z2, List list, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, z, i, z2, list, j5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-JzxSYW4$default  reason: not valid java name */
    public static /* synthetic */ InternalPointerInput m108899copyJzxSYW4$default(InternalPointerInput internalPointerInput, long j, long j2, long j3, long j4, boolean z, int i, boolean z2, List list, long j5, int i2, Object obj) {
        long j6;
        long j7;
        long j8;
        long j9;
        boolean z3;
        int i3;
        boolean z4;
        List<HistoricalChange> list2;
        long j10;
        if ((i2 & 1) != 0) {
            j6 = internalPointerInput.f495id;
        } else {
            j6 = j;
        }
        if ((i2 & 2) != 0) {
            j7 = internalPointerInput.uptime;
        } else {
            j7 = j2;
        }
        if ((i2 & 4) != 0) {
            j8 = internalPointerInput.positionOnScreen;
        } else {
            j8 = j3;
        }
        if ((i2 & 8) != 0) {
            j9 = internalPointerInput.position;
        } else {
            j9 = j4;
        }
        if ((i2 & 16) != 0) {
            z3 = internalPointerInput.down;
        } else {
            z3 = z;
        }
        if ((i2 & 32) != 0) {
            i3 = internalPointerInput.type;
        } else {
            i3 = i;
        }
        if ((i2 & 64) != 0) {
            z4 = internalPointerInput.issuesEnterExit;
        } else {
            z4 = z2;
        }
        if ((i2 & 128) != 0) {
            list2 = internalPointerInput.historical;
        } else {
            list2 = list;
        }
        if ((i2 & 256) != 0) {
            j10 = internalPointerInput.scrollDelta;
        } else {
            j10 = j5;
        }
        return internalPointerInput.m108905copyJzxSYW4(j6, j7, j8, j9, z3, i3, z4, list2, j10);
    }

    /* renamed from: component1-J3iCeTQ  reason: not valid java name */
    public final long m108900component1J3iCeTQ() {
        return this.f495id;
    }

    public final long component2() {
        return this.uptime;
    }

    /* renamed from: component3-F1C5BW0  reason: not valid java name */
    public final long m108901component3F1C5BW0() {
        return this.positionOnScreen;
    }

    /* renamed from: component4-F1C5BW0  reason: not valid java name */
    public final long m108902component4F1C5BW0() {
        return this.position;
    }

    public final boolean component5() {
        return this.down;
    }

    /* renamed from: component6-T8wyACA  reason: not valid java name */
    public final int m108903component6T8wyACA() {
        return this.type;
    }

    public final boolean component7() {
        return this.issuesEnterExit;
    }

    @NotNull
    public final List<HistoricalChange> component8() {
        return this.historical;
    }

    /* renamed from: component9-F1C5BW0  reason: not valid java name */
    public final long m108904component9F1C5BW0() {
        return this.scrollDelta;
    }

    @NotNull
    /* renamed from: copy-JzxSYW4  reason: not valid java name */
    public final InternalPointerInput m108905copyJzxSYW4(long j, long j2, long j3, long j4, boolean z, int i, boolean z2, @NotNull List<HistoricalChange> historical, long j5) {
        Intrinsics.checkNotNullParameter(historical, "historical");
        return new InternalPointerInput(j, j2, j3, j4, z, i, z2, historical, j5, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalPointerInput)) {
            return false;
        }
        InternalPointerInput internalPointerInput = (InternalPointerInput) obj;
        if (PointerId.m108880equalsimpl0(this.f495id, internalPointerInput.f495id) && this.uptime == internalPointerInput.uptime && Offset.m107288equalsimpl0(this.positionOnScreen, internalPointerInput.positionOnScreen) && Offset.m107288equalsimpl0(this.position, internalPointerInput.position) && this.down == internalPointerInput.down && PointerType.m108964equalsimpl0(this.type, internalPointerInput.type) && this.issuesEnterExit == internalPointerInput.issuesEnterExit && Intrinsics.m17075f(this.historical, internalPointerInput.historical) && Offset.m107288equalsimpl0(this.scrollDelta, internalPointerInput.scrollDelta)) {
            return true;
        }
        return false;
    }

    public final boolean getDown() {
        return this.down;
    }

    @NotNull
    public final List<HistoricalChange> getHistorical() {
        return this.historical;
    }

    /* renamed from: getId-J3iCeTQ  reason: not valid java name */
    public final long m108906getIdJ3iCeTQ() {
        return this.f495id;
    }

    public final boolean getIssuesEnterExit() {
        return this.issuesEnterExit;
    }

    /* renamed from: getPosition-F1C5BW0  reason: not valid java name */
    public final long m108907getPositionF1C5BW0() {
        return this.position;
    }

    /* renamed from: getPositionOnScreen-F1C5BW0  reason: not valid java name */
    public final long m108908getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    /* renamed from: getScrollDelta-F1C5BW0  reason: not valid java name */
    public final long m108909getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA  reason: not valid java name */
    public final int m108910getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptime() {
        return this.uptime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m108881hashCodeimpl = ((((((PointerId.m108881hashCodeimpl(this.f495id) * 31) + Long.hashCode(this.uptime)) * 31) + Offset.m107293hashCodeimpl(this.positionOnScreen)) * 31) + Offset.m107293hashCodeimpl(this.position)) * 31;
        boolean z = this.down;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int m108965hashCodeimpl = (((m108881hashCodeimpl + i2) * 31) + PointerType.m108965hashCodeimpl(this.type)) * 31;
        boolean z2 = this.issuesEnterExit;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return ((((m108965hashCodeimpl + i) * 31) + this.historical.hashCode()) * 31) + Offset.m107293hashCodeimpl(this.scrollDelta);
    }

    @NotNull
    public String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.m108882toStringimpl(this.f495id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) Offset.m107299toStringimpl(this.positionOnScreen)) + ", position=" + ((Object) Offset.m107299toStringimpl(this.position)) + ", down=" + this.down + ", type=" + ((Object) PointerType.m108966toStringimpl(this.type)) + ", issuesEnterExit=" + this.issuesEnterExit + ", historical=" + this.historical + ", scrollDelta=" + ((Object) Offset.m107299toStringimpl(this.scrollDelta)) + ')';
    }

    private InternalPointerInput(long j, long j2, long j3, long j4, boolean z, int i, boolean z2, List<HistoricalChange> list, long j5) {
        this.f495id = j;
        this.uptime = j2;
        this.positionOnScreen = j3;
        this.position = j4;
        this.down = z;
        this.type = i;
        this.issuesEnterExit = z2;
        this.historical = list;
        this.scrollDelta = j5;
    }

    public /* synthetic */ InternalPointerInput(long j, long j2, long j3, long j4, boolean z, int i, boolean z2, List list, long j5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, z, i, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? new ArrayList() : list, (i2 & 256) != 0 ? Offset.Companion.m107307getZeroF1C5BW0() : j5, null);
    }
}
