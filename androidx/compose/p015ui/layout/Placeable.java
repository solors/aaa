package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.graphics.GraphicsLayerScope;
import androidx.compose.p015ui.unit.Constraints;
import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.p015ui.unit.IntOffsetKt;
import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.p015ui.unit.IntSizeKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Placeable.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.layout.Placeable */
/* loaded from: classes.dex */
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private long measuredSize = IntSizeKt.IntSize(0, 0);
    private long measurementConstraints = PlaceableKt.access$getDefaultConstraints$p();
    private int width;

    /* compiled from: Placeable.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* renamed from: androidx.compose.ui.layout.Placeable$PlacementScope */
    /* loaded from: classes.dex */
    public static abstract class PlacementScope {
        public static final int $stable = 0;
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private static LayoutDirection parentLayoutDirection = LayoutDirection.Ltr;
        private static int parentWidth;

        /* compiled from: Placeable.kt */
        @Metadata
        /* renamed from: androidx.compose.ui.layout.Placeable$PlacementScope$Companion */
        /* loaded from: classes.dex */
        public static final class Companion extends PlacementScope {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final void executeWithRtlMirroringValues(int i, @NotNull LayoutDirection parentLayoutDirection, @NotNull Function1<? super PlacementScope, Unit> block) {
                Intrinsics.checkNotNullParameter(parentLayoutDirection, "parentLayoutDirection");
                Intrinsics.checkNotNullParameter(block, "block");
                Companion companion = PlacementScope.Companion;
                int parentWidth = companion.getParentWidth();
                LayoutDirection parentLayoutDirection2 = companion.getParentLayoutDirection();
                PlacementScope.parentWidth = i;
                PlacementScope.parentLayoutDirection = parentLayoutDirection;
                block.invoke(this);
                PlacementScope.parentWidth = parentWidth;
                PlacementScope.parentLayoutDirection = parentLayoutDirection2;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.compose.p015ui.layout.Placeable.PlacementScope
            @NotNull
            public LayoutDirection getParentLayoutDirection() {
                return PlacementScope.parentLayoutDirection;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.compose.p015ui.layout.Placeable.PlacementScope
            public int getParentWidth() {
                return PlacementScope.parentWidth;
            }

            private Companion() {
            }
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                placementScope.place(placeable, i, i2, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
        }

        /* renamed from: place-70tqf50$default  reason: not valid java name */
        public static /* synthetic */ void m109062place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                placementScope.m109066place70tqf50(placeable, j, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                placementScope.placeRelative(placeable, i, i2, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
        }

        /* renamed from: placeRelative-70tqf50$default  reason: not valid java name */
        public static /* synthetic */ void m109063placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                placementScope.m109069placeRelative70tqf50(placeable, j, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                float f2 = f;
                Function1 function12 = function1;
                if ((i3 & 8) != 0) {
                    function12 = PlaceableKt.access$getDefaultLayerBlock$p();
                }
                placementScope.placeRelativeWithLayer(placeable, i, i2, f2, function12);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default  reason: not valid java name */
        public static /* synthetic */ void m109064placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                float f2 = f;
                Function1 function12 = function1;
                if ((i & 4) != 0) {
                    function12 = PlaceableKt.access$getDefaultLayerBlock$p();
                }
                placementScope.m109070placeRelativeWithLayeraW9wM(placeable, j, f2, function12);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                float f2 = f;
                Function1 function12 = function1;
                if ((i3 & 8) != 0) {
                    function12 = PlaceableKt.access$getDefaultLayerBlock$p();
                }
                placementScope.placeWithLayer(placeable, i, i2, f2, function12);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
        }

        /* renamed from: placeWithLayer-aW-9-wM$default  reason: not valid java name */
        public static /* synthetic */ void m109065placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                float f2 = f;
                Function1 function12 = function1;
                if ((i & 4) != 0) {
                    function12 = PlaceableKt.access$getDefaultLayerBlock$p();
                }
                placementScope.m109071placeWithLayeraW9wM(placeable, j, f2, function12);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @NotNull
        public abstract LayoutDirection getParentLayoutDirection();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int getParentWidth();

        public final void place(@NotNull Placeable placeable, int i, int i2, float f) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            long m109057getApparentToRealOffsetnOccac = placeable.m109057getApparentToRealOffsetnOccac();
            placeable.mo109021placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(IntOffset) + IntOffset.m109852getXimpl(m109057getApparentToRealOffsetnOccac), IntOffset.m109853getYimpl(IntOffset) + IntOffset.m109853getYimpl(m109057getApparentToRealOffsetnOccac)), f, null);
        }

        /* renamed from: place-70tqf50  reason: not valid java name */
        public final void m109066place70tqf50(@NotNull Placeable place, long j, float f) {
            Intrinsics.checkNotNullParameter(place, "$this$place");
            long m109057getApparentToRealOffsetnOccac = place.m109057getApparentToRealOffsetnOccac();
            place.mo109021placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(j) + IntOffset.m109852getXimpl(m109057getApparentToRealOffsetnOccac), IntOffset.m109853getYimpl(j) + IntOffset.m109853getYimpl(m109057getApparentToRealOffsetnOccac)), f, null);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release  reason: not valid java name */
        public final void m109067placeApparentToRealOffsetaW9wM$ui_release(@NotNull Placeable placeApparentToRealOffset, long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            Intrinsics.checkNotNullParameter(placeApparentToRealOffset, "$this$placeApparentToRealOffset");
            long m109057getApparentToRealOffsetnOccac = placeApparentToRealOffset.m109057getApparentToRealOffsetnOccac();
            placeApparentToRealOffset.mo109021placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(j) + IntOffset.m109852getXimpl(m109057getApparentToRealOffsetnOccac), IntOffset.m109853getYimpl(j) + IntOffset.m109853getYimpl(m109057getApparentToRealOffsetnOccac)), f, function1);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release  reason: not valid java name */
        public final void m109068placeAutoMirroredaW9wM$ui_release(@NotNull Placeable placeAutoMirrored, long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            Intrinsics.checkNotNullParameter(placeAutoMirrored, "$this$placeAutoMirrored");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long m109057getApparentToRealOffsetnOccac = placeAutoMirrored.m109057getApparentToRealOffsetnOccac();
                placeAutoMirrored.mo109021placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(j) + IntOffset.m109852getXimpl(m109057getApparentToRealOffsetnOccac), IntOffset.m109853getYimpl(j) + IntOffset.m109853getYimpl(m109057getApparentToRealOffsetnOccac)), f, function1);
                return;
            }
            long IntOffset = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m109894getWidthimpl(placeAutoMirrored.measuredSize)) - IntOffset.m109852getXimpl(j), IntOffset.m109853getYimpl(j));
            long m109057getApparentToRealOffsetnOccac2 = placeAutoMirrored.m109057getApparentToRealOffsetnOccac();
            placeAutoMirrored.mo109021placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(IntOffset) + IntOffset.m109852getXimpl(m109057getApparentToRealOffsetnOccac2), IntOffset.m109853getYimpl(IntOffset) + IntOffset.m109853getYimpl(m109057getApparentToRealOffsetnOccac2)), f, function1);
        }

        public final void placeRelative(@NotNull Placeable placeable, int i, int i2, float f) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long m109057getApparentToRealOffsetnOccac = placeable.m109057getApparentToRealOffsetnOccac();
                placeable.mo109021placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(IntOffset) + IntOffset.m109852getXimpl(m109057getApparentToRealOffsetnOccac), IntOffset.m109853getYimpl(IntOffset) + IntOffset.m109853getYimpl(m109057getApparentToRealOffsetnOccac)), f, null);
                return;
            }
            long IntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m109894getWidthimpl(placeable.measuredSize)) - IntOffset.m109852getXimpl(IntOffset), IntOffset.m109853getYimpl(IntOffset));
            long m109057getApparentToRealOffsetnOccac2 = placeable.m109057getApparentToRealOffsetnOccac();
            placeable.mo109021placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(IntOffset2) + IntOffset.m109852getXimpl(m109057getApparentToRealOffsetnOccac2), IntOffset.m109853getYimpl(IntOffset2) + IntOffset.m109853getYimpl(m109057getApparentToRealOffsetnOccac2)), f, null);
        }

        /* renamed from: placeRelative-70tqf50  reason: not valid java name */
        public final void m109069placeRelative70tqf50(@NotNull Placeable placeRelative, long j, float f) {
            Intrinsics.checkNotNullParameter(placeRelative, "$this$placeRelative");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long m109057getApparentToRealOffsetnOccac = placeRelative.m109057getApparentToRealOffsetnOccac();
                placeRelative.mo109021placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(j) + IntOffset.m109852getXimpl(m109057getApparentToRealOffsetnOccac), IntOffset.m109853getYimpl(j) + IntOffset.m109853getYimpl(m109057getApparentToRealOffsetnOccac)), f, null);
                return;
            }
            long IntOffset = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m109894getWidthimpl(placeRelative.measuredSize)) - IntOffset.m109852getXimpl(j), IntOffset.m109853getYimpl(j));
            long m109057getApparentToRealOffsetnOccac2 = placeRelative.m109057getApparentToRealOffsetnOccac();
            placeRelative.mo109021placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(IntOffset) + IntOffset.m109852getXimpl(m109057getApparentToRealOffsetnOccac2), IntOffset.m109853getYimpl(IntOffset) + IntOffset.m109853getYimpl(m109057getApparentToRealOffsetnOccac2)), f, null);
        }

        public final void placeRelativeWithLayer(@NotNull Placeable placeable, int i, int i2, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long m109057getApparentToRealOffsetnOccac = placeable.m109057getApparentToRealOffsetnOccac();
                placeable.mo109021placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(IntOffset) + IntOffset.m109852getXimpl(m109057getApparentToRealOffsetnOccac), IntOffset.m109853getYimpl(IntOffset) + IntOffset.m109853getYimpl(m109057getApparentToRealOffsetnOccac)), f, layerBlock);
                return;
            }
            long IntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m109894getWidthimpl(placeable.measuredSize)) - IntOffset.m109852getXimpl(IntOffset), IntOffset.m109853getYimpl(IntOffset));
            long m109057getApparentToRealOffsetnOccac2 = placeable.m109057getApparentToRealOffsetnOccac();
            placeable.mo109021placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(IntOffset2) + IntOffset.m109852getXimpl(m109057getApparentToRealOffsetnOccac2), IntOffset.m109853getYimpl(IntOffset2) + IntOffset.m109853getYimpl(m109057getApparentToRealOffsetnOccac2)), f, layerBlock);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM  reason: not valid java name */
        public final void m109070placeRelativeWithLayeraW9wM(@NotNull Placeable placeRelativeWithLayer, long j, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeRelativeWithLayer, "$this$placeRelativeWithLayer");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long m109057getApparentToRealOffsetnOccac = placeRelativeWithLayer.m109057getApparentToRealOffsetnOccac();
                placeRelativeWithLayer.mo109021placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(j) + IntOffset.m109852getXimpl(m109057getApparentToRealOffsetnOccac), IntOffset.m109853getYimpl(j) + IntOffset.m109853getYimpl(m109057getApparentToRealOffsetnOccac)), f, layerBlock);
                return;
            }
            long IntOffset = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m109894getWidthimpl(placeRelativeWithLayer.measuredSize)) - IntOffset.m109852getXimpl(j), IntOffset.m109853getYimpl(j));
            long m109057getApparentToRealOffsetnOccac2 = placeRelativeWithLayer.m109057getApparentToRealOffsetnOccac();
            placeRelativeWithLayer.mo109021placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(IntOffset) + IntOffset.m109852getXimpl(m109057getApparentToRealOffsetnOccac2), IntOffset.m109853getYimpl(IntOffset) + IntOffset.m109853getYimpl(m109057getApparentToRealOffsetnOccac2)), f, layerBlock);
        }

        public final void placeWithLayer(@NotNull Placeable placeable, int i, int i2, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            long m109057getApparentToRealOffsetnOccac = placeable.m109057getApparentToRealOffsetnOccac();
            placeable.mo109021placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(IntOffset) + IntOffset.m109852getXimpl(m109057getApparentToRealOffsetnOccac), IntOffset.m109853getYimpl(IntOffset) + IntOffset.m109853getYimpl(m109057getApparentToRealOffsetnOccac)), f, layerBlock);
        }

        /* renamed from: placeWithLayer-aW-9-wM  reason: not valid java name */
        public final void m109071placeWithLayeraW9wM(@NotNull Placeable placeWithLayer, long j, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeWithLayer, "$this$placeWithLayer");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long m109057getApparentToRealOffsetnOccac = placeWithLayer.m109057getApparentToRealOffsetnOccac();
            placeWithLayer.mo109021placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(j) + IntOffset.m109852getXimpl(m109057getApparentToRealOffsetnOccac), IntOffset.m109853getYimpl(j) + IntOffset.m109853getYimpl(m109057getApparentToRealOffsetnOccac)), f, layerBlock);
        }
    }

    private final void recalculateWidthAndHeight() {
        int m16908n;
        int m16908n2;
        m16908n = _Ranges.m16908n(IntSize.m109894getWidthimpl(this.measuredSize), Constraints.m109692getMinWidthimpl(this.measurementConstraints), Constraints.m109690getMaxWidthimpl(this.measurementConstraints));
        this.width = m16908n;
        m16908n2 = _Ranges.m16908n(IntSize.m109893getHeightimpl(this.measuredSize), Constraints.m109691getMinHeightimpl(this.measurementConstraints), Constraints.m109689getMaxHeightimpl(this.measurementConstraints));
        this.height = m16908n2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: getApparentToRealOffset-nOcc-ac  reason: not valid java name */
    public final long m109057getApparentToRealOffsetnOccac() {
        return IntOffsetKt.IntOffset((this.width - IntSize.m109894getWidthimpl(this.measuredSize)) / 2, (this.height - IntSize.m109893getHeightimpl(this.measuredSize)) / 2);
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.p015ui.layout.Measured
    public int getMeasuredHeight() {
        return IntSize.m109893getHeightimpl(this.measuredSize);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: getMeasuredSize-YbymL2g  reason: not valid java name */
    public final long m109058getMeasuredSizeYbymL2g() {
        return this.measuredSize;
    }

    @Override // androidx.compose.p015ui.layout.Measured
    public int getMeasuredWidth() {
        return IntSize.m109894getWidthimpl(this.measuredSize);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: getMeasurementConstraints-msEJaDk  reason: not valid java name */
    public final long m109059getMeasurementConstraintsmsEJaDk() {
        return this.measurementConstraints;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: placeAt-f8xVGno */
    public abstract void mo109021placeAtf8xVGno(long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: setMeasuredSize-ozmzZPI  reason: not valid java name */
    public final void m109060setMeasuredSizeozmzZPI(long j) {
        if (!IntSize.m109892equalsimpl0(this.measuredSize, j)) {
            this.measuredSize = j;
            recalculateWidthAndHeight();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: setMeasurementConstraints-BRTryo0  reason: not valid java name */
    public final void m109061setMeasurementConstraintsBRTryo0(long j) {
        if (!Constraints.m109683equalsimpl0(this.measurementConstraints, j)) {
            this.measurementConstraints = j;
            recalculateWidthAndHeight();
        }
    }
}
