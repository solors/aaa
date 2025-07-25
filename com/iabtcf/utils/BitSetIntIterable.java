package com.iabtcf.utils;

import java.util.BitSet;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes6.dex */
public class BitSetIntIterable extends IntIterable {
    public static final BitSetIntIterable EMPTY = new BitSetIntIterable(new BitSet());

    /* renamed from: bs */
    private final BitSet f46992bs;

    /* loaded from: classes6.dex */
    public static class Builder {

        /* renamed from: bs */
        private final BitSet f46993bs;

        public Builder add(int i) {
            this.f46993bs.set(i);
            return this;
        }

        public BitSetIntIterable build() {
            return new BitSetIntIterable((BitSet) this.f46993bs.clone());
        }

        public Builder clear() {
            this.f46993bs.clear();
            return this;
        }

        public int max() {
            if (this.f46993bs.isEmpty()) {
                return 0;
            }
            return this.f46993bs.length() - 1;
        }

        public Builder add(BitSetIntIterable bitSetIntIterable) {
            this.f46993bs.or(bitSetIntIterable.f46992bs);
            return this;
        }

        private Builder() {
            this(new BitSet());
        }

        public Builder add(IntIterable intIterable) {
            IntIterator intIterator = intIterable.intIterator();
            while (intIterator.hasNext()) {
                this.f46993bs.set(intIterator.nextInt());
            }
            return this;
        }

        private Builder(BitSet bitSet) {
            this.f46993bs = bitSet;
        }

        public Builder add(Builder builder) {
            this.f46993bs.or(builder.f46993bs);
            return this;
        }

        private Builder(BitSetIntIterable bitSetIntIterable) {
            this(bitSetIntIterable.m110233clone().f46992bs);
        }
    }

    public static BitSetIntIterable from(BitSet bitSet) {
        return new BitSetIntIterable((BitSet) bitSet.clone());
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override // com.iabtcf.utils.IntIterable
    public boolean contains(int i) {
        if (i < 0) {
            return false;
        }
        return this.f46992bs.get(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BitSetIntIterable bitSetIntIterable = (BitSetIntIterable) obj;
        BitSet bitSet = this.f46992bs;
        if (bitSet == null) {
            if (bitSetIntIterable.f46992bs == null) {
                return true;
            }
            return false;
        }
        return bitSet.equals(bitSetIntIterable.f46992bs);
    }

    public int hashCode() {
        int hashCode;
        BitSet bitSet = this.f46992bs;
        if (bitSet == null) {
            hashCode = 0;
        } else {
            hashCode = bitSet.hashCode();
        }
        return 31 + hashCode;
    }

    @Override // com.iabtcf.utils.IntIterable
    public IntIterator intIterator() {
        return new IntIterator() { // from class: com.iabtcf.utils.BitSetIntIterable.1
            int currentIndex = start();

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.currentIndex != -1) {
                    return true;
                }
                return false;
            }

            @Override // java.util.PrimitiveIterator.OfInt
            public int nextInt() {
                if (hasNext()) {
                    int i = this.currentIndex;
                    this.currentIndex = BitSetIntIterable.this.f46992bs.nextSetBit(this.currentIndex + 1);
                    return i;
                }
                throw new NoSuchElementException();
            }

            public int start() {
                if (BitSetIntIterable.this.f46992bs.isEmpty()) {
                    return -1;
                }
                return BitSetIntIterable.this.f46992bs.nextSetBit(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator, java.util.PrimitiveIterator.OfInt
            public Integer next() {
                return Integer.valueOf(nextInt());
            }
        };
    }

    public BitSet toBitSet() {
        return (BitSet) this.f46992bs.clone();
    }

    public String toString() {
        return this.f46992bs.toString();
    }

    private BitSetIntIterable(BitSet bitSet) {
        this.f46992bs = bitSet;
    }

    public static BitSetIntIterable from(IntIterable intIterable) {
        if (intIterable instanceof BitSetIntIterable) {
            return ((BitSetIntIterable) intIterable).m110233clone();
        }
        BitSet bitSet = new BitSet();
        IntIterator intIterator = intIterable.intIterator();
        while (intIterator.hasNext()) {
            bitSet.set(intIterator.nextInt());
        }
        return new BitSetIntIterable(bitSet);
    }

    public static Builder newBuilder(BitSetIntIterable bitSetIntIterable) {
        return new Builder();
    }

    /* renamed from: clone */
    public BitSetIntIterable m110233clone() {
        return new BitSetIntIterable((BitSet) this.f46992bs.clone());
    }

    public static Builder newBuilder(BitSet bitSet) {
        return new Builder();
    }

    public static Builder newBuilder(IntIterable intIterable) {
        return new Builder();
    }

    public static BitSetIntIterable from(int... iArr) {
        BitSet bitSet = new BitSet();
        for (int i : iArr) {
            bitSet.set(i);
        }
        return new BitSetIntIterable(bitSet);
    }

    public static BitSetIntIterable from(Collection<Integer> collection) {
        final BitSet bitSet = new BitSet();
        collection.forEach(new Consumer() { // from class: com.iabtcf.utils.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                bitSet.set(((Integer) obj).intValue());
            }
        });
        return new BitSetIntIterable(bitSet);
    }
}
