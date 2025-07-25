package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SnapshotMutationPolicy.kt */
@Metadata
/* loaded from: classes.dex */
public interface SnapshotMutationPolicy<T> {

    /* compiled from: SnapshotMutationPolicy.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        public static <T> T merge(@NotNull SnapshotMutationPolicy<T> snapshotMutationPolicy, T t, T t2, T t3) {
            return (T) SnapshotMutationPolicy.super.merge(t, t2, t3);
        }
    }

    boolean equivalent(T t, T t2);

    @Nullable
    default T merge(T t, T t2, T t3) {
        return null;
    }
}
