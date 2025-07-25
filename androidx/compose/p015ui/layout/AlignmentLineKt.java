package androidx.compose.p015ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AlignmentLine.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.AlignmentLineKt */
/* loaded from: classes.dex */
public final class AlignmentLineKt {
    @NotNull
    private static final HorizontalAlignmentLine FirstBaseline = new HorizontalAlignmentLine(AlignmentLineKt$FirstBaseline$1.INSTANCE);
    @NotNull
    private static final HorizontalAlignmentLine LastBaseline = new HorizontalAlignmentLine(AlignmentLineKt$LastBaseline$1.INSTANCE);

    @NotNull
    public static final HorizontalAlignmentLine getFirstBaseline() {
        return FirstBaseline;
    }

    @NotNull
    public static final HorizontalAlignmentLine getLastBaseline() {
        return LastBaseline;
    }

    public static final int merge(@NotNull AlignmentLine alignmentLine, int i, int i2) {
        Intrinsics.checkNotNullParameter(alignmentLine, "<this>");
        return alignmentLine.getMerger$ui_release().mo105910invoke(Integer.valueOf(i), Integer.valueOf(i2)).intValue();
    }
}
