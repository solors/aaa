package androidx.compose.p015ui.layout;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: MeasureResult.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.MeasureResult */
/* loaded from: classes.dex */
public interface MeasureResult {
    @NotNull
    Map<AlignmentLine, Integer> getAlignmentLines();

    int getHeight();

    int getWidth();

    void placeChildren();
}
