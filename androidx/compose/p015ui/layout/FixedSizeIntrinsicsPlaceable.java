package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.graphics.GraphicsLayerScope;
import androidx.compose.p015ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Layout.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.FixedSizeIntrinsicsPlaceable */
/* loaded from: classes.dex */
final class FixedSizeIntrinsicsPlaceable extends Placeable {
    public FixedSizeIntrinsicsPlaceable(int i, int i2) {
        m109060setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i, i2));
    }

    @Override // androidx.compose.p015ui.layout.Measured
    public int get(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.p015ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno  reason: not valid java name */
    public void mo109021placeAtf8xVGno(long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
    }
}
