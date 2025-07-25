package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyGridItemProviderImpl.kt */
@ExperimentalFoundationApi
@Metadata
/* loaded from: classes.dex */
public final class LazyGridItemProviderImpl implements LazyGridItemProvider {
    @NotNull
    private final State<LazyGridItemsSnapshot> itemsSnapshot;

    public LazyGridItemProviderImpl(@NotNull State<LazyGridItemsSnapshot> itemsSnapshot) {
        Intrinsics.checkNotNullParameter(itemsSnapshot, "itemsSnapshot");
        this.itemsSnapshot = itemsSnapshot;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(int i, @Nullable Composer composer, int i2) {
        int i3;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(1959480708);
        if ((i2 & 14) == 0) {
            if (startRestartGroup.changed(i)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (startRestartGroup.changed(this)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            this.itemsSnapshot.getValue().Item(i, startRestartGroup, (i3 & 14) | 64);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyGridItemProviderImpl$Item$1(this, i, i2));
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Nullable
    public Object getContentType(int i) {
        return this.itemsSnapshot.getValue().getContentType(i);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.itemsSnapshot.getValue().getItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @NotNull
    public Object getKey(int i) {
        return this.itemsSnapshot.getValue().getKey(i);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @NotNull
    public Map<Object, Integer> getKeyToIndexMap() {
        return this.itemsSnapshot.getValue().getKeyToIndexMap();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    @NotNull
    public LazyGridSpanLayoutProvider getSpanLayoutProvider() {
        return this.itemsSnapshot.getValue().getSpanLayoutProvider();
    }
}
