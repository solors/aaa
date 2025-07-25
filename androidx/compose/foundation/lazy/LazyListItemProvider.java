package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyListItemProvider.kt */
@ExperimentalFoundationApi
@Metadata
/* loaded from: classes.dex */
public interface LazyListItemProvider extends LazyLayoutItemProvider {
    @NotNull
    List<Integer> getHeaderIndexes();

    @NotNull
    LazyItemScopeImpl getItemScope();
}
