package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotMutationPolicy.kt */
@Metadata
/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotStateKt__SnapshotMutationPolicyKt {
    @NotNull
    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        return NeverEqualPolicy.INSTANCE;
    }

    @NotNull
    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return ReferentialEqualityPolicy.INSTANCE;
    }

    @NotNull
    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        return StructuralEqualityPolicy.INSTANCE;
    }
}
