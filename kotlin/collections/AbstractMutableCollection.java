package kotlin.collections;

import ae.InterfaceC0036b;
import java.util.AbstractCollection;
import java.util.Collection;
import kotlin.Metadata;

@Metadata
/* renamed from: kotlin.collections.e */
/* loaded from: classes7.dex */
public abstract class AbstractMutableCollection<E> extends AbstractCollection<E> implements Collection<E>, InterfaceC0036b {
    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E e);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
