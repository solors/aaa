package androidx.compose.runtime.external.kotlinx.collections.immutable;

import ae.InterfaceC0036b;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: ImmutableCollection.kt */
@Metadata
/* loaded from: classes.dex */
public interface PersistentCollection<E> extends ImmutableCollection<E> {

    /* compiled from: ImmutableCollection.kt */
    @Metadata
    /* loaded from: classes.dex */
    public interface Builder<E> extends Collection<E>, InterfaceC0036b {
        @NotNull
        PersistentCollection<E> build();
    }

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> add(E e);

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> addAll(@NotNull Collection<? extends E> collection);

    @NotNull
    Builder<E> builder();

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> clear();

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> remove(E e);

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> removeAll(@NotNull Collection<? extends E> collection);

    @NotNull
    PersistentCollection<E> removeAll(@NotNull Function1<? super E, Boolean> function1);

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> retainAll(@NotNull Collection<? extends E> collection);
}
