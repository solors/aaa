package androidx.compose.runtime.tooling;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CompositionData.kt */
@Metadata
/* loaded from: classes.dex */
public interface CompositionGroup extends CompositionData {

    /* compiled from: CompositionData.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        public static Object getIdentity(@NotNull CompositionGroup compositionGroup) {
            return CompositionGroup.super.getIdentity();
        }
    }

    @NotNull
    Iterable<Object> getData();

    @Nullable
    default Object getIdentity() {
        return null;
    }

    @NotNull
    Object getKey();

    @Nullable
    Object getNode();

    @Nullable
    String getSourceInfo();
}
