package androidx.compose.p015ui.node;

import androidx.compose.p015ui.layout.IntrinsicMeasurable;
import androidx.compose.p015ui.layout.IntrinsicMeasureScope;
import androidx.compose.p015ui.layout.Measurable;
import androidx.compose.p015ui.layout.MeasureResult;
import androidx.compose.p015ui.layout.MeasureScope;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: MeasureBlocks.kt */
@Metadata
/* renamed from: androidx.compose.ui.node.MeasureBlocks */
/* loaded from: classes.dex */
public interface MeasureBlocks {
    int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i);

    int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i);

    @NotNull
    /* renamed from: measure-3p2s80s */
    MeasureResult mo109027measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j);

    int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i);

    int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i);
}
