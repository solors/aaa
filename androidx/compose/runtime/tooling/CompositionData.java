package androidx.compose.runtime.tooling;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: CompositionData.kt */
@Metadata
/* loaded from: classes.dex */
public interface CompositionData {
    @NotNull
    Iterable<CompositionGroup> getCompositionGroups();

    boolean isEmpty();
}
