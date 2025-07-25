package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RelocationRequester.kt */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata
/* renamed from: androidx.compose.ui.layout.RelocationRequester */
/* loaded from: classes.dex */
public final class RelocationRequester {
    public static final int $stable = 0;

    public static /* synthetic */ Object bringIntoView$default(RelocationRequester relocationRequester, Rect rect, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = null;
        }
        return relocationRequester.bringIntoView(rect, continuation);
    }

    @Nullable
    public final Object bringIntoView(@Nullable Rect rect, @NotNull Continuation<? super Unit> continuation) {
        return Unit.f99208a;
    }
}
