package com.smaato.sdk.core.util;

/* loaded from: classes7.dex */
public interface DoubleConsumer {
    /* renamed from: a */
    static /* synthetic */ void m39359a(DoubleConsumer doubleConsumer, DoubleConsumer doubleConsumer2, double d) {
        doubleConsumer.lambda$andThen$0(doubleConsumer2, d);
    }

    /* synthetic */ default void lambda$andThen$0(DoubleConsumer doubleConsumer, double d) {
        accept(d);
        doubleConsumer.accept(d);
    }

    void accept(double d);

    default DoubleConsumer andThen(final DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new DoubleConsumer() { // from class: com.smaato.sdk.core.util.b
            @Override // com.smaato.sdk.core.util.DoubleConsumer
            public final void accept(double d) {
                DoubleConsumer.m39359a(DoubleConsumer.this, doubleConsumer, d);
            }
        };
    }
}
