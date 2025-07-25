package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SnapshotMutationPolicy.kt */
@Metadata
/* loaded from: classes.dex */
final class StructuralEqualityPolicy implements SnapshotMutationPolicy<Object> {
    @NotNull
    public static final StructuralEqualityPolicy INSTANCE = new StructuralEqualityPolicy();

    private StructuralEqualityPolicy() {
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(@Nullable Object obj, @Nullable Object obj2) {
        return Intrinsics.m17075f(obj, obj2);
    }

    @NotNull
    public String toString() {
        return "StructuralEqualityPolicy";
    }
}
