package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextSelectionMouseDetector.kt */
@Metadata
/* loaded from: classes.dex */
public interface MouseSelectionObserver {
    /* renamed from: onDrag-3MmeM6k */
    boolean mo106635onDrag3MmeM6k(long j, @NotNull SelectionAdjustment selectionAdjustment);

    /* renamed from: onExtend-k-4lQ0M */
    boolean mo106636onExtendk4lQ0M(long j);

    /* renamed from: onExtendDrag-k-4lQ0M */
    boolean mo106637onExtendDragk4lQ0M(long j);

    /* renamed from: onStart-3MmeM6k */
    boolean mo106638onStart3MmeM6k(long j, @NotNull SelectionAdjustment selectionAdjustment);
}
