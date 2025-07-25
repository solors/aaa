package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.NoSuchElementException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {

    /* renamed from: b */
    private T f39781b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractSequentialIterator(T t) {
        this.f39781b = t;
    }

    /* renamed from: a */
    protected abstract T mo68840a(T t);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f39781b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = this.f39781b;
        if (t != null) {
            this.f39781b = mo68840a(t);
            return t;
        }
        throw new NoSuchElementException();
    }
}
