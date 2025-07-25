package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ForwardingCollection<E> extends ForwardingObject implements Collection<E> {
    @CanIgnoreReturnValue
    public boolean add(@ParametricNullness E e) {
        return delegate().add(e);
    }

    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        return delegate().addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: c */
    public abstract Collection<E> delegate();

    public void clear() {
        delegate().clear();
    }

    public boolean contains(Object obj) {
        return delegate().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return delegate().containsAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public boolean m69520d(Collection<? extends E> collection) {
        return Iterators.addAll(this, collection.iterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public boolean m69519f(Collection<?> collection) {
        return Collections2.m69722b(this, collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public boolean m69518g(Collection<?> collection) {
        return Iterators.retainAll(iterator(), collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public Object[] m69517h() {
        return toArray(new Object[size()]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public <T> T[] m69516i(T[] tArr) {
        return (T[]) ObjectArrays.m68899f(this, tArr);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Iterator<E> iterator() {
        return delegate().iterator();
    }

    @CanIgnoreReturnValue
    public boolean remove(Object obj) {
        return delegate().remove(obj);
    }

    @CanIgnoreReturnValue
    public boolean removeAll(Collection<?> collection) {
        return delegate().removeAll(collection);
    }

    @CanIgnoreReturnValue
    public boolean retainAll(Collection<?> collection) {
        return delegate().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return delegate().size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String standardToString() {
        return Collections2.m69716h(this);
    }

    public Object[] toArray() {
        return delegate().toArray();
    }

    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        return (T[]) delegate().toArray(tArr);
    }
}
