package com.iabtcf.utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Set;
import java.util.Spliterators;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

/* loaded from: classes6.dex */
public abstract class IntIterable implements Iterable<Integer> {
    public abstract boolean contains(int i);

    public boolean containsAll(int... iArr) {
        return Arrays.stream(iArr).allMatch(new C18822c(this));
    }

    public boolean containsAny(int... iArr) {
        return Arrays.stream(iArr).anyMatch(new C18822c(this));
    }

    public abstract IntIterator intIterator();

    public boolean isEmpty() {
        return !intIterator().hasNext();
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() { // from class: com.iabtcf.utils.IntIterable.1
            final IntIterator internal;

            {
                this.internal = IntIterable.this.intIterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.internal.hasNext();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public Integer next() {
                return this.internal.next();
            }
        };
    }

    public Set<Integer> toSet() {
        HashSet hashSet = new HashSet();
        IntIterator intIterator = intIterator();
        while (intIterator.hasNext()) {
            hashSet.add(intIterator.next());
        }
        return hashSet;
    }

    public IntStream toStream() {
        return StreamSupport.intStream(Spliterators.spliteratorUnknownSize((PrimitiveIterator.OfInt) intIterator(), 1296), false);
    }
}
