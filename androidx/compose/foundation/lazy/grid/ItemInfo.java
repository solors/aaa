package androidx.compose.foundation.lazy.grid;

import androidx.compose.p015ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridItemPlacementAnimator.kt */
@Metadata
/* loaded from: classes.dex */
final class ItemInfo {
    private int crossAxisOffset;
    private int crossAxisSize;
    private int index;
    private long notAnimatableDelta = IntOffset.Companion.m109862getZeronOccac();
    @NotNull
    private final List<PlaceableInfo> placeables = new ArrayList();

    public ItemInfo(int i, int i2, int i3) {
        this.index = i;
        this.crossAxisSize = i2;
        this.crossAxisOffset = i3;
    }

    public final int getCrossAxisOffset() {
        return this.crossAxisOffset;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final int getIndex() {
        return this.index;
    }

    /* renamed from: getNotAnimatableDelta-nOcc-ac  reason: not valid java name */
    public final long m106475getNotAnimatableDeltanOccac() {
        return this.notAnimatableDelta;
    }

    @NotNull
    public final List<PlaceableInfo> getPlaceables() {
        return this.placeables;
    }

    public final void setCrossAxisOffset(int i) {
        this.crossAxisOffset = i;
    }

    public final void setCrossAxisSize(int i) {
        this.crossAxisSize = i;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    /* renamed from: setNotAnimatableDelta--gyyYBs  reason: not valid java name */
    public final void m106476setNotAnimatableDeltagyyYBs(long j) {
        this.notAnimatableDelta = j;
    }
}
