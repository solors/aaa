package androidx.compose.p015ui.layout;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Measured.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.Measured */
/* loaded from: classes.dex */
public interface Measured {
    int get(@NotNull AlignmentLine alignmentLine);

    int getMeasuredHeight();

    int getMeasuredWidth();

    @Nullable
    default Object getParentData() {
        return null;
    }
}
