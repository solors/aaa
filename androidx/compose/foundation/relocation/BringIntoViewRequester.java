package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p015ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BringIntoViewRequester.kt */
@ExperimentalFoundationApi
@Metadata
/* loaded from: classes.dex */
public interface BringIntoViewRequester {
    static /* synthetic */ Object bringIntoView$default(BringIntoViewRequester bringIntoViewRequester, Rect rect, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                rect = null;
            }
            return bringIntoViewRequester.bringIntoView(rect, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
    }

    @Nullable
    Object bringIntoView(@Nullable Rect rect, @NotNull Continuation<? super Unit> continuation);
}
