package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridItemProvider.kt */
@ExperimentalFoundationApi
@Metadata
/* loaded from: classes.dex */
public interface LazyGridItemProvider extends LazyLayoutItemProvider {
    @NotNull
    LazyGridSpanLayoutProvider getSpanLayoutProvider();
}
