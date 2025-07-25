package androidx.compose.p015ui.node;

import androidx.compose.p015ui.graphics.GraphicsLayerScope;
import androidx.compose.p015ui.layout.AlignmentLine;
import androidx.compose.p015ui.layout.Measurable;
import androidx.compose.p015ui.layout.Placeable;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.unit.Constraints;
import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.p015ui.unit.IntSizeKt;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OuterMeasurablePlaceable.kt */
@Metadata
/* renamed from: androidx.compose.ui.node.OuterMeasurablePlaceable */
/* loaded from: classes.dex */
public final class OuterMeasurablePlaceable extends Placeable implements Measurable {
    private boolean duringAlignmentLinesQuery;
    @Nullable
    private Function1<? super GraphicsLayerScope, Unit> lastLayerBlock;
    private long lastPosition;
    private float lastZIndex;
    @NotNull
    private final LayoutNode layoutNode;
    private boolean measuredOnce;
    @NotNull
    private LayoutNodeWrapper outerWrapper;
    @Nullable
    private Object parentData;
    private boolean placedOnce;

    /* compiled from: OuterMeasurablePlaceable.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.node.OuterMeasurablePlaceable$WhenMappings */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
            iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
            iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public OuterMeasurablePlaceable(@NotNull LayoutNode layoutNode, @NotNull LayoutNodeWrapper outerWrapper) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Intrinsics.checkNotNullParameter(outerWrapper, "outerWrapper");
        this.layoutNode = layoutNode;
        this.outerWrapper = outerWrapper;
        this.lastPosition = IntOffset.Companion.m109862getZeronOccac();
    }

    private final void onIntrinsicsQueried() {
        LayoutNode.UsageByParent usageByParent;
        LayoutNode.requestRemeasure$ui_release$default(this.layoutNode, false, 1, null);
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        if (parent$ui_release != null && this.layoutNode.getIntrinsicsUsageByParent$ui_release() == LayoutNode.UsageByParent.NotUsed) {
            LayoutNode layoutNode = this.layoutNode;
            int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    usageByParent = parent$ui_release.getIntrinsicsUsageByParent$ui_release();
                } else {
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                }
            } else {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            }
            layoutNode.setIntrinsicsUsageByParent$ui_release(usageByParent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeOuterWrapper-f8xVGno  reason: not valid java name */
    public final void m109184placeOuterWrapperf8xVGno(long j, float f, Function1<? super GraphicsLayerScope, Unit> function1) {
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
        if (function1 == null) {
            companion.m109066place70tqf50(this.outerWrapper, j, f);
        } else {
            companion.m109071placeWithLayeraW9wM(this.outerWrapper, j, f, function1);
        }
    }

    @Override // androidx.compose.p015ui.layout.Measured
    public int get(@NotNull AlignmentLine alignmentLine) {
        LayoutNode.LayoutState layoutState;
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        LayoutNode.LayoutState layoutState2 = null;
        if (parent$ui_release != null) {
            layoutState = parent$ui_release.getLayoutState$ui_release();
        } else {
            layoutState = null;
        }
        if (layoutState == LayoutNode.LayoutState.Measuring) {
            this.layoutNode.getAlignmentLines$ui_release().setUsedDuringParentMeasurement$ui_release(true);
        } else {
            LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
            if (parent$ui_release2 != null) {
                layoutState2 = parent$ui_release2.getLayoutState$ui_release();
            }
            if (layoutState2 == LayoutNode.LayoutState.LayingOut) {
                this.layoutNode.getAlignmentLines$ui_release().setUsedDuringParentLayout$ui_release(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        int i = this.outerWrapper.get(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return i;
    }

    public final boolean getDuringAlignmentLinesQuery$ui_release() {
        return this.duringAlignmentLinesQuery;
    }

    @Nullable
    /* renamed from: getLastConstraints-DWUhwKw  reason: not valid java name */
    public final Constraints m109185getLastConstraintsDWUhwKw() {
        if (this.measuredOnce) {
            return Constraints.m109678boximpl(m109059getMeasurementConstraintsmsEJaDk());
        }
        return null;
    }

    @Override // androidx.compose.p015ui.layout.Placeable, androidx.compose.p015ui.layout.Measured
    public int getMeasuredHeight() {
        return this.outerWrapper.getMeasuredHeight();
    }

    @Override // androidx.compose.p015ui.layout.Placeable, androidx.compose.p015ui.layout.Measured
    public int getMeasuredWidth() {
        return this.outerWrapper.getMeasuredWidth();
    }

    @NotNull
    public final LayoutNodeWrapper getOuterWrapper() {
        return this.outerWrapper;
    }

    @Override // androidx.compose.p015ui.layout.Measured, androidx.compose.p015ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return this.parentData;
    }

    public final void invalidateIntrinsicsParent(boolean z) {
        LayoutNode parent$ui_release;
        LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
        LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = this.layoutNode.getIntrinsicsUsageByParent$ui_release();
        if (parent$ui_release2 != null && intrinsicsUsageByParent$ui_release != LayoutNode.UsageByParent.NotUsed) {
            while (parent$ui_release2.getIntrinsicsUsageByParent$ui_release() == intrinsicsUsageByParent$ui_release && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
                parent$ui_release2 = parent$ui_release;
            }
            int i = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent$ui_release.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    parent$ui_release2.requestRelayout$ui_release(z);
                    return;
                }
                throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
            parent$ui_release2.requestRemeasure$ui_release(z);
        }
    }

    @Override // androidx.compose.p015ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i) {
        onIntrinsicsQueried();
        return this.outerWrapper.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.p015ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i) {
        onIntrinsicsQueried();
        return this.outerWrapper.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.p015ui.layout.Measurable
    @NotNull
    /* renamed from: measure-BRTryo0 */
    public Placeable mo109020measureBRTryo0(long j) {
        boolean z;
        LayoutNode.UsageByParent usageByParent;
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        if (parent$ui_release != null) {
            if (this.layoutNode.getMeasuredByParent$ui_release() != LayoutNode.UsageByParent.NotUsed && !this.layoutNode.getCanMultiMeasure$ui_release()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                LayoutNode layoutNode = this.layoutNode;
                int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                    } else {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block.Parents state is " + parent$ui_release.getLayoutState$ui_release());
                    }
                } else {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                }
                layoutNode.setMeasuredByParent$ui_release(usageByParent);
            } else {
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + this.layoutNode.getMeasuredByParent$ui_release() + ". Parent state " + parent$ui_release.getLayoutState$ui_release() + '.').toString());
            }
        } else {
            this.layoutNode.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
        }
        m109186remeasureBRTryo0(j);
        return this;
    }

    @Override // androidx.compose.p015ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i) {
        onIntrinsicsQueried();
        return this.outerWrapper.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.p015ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i) {
        onIntrinsicsQueried();
        return this.outerWrapper.minIntrinsicWidth(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.p015ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo109021placeAtf8xVGno(long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
        boolean z;
        this.lastPosition = j;
        this.lastZIndex = f;
        this.lastLayerBlock = function1;
        LayoutNodeWrapper wrappedBy$ui_release = this.outerWrapper.getWrappedBy$ui_release();
        if (wrappedBy$ui_release != null && wrappedBy$ui_release.isShallowPlacing()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m109184placeOuterWrapperf8xVGno(j, f, function1);
            return;
        }
        this.placedOnce = true;
        this.layoutNode.getAlignmentLines$ui_release().setUsedByModifierLayout$ui_release(false);
        LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(this.layoutNode, new OuterMeasurablePlaceable$placeAt$1(this, j, f, function1));
    }

    public final void recalculateParentData() {
        this.parentData = this.outerWrapper.getParentData();
    }

    /* renamed from: remeasure-BRTryo0  reason: not valid java name */
    public final boolean m109186remeasureBRTryo0(long j) {
        boolean z;
        long mo109022getSizeYbymL2g;
        Owner requireOwner = LayoutNodeKt.requireOwner(this.layoutNode);
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        LayoutNode layoutNode = this.layoutNode;
        boolean z2 = true;
        if (!layoutNode.getCanMultiMeasure$ui_release() && (parent$ui_release == null || !parent$ui_release.getCanMultiMeasure$ui_release())) {
            z = false;
        } else {
            z = true;
        }
        layoutNode.setCanMultiMeasure$ui_release(z);
        if (!this.layoutNode.getMeasurePending$ui_release() && Constraints.m109683equalsimpl0(m109059getMeasurementConstraintsmsEJaDk(), j)) {
            requireOwner.forceMeasureTheSubtree(this.layoutNode);
            this.layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
            return false;
        }
        this.layoutNode.getAlignmentLines$ui_release().setUsedByModifierMeasurement$ui_release(false);
        MutableVector<LayoutNode> mutableVector = this.layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                content[i].getAlignmentLines$ui_release().setUsedDuringParentMeasurement$ui_release(false);
                i++;
            } while (i < size);
            this.measuredOnce = true;
            mo109022getSizeYbymL2g = this.outerWrapper.mo109022getSizeYbymL2g();
            m109061setMeasurementConstraintsBRTryo0(j);
            this.layoutNode.m109147performMeasureBRTryo0$ui_release(j);
            if (IntSize.m109892equalsimpl0(this.outerWrapper.mo109022getSizeYbymL2g(), mo109022getSizeYbymL2g) && this.outerWrapper.getWidth() == getWidth() && this.outerWrapper.getHeight() == getHeight()) {
                z2 = false;
            }
            m109060setMeasuredSizeozmzZPI(IntSizeKt.IntSize(this.outerWrapper.getWidth(), this.outerWrapper.getHeight()));
            return z2;
        }
        this.measuredOnce = true;
        mo109022getSizeYbymL2g = this.outerWrapper.mo109022getSizeYbymL2g();
        m109061setMeasurementConstraintsBRTryo0(j);
        this.layoutNode.m109147performMeasureBRTryo0$ui_release(j);
        if (IntSize.m109892equalsimpl0(this.outerWrapper.mo109022getSizeYbymL2g(), mo109022getSizeYbymL2g)) {
            z2 = false;
        }
        m109060setMeasuredSizeozmzZPI(IntSizeKt.IntSize(this.outerWrapper.getWidth(), this.outerWrapper.getHeight()));
        return z2;
    }

    public final void replace() {
        if (this.placedOnce) {
            mo109021placeAtf8xVGno(this.lastPosition, this.lastZIndex, this.lastLayerBlock);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void setDuringAlignmentLinesQuery$ui_release(boolean z) {
        this.duringAlignmentLinesQuery = z;
    }

    public final void setOuterWrapper(@NotNull LayoutNodeWrapper layoutNodeWrapper) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper, "<set-?>");
        this.outerWrapper = layoutNodeWrapper;
    }
}
