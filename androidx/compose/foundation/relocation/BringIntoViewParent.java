package androidx.compose.foundation.relocation;

import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BringIntoView.kt */
@Metadata
/* loaded from: classes.dex */
public interface BringIntoViewParent {
    @Nullable
    Object bringChildIntoView(@NotNull Rect rect, @NotNull LayoutCoordinates layoutCoordinates, @NotNull Continuation<? super Unit> continuation);
}
