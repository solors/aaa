package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SnapshotMutationPolicy.kt */
@Metadata
/* loaded from: classes.dex */
final class ReferentialEqualityPolicy implements SnapshotMutationPolicy<Object> {
    @NotNull
    public static final ReferentialEqualityPolicy INSTANCE = new ReferentialEqualityPolicy();

    private ReferentialEqualityPolicy() {
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "ReferentialEqualityPolicy";
    }
}
