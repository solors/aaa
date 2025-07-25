package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SnapshotMutationPolicy.kt */
@Metadata
/* loaded from: classes.dex */
final class NeverEqualPolicy implements SnapshotMutationPolicy<Object> {
    @NotNull
    public static final NeverEqualPolicy INSTANCE = new NeverEqualPolicy();

    private NeverEqualPolicy() {
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(@Nullable Object obj, @Nullable Object obj2) {
        return false;
    }

    @NotNull
    public String toString() {
        return "NeverEqualPolicy";
    }
}
