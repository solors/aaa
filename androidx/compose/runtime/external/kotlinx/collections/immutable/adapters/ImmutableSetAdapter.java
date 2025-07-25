package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReadOnlyCollectionAdapters.kt */
@Metadata
/* loaded from: classes.dex */
public final class ImmutableSetAdapter<E> extends ReadOnlyCollectionAdapters<E> implements ImmutableSet<E> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImmutableSetAdapter(@NotNull Set<? extends E> impl) {
        super(impl);
        Intrinsics.checkNotNullParameter(impl, "impl");
    }
}
