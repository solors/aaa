package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.p015ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.compose.foundation.text.selection.SelectionHandleInfo */
/* loaded from: classes.dex */
public final class SelectionHandles {
    @NotNull
    private final Handle handle;
    private final long position;

    public /* synthetic */ SelectionHandles(Handle handle, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(handle, j);
    }

    /* renamed from: copy-Uv8p0NA$default  reason: not valid java name */
    public static /* synthetic */ SelectionHandles m106700copyUv8p0NA$default(SelectionHandles selectionHandles, Handle handle, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            handle = selectionHandles.handle;
        }
        if ((i & 2) != 0) {
            j = selectionHandles.position;
        }
        return selectionHandles.m106702copyUv8p0NA(handle, j);
    }

    @NotNull
    public final Handle component1() {
        return this.handle;
    }

    /* renamed from: component2-F1C5BW0  reason: not valid java name */
    public final long m106701component2F1C5BW0() {
        return this.position;
    }

    @NotNull
    /* renamed from: copy-Uv8p0NA  reason: not valid java name */
    public final SelectionHandles m106702copyUv8p0NA(@NotNull Handle handle, long j) {
        Intrinsics.checkNotNullParameter(handle, "handle");
        return new SelectionHandles(handle, j, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionHandles)) {
            return false;
        }
        SelectionHandles selectionHandles = (SelectionHandles) obj;
        if (this.handle == selectionHandles.handle && Offset.m107288equalsimpl0(this.position, selectionHandles.position)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Handle getHandle() {
        return this.handle;
    }

    /* renamed from: getPosition-F1C5BW0  reason: not valid java name */
    public final long m106703getPositionF1C5BW0() {
        return this.position;
    }

    public int hashCode() {
        return (this.handle.hashCode() * 31) + Offset.m107293hashCodeimpl(this.position);
    }

    @NotNull
    public String toString() {
        return "SelectionHandleInfo(handle=" + this.handle + ", position=" + ((Object) Offset.m107299toStringimpl(this.position)) + ')';
    }

    private SelectionHandles(Handle handle, long j) {
        this.handle = handle;
        this.position = j;
    }
}
