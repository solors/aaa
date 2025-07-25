package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SelectionRegistrar.kt */
@Metadata
/* loaded from: classes.dex */
public final class SelectionRegistrarKt {
    @NotNull
    private static final ProvidableCompositionLocal<SelectionRegistrar> LocalSelectionRegistrar = CompositionLocalKt.compositionLocalOf$default(null, SelectionRegistrarKt$LocalSelectionRegistrar$1.INSTANCE, 1, null);

    @NotNull
    public static final ProvidableCompositionLocal<SelectionRegistrar> getLocalSelectionRegistrar() {
        return LocalSelectionRegistrar;
    }

    public static final boolean hasSelection(@Nullable SelectionRegistrar selectionRegistrar, long j) {
        Map<Long, Selection> subselections;
        if (selectionRegistrar != null && (subselections = selectionRegistrar.getSubselections()) != null) {
            return subselections.containsKey(Long.valueOf(j));
        }
        return false;
    }
}
