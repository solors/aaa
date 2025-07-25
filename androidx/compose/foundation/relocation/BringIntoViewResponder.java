package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p015ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BringIntoViewResponder.kt */
@ExperimentalFoundationApi
@Metadata
/* loaded from: classes.dex */
public interface BringIntoViewResponder {
    @ExperimentalFoundationApi
    @Nullable
    Object bringChildIntoView(@NotNull Rect rect, @NotNull Continuation<? super Unit> continuation);

    @ExperimentalFoundationApi
    @NotNull
    Rect calculateRectForParent(@NotNull Rect rect);
}
