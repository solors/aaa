package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyLayoutItemProvider.kt */
@Stable
@ExperimentalFoundationApi
@Metadata
/* loaded from: classes.dex */
public interface LazyLayoutItemProvider {
    @Composable
    void Item(int i, @Nullable Composer composer, int i2);

    @Nullable
    default Object getContentType(int i) {
        return null;
    }

    int getItemCount();

    @NotNull
    default Object getKey(int i) {
        return Lazy_androidKt.getDefaultLazyLayoutKey(i);
    }

    @NotNull
    default Map<Object, Integer> getKeyToIndexMap() {
        Map<Object, Integer> m17284j;
        m17284j = C37559r0.m17284j();
        return m17284j;
    }
}
