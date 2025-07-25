package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.layout.Placeable;
import androidx.compose.p015ui.unit.DpRect;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37559r0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MeasureScope.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.MeasureScope */
/* loaded from: classes.dex */
public interface MeasureScope extends IntrinsicMeasureScope {

    /* compiled from: MeasureScope.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.layout.MeasureScope$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static MeasureResult layout(@NotNull MeasureScope measureScope, int i, int i2, @NotNull Map<AlignmentLine, Integer> alignmentLines, @NotNull Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
            Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
            Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
            return MeasureScope.super.layout(i, i2, alignmentLines, placementBlock);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m109042roundToPxR2X_6o(@NotNull MeasureScope measureScope, long j) {
            return MeasureScope.super.mo106207roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m109043roundToPx0680j_4(@NotNull MeasureScope measureScope, float f) {
            return MeasureScope.super.mo106208roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m109044toDpGaN1DYA(@NotNull MeasureScope measureScope, long j) {
            return MeasureScope.super.mo106209toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m109045toDpu2uoSUM(@NotNull MeasureScope measureScope, float f) {
            return MeasureScope.super.mo106210toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m109047toDpSizekrfVVM(@NotNull MeasureScope measureScope, long j) {
            return MeasureScope.super.mo106212toDpSizekrfVVM(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m109048toPxR2X_6o(@NotNull MeasureScope measureScope, long j) {
            return MeasureScope.super.mo106213toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m109049toPx0680j_4(@NotNull MeasureScope measureScope, float f) {
            return MeasureScope.super.mo106214toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull MeasureScope measureScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return MeasureScope.super.toRect(receiver);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m109050toSizeXkaWNTQ(@NotNull MeasureScope measureScope, long j) {
            return MeasureScope.super.mo106215toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m109051toSp0xMU5do(@NotNull MeasureScope measureScope, float f) {
            return MeasureScope.super.mo106216toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m109052toSpkPz2Gy4(@NotNull MeasureScope measureScope, float f) {
            return MeasureScope.super.mo106217toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m109046toDpu2uoSUM(@NotNull MeasureScope measureScope, int i) {
            return MeasureScope.super.mo106211toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m109053toSpkPz2Gy4(@NotNull MeasureScope measureScope, int i) {
            return MeasureScope.super.mo106218toSpkPz2Gy4(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i, int i2, Map map, Function1 function1, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                map = C37559r0.m17284j();
            }
            return measureScope.layout(i, i2, map, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
    }

    @NotNull
    default MeasureResult layout(final int i, final int i2, @NotNull final Map<AlignmentLine, Integer> alignmentLines, @NotNull final Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
        Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
        Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
        return new MeasureResult(i, i2, alignmentLines, this, placementBlock) { // from class: androidx.compose.ui.layout.MeasureScope$layout$1
            final /* synthetic */ Function1<Placeable.PlacementScope, Unit> $placementBlock;
            final /* synthetic */ int $width;
            @NotNull
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            final /* synthetic */ MeasureScope this$0;
            private final int width;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$width = i;
                this.this$0 = this;
                this.$placementBlock = placementBlock;
                this.width = i;
                this.height = i2;
                this.alignmentLines = alignmentLines;
            }

            @Override // androidx.compose.p015ui.layout.MeasureResult
            @NotNull
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.p015ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.p015ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.p015ui.layout.MeasureResult
            public void placeChildren() {
                Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
                int i3 = this.$width;
                LayoutDirection layoutDirection = this.this$0.getLayoutDirection();
                Function1<Placeable.PlacementScope, Unit> function1 = this.$placementBlock;
                int parentWidth = companion.getParentWidth();
                LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
                Placeable.PlacementScope.parentWidth = i3;
                Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
                function1.invoke(companion);
                Placeable.PlacementScope.parentWidth = parentWidth;
                Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
            }
        };
    }
}
