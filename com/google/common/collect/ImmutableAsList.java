package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
abstract class ImmutableAsList<E> extends ImmutableList<E> {

    @GwtIncompatible
    /* loaded from: classes4.dex */
    static class SerializedForm implements Serializable {

        /* renamed from: b */
        final ImmutableCollection<?> f40022b;

        SerializedForm(ImmutableCollection<?> immutableCollection) {
            this.f40022b = immutableCollection;
        }

        Object readResolve() {
            return this.f40022b.asList();
        }
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return mo68837j().contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return mo68837j().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return mo68837j().isPartialView();
    }

    /* renamed from: j */
    abstract ImmutableCollection<E> mo68837j();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return mo68837j().size();
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    Object writeReplace() {
        return new SerializedForm(mo68837j());
    }
}
