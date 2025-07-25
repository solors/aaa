package androidx.compose.p015ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AlignmentLine.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.layout.VerticalAlignmentLine */
/* loaded from: classes.dex */
public final class VerticalAlignmentLine extends AlignmentLine {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalAlignmentLine(@NotNull Function2<? super Integer, ? super Integer, Integer> merger) {
        super(merger, null);
        Intrinsics.checkNotNullParameter(merger, "merger");
    }
}
