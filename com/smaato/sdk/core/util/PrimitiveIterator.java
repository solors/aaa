package com.smaato.sdk.core.util;

import com.smaato.sdk.core.util.p574fi.Consumer;

/* loaded from: classes7.dex */
public interface PrimitiveIterator<T, T_CONS> extends Iterator<T> {

    /* loaded from: classes7.dex */
    public interface OfDouble extends PrimitiveIterator<Double, DoubleConsumer> {
        double nextDouble();

        @Override // com.smaato.sdk.core.util.PrimitiveIterator
        default void forEachRemaining(DoubleConsumer doubleConsumer) {
            Objects.requireNonNull(doubleConsumer);
            while (hasNext()) {
                doubleConsumer.accept(nextDouble());
            }
        }

        @Override // com.smaato.sdk.core.util.Iterator
        default Double next() {
            return Double.valueOf(nextDouble());
        }

        @Override // com.smaato.sdk.core.util.Iterator
        default void forEachRemaining(final Consumer<? super Double> consumer) {
            if (consumer instanceof DoubleConsumer) {
                forEachRemaining((DoubleConsumer) consumer);
                return;
            }
            Objects.requireNonNull(consumer);
            java.util.Objects.requireNonNull(consumer);
            forEachRemaining(new DoubleConsumer() { // from class: com.smaato.sdk.core.util.f
                @Override // com.smaato.sdk.core.util.DoubleConsumer
                public final void accept(double d) {
                    Consumer.this.accept(Double.valueOf(d));
                }
            });
        }
    }

    /* loaded from: classes7.dex */
    public interface OfInt extends PrimitiveIterator<Integer, IntConsumer> {
        int nextInt();

        @Override // com.smaato.sdk.core.util.PrimitiveIterator
        default void forEachRemaining(IntConsumer intConsumer) {
            Objects.requireNonNull(intConsumer);
            while (hasNext()) {
                intConsumer.accept(nextInt());
            }
        }

        @Override // com.smaato.sdk.core.util.Iterator
        default Integer next() {
            return Integer.valueOf(nextInt());
        }

        @Override // com.smaato.sdk.core.util.Iterator
        default void forEachRemaining(final Consumer<? super Integer> consumer) {
            if (consumer instanceof IntConsumer) {
                forEachRemaining((IntConsumer) consumer);
                return;
            }
            Objects.requireNonNull(consumer);
            java.util.Objects.requireNonNull(consumer);
            forEachRemaining(new IntConsumer() { // from class: com.smaato.sdk.core.util.g
                @Override // com.smaato.sdk.core.util.IntConsumer
                public final void accept(int i) {
                    Consumer.this.accept(Integer.valueOf(i));
                }
            });
        }
    }

    /* loaded from: classes7.dex */
    public interface OfLong extends PrimitiveIterator<Long, LongConsumer> {
        long nextLong();

        @Override // com.smaato.sdk.core.util.PrimitiveIterator
        default void forEachRemaining(LongConsumer longConsumer) {
            Objects.requireNonNull(longConsumer);
            while (hasNext()) {
                longConsumer.accept(nextLong());
            }
        }

        @Override // com.smaato.sdk.core.util.Iterator
        default Long next() {
            return Long.valueOf(nextLong());
        }

        @Override // com.smaato.sdk.core.util.Iterator
        default void forEachRemaining(final Consumer<? super Long> consumer) {
            if (consumer instanceof LongConsumer) {
                forEachRemaining((LongConsumer) consumer);
                return;
            }
            Objects.requireNonNull(consumer);
            java.util.Objects.requireNonNull(consumer);
            forEachRemaining(new LongConsumer() { // from class: com.smaato.sdk.core.util.h
                @Override // com.smaato.sdk.core.util.LongConsumer
                public final void accept(long j) {
                    Consumer.this.accept(Long.valueOf(j));
                }
            });
        }
    }

    void forEachRemaining(T_CONS t_cons);
}
