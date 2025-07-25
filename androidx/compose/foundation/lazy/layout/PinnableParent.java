package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PinnableParent.kt */
@ExperimentalFoundationApi
@Metadata
/* loaded from: classes.dex */
public interface PinnableParent {

    /* compiled from: PinnableParent.kt */
    @ExperimentalFoundationApi
    @Metadata
    /* loaded from: classes.dex */
    public interface PinnedItemsHandle {
        void unpin();
    }

    @NotNull
    PinnedItemsHandle pinItems();
}
