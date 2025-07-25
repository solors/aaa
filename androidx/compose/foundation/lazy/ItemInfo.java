package androidx.compose.foundation.lazy;

import androidx.compose.p015ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyListItemPlacementAnimator.kt */
@Metadata
/* loaded from: classes.dex */
final class ItemInfo {
    private int index;
    private long notAnimatableDelta = IntOffset.Companion.m109862getZeronOccac();
    @NotNull
    private final List<PlaceableInfo> placeables = new ArrayList();

    public ItemInfo(int i) {
        this.index = i;
    }

    public final int getIndex() {
        return this.index;
    }

    /* renamed from: getNotAnimatableDelta-nOcc-ac  reason: not valid java name */
    public final long m106420getNotAnimatableDeltanOccac() {
        return this.notAnimatableDelta;
    }

    @NotNull
    public final List<PlaceableInfo> getPlaceables() {
        return this.placeables;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    /* renamed from: setNotAnimatableDelta--gyyYBs  reason: not valid java name */
    public final void m106421setNotAnimatableDeltagyyYBs(long j) {
        this.notAnimatableDelta = j;
    }
}
