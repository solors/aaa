package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridItemPlacementAnimator.kt */
@Metadata
/* loaded from: classes.dex */
final class PlaceableInfo {
    @NotNull
    private final Animatable<IntOffset, AnimationVector2D> animatedOffset;
    @NotNull
    private final SnapshotState inProgress$delegate;
    private int mainAxisSize;
    private long targetOffset;

    public /* synthetic */ PlaceableInfo(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i);
    }

    @NotNull
    public final Animatable<IntOffset, AnimationVector2D> getAnimatedOffset() {
        return this.animatedOffset;
    }

    public final boolean getInProgress() {
        return ((Boolean) this.inProgress$delegate.getValue()).booleanValue();
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    /* renamed from: getTargetOffset-nOcc-ac  reason: not valid java name */
    public final long m106527getTargetOffsetnOccac() {
        return this.targetOffset;
    }

    public final void setInProgress(boolean z) {
        this.inProgress$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setMainAxisSize(int i) {
        this.mainAxisSize = i;
    }

    /* renamed from: setTargetOffset--gyyYBs  reason: not valid java name */
    public final void m106528setTargetOffsetgyyYBs(long j) {
        this.targetOffset = j;
    }

    private PlaceableInfo(long j, int i) {
        SnapshotState mutableStateOf$default;
        this.mainAxisSize = i;
        this.animatedOffset = new Animatable<>(IntOffset.m109843boximpl(j), VectorConvertersKt.getVectorConverter(IntOffset.Companion), null, 4, null);
        this.targetOffset = j;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.inProgress$delegate = mutableStateOf$default;
    }
}
