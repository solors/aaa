package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyListItemInfo.kt */
@Metadata
/* loaded from: classes.dex */
public interface LazyListItemInfo {
    int getIndex();

    @NotNull
    Object getKey();

    int getOffset();

    int getSize();
}
