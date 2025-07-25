package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextPreparedSelection.kt */
@Metadata
/* loaded from: classes.dex */
public final class TextPreparedSelectionState {
    @Nullable
    private Float cachedX;

    @Nullable
    public final Float getCachedX() {
        return this.cachedX;
    }

    public final void resetCachedX() {
        this.cachedX = null;
    }

    public final void setCachedX(@Nullable Float f) {
        this.cachedX = f;
    }
}
