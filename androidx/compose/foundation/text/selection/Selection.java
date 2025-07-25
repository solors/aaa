package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.text.TextRangeKt;
import androidx.compose.p015ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Selection.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
public final class Selection {
    @NotNull
    private final AnchorInfo end;
    private final boolean handlesCrossed;
    @NotNull
    private final AnchorInfo start;

    /* compiled from: Selection.kt */
    @Immutable
    @Metadata
    /* loaded from: classes.dex */
    public static final class AnchorInfo {
        @NotNull
        private final ResolvedTextDirection direction;
        private final int offset;
        private final long selectableId;

        public AnchorInfo(@NotNull ResolvedTextDirection direction, int i, long j) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.direction = direction;
            this.offset = i;
            this.selectableId = j;
        }

        public static /* synthetic */ AnchorInfo copy$default(AnchorInfo anchorInfo, ResolvedTextDirection resolvedTextDirection, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                resolvedTextDirection = anchorInfo.direction;
            }
            if ((i2 & 2) != 0) {
                i = anchorInfo.offset;
            }
            if ((i2 & 4) != 0) {
                j = anchorInfo.selectableId;
            }
            return anchorInfo.copy(resolvedTextDirection, i, j);
        }

        @NotNull
        public final ResolvedTextDirection component1() {
            return this.direction;
        }

        public final int component2() {
            return this.offset;
        }

        public final long component3() {
            return this.selectableId;
        }

        @NotNull
        public final AnchorInfo copy(@NotNull ResolvedTextDirection direction, int i, long j) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            return new AnchorInfo(direction, i, j);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnchorInfo)) {
                return false;
            }
            AnchorInfo anchorInfo = (AnchorInfo) obj;
            if (this.direction == anchorInfo.direction && this.offset == anchorInfo.offset && this.selectableId == anchorInfo.selectableId) {
                return true;
            }
            return false;
        }

        @NotNull
        public final ResolvedTextDirection getDirection() {
            return this.direction;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final long getSelectableId() {
            return this.selectableId;
        }

        public int hashCode() {
            return (((this.direction.hashCode() * 31) + Integer.hashCode(this.offset)) * 31) + Long.hashCode(this.selectableId);
        }

        @NotNull
        public String toString() {
            return "AnchorInfo(direction=" + this.direction + ", offset=" + this.offset + ", selectableId=" + this.selectableId + ')';
        }
    }

    public Selection(@NotNull AnchorInfo start, @NotNull AnchorInfo end, boolean z) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.start = start;
        this.end = end;
        this.handlesCrossed = z;
    }

    public static /* synthetic */ Selection copy$default(Selection selection, AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            anchorInfo = selection.start;
        }
        if ((i & 2) != 0) {
            anchorInfo2 = selection.end;
        }
        if ((i & 4) != 0) {
            z = selection.handlesCrossed;
        }
        return selection.copy(anchorInfo, anchorInfo2, z);
    }

    @NotNull
    public final AnchorInfo component1() {
        return this.start;
    }

    @NotNull
    public final AnchorInfo component2() {
        return this.end;
    }

    public final boolean component3() {
        return this.handlesCrossed;
    }

    @NotNull
    public final Selection copy(@NotNull AnchorInfo start, @NotNull AnchorInfo end, boolean z) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        return new Selection(start, end, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) obj;
        if (Intrinsics.m17075f(this.start, selection.start) && Intrinsics.m17075f(this.end, selection.end) && this.handlesCrossed == selection.handlesCrossed) {
            return true;
        }
        return false;
    }

    @NotNull
    public final AnchorInfo getEnd() {
        return this.end;
    }

    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    @NotNull
    public final AnchorInfo getStart() {
        return this.start;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.start.hashCode() * 31) + this.end.hashCode()) * 31;
        boolean z = this.handlesCrossed;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public final Selection merge(@Nullable Selection selection) {
        if (selection == null) {
            return this;
        }
        if (this.handlesCrossed) {
            return copy$default(this, selection.start, null, false, 6, null);
        }
        return copy$default(this, null, selection.end, false, 5, null);
    }

    @NotNull
    public String toString() {
        return "Selection(start=" + this.start + ", end=" + this.end + ", handlesCrossed=" + this.handlesCrossed + ')';
    }

    /* renamed from: toTextRange-d9O1mEE  reason: not valid java name */
    public final long m106691toTextRanged9O1mEE() {
        return TextRangeKt.TextRange(this.start.getOffset(), this.end.getOffset());
    }

    public /* synthetic */ Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(anchorInfo, anchorInfo2, (i & 4) != 0 ? false : z);
    }
}
