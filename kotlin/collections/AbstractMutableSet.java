package kotlin.collections;

import ae.InterfaceC0041f;
import java.util.AbstractSet;
import java.util.Set;
import kotlin.Metadata;

@Metadata
/* renamed from: kotlin.collections.h */
/* loaded from: classes7.dex */
public abstract class AbstractMutableSet<E> extends AbstractSet<E> implements Set<E>, InterfaceC0041f {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(E e);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
