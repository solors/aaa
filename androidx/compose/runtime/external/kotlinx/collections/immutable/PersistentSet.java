package androidx.compose.runtime.external.kotlinx.collections.immutable;

import ae.InterfaceC0041f;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: ImmutableSet.kt */
@Metadata
/* loaded from: classes.dex */
public interface PersistentSet<E> extends ImmutableSet<E>, PersistentCollection<E> {

    /* compiled from: ImmutableSet.kt */
    @Metadata
    /* loaded from: classes.dex */
    public interface Builder<E> extends Set<E>, PersistentCollection.Builder<E>, InterfaceC0041f {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
        @NotNull
        PersistentSet<E> build();
    }

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentSet<E> add(E e);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentSet<E> addAll(@NotNull Collection<? extends E> collection);

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    Builder<E> builder();

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentSet<E> clear();

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentSet<E> remove(E e);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentSet<E> removeAll(@NotNull Collection<? extends E> collection);

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentSet<E> removeAll(@NotNull Function1<? super E, Boolean> function1);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentSet<E> retainAll(@NotNull Collection<? extends E> collection);
}
