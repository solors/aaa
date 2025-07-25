package androidx.compose.foundation;

import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.unit.Velocity;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@ExperimentalFoundationApi
@Metadata
/* renamed from: androidx.compose.foundation.OverscrollEffect */
/* loaded from: classes.dex */
public interface Overscroll {
    @Nullable
    /* renamed from: consumePostFling-sF-c-tU */
    Object mo106064consumePostFlingsFctU(long j, @NotNull Continuation<? super Unit> continuation);

    /* renamed from: consumePostScroll-l7mfB5k */
    void mo106065consumePostScrolll7mfB5k(long j, long j2, @Nullable Offset offset, int i);

    @Nullable
    /* renamed from: consumePreFling-QWom1Mo */
    Object mo106066consumePreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation);

    /* renamed from: consumePreScroll-A0NYTsA */
    long mo106067consumePreScrollA0NYTsA(long j, @Nullable Offset offset, int i);

    @NotNull
    Modifier getEffectModifier();

    boolean isEnabled();

    boolean isInProgress();

    void setEnabled(boolean z);
}
