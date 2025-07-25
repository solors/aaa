package kotlin.collections;

import ae.InterfaceC0038d;
import java.util.AbstractList;
import java.util.List;
import kotlin.Metadata;

@Metadata
/* renamed from: kotlin.collections.f */
/* loaded from: classes7.dex */
public abstract class AbstractMutableList<E> extends AbstractList<E> implements List<E>, InterfaceC0038d {
    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i, E e);

    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return removeAt(i);
    }

    public abstract E removeAt(int i);

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int i, E e);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
